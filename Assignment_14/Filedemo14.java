import java.io.*;
class FileDemo14 
{
    public static void main(String[] args) {
        try(FileWriter fw = new FileWriter( "C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Demoo18.txt");
                BufferedWriter bw = new BufferedWriter(fw)){
                bw.write("Mohit");
                    bw.newLine();
                bw.write("Today Tomato ");
                    bw.newLine();
                bw.write("Tanvi testi test ");
                bw.newLine();
                bw.write("team to");
                System.out.println("Data inserted successfully");
        }catch(IOException e){
            System.out.println("Exception : "+e);
        }
    }        
}
