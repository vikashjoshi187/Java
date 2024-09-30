import java.util.Scanner;
class Student {
    int rno;
    double per;
    String name;

    Student(int rno,String name,double per) {
        
        this(rno,name);
        this.per=per;
    }

    // Student(int rno) {
    //     this(rno, 56.67);
    // }

    Student(int rno, String  name) {
        this.name=name;
        this.rno=rno;
    }

    // Student(int rno, double per, String name) {
    //     this.rno = rno;
    //     this.per = per;
    //     this.name = name;
    // }
    
    void display() {
        System.out.println("Roll Number : " + rno);
        System.out.println("Percentage : " + per);
        System.out.println("Name : " + name);
    }
}

class CDemo10 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter roll");
        int roll = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter per");
        double per=sc.nextDouble();
        
        
        
        Student s = new Student(roll,name);
        Student s1 = new Student(roll,name,per);
        s.display();
        s1.display();
    }
}