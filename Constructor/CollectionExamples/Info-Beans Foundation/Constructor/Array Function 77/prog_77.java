import java.util.Scanner;
class Prog77 {
    //77)WAP showing the concept of multidimensional array
    static Scanner sc = new Scanner(System.in);
    int arr[][][];
    Prog77(int arr[][][]) {
        this.arr = arr;
    }

    void getElement() {
        System.out.println("Enter Elements of Multidimensional Array \n");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Elements in " + (i + 1) + " Array");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter Elements in " + (j + 1) + " Row");
                for (int k = 0; k < arr[i][j].length; k++) {
                    arr[i][j][k] = sc.nextInt();
                }
                System.out.println();
            }
            System.out.println();
        }
    }

    void show() {
        System.out.println("Multidimensional Array ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                for (int k = 0; k < arr[i][j].length; k++) {
                    System.out.print(arr[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    
     public static void main(String args[])
    {
        System.out.println("Enter the Number Of 2-D Array You Want ");
        int nr = sc.nextInt();
        System.out.println("Enter the Number of Rows You Want");
        int r = sc.nextInt();
        System.out.println("Enter the Number of Columns You Want ");
        int c = sc.nextInt();
        int arr[][][] = new int[nr][r][c];
        Prog77 obj = new Prog77(arr);
        obj.getElement();
        obj.show();
    }
}