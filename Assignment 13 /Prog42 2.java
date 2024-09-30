/* 42. Create a class Student with two members : rollno and percentage.
Create default and parameterized constructors. Create method show() to display information.
Create another class CollegeStudent inherits Student class. Add a new member semester to it. Create default and parameterized constructors. Also override show() method.

Create another class SchoolStudent inherits Student class. Add a new member classname(eg 12 th ,10 th etc.) to it. Create default and parameterized constructors. Also override show() method.

Create a class(say XYZ) with main method that carries out the operation of the
project :
-- has array to store objects of any class(Student or CollegeStudent,SchoolStudent)
--create two CollegeStudent and three SchoolStudent record objects and store them inside the array
-- display all record from the array
-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent.--count how many students are having A grade, if for A grade percentage >75  */

import java.util.Scanner;
class Student {
    int roll;
    float percentage;

    Student() {
    }

    Student(int roll, float percentage) {
        this.roll = roll;
        this.percentage = percentage;
    }

    void Show() {
        System.out.println("Roll number " + roll);
        System.out.println("Percentage is  " + percentage);
    }

    static void Agrade(Student schStudent[], Student collStudent[]) {
        int count = 0;
        for (int i = 0; i < schStudent.length; i++) {
            if (schStudent[i].percentage > 75) {
                count++;
            }
        }

        for (int i = 0; i < collStudent.length; i++) {
            if (collStudent[i].percentage > 75) {
                count++;
            }
        }
        System.out.println("Number of Student With A Grade is " + count);

    }

}

class CollageStudent extends Student {
    int sem;

    CollageStudent() {
    }

    CollageStudent(int roll, float percentage, int sem) {

        super(roll, percentage);
        this.sem = sem;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Sem is" + sem);
    }
}

class SchoolStudent extends Student {
    String Classname;

    SchoolStudent() {
    }

    SchoolStudent(int rollno, float percentage, String Class) {
        super(rollno, percentage);
        this.Classname = Class;
    }

    @Override
    public void Show() {
        super.Show();
        System.out.println("Class name is " + Classname);
    }
}

class Prog42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student schStudent[] = new SchoolStudent[3];
        for (int i = 0; i < schStudent.length; i++) {
            System.out.println("\n\nEnter details for School Student " + (i + 1));
            sc.nextLine();
            System.out.println("Enter Class");
            String Class = sc.nextLine();
            System.out.println("Enter roll num");
            int rollno = sc.nextInt();
            System.out.println("Enter Percentage");
            float per;
            do {
                per = sc.nextFloat();
                if (per > 100) {
                    System.out.println("Invalid Percent Please Reenter");
                }
            } while (per > 100 || per < 0);
            schStudent[i] = new SchoolStudent(rollno, per, Class);
        }
        Student collStudent[] = new CollageStudent[3];
        for (int i = 0; i < collStudent.length; i++) {
            System.out.println("\n\nEnter details for CollageStudent " + (i + 1));
            System.out.println("Enter Sem");
            int sem = sc.nextInt();
            System.out.println("Enter roll num");
            int rollno = sc.nextInt();
            System.out.println("Enter Percentage");
            float per;
            do {
                per = sc.nextFloat();
                if (per > 100) {
                    System.out.println("Invalid Percent Please Reenter");
                }
            } while (per > 100 || per < 0);
            collStudent[i] = new CollageStudent(rollno, per, sem);
        }

        for (int i = 0; i < schStudent.length; i++) {
            System.out.println("\n\n\nDetails of School Student" + (i + 1));
            schStudent[i].Show();
        }

        for (int i = 0; i < collStudent.length; i++) {
            System.out.println("\n\n\nDetails of Collage Student" + (i + 1));
            collStudent[i].Show();
        }
        int check;
        do {
            System.out.println("\nEnter Roll no.");
            int SerchRoll = sc.nextInt();
            for (int i = 0; i < schStudent.length; i++) {
                if (SerchRoll == schStudent[i].roll) {
                    System.out.println("The Student is in School");
                    break;
                }
            }

            for (int i = 0; i < collStudent.length; i++) {
                if (SerchRoll == collStudent[i].roll) {
                    System.out.println("The Student is in Collage");
                    break;
                }
            }
            Student.Agrade(schStudent, collStudent);
            System.out.println("Do You Want To Verify Another Student \nIf Yes Press 1 Otherwise Press Any Key ");
            check = sc.nextInt();
        } while (check == 1);
    }
}
