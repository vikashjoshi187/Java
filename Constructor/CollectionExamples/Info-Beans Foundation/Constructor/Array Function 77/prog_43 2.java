import java.util.Scanner;
public class prog_43 {
    //43) Java Program to Move All Zeros to the Start of an Array
static Scanner sc = new Scanner(System.in);
    int arr[], s;

    prog_43(int arr1[], int s1) {
        this.arr = arr1;
        this.s = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

    }

    void shiftZero() {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j + 1] == 0) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;  
                }
            }
        }

    }

   void display(){
    System.out.println();
    for (int i = 0; i < arr.length; i++) {
        System.out.print("\t"+arr[i]);
    }
   }


    public static void main(String[] args) {
        System.out.println("Enter the Size of Array ");
        int s = sc.nextInt();
        int arr[] = new int[s];
        prog_43 obj = new prog_43(arr, s);
        obj.getElement();
        obj.shiftZero();
        obj.display();

    }
}





