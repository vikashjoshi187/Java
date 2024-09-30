
public class prog_10 {
    //10)WAP to find out the smallest(minimum) element from an array

        public static void main(String[] args) {
            int  small=Integer.parseInt(args[0]);
            for (int i = 0; i < args.length; i++) {
    
                    if (Integer.parseInt(args[i])<small) {
                        small=Integer.parseInt(args[i]);
                    }
                }
                System.out.println("The Smallest element in the array is "+small);
        }
    }