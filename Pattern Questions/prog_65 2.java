import java.util.Scanner;
public class prog_65 {
    /*
     X
    X_X
   X___X
  X_____X
 X_______X
XXXXXXXXXXX
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
            System.out.print("X");
        }
        else{
            System.out.print("_");
        }
        
    }
    System.out.println();
    
}

}    
}
