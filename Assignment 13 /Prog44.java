// Create Interface Taxable with members salesTax=7% and incomeTax=10.5%. Create abstract method calcTax().
// a. Create class Employee(empId,name,salary) and implement Taxable to calculate incomeTax on yearly salary.
// b. Create class Product(pid,price,quantity) and implement Taxable to calculate salesTax on unit price of product.
// c. Create class for main method(Say XYZ), accept employee information and a product information from user and print income tax and sales tax respectively.

import java.util.Scanner;
interface Taxable {
    int salesTax = 7;
    double incomeTax = 10.5;

    double calcTax();
}

class Employee implements Taxable {
    int empId;
    String name;
    double salary;

    Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    public double calcTax() {
        return (incomeTax * (salary * 12) / 100);
    }
}

class Product implements Taxable {
    int pid;
    int quantity;
    double price;

    Product(int pid, int quantity, double price) {
        this.pid = pid;
        this.quantity = quantity;
        this.price = price;
    }

    public double calcTax() {
        return (price) * salesTax / 100;
    }
}

class Prog44 {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println(" Enter Employee Name , Id and Salary  : ");
        String name = ip.next();
        int empId = ip.nextInt();
        double salary = ip.nextDouble();
        Employee ob = new Employee(empId, name, salary);
        System.out.println("incomeTax on yearly salary : " + ob.calcTax());

        System.out.println(" Enter Product Id , Quantity and Price :  ");
        int pid = ip.nextInt();
        int quantity = ip.nextInt();
        double price = ip.nextDouble();
        Product obj = new Product(pid, quantity, price);
        System.out.println("salesTax on unit price of product : " + obj.calcTax());
    }
}
