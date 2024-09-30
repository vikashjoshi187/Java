import java.util.Scanner;

public class porg_32 {
    // A	b	C	d	E	f	G	h	…… n terms 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num=sc.nextInt();
        int up=65,low=98;
        for (int i = 0; i < num; i++) {
        
            if (i%2==0) {
                
                System.out.print(" "+(char)up+" ");
                up=up+2;
            } 
            else {
                System.out.print(" "+(char)low+" ");
                low=low+2;
                
            }
            
        }


    }
}
