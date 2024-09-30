import java.util.Scanner;
public class prog_12 {
    // 12)WAP to count no. Of even and odd elements
    static Scanner sc = new Scanner(System.in);
    int s, arr[];
    prog_12(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    void marks() {
        System.out.println("Enter the Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void diplay() {
    int ev = 0, od = 0;
    for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter numver " + i);
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                ev++;            
            } 
            else 
            {
                od++;
            }
        }
        System.out.println("number even eletments are " + ev + "\nnumber odd elemnts are " + od);
    }

    public static void main(String[] args) {
        System.out.println("Enter th Size of Array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_12 obj = new prog_12(arr, s);
        obj.marks();
        obj.diplay();
    }
}