import java.util.Scanner;


public class prog_30 {
    //30) Java Program to Sort Names in an Alphabetical Order
void sortname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int s=sc.nextInt();
        sc.nextLine();
        
        String arr[]=new String[s];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextLine();
            
        }
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i].compareTo(arr[j])>0) {
                    String temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    
                }
                
            }
            
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" "+arr[i]);
            
        }

}

    public static void main(String[] args) {

     prog_30 obj=new prog_30();
     obj.sortname();




    }

}
