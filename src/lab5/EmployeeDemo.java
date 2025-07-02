/*2. Create class WageEmployee extending Employee class with attributes as hrs
(int)and rate(int) and method computeSalary() to calculate the salary.Print the
salary and details of WageEmployee.
(Note: Use the previous date and Employee classes. Accept the values from the
user..Default, Parameterised Constructor and toString() to be written in all the
classes)*/
package lab5;

import java.util.*;
class Date{
	int day, month, year;
		Date(){
			day=1;
			month=1;
			year=2000;
		}

	   Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}

	   @Override
	   public String toString() {
		return "day=" + day + ", month=" + month + ", year=" + year+"" ;
	   }
	   
}

class Employee extends Date{
	int id;
	String name;
	Date dob;
Employee(){
	id=0;
	name="Unknown";
	dob=new Date();
}
	Employee(int id, String name, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.dob = dob;
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", dob=" + dob+"";
	}
	
}

class WageEmployee extends Employee{
	int hrs,rate;
	WageEmployee(){
		super();
		hrs=00;
		rate=00;
	}
	public WageEmployee(int id, String name,Date dob, int hrs, int rate) {
		super(id, name, dob);
		this.hrs = hrs;
		this.rate = rate;
	}
	
	int computeSalary(){
     return hrs*rate;
      }
	@Override
	public String toString() {
		return "hrs=" + hrs + ", rate=" + rate + ", computeSalary()=" + computeSalary() + "";
	}
	
}

public class EmployeeDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Employee ID:");
		int id=sc.nextInt();
		
		System.out.println("Enter employee name:");
		sc.nextLine();
		String name=sc.nextLine();
		
		System.out.println("Enter date of birth:");
		int d=sc.nextInt();
		int m=sc.nextInt();
		int y=sc.nextInt();
		Date dob = new Date(d, m, y);
		
		System.out.println("Enter working hour:");
		int hrs=sc.nextInt();
		
		System.out.println("Enter rate per hour:");
		int rate=sc.nextInt();
		
		WageEmployee we= new WageEmployee(id, name, dob, hrs, rate);
		
		System.out.println("Details are:");
		System.out.println(we);
		

	}

}
