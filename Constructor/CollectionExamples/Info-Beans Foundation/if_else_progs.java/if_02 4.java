import java.util.Scanner;

public class if_02 {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = sc.nextInt();
        System.out.println("Enter the value of b");
        b = sc.nextInt();
        if (a>b)
        System.out.println(a+" is bigger ");
        else 
        System.out.println(b+" is bigger ");

    }
}
