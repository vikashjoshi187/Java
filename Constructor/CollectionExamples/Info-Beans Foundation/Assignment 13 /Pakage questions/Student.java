package campus.academics;

import campus.data.Person;
import java.util.Scanner;
public class Student extends Person{
    int rollNo;
    String branch;
    byte semester;
    public Student(){}

    public int getRollNo(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Roll Number : ");
        int rollNo = sc.nextInt();
        return rollNo;
    }
    public String getBranch(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Branch Name : ");
        String branch = sc.nextLine();
        return branch;
    }
    public byte getSem(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Semester : ");
        byte sem = sc.nextByte();
        return sem;
    }
//    static{
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Roll Number : ");
//        int rollNo = sc.nextInt();
//        System.out.print("\nEnter Branch : ");
//        sc.nextLine();
//        String branch = sc.nextLine();
//        System.out.print("\nEnter Semester : ");
//        byte semester = sc.nextByte();
//        Student s = new Student(rollNo,branch,semester);
//    }
}
