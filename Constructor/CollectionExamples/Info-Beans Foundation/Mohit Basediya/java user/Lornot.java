// Enter character is Lowercase or not
import java.util.Scanner;
class Lornot
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a Character : ");
        char ch = sc.next().charAt(0);
        String a = (ch>=97 && ch<=122)?("Character is in Lowercase"):
        ("Not a Lowercase");
        System.out.println(a);
    }
}