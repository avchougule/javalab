
package lab2;
import java.util.*;



public class Voting {
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int age;
		System.out.println("Enter the age:");
		age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("You are eligible for voting.");
			
		}else
		{
			System.out.println("You are not eligible");}
		}
}