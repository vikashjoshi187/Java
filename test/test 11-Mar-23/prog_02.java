import java.util.Scanner;

import javax.xml.transform.Source;

import java.lang.Math;

public class prog_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an number");
        int num = sc.nextInt();
        int ld = num % 10;
        int fd = 0;
        System.out.println("last digit is "+ld);
        int t = num;
        while (t > 0) {
            fd = t;
            t = t / 10;
        }
        System.out.println("first digit "+fd);
        t = num;
        int digi = 0;
        while (t > 0) {
            digi++;
            t = t / 10;
        }
        System.out.println(digi);
        t=num;
        System.out.println("the "+Math.pow(fd,digi));
        double mt=t-(Math.pow(fd, 10));
        System.out.println(mt);

    }

}
