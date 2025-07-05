/*3. Create SalesPerson class extending WageEmployee with attributes as sales(int) and commission (int). Overide the ComputeSalary()
in Salesperson class and print the salary and details of SalesPerson*/
package lab5;
class WageEmployee1 {
    int empId;
    String name;
    int hours;
    int rate;

    // Constructor
    WageEmployee1(int empId, String name, int hours, int rate) {
        this.empId = empId;
        this.name = name;
        this.hours = hours;
        this.rate = rate;
    }

    // Method to compute base salary
    int computeSalary() {
        return hours * rate;
    }

    // Method to print details
    void display() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Hours Worked: " + hours);
        System.out.println("Hourly Rate: " + rate);
    }
}

class SalesPerson extends WageEmployee1 {
    int sales;
    int commission;

    // Constructor
    SalesPerson(int empId, String name, int hours, int rate, int sales, int commission) 
    {
        super(empId, name, hours, rate);
        this.sales = sales;
        this.commission = commission;
    }

    // Overriding computeSalary
    @Override
    int computeSalary() {
        return super.computeSalary() + (sales * commission);
    }

    // Overriding display method
    @Override
    void display() {
        super.display();
        System.out.println("Sales Made: " + sales);
        System.out.println("Commission per Sale: " + commission);
        System.out.println("Total Salary: " + computeSalary());
    }
}

public class Ass_3 {
    public static void main(String[] args) {
        SalesPerson sp = new SalesPerson(101, "Akshay", 40, 200, 10, 50);
        sp.display();
    }
}
