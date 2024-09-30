import java.util.Scanner;
public class prog_7 {
    //1)WAP to set marks of 5 subjects manually and print it by indexing, for loop, while loop, do while loop and for each loop separately.
    int  arr[];
    prog_7(){
        int arr[]=new int [5];
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
    prog_7 obj=new prog_7();
    obj.prinMrks();
    }
}
