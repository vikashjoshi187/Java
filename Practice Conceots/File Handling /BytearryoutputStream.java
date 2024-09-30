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
 class FileDemo6 
{
    public static void main(String[] args) {
        File file1 = new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas.txt");
        File file2 = new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas2.txt");

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        
        
        try(FileOutputStream fout1 = new FileOutputStream(file1);
                FileOutputStream fout2 = new FileOutputStream(file2);
                ByteArrayOutputStream bout = new ByteArrayOutputStream())
        {
        byte bt[] = str.getBytes();

        // fout1.write(bt);
        // fout2.write(bt);

        bout.write(bt);
        bout.writeTo(fout1);
        bout.writeTo(fout2);
        
            System.out.println("Data inserted Successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }        
}