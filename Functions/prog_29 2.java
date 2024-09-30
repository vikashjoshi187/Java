
import java.util.Scanner;

public class prog_29 {
    // 29)WAP to merge two arrays.

    int[] merge(int arr1[],int arr2[]) {

        int j=0;
        for (int i = arr1.length-arr2.length; i < arr1.length; i++){
            arr1[i]=arr2[j];
            j++;
        }

        return arr1;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        prog_29 obj=new prog_29();
        System.out.println("Enter sie of array 1");
        int s1 = sc.nextInt();
        
        System.out.println("Enter sie of array 2");
        int s2 = sc.nextInt();

        int arr1[]=new int [s1+s2];

        int arr2[]=new int [s2];

        System.out.println("Enter elemnts in arry 1");

        for (int i = 0; i < s1; i++) {

            arr1[i]=sc.nextInt();
            
        }


        System.out.println("Enter elemnts in arry 2");

        for (int i = 0; i < s2; i++) {

            arr2[i]=sc.nextInt();
            
        }



        arr1=obj.merge(arr1, arr2);

        for (int i = 0; i < arr1.length; i++) {
            System.out.println("\t"+arr1[i]);
            
        }

        


    }

}
