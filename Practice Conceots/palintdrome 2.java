import java.util.Scanner;

public class palintdrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        boolean b = true;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                b = false;
                break;
            }

        }

        if (b) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not palindrome");

        }
    }

}
