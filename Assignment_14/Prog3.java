/*3. Write a program to copy content of one file into another file. */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Prog3
{
    public static void main(String[] args) throws IOException{
        try (FileInputStream r = new FileInputStream("C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Assinment14.iml")) {
            try (FileOutputStream w = new FileOutputStream("C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Assinment14.txt")) {
                int i ;
                while((i = r.read()) != -1)
                {
                    w.write((char)i);
                }
            }
        }
        System.out.println("Data copy suceussfully");
    }
}
