
public class prog_4 {
    //4)WAP to reverse all the elements of an array
    public static void main(String[] args) {
           
            for (int i = 0; i< args.length/2; i++) {
                String temp=args[i];
                args[i]=args[args.length-1-i];
                args[args.length-1-i]=temp;
            }
            for (int i = 0; i < args.length; i++) {
                    System.out.print(" "+args[i]);
            }
        }
    }