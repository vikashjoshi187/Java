import java.util.Scanner;

class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number ");
        int num = sc.nextInt();

        int rem, temp = num;
        int sum = 0;
        int fact = 1;

        while (num > 0) {
            rem = num % 10;
            for (int i = 1; i <= rem; i++) {
                fact = fact * i;
            }
            sum = sum + fact;
            fact = 1;
            num = num / 10;
        }
        
        if (temp == sum) {
            System.out.println("Strong num");
        } else {
            System.out.println(" Not Strong num");

        }
    }
}
