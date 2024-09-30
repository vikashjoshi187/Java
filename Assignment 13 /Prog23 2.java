/*  23.Create three classes :-
Faculty (facultyname, department, salary) 
FullTimeFaculty (basic, allowance) inherits class Faculty 
PartTimeFaculty (hour, rate) inherits class Faculty

Create a function for accepting input for FullTimeFaculty and PartTimeFaculty but salary should not be accepted. 
Salary is calculated on the basis of (basic+allowance) for FullTimeFaculty and (hour*rate) for PartTimeFaculty. 
Also create function for displaying data for any faculty.   */

import java.util.Scanner;
class Faculty {
    String facultyname, department;
    double salary;
}
class FullTimeFaculty extends Faculty {
    double basic, allowance;
    FullTimeFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Faculty Name : ");
        facultyname = sc.nextLine();
        System.out.println("Enter Department Name : ");
        department = sc.nextLine();
        System.out.println("Enter Basic salary : ");
        basic = sc.nextDouble();
        System.out.println("Enter Allowance : ");
        allowance = sc.nextDouble();
        salary();
    }
    void salary() {
        salary = basic + allowance;
    }
}
class PartTimeFaculty extends Faculty {
    double rate, hour;
    PartTimeFaculty() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Faculty Name : ");
        facultyname = sc.nextLine();
        System.out.println("Enter Department Name : ");
        department = sc.nextLine();
        System.out.println("Enter Number of Hours Worked : ");
        hour = sc.nextDouble();
        System.out.println("Enter Rate per Hour : ");
        rate = sc.nextDouble();
        salary();
    }
    void salary() {
        salary = hour * rate;
    }
}
class Prog23 {
    static void displayFacultyData(Faculty faculty) {
        System.out.println("Faculty Name : "+faculty.facultyname);
        System.out.println("Department : "+faculty.department);
        System.out.println("Salary : "+faculty.salary);
    }
    public static void main (String args[]) {
        FullTimeFaculty obj = new FullTimeFaculty();
        PartTimeFaculty obj1 = new PartTimeFaculty();
        displayFacultyData(obj);
        displayFacultyData(obj1);
    }
}