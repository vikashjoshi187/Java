import java.util.Scanner;
public class prog_61 {
    //WAP to find out all the leap years between two entered years
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int num1,num2;
    System.out.println("Enter  number 1");
    num1=sc.nextInt();
    System.out.println("Enter  number 2");
    num2=sc.nextInt();
    for (int i = num1; i <= num2; i++) {

        if ((i % 100 != 0 &&  i % 4 == 0||i%400==0)) {

            System.out.println(i+" is a leap year");

        }
        
    }

}    
}
