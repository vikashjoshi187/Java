/* 9.Create a class Employee with members (empid, salary).Create following functions
   a)calcTax() with employee object as argument and print tax on salary with 12.5% tax rate;
   b)max() which accepts two employee as objects and return the employee with higher salary   */

import java.util.Scanner;
class Employee {

    private int empid;
    private double salary;

    // Constructor
    public Employee(int empid, double salary) {
        this.empid = empid;
        this.salary = salary;
    }

    // Getter for empid
    public int getEmpid() {
        return empid;
    }

    Employee() {
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Function to calculate tax on salary with 12.5% tax rate
    public void calcTax() {
        double tax = salary * 0.125;
        System.out.println("Tax on salary: " + tax);
    }

    // Function to return employee with higher salary
    public static Employee max(Employee emp[]) {
        Employee e = emp[0];
        for (int i = 0; i < emp.length; i++) {
            if (e.salary < emp[i].salary) {
                e.empid = emp[i].empid;
                e.salary = emp[i].salary;
            }
        }
        return emp[0];
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbe of Employe");
        int empnum = sc.nextInt();
        Employee emp[] = new Employee[empnum];
        for (int i = 0; i < emp.length; i++) {
            System.out.println("Enter Employee id ");
            int id = sc.nextInt();
            System.out.println("Enter Employee Salary");
            double Sla = sc.nextDouble();
            emp[i] = new Employee(id, Sla);
            emp[i].calcTax();
        }

        Employee empMax = Employee.max(emp);
        System.out.println("Employee with higher salary: " + empMax.getEmpid());
    }
}