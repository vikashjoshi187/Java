import java.util.Scanner;
public class EXPRSN_39 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float numx,numy,numz;
        System.out.println("Enter a number");
        numx=sc.nextFloat();
        numy=numx-2+3*numx-7;
        System.out.println("The value of y is "+numy);
        numy=numx++ + ++numx;
        System.out.println("The valus of x is "+numx+" and y is "+numy);
        numz= numx++ - --numy - --numx + numx++;
        System.out.println("The valus of numx is "+numx+" numy is "+numy+" and value of numz is "+numz);
    }
}
