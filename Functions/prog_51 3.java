import java.util.Scanner;

public class prog_51 {
    //51)…... -6	-3	0	3	6	9	……. n terms	 
    void prntPthree(int num) {
        Scanner sc = new Scanner(System.in);
        int temp=-6;
        for (int i = 1; i <= num; i++) {

            System.out.print("\t"+temp);
            temp+=3;

        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        prog_51 obj = new prog_51();
        System.out.println("Enter a range for print series till  N numbers");
        int nm = sc.nextInt();
        obj.prntPthree(nm);
    }
}

