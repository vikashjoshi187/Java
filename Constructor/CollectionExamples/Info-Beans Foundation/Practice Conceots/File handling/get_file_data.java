import java.io.File;
import java.util.Scanner;

 class redafile {
    public static void main(String[] args) {
        
        File f=new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/Practice Conceots/vtxt");
       
       if (f.exists()) {
        System.out.println("File name:"+f.getName());
        System.out.println("File Path :"+f.getAbsolutePath());
        System.out.println("Writable :"+f.canRead());
        System.out.println("Readable :"+f.canWrite());
        System.out.println("Size of file :"+f.length()+" bytes");
        //System.out.println("File Deleted or not "+f.delete());
        
       } else {
        System.out.println("File does Not Exist");
        
       }
    }

}
