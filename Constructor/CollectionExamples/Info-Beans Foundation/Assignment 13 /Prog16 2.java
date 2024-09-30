/*Create a class TCSEmployee with data members name, eid, salary and companyName to store information of All TCS’s 
Employee records. Create functions which accept these members value and display them. Now u need to manage that companyName 
should be assign only once, no matter how many number of object of this class created. */
import java.util.Scanner;
class TCSEmployee
{
    String Employe_name,company_name="TCS COMPANY";
    int Employee_id,Employee_salary;
    
    void getEmplloyeedetail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee name : ");
        Employe_name = sc.nextLine();
        System.out.println("Enter Employee id : ");
        Employee_id = sc.nextInt();
        System.out.println("Enter Employee Salary : ");
        Employee_salary = sc.nextInt();
        
    }
    void showcompnayname()
    {
        System.out.println(":-----------"+company_name+"---------------:");
    }
    void showdeatil()
    {
        System.out.println("Employee Name : "+Employe_name);
        System.out.println("Employee id : "+Employee_id);
        System.out.println("Employee Salary : "+Employee_salary+"\n");
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number of Employee : ");
        int num = sc.nextInt();

        TCSEmployee T [] = new TCSEmployee[num];
        TCSEmployee obj = new TCSEmployee();
        
        for(int i = 0; i<T.length ;i++)
        {
            T[i] = new TCSEmployee();
            T[i].getEmplloyeedetail();  
        }
        obj.showcompnayname();
        for(TCSEmployee E : T)
        {
            E.showdeatil();
        }
    }
}