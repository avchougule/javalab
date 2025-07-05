//5. Write a TestEmployee class to print the details of all types of employee (use array[] of Employee Objects)


package lab5;
class Employee4 {
    protected int id;
    protected String name;

    public Employee4(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee4 {
    double salary;

    public FullTimeEmployee(int id, String name, double salary) {
        super(id, name);
        this.salary = salary;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Full Time Employee");
        System.out.println("Salary: " + salary);
    }
}

class PartTimeEmployee extends Employee4 {
    public PartTimeEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Part Time Employee");
    }
}

class ContractEmployee extends Employee4 {
    public ContractEmployee(int id, String name) {
        super(id, name);
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Type: Contract Employee");
    }
}

public class Ass_5 {
    public static void main(String[] args) {
        Employee4[] employees = new Employee4[4];

        employees[0] = new FullTimeEmployee(101, "Amit", 50000);
        employees[1] = new PartTimeEmployee(102, "Sneha");
        employees[2] = new ContractEmployee(103, "Ravi");
        employees[3] = new FullTimeEmployee(104, "Priya", 60000);

        System.out.println("Employee Details are:");
        for (Employee4 emp : employees) {
            System.out.println("--------------------------");
            emp.displayDetails();
        }
    }
}
