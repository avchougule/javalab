//WAP to check whether a given year is a LEAP year

package lab2;
import java.util.*;
public class Leap {
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
	
		System.out.println("Enter the year:");
		int year=sc.nextInt();
		if((year%4==0 && year%100!=0)||(year%400==0))
		{
			System.out.println("Leap year");
		}
		else
		{
			System.out.println("Not a leap year");
		}
	}
}
