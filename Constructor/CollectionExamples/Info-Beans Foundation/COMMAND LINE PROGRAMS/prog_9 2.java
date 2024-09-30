/**
 * prog_9
 */
public class prog_9 {
//9)WAP to find out the largest(maximum) element from an array

    public static void main(String[] args) {
        int  max=Integer.parseInt(args[0]);
        for (int i = 0; i < args.length; i++) {

                if (Integer.parseInt(args[i])>max) {
                    max=Integer.parseInt(args[i]);
                }
            }
            System.out.println("The largest element in the array is "+max);
    }
}