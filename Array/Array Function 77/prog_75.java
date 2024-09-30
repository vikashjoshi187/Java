import java.util.Scanner;
public class prog_75 {
    //75)WAP showing the concept of jagged array without taking inputs from user
    int arr[][];
    prog_75(int arr[][]) {
        arr[0] = new int[]{1,2,3};
        arr[1] = new int[]{0,1};
        arr[2] = new int[]{1,2,3,4};
        this.arr = arr;
    }

    void show() {
        System.out.println("Jagged Array  ");
        for(int a[] : arr){
            for(int a1 : a){
            System.out.print(a1+"\t");
            }
            System.out.println();
        }
    }
    
     public static void main(String args[])
    {
        int arr[][] = new int[3][];
        prog_75 obj = new prog_75(arr);
        obj.show();
    }
}