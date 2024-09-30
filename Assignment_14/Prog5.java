/*5. Write a program to count number of bytes in a image file(jpeg/png/gif).
Also find how much time it will take to upload the file on server if internet speed is 256 bps(bitsper second). */
import java.io.File;
public class Prog5 {
    public static void main(String[] args) {
        File file = new File("Downloads\\Bird.JPG");
        long size = file.length();
        System.out.println("size of file : "+size);

        long time = ((size*8)/256/60);
        System.out.println("Time : "+time);
    }
}
.