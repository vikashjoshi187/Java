/* 
47. Add following package to above structure
▪campus.accounts
o Fees(Student, amount, paymentDate)
▪ campus -
o CampusApp- this class contains main method to accept 4 Students information with their fees for second semester and print total fees collected from all 4 students.
Take your assumptions regarding subject, branch and student data. Create this application as a runnable jar file.

*/
package campus.accounts;
import java.util.Scanner;
public class Fees {
    public static float getFees(){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter The Fees ");
        float fees =  sc.nextFloat();
        return fees;
    }
}
