import java.util.Scanner;
class Prog76 {
    //76)WAP showing the concept of jagged array by taking inputs from user
    static Scanner sc = new Scanner(System.in);
    int arr[][];
    Prog76(int arr[][]) {
        this.arr = arr;
    }

    void col() {
        for (int i = 0; i < arr.length;i++){
            System.out.println("Enter Number Of Columns in Row "+(i+1));
            int columns = sc.nextInt();
            arr[i] = new int [columns];
        }
    }

    void getElement() {
        System.out.println("Enter Elements of Jagged Array ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.println("Enter Element of "+(i+1)+","+(j+1));
                arr[i][j] = sc.nextInt();
            }
        }
    }

    void show() {
        System.out.println("Jagged Array Is ");
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length;j++){
                System.out.print(arr[i][j]+"\t");
            }System.out.println();
        }
    }
    
     public static void main(String args[])
    {
        System.out.println("Enter Number Of Rows ");
        int row = sc.nextInt();
        int arr[][] = new int [row][];
        Prog76 obj = new Prog76(arr);
        obj.col();
        obj.getElement();
        obj.show();
    }
}