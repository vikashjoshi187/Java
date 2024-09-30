
/*1. Write a program to count how many times character ‘t’ occurs in a file*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog1 {
    private static int countT(String filePath, char ch) {
        int count = 0;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            int character;
            while ((character = reader.read()) != -1) {
                if (Character.toLowerCase((char)character) == ch ) {
                    count++;
                }
            }
        } catch (IOException e) {
            System.err.println("Exception : " + e.getMessage());
        }
        return count;
    }

    public static void main(String[] args) {
        String filePath = "C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Assinment14.iml";
        char ch = 't';
        int count = countT(filePath, ch);
        System.out.println(" t count : " + count);
    }
}
