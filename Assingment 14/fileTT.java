import java.util.Scanner;
import java.io.File;

 class prog1{
    public static void main(String[] args) {
        File file = new File("D:\\MyFolder\\demo7");
        int count = 0;
        // File arr[] = file.listFiles();
        // File arr[] = file.length();
        for(int i = 0 ; i<file.length() ;i++){
            if(file.getName().contains("t")){
                count++;
             System.out.println("Count of t : "+count);
         }
         else{
            System.out.println("Count of t : "+count);
         }
        }
       
    }
    }