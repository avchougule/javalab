/*2. Create a class Medicine to represent a drug manufactured by a
pharmaceutical company. Provide a function displayLabel() in this class to print
Name and address of the company.
Derive Tablet, Syrup and Ointment classes from the Medicine class. Override the
displayLabel() function in each of these classes to print additional information
suitable to the type of medicine. For example, in case of tablets, it could be
“store in a cool dry place”, in case of ointments it could be “for external use
only” etc.
Create a class TestMedicine. Write main function to do the following:
Declare an array of Medicine references of size 10
Create a medicine object of the type as decided by a randomly generated integer
in the range 1 to 3.
Refer Java API Documentation to find out random generation feature.
Check the polymorphic behavior of the displayLabel() method.*/

package lab6;
class Medicine{
	String companyName="AV Pharma Ltd";
	String address="123, Near Road Pune";
	
	public void displayLabel()
	{
			System.out.println("Company name: "+companyName);
			System.out.println("Company address: "+address);
	}
}

class Tablet extends Medicine{
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Medicine Type: Tablet");
		System.out.println("Note: Store in cool dry places./n");
	}
	
}
class Syrup extends Medicine{
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Medicine Type: Syrup");
		System.out.println("Note: Store in cool dry places./n");
	}		
	
}
class Ointments extends Medicine{
	@Override
	public void displayLabel() {
		super.displayLabel();
		System.out.println("Medicine Type: Ointments");
		System.out.println("Note: For external use only./n");
		
}
}

public class Ass_2
{

	public static void main(String[] args) {
		Medicine md= new Medicine();
		md.displayLabel();

	}	
}
	
	
	