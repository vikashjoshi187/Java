import java.io.*;
import java.util.Scanner;
class FileDemo4 
{
    public static void main(String[] args) {
        File file = new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/Practice Conceots/FileHandling vikas/src/vikas.txt");
       
        if(!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string : ");
        String str = sc.nextLine();
        str=str+"\n";
        try(FileOutputStream fout = new FileOutputStream(file,true);)
        {
        byte bt[] = str.getBytes();
        fout.write(bt);
            System.out.println("Data inserted Successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }        
}
