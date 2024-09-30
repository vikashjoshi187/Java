/*  Create a class Student with data member (rno, fees and static member totalFees).Create parameterized constructor 
 which update the totalFees and create member function which prints the total fees collected of all the students.   */

import java.util.Scanner;
class Student {
    int rno;
    int fees;
    String name;
    static int totalFees = 0;

    Student(){}

    Student(String name, int rno, int fees) {
        this.name = name;
        this.rno = rno;
        this.fees = fees;
        this.totalFees += fees;
    }

    void show() {
        System.out.println("\nName : "+name);
        System.out.println("Roll Number : "+rno);
        System.out.println("Fees : "+fees);
    }

    static void printTotalFees() {
        System.out.println("Total fees collected: " + totalFees);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of student : ");
        int num = sc.nextInt();
        Student s[] = new Student[num];

        for (int i = 0; i < s.length; i++) {
            sc.nextLine();
            System.out.print("\nEnter Name : ");
            String name = sc.nextLine();
            System.out.println("Enter Roll Number : ");
            int rno = sc.nextInt();
            System.out.println("Enter Fees : ");
            int fees = sc.nextInt();
            s[i] = new Student(name, rno, fees);
        }

        for (Student obj : s){
            obj.show();
        }
        Student.printTotalFees();
    }
}