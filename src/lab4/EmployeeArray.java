//2. Write program to create array of employee object, and print all employee information
package lab4;

class Employee
{
	int id;
	String name;
	double salary;
	
	Employee(int id, String name, double salary)
	{
	this.id=id;
	this.name=name;
	this.salary=salary;
	}
	
	void dispalyInfo()
	{
		System.out.println("id="+id);
		System.out.println("name="+name);
		System.out.println("salary="+salary);
		System.out.println("------------");
	}
}
public class EmployeeArray {

	public static void main(String[] args) {
		Employee[] employees= new Employee[3];
		
		employees[0]= new Employee(101,"Akshay",10152);
		employees[1]= new Employee(102,"Harry",15200);
		employees[2]= new Employee(101,"Karan",5000);
	
		
		System.out.println("Employee Details are:");
		for(int i=0;i<employees.length; i++) 
		{
			employees[i].dispalyInfo();
		}
	}

}
