import java.io.*;

public class fileInputstream {
    public static void main(String[] args) {
        File obj=new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas.txt");

        try (FileInputStream fin=new FileInputStream(obj)){

            while (true) {

                int x=fin.read();
                 if(x==-1){
                    break;

                 }

                 System.out.print((char)x);
                
            }
            
        } catch (IOException e) {
           System.out.println(e);
        }
    }
}
