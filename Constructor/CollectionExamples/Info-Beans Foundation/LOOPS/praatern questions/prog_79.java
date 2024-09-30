import java.util.Scanner;
public class prog_79 {
    /*
123456789
 1+++++7
  1+++5
   1+3
    1
*/
public static void main(String[] args) {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter a number");
    int num=sc.nextInt();

for (int i = num; i >= 1; i--) {
    for (int sp = 1; sp <= num-i; sp++) {
        System.out.print(" ");
        
    }
    
    for (int j = 1; j <= (i*2)-1; j++) {
        if(j==1 || j==(i*2)-1 || i==num){
            System.out.print(j);
        }
        else{
            System.out.print("+");
        }
        
    }
    
    System.out.println();
    
}

}    
}
