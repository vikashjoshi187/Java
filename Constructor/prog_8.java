import java.util.Scanner;
public class prog_8 {
    //3)WAP to take marks of 7 subjects from a user and print it.
    int  arr[];
    prog_8(){
        int arr[]=new int [7];
        System.out.println("Enter marks of 5 subjects");
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Enter marks of subject "+(i+1));
            arr[i]=sc.nextInt();
        }
        this.arr=arr;
    }
    void prinMrks(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(" Marks of subject "+(i+1)+" is "+arr[i]);
        }
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    prog_8 obj=new prog_8();
    obj.prinMrks();
    }
}
