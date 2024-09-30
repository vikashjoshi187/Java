import java.util.Scanner;

//PROGRAM TO SHOW RTHW CONCEP OF POLYMORPHISM 
class Student {
    String name;
    int age;
    
    public void printinfo(String name,int age) {//CREATING SAME NAME FUNCTION 1
        System.out.println("Student namer is " + this.name);
        System.out.println("Student age is " + this.age);
    }
    
    public void printinfo(String name) {//CREATING SAME NAME FUNCTION 2
        System.out.println("Student namer is " + this.name);
    }

    public void printinfo(int age) {//CREATING SAME NAME FUNCTION 3
        System.out.println("Student age is " + this.age);
    }
}
public class polymorphism {
    public static void main(String[] args) {         
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();// this object of Student class

        System.out.println("Enter student name");
        s1.name = sc.nextLine();

        System.out.println("Entwer student age");
        s1.age = sc.nextInt();

        s1.printinfo(s1.name,s1.age);// CallingSame name funtion 1
        s1.printinfo(s1.name);// CallingSame name funtion 2
        s1.printinfo(s1.age);// CallingSame name funtion 3
        sc.close();
    }
}