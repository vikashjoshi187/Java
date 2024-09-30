import java.util.Scanner;

public class prog_46 {
    //46) WAP to replace all EVEN elements by 0 and Odd by 1 in One Dimensional Array
    static Scanner sc = new Scanner(System.in);
    int arr1[], s1;

    prog_46(int arr1[], int s1) {
        this.arr1 = arr1;
        this.s1 = s1;

    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

    }

    void odEvn() {
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] % 2 == 0) {
                arr1[i] = 0;
            } else {
                arr1[i] = 1;
            }

        }
    }

    void display(){
        for (int i = 0; i < arr1.length; i++) {
          System.out.print("\t"+arr1[i]);

        }

    }

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array 1");
        int s1 = sc.nextInt();

        int arr1[] = new int[s1];

        prog_46 obj = new prog_46(arr1, s1);
        obj.getElement();
        obj.odEvn();
        obj.display();

    }
}

