/*Create a class Student (rollno, name) which keeps track of how many objects are created of the class. 
Every time object of the class is created, it should display number of total objects created */

import java.util.Scanner;
class Prog15 {
    String name;
    int rollno;
    static int count;

    void getStudent() {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter Student name : ");
        name = sc.nextLine();
        System.out.println("Enter Rollno : ");
        rollno = sc.nextInt();
    }

    void showdeatil() {
        System.out.println("\nName : " + name);
        System.out.println("\nrollno : " + rollno);
    }

    static void tobject() {
        System.out.println("\nTotal Object Created : " + count);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student : ");
        int num = sc.nextInt();
        Prog15 p[] = new Prog15[num];
        int count = 0;
        for (int i = 0; i < p.length; i++) {
            count++;
            p[i] = new Prog15();
            p[i].getStudent();
        }
        Prog15.count = count;
        for (Prog15 pobj : p) {
            pobj.showdeatil();
        }
        Prog15.tobject();
    }
}