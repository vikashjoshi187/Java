
/**
 * FileHandkig1
 */
import java.io.*;

class FileHandkig2 {

    public static void main(String[] args) {

        String name = "VikasJoshi";

        File obj = new File(
                "/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas.txt");
        try (FileOutputStream fout = new FileOutputStream(obj, true)) {

            byte bt[] = name.getBytes();
            fout.write(bt);
            System.out.println("File written Sucessfully!!!");

        } catch (IOException e) {
            System.out.println(e);
        }

    }
}