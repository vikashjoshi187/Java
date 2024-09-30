import java.util.Scanner;
class Student {
    String name;
    int  age;

    public void printinfo() {
        System.out.println("Student namer is "+this.name);
        System.out.println("Student age is "+this.age);
    }
  
}
public class obj_class {

    public static void main(String[] args) {
        Student s1=new Student();
        Scanner sc=new Scanner(System.in);

        System.out.println("student name");
        s1.name=sc.nextLine();

        System.out.println("student Age");
        s1.age=sc.nextInt();
        s1.printinfo();
        
    }
}