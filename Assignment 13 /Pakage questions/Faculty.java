package campus.academics;

import campus.data.Person;
import java.util.Scanner;
public class Faculty extends Person {
    public int facultyId;
    public byte age;
    public float salary;
    public String name,branch;
    public Faculty() {
    }
    public int getId(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Faculty Id : ");
        int facultyId = sc.nextInt();
        return facultyId;
    }
    public float getSalary(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Salary : ");
        float salary = sc.nextFloat();
        return salary;
    }
    public String getBranch(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Branch : ");
        String branch = sc.nextLine();
        return branch;
    }

    public Faculty(int facultyId, float salary, String branch) {
        Faculty f = new Faculty(facultyId, salary, branch);   
        this.facultyId = facultyId;
        this.salary = salary;
        this.branch = branch;
        
    }

}
