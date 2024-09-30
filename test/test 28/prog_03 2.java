import java.util.Scanner;

public class prog_03 {

    int arr1[][];
    int r, c;

    prog_03(int r ,int c) {
    this.r = r;
    this.c = c;
    }
    
    
    void matrix() {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        int arr1[][] = new int[r][c];
        System.out.println("Enter array elements ");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                arr1[i][j] = sc.nextInt();
            }
            System.out.println();
        }


        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
            System.out.print(" "+arr1[i][j]);
            }
            System.out.println();
        }
        this.arr1 = arr1;
    }
    
    int prog_03() {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr1[0].length; j++) {
                if (i==0 && j==0 || i==j || j==(arr1.length-1)-i) {
                    sum=sum+arr1[i][j];
                    
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter row of array");
        int r = sc.nextInt();
        System.out.println("Enter the column of arry");
        int c = sc.nextInt();
        
        prog_03 obj =new prog_03(r,c);
        obj.matrix();
       int sum= obj.prog_03();
        System.out.println(sum);
    }
}
