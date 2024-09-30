import java.io.File;
// import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class creteingFile {

    public static void main(String args[]) {
        // File creteFile=new File("Bill.txt");

        // try {
        // creteFile.createNewFile();

        // System.out.println("File Created Sucessfully");
        // } catch (IOException e) {

        // e.printStackTrace();
        // }

        try  {
        
        FileWriter fileWriter = new FileWriter(new File("Bill.txt"));
        fileWriter.write("Hi this IS your bill");
        fileWriter.close();
        }
        catch (IOException e) {

        e.printStackTrace();
        }

        try  {

            Scanner sc = new Scanner(new File("Bill.txt"));
            while (sc.hasNextLine()) {

                String line =sc.nextLine();
                System.out.println(line);

            }
        }

        catch (IOException e) {
            e.printStackTrace();
        }
    }
}