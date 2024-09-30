import java.util.Scanner;
public class prog_40 {
    //WAP to count no. Of even and odd digits in a number
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num, dub, digi,ev=0,od=0;
        System.out.println("Enter a number");
        num = sc.nextInt();
        while (num > 0) {
            digi=num%10;
            if (digi%2==0){
                ev++;
            }
            else{
                od++;
            }
        num=num/10;
        }
        System.out.println("The number even digit is "+ev+"\nThe number of odd digit is "+od);
       
    }
}
