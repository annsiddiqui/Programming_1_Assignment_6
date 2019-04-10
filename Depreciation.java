/**
 * Note: When you complete this challenge, you should add your name as an
 * author (and remove this note).
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class Depreciation {   
    /**
     * NAME: straightLine
     * 
     * Returns the depreciation amount of an asset after a given number of years, 
     * evaluated using the Straight Line method.
     *
     * @param  initialCost          the inital cost of the asset in dollars and cents. Assumed >= 0.
     * @param  residualValue        the value of the asset at the end of its useful life in dollars and cents. Assumed >= 0.
     * @param  usefulLifeInYears    the number of whole years from purchase to disposal of the asset. Assumed > 0.
     * @param  numYearsPassed       tthe number of whole years that have passed. Assumed >= 1 and <= usefulLifeInYears.
     * @return    the dollar and cents amount the asset has depreciated after numYearsPassed
     * @see <a href="http://accounting-simplified.com/financial/fixed-assets/depreciation-methods/straight-line.html">Calculating straight line depreciation</a>
     */

    public static double straightLine (double initialCost,double residualValue,int usefulLifeInYears,int numYearsPassed)
    {
        double depreciationPerAnnum = (initialCost - residualValue) / usefulLifeInYears;
        depreciationPerAnnum *= numYearsPassed;

        return depreciationPerAnnum;
    }

    /**
     * NAME: sumOfYearsDigits
     * 
     * Returns the depreciation amount of an asset after a given number of years, 
     * evaluated using the Sum of Years' Digits method.
     * 
     * @param  initialCost          the inital cost of the asset in dollars and cents. Assumed >= 0.
     * @param  residualValue        the value of the asset at the end of its useful life in dollars and cents. Assumed >= 0.
     * @param  usefulLifeInYears    the number of whole years from purchase to disposal of the asset. Assumed > 0.
     * @param  numYearsPassed       the number of whole years that have passed. Assumed >= 1 and <= usefulLifeInYears.
     * @return    the dollar and cents amount the asset has depreciated after numYearsPassed
     * @see <a href="http://accounting-simplified.com/financial/fixed-assets/depreciation-methods/sum-of-the-years-digits.html">Calculating sum of years' digits depreciation</a>
     */

    public static double sumOfYearsDigits (double initialCost,double residualValue,int usefulLifeInYears,int numYearsPassed)
    {
        int sumOfYears = ((usefulLifeInYears*(usefulLifeInYears +1))/2);
        double depreciableAmount = (initialCost - residualValue);
        double depreciationExpense = 0;
        int count = 0;

        while (count < numYearsPassed)
        {
            depreciationExpense += (((double)usefulLifeInYears/sumOfYears)*depreciableAmount);
            usefulLifeInYears--;
            count++;
        }

        return depreciationExpense;
    }
}    