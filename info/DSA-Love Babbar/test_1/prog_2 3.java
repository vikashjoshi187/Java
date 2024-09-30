import java.util.Scanner;
public class prog_2 {
    int arr[];
    int s;
    
    prog_2(int s) {
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
    
    int[] Split() {

        for (int i = 0; i < arr.length/2; i++) {
            int temp = arr[0];
            for (int j = 0; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
            arr[arr.length - 1] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of arry ");
        int s = sc.nextInt();
        prog_2 obj = new prog_2(s);
        obj.display();
        int arr[]=obj.Split();
        obj.display();

    }

}
