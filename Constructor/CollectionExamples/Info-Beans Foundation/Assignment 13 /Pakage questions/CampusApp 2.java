
package campus;
import java.util.Scanner;
import campus.academics.Student;
import campus.accounts.Fees;
public class CampusApp{
    int facultyId,rollNo;
    byte age,sem;
    String name,address,branch;
    float fees;
    CampusApp(String name,byte age,String address,int rollNo,String branch,byte sem,float fees){
        this.name = name;
        this.age = age;
        this.address = address;
        this.rollNo = rollNo;
        this.branch = branch;
        this.sem = sem;
        this.fees = fees;
    }
    public void showData() {
        System.out.println(branch + "\t\t" + fees + "\t\t" + name + "\t" + rollNo + "\t\t" + age+"\t"+address+"\t"+sem);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Student : ");
        int number = sc.nextInt();
        Student sobj[] = new Student[number];
        CampusApp cmps[] = new CampusApp[number];
            for(int i=0;i<number;i++){
                sobj[i] = new Student();
                cmps[i] = new CampusApp(sobj[i].getName(),sobj[i].getAge(),sobj[i].getAddress(),sobj[i].getRollNo(),sobj[i].getBranch(),sobj[i].getSem(),Fees.getFees());
            }
        System.out.println("---------------: DETAILS OF FACULTY :---------------");
        System.out.println("Branch Name\tFees\tStudent Name\tRoll Number\tStudent Age\tStudent Address\tSemester");

        for(int i=0;i<number;i++){
            cmps[i].showData();   
        }
    }
}
