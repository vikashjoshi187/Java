import java.util.Scanner;
public class prog_31 {
   //9	99	999	9999	  99999 …….
//   temp*10+9   
public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter na number of terms");
        int num=sc.nextInt();
        int temp=0;
        for (int i = 0; i < num; i++) {
         temp=temp*10+9;
            System.out.println(temp);
        }

    }
}
