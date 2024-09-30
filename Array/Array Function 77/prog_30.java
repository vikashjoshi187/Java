import java.util.Scanner;

public class prog_30 {
    //30)WAP to find out the element which have highest frequency.

    int s;
    int arr[];

    prog_30(int s) {
        Scanner sc=new Scanner(System.in);

        this.s = s;
        
        int arr[]=new int [s];
        System.out.println("Enter arry elemets");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        this.arr=arr;
    }

    void highFreq() {
        int count = 0, t = 0, vl = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (t < count) {
                t = count;
                vl = i;
            }
            count = 0;

        }
        System.out.println("The element with highest frequency " + arr[vl] + "\nThe frequency is " + t);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arr");
        int s = sc.nextInt();
        prog_30 obj = new prog_30(s);
        obj.highFreq();

    }
}

