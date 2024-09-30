import java.util.Scanner;
class matix {

    int arr1[][];
    int arr2 [][];
    int c1;

    void sedta(int arr1[][], int arr2[][],int c1) {
        this.arr1=arr1;
        this.arr2=arr2;
        this.c1=c1;
    }

    int[][] multi() {
    
        int arr3[][] = new int[arr1.length][arr2[0].length];
        if (arr1.length == arr2[0].length) {
            for (int i = 0; i < arr3.length; i++) {
                for (int j = 0; j < arr3.length; j++) {
                    for (int k = 0; k < c1; k++) {
                        arr3[i][j]+=arr1[i][k]*arr2[k][j];
                    }
                }
            }
        }
    return arr3;
    }
    
    
    
    void arr1Fun(int r1,int c1){
        Scanner sc=new Scanner(System.in);
        int arr1[][] = new int[r1][c1];

        System.out.println("Enter elemnts in array 1");

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < c1; j++) {
                arr1[i][j]=sc.nextInt();
            }
        }
       this.arr1=arr1;
       this.c1=c1;
       
    }
    
    
    void arr2Fun(int r2,int c2){
        Scanner sc=new Scanner(System.in);
        int arr2[][] = new int[r2][c2];

        System.out.println("Enter elemnts in array 2");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < c2; j++) {
                arr2[i][j]=sc.nextInt();
            }
        }
       this.arr2=arr2;
       
    }


public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        matix obj=new matix();
        int r1, c1, r2, c2;
        
        System.out.println("Enter the row for 1arry ");
        r1 = sc.nextInt();
        
        System.out.println("Enter the column 1 array  ");
        c1 = sc.nextInt();
        //obj.arr1Fun(r1, c1);
        
        
        System.out.println("Enter the row for 2 arry ");
            r2 = sc.nextInt();

            System.out.println("Enter the column 2 array  ");
            c2 = sc.nextInt();
            
            //obj.arr2Fun(r2, c2);

            if (r1!=c2) {
            System.out.println("Matrix not possible");
            System.exit(9);
                
            }

        int arr3[][]=new int [r1][c2];


        obj.arr1Fun(r1, c1);
        obj.arr2Fun(r2, c2);
        obj.sedta(arr3, arr3, c1);
        //arr3= obj.multi();

        
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[0].length; j++) {
                System.out.print("\t"+arr3[i][j]);
                
            }
            System.out.println();
        }
    }
}