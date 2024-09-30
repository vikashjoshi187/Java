import java.util.Scanner;
public class prog_3 {
    //3)WAP to take marks of 7 subjects from a user and print it.
    static Scanner sc = new Scanner(System.in);
    int  arr[];
    prog_3(int arr[]){
        System.out.println("Enter Marks of 7 Subjects -> ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter Marks of Subject " + (i+1) + " -> ");
            arr[i]=sc.nextInt();
        }
        this.arr=arr;
    }
    void prinMrks(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Marks of "+(i+1)+" Subject -> "+arr[i]);
        }
    }
    public static void main(String[] args) {
    int arr[]=new int [7];
    prog_3 obj=new prog_3(arr);
    obj.prinMrks();
    }
}