//Generate the Fib… series 1 1 2 3 5 8 13
package lab2;
import java.util.*;
public class Fibonacci 
{
	public static void main(String[] args)
	{	
		Scanner sc=new Scanner(System.in);
		int num,fibo,n1=0,n2=1,n3,i;
		System.out.println("Enter the number for Fibonacci series:");
		num=sc.nextInt();
		System.out.println(""+n1+"\n"+n2);
		
		for(i=2; i<num ;i++)
		{
			n3=n1+n2;
			System.out.println(""+n3);
			n1=n2;
			n2=n3;
		}
		
	}
}
