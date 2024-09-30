import java.util.Scanner;

public class prog_8 {
    // 8) Program to get marks of 5 subjects from user and find out its grade using
    // nested if else
    void grade() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Entet the marks of sub 1 ");
        int s1 = sc.nextInt();

        System.out.println("Entet the marks of sub 2 ");
        int s2 = sc.nextInt();

        System.out.println("Entet the marks of sub 3 ");
        int s3 = sc.nextInt();

        System.out.println("Entet the marks of sub 4 ");
        int s4 = sc.nextInt();

        System.out.println("Entet the marks of sub 5 ");
        int s5 = sc.nextInt();

        int percent = (s1 + s2 + s3 + s4 + s5) * 100 / 500;

        if (percent >= 75 && percent <= 100) {
            System.out.println("A Grade");
        } 
        else if (percent >= 60 && percent < 75) {
            System.out.println("B Grade");
        } 
        else if (percent >= 50 && percent < 60) {
            System.out.println("C Grade");
        }

        else if (percent >= 33 && percent < 50) {
            System.out.println("D Grade");
        } else {
            System.out.println("Fail");
        }

    }

    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        prog_8 obj = new prog_8();

        obj.grade();

    }

}
