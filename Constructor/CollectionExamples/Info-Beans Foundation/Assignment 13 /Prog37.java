//37. Make list of Students having name, roll no., age, score. Write a program to accept 10 students record and arrange the Students based on the score group [0-50], [50-65],[65-80],[80-100].
import java.util.Scanner;
class Student{ 
    Scanner sc = new Scanner(System.in);     
     int roll,age;
     float eng,hindi,math,science,social,score,total;
     String name;
     Student()
     {
        System.out.println("Enter Name of Student");
        name = sc.nextLine();
        System.out.println("Enter Age of Student");
        age = sc.nextInt();
        System.out.println("Enter Roll Number of Student");
        roll = sc.nextInt();
        System.out.println("Enter Marks of 5 Subject's (Out of 100)");
        eng= sc.nextFloat();
        hindi = sc.nextFloat();
        math= sc.nextFloat();
        science = sc.nextFloat();
        social = sc.nextFloat();
        total=eng+math+science+social+hindi;
        score= (total*100)/500;
     }
     void first()
     {        
        System.out.println(name+"\t"+roll+"\t\t"+age+"\t"+score);
     }
     
}
class Ass13_37_oops{
    public static void main(String args[])
    {   
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number Of Students : ");
        int ar = sc.nextInt();
        Student std[]=new Student[ar];
        
        for(int i=0;i<std.length;i++){
         std[i]=new Student();
        }
        System.out.println("Score Between 80 to 100");
        System.out.println("Name\t\tRoll Number\tAge\tScore");
        for(int i=0;i<std.length;i++){
          if(std[i].score>=80 && std[i].score<100)
           std[i].first();  
        } 
        System.out.println("Score Between 65 to 80");
        System.out.println("Name\t\tRoll Number\tAge\tScore");
        for(int i=0;i<std.length;i++){
          if(std[i].score>=65 && std[i].score<80)
           std[i].first();  
        }
        System.out.println("Score Between 50 to 65");
        System.out.println("Name\t\tRoll Number\tAge\tScore");
        for(int i=0;i<std.length;i++){
          if(std[i].score>=50 && std[i].score<65)
           std[i].first();  
        }
        System.out.println("Score Between 0 to 50");
        System.out.println("Name\t\tRoll Number\tAge\tScore");
        for(int i=0;i<std.length;i++){
          if(std[i].score>=0 && std[i].score<50)
           std[i].first();  
        }              
    }
}