// entered character is Uppercase or not 
import java.util.Scanner;
class Uornot
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Character : ");
        char ch = sc.next().charAt(0);
        String a = (ch>=65 && ch<=90)?("Character is in Uppercase"):
        ("not a Uppercase");
        System.out.println(a);
    }
}