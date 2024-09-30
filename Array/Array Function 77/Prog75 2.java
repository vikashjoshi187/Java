import java.util.Scanner;
class Prog75 {
    int arr[][];
    Prog75(int arr[][]) {
        arr[0] = new int[]{5,4,3,2,1};
        arr[1] = new int[]{0,1};
        arr[2] = new int[]{1,3,2,5,6};
        arr[3] = new int[]{1,3,2,5,6,5,6,9};
        arr[4] = new int[]{0,1};
        this.arr = arr;
    }

    void show() {
        System.out.println("Jagged Array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(" "+arr[i][j]);
                
            }
            System.out.println();
            
        }
    }
    
     public static void main(String args[])
    {
        int arr[][] = new int[5][];
        Prog75 obj = new Prog75(arr);
        obj.show();
    }
}