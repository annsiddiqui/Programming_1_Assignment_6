public class MoneyFormat
{

    /**
     * NAME: standard
     * 
     * Returns the amount provided as a string formatted in "standard format"; 
     * that is, the amount will be shown with 2 decimal places.
     * <p>
     * No other special formatting will be applied.
     * <p>
     * Here are some examples:
     * <pre>
     * standard(12.0)   => "12.00"
     * standard(-3.255) => "-3.26"
     * standard(1234)   => "1234.00"
     * </pre>
     * @param  amt    the amount to format
     * @return    the "standard formatted" string representation of amt
     */

    public static String standard (double amt)
    {
        return String.format("%.2f",amt);
    }

    /**
     * NAME: accounting
     * 
     * Returns the amount provided as a string formatted in "accounting format"; 
     * that is, a negative amount will have brackets around it and there will be 
     * a comma after every three digits to the left of the decimal. Any digits 
     * to the right of the decimal will be rounded to 2 decimal places.
     * <p>
     * If the amount is negative, the returned string will have the right bracket
     * as its right-most character. If the amount is positive, the return string will 
     * have a space as its right-most character. (Think back to assignment one!)
     * <p>
     * The width provided will determine how many characters wide the returned string
     * is. If the width is greater than the minimum number of characters needed
     * to represent the formatted value, the returned string will be left-padded
     * with spaces. If the width is less than or equal to this minimum, then the
     * width will be ignored.
     * <p>
     * Here are some examples:
     * <pre>
     * accounting(12.0, 8)   => "  12.00 "
     * accounting(-3.255, 8) => "  (3.26)"
     * accounting(1234, 9)   => "1,234.00 "
     * </pre>
     * @param  amt    the amount to format
     * @param  width    how many characters wide the returned representation should be    
     * @return    the "accounting formatted" string representation of amt
     */

    public static String accounting(double amount, int width)
    {
        String formattedString;

        if (amount > 0)
        {
            String amountString = String.format("%,.2f",amount);
            int amountLength = amountString.length();

            if (amountLength < width)
            { 
                width = width-1;
                formattedString = String.format("%"+ width + "s ",amountString);
            }
            else
            {
                formattedString = String.format("%,(.2f",amount);
            }
        }
        else
        {
            String amountString = String.format("%,(.2f",amount);
            int amountLength = amountString.length();

            if (amountLength < width)
            {
                formattedString = String.format("%"+ width + "s",amountString);
            }
            else
            {
                formattedString = String.format(amountString);
            }

            // If you don't need width, you compare the length of width to amount length
        }

        return formattedString;
    }

}
