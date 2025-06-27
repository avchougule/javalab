/*Write a class Addition2 with add method (overloading) using varargs and
enhanced for loop*/
package lab3;

public class Addition2 {
	//method to add int
	public int add(int...numbers) {
		int sum=0;
		for(int num:numbers) {
			sum=sum+num;
		}
		return sum;
	}
	//method to add double
	public double add(double...numbers) {
		double sum=0.0;
		for(double num:numbers) {
			sum=sum+num;
		}
		return sum;
	}

	public static void main(String[] args) {
		Addition2 addition= new Addition2();
		
		System.out.println("The integer addition is:"+addition.add(1,2,5,6,8));
		System.out.println("The double addition is:"+addition.add(1.60,2.5));

	}

}
