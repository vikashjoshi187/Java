/* Program to check whether entered character is in lowercase or not, if yes then 
convert it into uppercase. */
import java.util.Scanner;
class Prog19
{
    public static void main (String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a character : ");
        char ch = sc.next().charAt(0);
        String a =(ch>=97 && ch<=122)?
        (ch+" is lowercase"+" "+"& conversion in uppercase : "+(char)(ch-32)):
        (ch+" is not lowercase");
        System.out.println(a);
    }
}