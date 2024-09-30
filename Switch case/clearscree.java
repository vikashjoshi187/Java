import java.io.*;
public class clearscree {
    public static void main(String [] args)
    {
        System.out.println("coding is fun");
        cls();
    }
    public static void cls()
    {
        try
        {
              new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
        }
        catch(Exception E)
        {
              System.out.println(E);
        }
    }
    
}

