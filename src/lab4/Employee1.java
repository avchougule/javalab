/*Write an Employee class with id, name and dob(Contained Object.. Containment)with Default and parameterised constructor & toString().*/
package lab4;

class DateOfBirth{
	private int day;
	 private int month;
	private int year;
	
	public DateOfBirth() {
		this.day=01;
		this.month=02;
		this.year=2003;
	}
	
  public DateOfBirth(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}

   @Override
   public String toString() {
	return "DateOfBirth [day=" + day + ", month=" + month + ", year=" + year + "]";
   }

}

public class Employee1 {
	
	private int id;
	private String name;
	private DateOfBirth dob;
	
	public Employee1(){
		this.id=0;
		this.name="Not Assigned";
		this.dob=new DateOfBirth();
	}
	public Employee1(int id, String name, DateOfBirth dob ){
		this.id=id;
		this.name=name;
		this.dob=dob;
	}

	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", dob=" + dob + "]";
	}
	public static void main(String[] args) {
		
		Employee1 emp1=new Employee1();
		
		DateOfBirth dob= new DateOfBirth(16,01,2001);
		
		Employee1 emp2= new Employee1(101,"Akshay",dob);
		
		System.out.println(emp1);
		System.out.println(emp2);
		
	}

}
