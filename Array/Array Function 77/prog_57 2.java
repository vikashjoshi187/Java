import java.util.Scanner;
public class prog_57 {
    /*
 57) Given two arrays of integers A and B of sizes M and N respectively. Write a Write a java program, which will produce a third array named C. such that the following sequence is followed. 
All even numbers of A from left to right are copied into C from left to right. 
All odd numbers of A from left to right are copied into C from right to left. 
All even numbers of B from left to right are copied into C from left to right. 
All old numbers of B from left to right are copied into C from right to left.
     */
    static Scanner sc = new Scanner(System.in);
    int size1,size2,A[], B[];

    prog_57(int arr[],int arr1[],int size,int size2) {
        A = arr;
        B = arr1;
        size1 = size;
        this.size2 = size2;
    }

    void getElement() {
        System.out.println("Enter the elements of the array-1");
		for (int i = 0; i < size1; i++) {
			A[i] = sc.nextInt();
		}
        System.out.println("Enter the elements of the array-2");
		for (int i = 0; i < size2; i++) {
			B[i] = sc.nextInt();
		}
    }

    void evenOdd() {
        int C[] = new int[size1]; 
        int j=0;
        for(int i=0;i<size1;i++){
            if(A[i]%2==0){
                C[j]=A[i]; 
                j++;
            }
        }
        System.out.println("\nThe Elements of Array C (Even Elements of Array A )");
        for (int i=0;i<j;i++) {
            System.out.print(C[i]+"\t");
        }
        
        /* All odd numbers of A from left to right are copied into C from right to left */
        j=0;
        for(int i=size1-1;i>=0;i--){
            if(A[i]%2!=0){
                C[j] = A[i];
                j++;
            }
        }
        System.out.println("\nThe Elements of Array C (Odd Elements of Array A )");
        for (int i=0;i<j;i++) {
            System.out.print(C[i]+"\t");
        }
        
        /* All even numbers of B from left to right are copied into C from left to right */
        int c[] = new int[size2];
        j=0;
        for(int i=0;i<size2;i++){
            if(B[i]%2==0){
                c[j]=B[i]; 
                j++;
            }
        }
        System.out.println("\nThe Elements of Array C (Even Elements of Array B ) -> ");
        for (int i=0;i<j;i++) {
            System.out.print(c[i]+"\t");
        }

        /* All old numbers of B from left to right are copied into C from right to left */
        j=0;
       for(int i=size2 -1;i>=0;i--){
            if(B[i]%2!=0){
                c[j] = B[i];
                j++;
            }
        }
        System.out.println("\nThe Elements of Array C (Odd Elements of Array B ) -> ");
        for (int i=0;i<j;i++) {
            System.out.print(c[i]+"\t");
        }System.out.println();
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of first Array -> ");
		int size1 = sc.nextInt();
        int A[] =new int[size1];
        System.out.println("Enter the size of second array -> ");
        int size2 = sc.nextInt();
		int B[] = new int [size2];
        prog_57 obj = new prog_57(A,B,size1,size2);
        obj.getElement();
        obj.evenOdd();
	}
}