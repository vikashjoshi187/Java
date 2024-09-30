import java.util.Scanner;
public class prog_70 {
    /*
     1
    1*1
   1***1
  1*****1
 1*******1
11111111111
*/
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();
for (int i = 1; i <= num; i++) {
    for (int sp= 1; sp <= num-i; sp++) {
        System.out.print(" ");
        
    }
    for (int j = 1; j <=(i*2)-1 ; j++) {
        if(j==(i*2)-1 || i==num || j==1)
        {
            System.out.print(1);
        }
        else{
            System.out.print("*");
        }
        
    }
    System.out.println();
    
}

}    
}
