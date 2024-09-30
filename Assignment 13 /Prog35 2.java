 import java.util.Scanner;
 class Employee {
    int salary;
    static int empNo=0;
    static int totalSalary = 0;
    
    public Employee(int Salary) {
        this.salary = Salary;
        empNo++;
        totalSalary += salary;
    }
   
     static void displayStats() {
        System.out.println("\nTotal employees: " +empNo);
        System.out.println("Total salary: " + totalSalary);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("no.of employee");
        int no = sc.nextInt();
        Employee emp[] = new Employee[no];
        for(int i = 0;i<emp.length;i++)
        {
            System.out.println("enter salary of Employee "+(i+1));
            int salary = sc.nextInt();
            emp[i] = new Employee(salary);
        }
        Employee.displayStats();
    }
}