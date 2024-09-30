import java.io.File;
import java.util.Scanner;

public class filehandling {
    public static void main(String[] args) {
        
        File f=new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/Practice Conceots/File handling/Vikas.java");
        try{

            if (f.createNewFile()) {
                System.out.println("File ban gai");
            }
            else{
                System.out.println("Nahi bani file");
            }
        }
        catch(Exception e){
           
        }
        finally{

        }
    }

}
