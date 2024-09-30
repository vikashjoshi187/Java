import java.util.Scanner;
class Prog48{
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.println(" Enter name : ");
        String name = ip.nextLine();
        int count=0;
        for(int i = 0;i<name.length();i++){
            char ch = name.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U'){
                count++;
            }
        }
        System.out.println(" Number of vowel in Name : "+count);
    }
}
