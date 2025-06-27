/*Declare three array of integer types ,Accept values for two array.Perform
arithmetic operation on both array values and store corresponding values in third
array. e.g: c[0]=a[0]+b[0]*/

package lab3;
import java.util.*;
public class ArrayAddition {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of array:");
		
		int size=sc.nextInt();
		
		int[] a=new int[size];
		int[] b=new int[size];
		int[] c=new int[size];
		
		System.out.println("Enter the value for first array:");
		for(int i=0;i<size;i++)
		{
			System.out.println("a["+i+"]=");
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the value for second array:");
		for(int i=0;i<size;i++)
		{
			System.out.println("b["+i+"]=");
			b[i]=sc.nextInt();
		}

			for(int i=0;i<size;i++)
			{
				c[i]=a[i]+b[i];
				
			}
			System.out.println("The addition of two arrays are::");
			for(int i=0;i<size;i++)
			{
				System.out.println("C["+i+"]="+c[i]);
			}
	}

}
