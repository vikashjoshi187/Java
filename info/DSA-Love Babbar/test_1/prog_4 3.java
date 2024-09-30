import java.util.Scanner;

public class prog_4 {
int arr[];
    prog_4(int s){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array elemnts");
        
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
    }



void conaure(){
    
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of arry ");
        int s=sc.nextInt();
        prog_4 obj=new prog_4(s);


    }
}
