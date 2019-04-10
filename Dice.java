import java.util.Random;

/**
 * Note: When you complete this challenge, you should add your name as an
 * author (and remove this note).
 *
 * @author Qurrat-al-Ain Siddiqui
 */
public class Dice {   

    /**
     * NAME: roll
     * 
     * Returns the string representation of the die face that was randomly rolled.
     * The die consists of faces supplied by the caller as a string, with each
     * character in the string representing one face. Faces do not have to be digits.
     * The probability of rolling any face should be the same - it is a "fair" die.
     * <p>
     * For example, if the faces provided were "12345XX", then the die in question would
     * have seven faces: '1', '2', '3', '4', '5', and two 'X' faces. The probability
     * of rolling any face in this case is 1:7.
     *
     * @param  faces  a string representng the faces of the die
     * @return    the string representation of the face that was rolled
     */

    public static String roll (String dice)
    {
        Random randomGenerator = new Random();

        int diceLength = dice.length();
        int dieRoll = randomGenerator.nextInt(diceLength);
        char diceFace = dice.charAt(dieRoll);

        return Character.toString(diceFace);
    } 

    /**
     * NAME: sum
     * 
     * Return the sum of faces of a given number of dice that are rolled.
     * <p>
     * All dice are assumed to be identical. Each die consists of faces 
     * supplied by the caller as a string, with each
     * character in the string representing one face. Each face must be a digit.
     * <p>
     * The probability of rolling any face should be the same - all dice are "fair".
     *
     * @param  faces        a string representng the faces of each die rolled
     * @param  numRolled    the number of dice rolled. Assumed to be >= 0.
     * @return    the integer sum of all faces rolled
     */

    public static int sum (String faces,int numRolled)
    {
        Random randomGenerator = new Random();
        int count = 0;
        int sum = 0;

        while (count < numRolled)
        { 
            int diceLength = faces.length();
            int dieRoll = randomGenerator.nextInt(diceLength);
            char diceFace = faces.charAt(dieRoll);
            int diceValue = Character.getNumericValue(diceFace);
            sum += diceValue;
            count++;
        }

        return sum; 

    }
}    