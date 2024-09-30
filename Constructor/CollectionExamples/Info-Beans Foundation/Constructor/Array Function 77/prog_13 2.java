import java.util.Scanner;
public class prog_13 {
//13)WAP to count no. Of elements which are greater than or equals to 50
    static Scanner sc = new Scanner(System.in);
    int s, arr[];
    prog_13(int arr[], int s) {
        this.arr = arr;
        this.s = s;
    }
    void marks() {
        System.out.println("Enter the Element");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    void countgrt(){
        int count =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>=50) {
                count++;
                
            }
        }
        System.out.println("The number of elemnts wich are greater then or equal to 50 is "+count);
    }

    public static void main(String[] args) {
        System.out.println("Enter th Size of Array");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_13 obj = new prog_13(arr, s);
        obj.marks();
        obj.countgrt();
    }
}