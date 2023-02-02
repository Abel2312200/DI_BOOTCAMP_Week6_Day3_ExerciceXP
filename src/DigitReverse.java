import java.util.Scanner;

public class DigitReverse {
    public static void main(String[] args) {
        // Declaration global variables
        Scanner se = new Scanner(System.in);
        int numberToReverse, sizeNumberInString;
        String numberInString, numberReversedInString ="";

        // retrieve number value
        System.out.print("Please enter your number : ");
        numberToReverse = se.nextInt();

        // convert the number to reverse
        numberInString = String.valueOf(numberToReverse); //convert number for
        var reversedInString = numberInString.toCharArray(); // convert string array

        // treatment inversion process
        sizeNumberInString = reversedInString.length;
        for (int i = 1; i <= sizeNumberInString; i++) {
            var num = reversedInString[sizeNumberInString-i];
            numberReversedInString += num;
        }
        // display result
        System.out.println(numberReversedInString);
    }
}
