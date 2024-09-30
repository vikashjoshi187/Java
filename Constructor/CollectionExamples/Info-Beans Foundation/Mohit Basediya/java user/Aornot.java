// Enter character is Alphabet or not
import java.util.Scanner;
class Aornot
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        String a = ((ch>=65 && ch<=90)||(ch>=97 && ch<=122))?
        ("Character is Alphabet"):("Character is not Alphabet");
        System.out.println(a);
    }
}