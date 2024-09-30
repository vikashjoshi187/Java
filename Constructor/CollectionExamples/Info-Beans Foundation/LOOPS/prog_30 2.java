import java.util.Scanner;
public class prog_30 {
    //1   +    11  +  111 + 1111 +  11111 +….
    //i*10+1   i*10+1   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter na number of terms");
        int num=sc.nextInt();
        int temp=0,c=0;
        for (int i = 0; i < num; i++) {
            temp=temp*10+1;
            c=c+temp;
        }
        System.out.println(c);
    }
}
