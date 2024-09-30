import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String string=sc.nextLine();


        String words[] = string.split(" ");

        int max_lenght=words[0].length();
        String maxString=words[0];

        for(String word : words){
            //System.out.println(word);
            if (word.length()>max_lenght){
                max_lenght=word.length();
                maxString=word;
            }

        }
        System.out.printf("Greatest Word in Sting is "+maxString+"\nGreatest Lenght is "+max_lenght);



    }
}