import java.util.Scanner;
public class prog_33 {
    //33)WAP to merge two arrays and arrange them in ascending order

    static Scanner sc = new Scanner(System.in);
    int arr1[],arr2[],s2,s1;

    prog_33(int arr1[], int s1,int arr2[],int s2) {
        this.arr1 = arr1;
        this.s1 = s1;
        this.arr2 = arr2;
        this.s2 = s2;
    }

    void getElement() {
        System.out.println("Enter the Array Elements in array 1");
        for (int i = 0; i < s1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the Array Elements in array 2 ");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
    }

   

    void merfArr() {


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

    public static void main(String[] args) {
        System.out.println("Enter the Size of Array ");
        int s1 = sc.nextInt();
        System.out.println("Enter the Size of Array ");
        int s2 = sc.nextInt();
        int arr1[] = new int[s1+s2];
        int arr2[] = new int[s2];
        prog_33 obj = new prog_33(arr1,s1,arr2,s2);
        obj.getElement();
        obj.merfArr();

    }
}
