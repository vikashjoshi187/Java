/* Program to check whether entered character is in uppercase or not, if yes then 
convert it into lowercase. */
import java.util.Scanner;
class Prog18
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        String a =(ch>=65 && ch<=90)?
        (ch+" is uppercase"+" "+"& conversion in lowercase : "+(char)(ch+32)):
        (ch+" is not uppercase");
        System.out.println(a);
    }
}