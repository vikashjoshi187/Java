import java.util.Scanner;
public class btn_50_100_15 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        if(a>=50 && a<=100){
            System.out.println("The number lies between 50 and 100");
        }
        else{
            System.out.println("The number do not lie between 50 and 100");
        }
    }
    
}
