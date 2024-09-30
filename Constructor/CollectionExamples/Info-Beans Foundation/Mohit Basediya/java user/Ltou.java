// Lowercase to Uppercase
import java.util.Scanner;
class Ltou
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Character in Lowercase : ");
        char ch = sc.next().charAt(0);
        System.out.println("Lowercase to Uppercase : "+(char)(ch-32));
    }
}