import java.util.Scanner;
public class prog_6 {
    //PROGRAM TO FIND FATOR OF A NUMBER
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a nukmber");
        int num = sc.nextInt(), temp = 0;
        int i = 1;
        for (; i <=(num/2); i++) {
            if (num % i == 0) {
                System.out.println(i+" IS FACTOR OF "+num);
            }
        }
        
    }
}