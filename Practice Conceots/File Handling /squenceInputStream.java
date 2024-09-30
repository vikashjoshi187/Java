// import java.io.*;
// public class BytearryoutputStream {

//     public static void main(String[] args) {

//         File Obj1=new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas.txt");
//         File Obj2=new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas2.txt");
//         File Obj3=new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas3.txt");

//         ByteArrayOutputStream BaoutS=new ByteArrayOutputStream(0);

//     }
// }
import java.io.*;
import java.util.Scanner;

class sequenceInputStream {
    public static void main(String[] args) {
        File file1 = new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas.txt");
        File file2 = new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas2.txt");

        try (FileInputStream fin1 = new FileInputStream(file1);
                FileInputStream fin2 = new FileInputStream(file2); 
                SequenceInputStream seIn = new SequenceInputStream(fin1,fin2)) {
        while (true) {
                int x = seIn.read();

                if (x == -1) {
                    System.out.println("  END OF FILE");
                    break;
                }

                System.out.print((char) x);
            }
        } catch (Exception e) {

        }

    }
}