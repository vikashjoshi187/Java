import java.util.Scanner;
public class div_a_b_14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter number 1");
        a=sc.nextInt();
        System.out.println("Enter number 2");
        b=sc.nextInt();
        if(a%b==0){
            System.out.println("number 1 is divisivbe by number 2 ");
        }
        else{
            System.out.println("number 1 is not divisivbe by number 2 ");
        }
        System.out.println();
    }
}
