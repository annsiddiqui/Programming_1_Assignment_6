/**
 * Note: When you complete this challenge, you should add your name as an
 * author (and remove this note).
 *
 * @author Student Person
 */
public class Banner {

    /**
     * NAME: displayStandard
     *
     * Displays a banner to the screen. This banner consists of a
     * message surrounded by a border of asterisks.
     * <p>
     * Here is an example banner:
     * <pre>
     * ********
     * *Hello!*
     * ********
     * </pre>
     *
     * @param  msg          the message to display. It might be empty.
     */

    public static void displayStandard(String msg)
    {
        printBorder(msg, 0);
        System.out.printf("*%s*%n", msg);
        printBorder(msg, 0);
    }

    private static void printTemplate(String msg,int paddingAmt, char filler)
    {
        System.out.print("*");
        int messageLength = (msg.length() + (paddingAmt * 2));

        for (int count = messageLength;count > 0;count--)
        {
            System.out.print(filler);
        }

        System.out.printf("*%n");
    }

    private static void printEmpty(String msg, int paddingAmt)
    {
        printTemplate (msg,paddingAmt, ' ');
    }

    private static void printBorder (String msg, int paddingAmt)
    {
        printTemplate (msg,paddingAmt, '*');
    }

    private static void printVerticalPadding (String msg, int paddingAmt)
    {
        for (int count =0;count < paddingAmt;count++)
        {
            printEmpty(msg,paddingAmt);
        }
    }

    /**
     * NAME: displayPadded
     *
     * Displays a banner to the screen. This banner consists of a
     * message surrounded by specified amount of padding which is
     * then surrounded by a border of asterisks.
     * <p>
     * Here is an example banner with a padding of 2:
     * <pre>
     * ************
     * *          *
     * *          *
     * *  Hello!  *
     * *          *
     * *          *
     * ************
     * </pre>
     *
     * @param  msg          the message to display. It might be empty.
     * @param  paddingAmt   the number of spaces of padding to put above, below, left, and right around the message (assumed to be >= 0)
     */

    public static void displayPadded (String msg,int paddingAmt)
    {
        printBorder (msg, paddingAmt);
        printVerticalPadding(msg, paddingAmt);

        if (paddingAmt == 0)
        {
            System.out.printf("*%s*%n", msg);
        }
        else
        {
            System.out.printf("*%" + paddingAmt + "s%s%" + paddingAmt + "s*%n", "", msg, "");
        }

        printVerticalPadding(msg, paddingAmt);
        printBorder(msg, paddingAmt);
    }


}