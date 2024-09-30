// Uppercase to lowercase
import java.util.Scanner;
class Utol
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Character in Uppercase : ");
        char ch = sc.next().charAt(0);
        System.out.println("Uppercase to Lowercase : "+(char)(ch+32));
    }
}