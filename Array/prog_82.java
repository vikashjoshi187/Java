import java.util.Scanner;

public class prog_82 {
    //77)WAP showing the concept of multidimensional array

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number 2d arry you want ");
        int nr = sc.nextInt();
        System.out.println("Enter the number of rows you want");
        int r = sc.nextInt();
        System.out.println("Enter the col ypu want ");
        int c = sc.nextInt();

        int arr[][][] = new int[nr][r][c];


        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter elements in "+(i+1)+" array");

            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("Enter elements in "+(j+1)+" row");

                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                       
                    arr[i][j][j2]=sc.nextInt();
                    
                }
                System.out.println();
                
            }
            System.out.println();
            
        }


System.out.println("printing the elements ");
        for (int i = 0; i < arr.length; i++) {


            for (int j = 0; j < arr[i].length; j++) {


                for (int j2 = 0; j2 < arr[i][j].length; j2++) {
                       
                            System.out.print(arr[i][j][j2]+" ");
                    
                }
                System.out.println();
                
            }
            System.out.println();
            
        }

    }

}
