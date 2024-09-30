/**
 * FileHandkig1
 */
import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;
public class FileHandkig1 {

    public static void main(String[] args) {
        

        File obj=new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder");
        


        File arr[]=obj.listFiles();


        for (File file : arr) {
            
                           System.out.print(file.getName()+"\n");

        }

System.out.println("-------------------------------------------------");
        for (File file : arr) {
            if (file.getName().contains(".txt")) {
                           System.out.print(file.getName()+"\n");
 
            }
        }
      
        

        // try{

        //     if (!obj.exists()) {
        //         obj.createNewFile();
        //         System.out.println("File  createe sucessfully!!");
        //     }
        //     else{
        //         System.out.println("File not created");
        //     }
        // }
        // catch(IOException e){

        //     System.out.println(e);

        // }

        //  System.out.println(obj.getName());

    }
}