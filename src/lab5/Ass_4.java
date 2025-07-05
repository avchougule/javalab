/*4. Create Manager class extending Employee class with attributes as fixedsalary(int) and incentives(int) and method computeSalary() to calculate the
salary of Manager .Print the salary and details of Manager*/

package lab5;

//Base Employee class
class Employee3 {
 int empId;
 String name;

 // Constructor
 Employee3(int empId, String name) {
     this.empId = empId;
     this.name = name;
 }

 // Method to display employee details
 void displayDetails() {
     System.out.println("Employee ID: " + empId);
     System.out.println("Name: " + name);
 }
}

//Manager class extending Employee
class Manager extends Employee3 {
 int fixedSalary;
 int incentives;

 // Constructor
 Manager(int empId, String name, int fixedSalary, int incentives) {
     super(empId, name);
     this.fixedSalary = fixedSalary;
     this.incentives = incentives;
 }

 // Method to compute total salary
 int computeSalary() {
     return fixedSalary + incentives;
 }

 // Display full details including salary
 void displayManagerDetails() {
     displayDetails(); // from Employee
     System.out.println("Fixed Salary: " + fixedSalary);
     System.out.println("Incentives: " + incentives);
     System.out.println("Total Salary: " + computeSalary());
 }
}

//Main class to test the Manager
public class Ass_4 {
 public static void main(String[] args) {
     Manager mgr = new Manager(101, "Akshay", 50000, 10000);
     mgr.displayManagerDetails();
 }
}