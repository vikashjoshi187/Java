import java.util.Scanner;

class ascii_loop_01 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int sv, ev, v;
        System.out.println("Enter the starting value");
        sv = sc.nextInt();
        System.out.println("Enter the end value");
        ev = sc.nextInt();
        for (int i = sv; i <=ev; i++) {
            System.out.println("The value at "+i+" Will be "+(char)i);
            
        }
    }
}