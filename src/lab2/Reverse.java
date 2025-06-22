//WAP to reverse the given number
package lab2;
import java.util.Scanner;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number:");
		int number =sc.nextInt();
		int reversed=0;
		while(number!=0)
		{
			int digit= number%10;
			reversed= reversed*10+digit;
			number=number/10;
		}
		System.out.println("Reversed number "+number+" is:"+reversed);
	}

}
