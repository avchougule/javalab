//WAP to find the factorial of a number
package lab2;
import java.util.*;

public class Factorial 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int fact,num;
		
		System.out.println("Enter the number for factorial:");
		num=sc.nextInt();
		if(num<0) 
		{
			System.out.println("Factorial is not used for negtive numbers.");
		}else {
			fact=1;
			for(int i=1; i<=num; i++) {
				fact*=i;
			}
			System.out.println("Factorial of " +num+ " is:" + fact);
		}
}
}