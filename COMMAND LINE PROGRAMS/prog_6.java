public class prog_6 {
    // 6)WAP to check whether entered array is a palindrome or not
    public static void main(String[] args) {
        int count = 0;
        for (int i = 0; i < args.length / 2; i++) {
            if ((args[i]).equals(args[args.length - 1 - i])) {
                count++;
            }
        }
        if (count == args.length / 2) {
            System.out.println("The arry is palindrome");
        } else {
            System.out.println("The array is not palindrome ");
        }

    }
}