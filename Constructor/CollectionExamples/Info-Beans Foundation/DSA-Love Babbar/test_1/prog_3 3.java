import java.util.Scanner;
public class prog_3 {
    int arr[];
    int s;
    
    prog_3(int s) {
        Scanner sc = new Scanner(System.in);
        this.s = s;
        System.out.println("Enter the lements of Arry");
        arr = new int[s];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }
    
    
    void display() {
        System.out.println("\nArry elemnts are");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("\t" + arr[i]);
        }
    }

    int [] insertion(){
        for (int i = 0; i < arr.length; i++) {
            int temp=arr[i];
            int j=i;
            while (j>0 && temp<arr[j-1]) {
                arr[j]=arr[j-1];
                j--;
            } 
            arr[j]=temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arry ");
        int s = sc.nextInt();
        prog_3 obj = new prog_3(s);
        obj.display();
        int arr[]=obj.insertion();
        obj.display();

    }

}
