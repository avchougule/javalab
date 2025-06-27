package lab3;

public class Employee {
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;
	
	Employee()
	{
		this.employeeId=0;
		this.employeeName="";
		this.basicSalary=0.0;
		this.medical=0.0;
		this.pt=200;
	}
	
	Employee(int employeeId, String employeeName, double basicSalary, double medical)
	{
		this.employeeId= employeeId;
		this.employeeName= employeeName;
		this.basicSalary=basicSalary;
		this.medical=medical;
		this.pt=200;
		calculateSalary();
	}
	
	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}


	private void calculateSalary(){
		hra=0.50*basicSalary;
		pf=0.12*basicSalary;
		grossSalary=basicSalary+hra+medical;
		netSalary=grossSalary-(pf+pt);
		
	}
	
	private void displayEmployeeDetails() {
		System.out.println("EmployeeId:"+employeeId);
		System.out.println("Employee Name:"+employeeName);
		System.out.println("Basic Salary:Rs"+basicSalary);
		System.out.println("hra:"+hra);
		System.out.println("medical:"+medical);
		System.out.println("pf:"+pf);
		System.out.println("pt:"+pt);
		System.out.println("Gross salary:"+grossSalary);
		System.out.println("Net salary:"+netSalary);
	}
	
	public static void main(String[] args) {
		Employee emp=new Employee(101, "Akshay chougule", 25000.0, 500.0);
		emp.displayEmployeeDetails();

	}

}
