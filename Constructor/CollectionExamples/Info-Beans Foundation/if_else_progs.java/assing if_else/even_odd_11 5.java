import java.util.Scanner;


public class even_odd_11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a number");
        a=sc.nextInt();
        if(a%2==0){
            System.out.println(a+" is even number");
        }
        else{
            System.out.println(a+" is odd number");
        }
    }
}
