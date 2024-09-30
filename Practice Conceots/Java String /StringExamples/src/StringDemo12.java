// program
public class StringDemo12 
{
    public static void main(String[] args) { 
        String str = "Hello user how are you?";
        char ch[] = str.toCharArray();
        char temp;    
        for(int i=0;i<ch.length/2;i++){
            temp = ch[i];
            ch[i] = ch[ch.length-1-i];
            ch[ch.length-1-i] = temp;
        }
        System.out.println("After reversing : ");
        for(char c : ch){
            System.out.print(c);
        }
    }
}
