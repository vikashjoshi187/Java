import java.util.Scanner;
public class prog_38 {
    //33)WAP to merge two arrays and arrange them in ascending order
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sze array 1");
        int s1 = sc.nextInt();
        System.out.println("Enter the size of array 2");
        int s2 = sc.nextInt();

        int arr1[] = new int[s1+s2];
        System.out.println("Enter elements in arry 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        int arr2[] = new int[s2];
        System.out.println("Enter elements in arry 2");
        for (int i = 0; i < s2; i++) {
            arr2[i] = sc.nextInt();
        }
        
        for (int i = s1,t=0; i < arr1.length; i++,t++) {
        arr1[i]=arr2[t];
        }
        System.out.println();

        
        System.out.println("Normal array");
        for (int i = 0; i < arr1.length; i++) {
        System.out.print(arr1[i]+" ");
        }
        System.out.println();
        for (int i = 0; i < arr1.length; i++) {
            for (int j = i+1; j < arr1.length; j++) {
                if (arr1[i]>arr1[j]) {
                    int temp=arr1[i];
                    arr1[i]=arr1[j];
                    arr1[j]=temp;
                }
            }
        }
        System.out.println("Sorted array");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i]+" ");
            }
        }
    }
