import java.util.Scanner;
public class prog_20 {
    // WAP to merge two arrays.
    static Scanner sc = new Scanner(System.in);
    int arr1[], arr2[], s1, s2;

    prog_20(int arr1[], int arr2[], int s1, int s2){
        this.arr1 = arr1;
        this.arr2 = arr2;
        this.s1 = s2;
        this.s2 = s2;
    }

    int[] merge(int arr1[],int arr2[]) {
        int j=0;
        for (int i = arr1.length-arr2.length; i < arr1.length; i++){
            arr1[i]=arr2[j];
            j++;
        }
        return arr1;
    }
    public static void main(String[] args) {
        System.out.println("Enter Size of 1st Array");
        int s1 = sc.nextInt();
        System.out.println("Enter Size of 2nd Array");
        int s2 = sc.nextInt();
        int arr1[]=new int [s1+s2];
        int arr2[]=new int [s2];
        prog_20 obj=new prog_20(arr1, arr2, s1, s2);
        System.out.println("Enter Elements of 1st Array ");
        for (int i = 0; i < s1; i++) {
            arr1[i]=sc.nextInt();   
        }
        System.out.println("Enter Elemnts of 2nd Array");
        for (int i = 0; i < s2; i++) {
            arr2[i]=sc.nextInt();   
        }
        arr1=obj.merge(arr1, arr2);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print("\t"+arr1[i]);   
        }System.out.println();
    }
}