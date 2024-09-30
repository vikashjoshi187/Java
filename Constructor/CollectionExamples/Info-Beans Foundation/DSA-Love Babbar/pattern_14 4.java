import java.util.Scanner;

 class pattern_14 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows an col");
        int n = sc.nextInt();
        int i = n;
        while (i >= 1) {

            int j = 1;
            while (j <= i) {

                if (j <= i) {
                    System.out.print("*");
                }
                j++;
            }
            System.out.println();
            i--;
        }

    }
}
