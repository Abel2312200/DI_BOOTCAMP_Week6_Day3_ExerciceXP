import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        // declaration global variables
        int digitHundred, digitTen, digitUnit;

        // course loop of numbers from 0 to 5
        for (int numberTocheck = 0; numberTocheck < 501; numberTocheck++) {

            digitHundred = numberTocheck / 100; // find digit a hundred
            digitTen = (numberTocheck - digitHundred * 100) / 10 ; // find digit te
            digitUnit = numberTocheck % 10; // find digit unit

            if((Math.pow(digitUnit,3) + Math.pow(digitTen,3)+ Math.pow(digitHundred,3)) == numberTocheck){
                System.out.println(numberTocheck); // display the Armstrong number
            }
        }

    }
}
