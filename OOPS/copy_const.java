import java.util.Scanner;
//Takoing input throw constriuctor 
class Student {
    String name;
    int age;

    public void printinfo() {
        System.out.println("Student namer is " + this.name);
        System.out.println("Student age is " + this.age);
    }

//this is constructor 
    Student(String name, int age) {
        this.age = age;
        this.name = name;
    }
    //construcror ends
}


public class copy_const {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name");
        String name = sc.nextLine();
        
        System.out.println("Entwer student age");
        int age = sc.nextInt();
        
        Student s1 = new Student(name, age);//this object of Student class 

        s1.printinfo();
        ;
        sc.close();
        ;
    }
}