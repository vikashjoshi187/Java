import java.util.Scanner;
public class uppr_not_02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char a;
        System.out.print("Enter a character \n");
        a=sc.next().charAt(0);
        if(a>=65 && a<=90){
            System.out.println("Upper case");
        }
        else{
            System.out.println("Lower case");
        }


    }
}
