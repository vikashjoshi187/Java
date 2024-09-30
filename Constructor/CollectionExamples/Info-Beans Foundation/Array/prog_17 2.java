import java.util.Scanner;

public class prog_17 {
    // 12)WAP to count no. Of even and odd elements
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of number you want to add");
        int num = sc.nextInt();
        int arr[] = new int[num];
        int ev = 0, od = 0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numver " + i);
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                ev++;
            } else {
                od++;
            }

        }

        System.out.println("number even eletments are " + ev + "\nnumber odd elemnts are " + od);
    }
}
