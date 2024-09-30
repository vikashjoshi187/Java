import java.io.File;
import java.util.Scanner;
import java.io.FileWriter;
public class write_file {
    public static void main(String[] args) {
        try {

            FileWriter f=new FileWriter("/Users/vikasjoshi/Desktop/Info-Beans Foundation/Practice Conceots/File handling/Vikas.java");
            
            try {
                
                f.write("class tfsemp {\npublic static void main(String[] args) {\nint a=10,b=34,c=a+b;\nSystem.out.println(c);\n}\n}");
            } 
            finally{
                f.close();
            }
            System.out.println("Sucessfully Wrote in File!!!");
        } 
        
        
        catch (Exception e) {
            System.out.println("Fie not found");
            
        }
      
}
}
