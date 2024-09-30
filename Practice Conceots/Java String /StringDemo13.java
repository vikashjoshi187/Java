// program
public class StringDemo13 
{
    public static void main(String[] args) { 
        String str = "Hello user how are you ?";
        String words[] = str.split(" ");
        String temp;    
        for(int i=0;i<words.length/2;i++){
            temp = words[i];
            words[i] = words[words.length-1-i];
            words[words.length-1-i] = temp;
        }
        System.out.println("After reversing : ");
        for(String c : words){
            System.out.print(" "+c);
        }
        System.out.println();
    }
}
