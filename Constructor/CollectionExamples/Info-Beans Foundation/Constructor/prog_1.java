import java.util.Scanner;
public class prog_1 {
    // 14)WAP to count no. Of elements which lies in between 50 and 100
    int a;
    int arr1[];
    
    prog_1(int a) {
        this.a = a;
    }

    void arryC() {
        Scanner sc = new Scanner(System.in);
        int arr1[] = new int[a];
        System.out.println("Enter Arrya Elemnts ");
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sc.nextInt();
        }
        this.arr1 = arr1;
    }

    int lieB() {
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 50 && arr1[i] < 100) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array");
        int a = sc.nextInt();

        prog_1 obj = new prog_1(a);
        obj.arryC();

        System.out.println("Te number of elemnts int hte arrry lie between 50 and 100 are " + obj.lieB());

    }
}