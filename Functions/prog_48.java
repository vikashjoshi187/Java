import java.util.Scanner;
public class prog_48 {
    //48)WAP to find out the factors of a number.
    void prntTable(int num) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a range to check factor for "+num);
        int temp=sc.nextInt();

        for (int i = num; i <=temp ; i++) {
            if (i%num==0){
                System.out.println(i+" is a Factor of "+num);
            }
            
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_48 obj = new prog_48();

        System.out.println("Enter a number for printig Factors ");
        int nm = sc.nextInt();
        obj.prntTable(nm);
    }
}
