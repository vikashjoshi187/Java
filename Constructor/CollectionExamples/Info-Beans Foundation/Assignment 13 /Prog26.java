// 26.Create a class Employee with two protected data member (name, payRate).
// Declare two member function
// a)void getName() :- which accepts name.
// b)float getPay() :- which accepts the pay.
// Create a class Manager with one data member is_salaried (which should be in the form of 0(false) or 1(true).
// Declare one member function
// a)int is_salaried() :- which returns whether the manager is salaried or not. b)showDetail() :- it display the entire detail of a employee.

import java.util.Scanner;
class Emp{
    protected String name;
    protected float payrate;
    void getname(String name)
    {
        this.name=name;

    }
    float getpay(float sal)
    {
        payrate=sal;
        return payrate;
    }
}
    class Manager{
            int is_Salaried;
            
            int is_Salaried()
            {        Scanner sc=new Scanner(System.in);

                System.out.println("if manager is saleried enter enter 1 if not press 0");
                int s=sc.nextInt();
                return s;
            }
            void showDetail(Emp obj)
            {
                System.out.println("Name of the Employee\t"+obj.name);
                System.out.println("Salary of the Employee\t"+obj.payrate);

            }
    }


public class Prog26 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Emp eobj=new Emp();
        System.out.println("Enter name of the Employee");
        String name=sc.nextLine();
        eobj.getname(name);
        System.out.println("enter salary of the employee");
        float sal=sc.nextFloat();
        eobj.getpay(sal);
        Manager mobj=new Manager();
        int saln=mobj.is_Salaried();
        if(saln==1)
        {
            mobj.showDetail(eobj);
        } else 
        System.out.println("Manager is not salaried");
       // mobj.showDetail(eobj);

        
    }
    
}
