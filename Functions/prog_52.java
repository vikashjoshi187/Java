import java.util.Scanner;

public class prog_52 {
//28)1	2	3	4	 Hello	6	7	8	9	Hello	11	….
    void prntpHello(int num) {
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= num; i++) {
        if(i%5==0){
            System.out.print("\tHello");
        }
        else{
            System.out.print("\t"+i);
        }
    }
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_52 obj = new prog_52();
        System.out.println("Enter a range for print series till  N numbers");
        int nm = sc.nextInt();
        obj.prntpHello(nm);
    }
}

