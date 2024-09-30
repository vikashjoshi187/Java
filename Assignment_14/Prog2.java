/*Write a program to count no of words in a text file and average word size. */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Prog2 {

    public static void main(String[] args) {
        try (BufferedReader file = new BufferedReader(new FileReader("C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Assinment14.iml"))) {
            String line;
            int Word = 0;
            int sum = 0;

            while ((line = file.readLine()) != null) {
                String[] words = line.trim().split(" ");
                for (String word : words) {
                    Word++;
                    sum += word.length();
                }
            }

            double avg = (double) sum / Word;
            System.out.println("Words : " + Word);
            System.out.println("Average : " + avg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
