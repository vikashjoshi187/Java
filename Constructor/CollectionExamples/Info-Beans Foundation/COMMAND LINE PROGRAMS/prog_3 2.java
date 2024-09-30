
public class prog_3 {
    //3)WAP to take n number of elements of an array from user and find out the average of all the elements.

        public static void main(String[] args) {
    
            int sum = 0;
    
            for (int i = 0; i < args.length; i++) {
                sum = sum + Integer.parseInt(args[i]);
            }
            System.out.println("Thre average is " + (sum/args.length));
    
        }
    }