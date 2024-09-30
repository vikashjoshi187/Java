import java.util.Scanner;

//Takoing input throw constriuctor 
class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println("Student namer is " + this.name);
        System.out.println("Student age is " + this.age);
    }

    // this is copy constructor
    Student(Student s2) {
        this.name = s2.name;
        this.age = s2.age;
    }
    // copy construcror ends

    Student() {

    }
}

public class consrtuct {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();// this object of Student class

        System.out.println("Enter student name");
        s1.name = sc.nextLine();

        System.out.println("Entwer student age");
        s1.age = sc.nextInt();

        Student s2 = new Student(s1);

        s2.printinfo();

        sc.close();
    }
}