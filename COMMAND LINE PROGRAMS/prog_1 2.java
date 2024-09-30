/**
 * prog_1
 */
public class prog_1 {
//1)WAP to take n number of elements of an array and find out the sum of first and last element of an array. 
public static void main(String args[]) {
    System.out.println(args[args.length - 1]);
        System.out.println(args[0]);
        int sum =  (Integer.parseInt(args[0])) + (Integer.parseInt(args[args.length - 1]));
        System.out.println("Sum is " + sum);
        
    }
}