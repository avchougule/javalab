//WAP to find whether a given number is an Armstrong number
package lab2;
import java.util.*;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int originalNumber = number;
        int result = 0;
        int digits = 0;

        // Find number of digits
        int temp = number;
        while (temp != 0) {
            digits++;
            temp /= 10;
        }

        // Calculate the sum of the powers of digits
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            result += Math.pow(digit, digits);
            temp /= 10;
        }

        // Check if the result is equal to the original number
        if (result == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}
