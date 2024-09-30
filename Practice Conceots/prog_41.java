
/*
 41. Create three classes Faculty (facultyid, salary)
FullTimeFaculty (basic, allowance) inherits class Faculty
PartTimeFaculty (hour, rate) inherits class Faculty

Create a method for accepting input in FullTimeFaculty and PartTimeFaculty, 
but salary should not be accepted. Salary is calculated on the basis of (basic+allowance) 
for FullTimeFaculty and (hour*rate) for PartTimeFaculty. 
Also create method in above classes to display faculty data.

Create another class(say XYZ) for main method and store 2 fulltime and 
2 parttime faculty information. Also print their details.

 */
import java.util.Scanner;

class Faculty {
    int facultyId;
    double salary;

}

class FullTimeFaculty extends Faculty {
    double basic, allowance;

    void setData(Double basic,Double allowance){
        this.basic=basic;
        this.allowance=allowance;
        this.salary=basic+allowance;
    }

    void showData(FullTimeFaculty obj){
        System.out.println("Basic Salary is "+this.basic);
        System.out.println("Allowance is "+this.allowance);
        System.out.println(" Salary is "+this.salary);
    }

}

class PartTimeFaculty extends Faculty {
    int hour, rate;
   
    void setData(int hour,int rate){
        this.hour=hour;
        this.rate=rate;
        this.salary=hour*rate;
    }

    void showData(PartTimeFaculty obj){
        System.out.println("Hour is "+this.hour);
        System.out.println("Rate is "+this.rate);
        System.out.println(" Salary is "+this.salary);
    }

}
class prog_41 {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

System.out.println("For Fulltime Faculty");      
    System.out.println("Enter Basic");
    double basic=sc.nextDouble();
    System.out.println("Enter Allowance");
    double allowance=sc.nextDouble();
   
    FullTimeFaculty Ft=new FullTimeFaculty();
    Ft.setData(basic,allowance);

   
    System.out.println("For Parttime Faculty");      
    System.out.println("Enter Hour");
    int  hour=sc.nextInt();
    System.out.println("Enter Rate");
    int  Rate=sc.nextInt();
    
    PartTimeFaculty Pt=new PartTimeFaculty();
    Pt.setData(hour,Rate);
    
    System.out.println("\nCalling Method to show Data of Full time Faculty");
    
    Ft.showData(Ft);
   
    System.out.println("\n\nCalling Method to show Data of Part time Faculty");      
    Pt.showData(Pt);
}
    
}
