import java.util.Scanner;
public class prog_81 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //75)WAP showing the concept of jagged array without taking inputs from user

        int arr[][] = new int[5][];
        
        arr[0]=new int[] {1,2,5,4,3};
        arr[1]=new int[] {1,2};
        arr[2]=new int[] {1,2,5,4,3};
        arr[3]=new int[] {1,2,5,4};
        arr[4]=new int[] {1};
        

       

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);

            }
            System.out.println();

        }

    }
    
}
