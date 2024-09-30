/* 30.Create a class Employee with one data member(name).Declare the member function 
a)Employee() :- initializes the data member.
b)getName() :- which gets the name. 
c)setName() :- which sets the name. 
d)pay(int hours_worked)

Create a class HourlyEmployee which takes two data members(name and wage).Use above member function. The pay method should calculate the hourly wage of an employee.
Create a class SalariedEmployee which takes two data members(name and wage).Use above member function. The pay method should calculate the hourly wage of an employee. */

import java.util.Scanner;
class Employee {
    String name;

    Employee() {
        name = "nam";
    }

    void getName() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name  : ");
        name = sc.nextLine();
    }

    void setName(String nam) {
        name = nam;
    }

    double pay(Double time) {
        return time;
    }
}

class HourlyEmployee extends Employee {
    Double wagee;

    void hourlyEmployee(Double wagee) {
        this.wagee = wagee;
    }

    double pay(Double time) {
        return wagee * time;
    }
}

class SalariedEmployee extends Employee {
    Double wage;

    void salariedEmployee(Double wagee) {
        this.wage = wagee;
    }

    double pay(Double time) {
        return wage * time;
    }
}

class Demo {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        SalariedEmployee obj = new SalariedEmployee();
        obj.getName();
        obj.setName(obj.name);
        System.out.println("Enter Salary : ");
        Double salary = sc.nextDouble();
        obj.salariedEmployee(salary);
        System.out.println("Enter Work Hours : ");
        double time = sc.nextInt();
        double work = obj.pay(time);

        HourlyEmployee obj1 = new HourlyEmployee();
        obj1.getName();
        obj1.setName(obj1.name);
        System.out.println("\nEnter Salary : ");
        Double salary1 = sc.nextDouble();
        obj1.hourlyEmployee(salary1);
        System.out.println("Enter Work Hours : ");
        double time1 = sc.nextInt();
        double work1 = obj1.pay(time1);

        System.out.println("\nSalaried Employee Name : " + obj.name);
        System.out.println("Work Time : " + time);
        System.out.println("Salary : " + work);

        System.out.println("\nHourly Employee Name : " + obj1.name);
        System.out.println("Work Time : " + time1);
        System.out.println("Salary : " + work1);
    }
}
