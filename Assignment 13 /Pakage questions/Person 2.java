
/*46. Create a following class/package structure in your application. Filled squares are
packages and empty circles are classes.
campus.data
Person (name, age, address)
campus.academics
o Student(rollno, branch, semester) inherits Person▪
o Faculty(facultyId, name, salary, branch) inherits Person
campus
o CampusApp- this class contains main method to accept 5 Faculty
information and print total of salaries of all faculties.*/
package campus.data;
/* @author vishn */
import java.util.Scanner;
public class Person {
    public String name,address;
    public byte age;
    public Person(){}
    public Person(String name,byte age,String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public String getName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name : ");
        String name = sc.nextLine(); 
        return name;
    }
    public byte getAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Age : ");
        byte age = sc.nextByte(); 
        return age;
    }
    public String getAddress(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Address : ");
        String address = sc.nextLine(); 
        return address;
    }
}
