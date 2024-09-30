
public class prog_2 {
//2)WAP to take n number of elements of an array from user and find out the sum of all the elements.
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i < args.length; i++) {
            sum = sum + Integer.parseInt(args[i]);
        }
        System.out.println("Thre sum is " + sum);

    }
}