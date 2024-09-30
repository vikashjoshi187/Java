
public class prog_5 {
    //5)WAP to reverse individual elements of an array
    public static void main(String[] args) {
           
        for (int i = 0; i < args.length; i++){
            int b =  Integer.parseInt(args[i]),rem = 0,rev = 0;
            while (b > 0) {
                rem = b%10;
                rev = rev*10 + rem;
                b = b/10;
            }
            args[i] = ""+rev;
            System.out.print(args[i]+"\t");
        }System.out.println();
        }
    }