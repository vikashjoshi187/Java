import java.util.Scanner;
public class prog_22 {
    //28)WAP to search an element from an array using Binary search

    void  binaryS(){

Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array ");
        int s=sc.nextInt();

        int arr[]=new int [s];

        System.out.println("Enter the arry Elements ");

        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
            
        }

        System.out.println("Enter a elemnt for search");
        int vl = sc.nextInt();
        int l=0,h=arr.length-1;
        while (l<=h) {
            int mid=(l+h)/2;
            if (arr[mid]==vl) {
                System.out.println("The element is at the position "+mid);
                break;
                
            }
            else if (vl>arr[mid]) {
                
                l=mid+1;
            }
            else{
                h=mid-1;
            }
            
        }
        if (l>h) {

            System.out.println("no such elemnt int th arry");
        }
   


    }

    public static void main(String[] args) {

     prog_22 obj=new prog_22();
     obj.binaryS();
        
    }
    
}
