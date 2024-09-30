import java.util.Scanner;
public class prog_6 {
    // 6) Program to check whether entered year is a leap year or not using nested if else
 
    String character(int a){
       String b ;
        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            b = "Year is a Leap Year";
        }else{
            b = "Year is not a Leap Year";
        }
        return b;
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter a Year");
        int a = sc.nextInt();
        prog_6 obj = new prog_6();
        System.out.println(obj.character(a));

    }
}