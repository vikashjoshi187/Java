/*  Write a program to define a class Student with the following specification
Private members of class Student
admno	integer
sname	string 
eng, math, science		float
total	float
ctotal() (a Function to calculate eng + math + science with float return type.)

Public member function of class Student
takeData() (a Function to accept values for admno, sname, eng, science and invoke ctotal() to calculate total.)
showData() (a Function to display all the data members on the screen.)   */

import java.util.Scanner;
class Prog4 {
    private String Sname;
    private int admno;
    private float eng, math, science;

    void takedata(String Sname, int admno, float eng, float math, float science) {
        this.Sname = Sname;
        this.admno = admno;
        this.eng = eng;
        this.math = math;
        this.science = science;
    }

    float ctotal() {
        float total = eng + math + science;
        return total;
    }

    void show(float total) {
        System.out.println(": S T U D E N T  I N F O R M A T I O N :");
        System.out.println("Student Name : " + Sname);
        System.out.println("Admission No. : " + admno);
        System.out.println("English Marks : " + eng);
        System.out.println("Maths Marks : " + math);
        System.out.println("Science Marks : " + science);
        System.out.println("Total Marks : " + total);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Prog4 obj = new Prog4();
        System.out.println("Enter name : ");
        String Sname = sc.nextLine();
        System.out.println("Enter Admission No. : ");
        int admno = sc.nextInt();
        System.out.println("Enter English mark : ");
        float eng = sc.nextFloat();
        System.out.println("Enter math mark : ");
        float math = sc.nextFloat();
        System.out.println("Enter science mark: ");
        float science = sc.nextInt();
        obj.takedata(Sname, admno, eng, math, science);
        float total = obj.ctotal();
        obj.show(total);
    }
}