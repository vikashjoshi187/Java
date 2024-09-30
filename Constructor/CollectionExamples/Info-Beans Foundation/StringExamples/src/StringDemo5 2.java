public class StringDemo5 
{
    public static void main(String[] args) {
        String s1 = String.join("-", "indore","Bhopal","Ujjain","Jabalpur");
        System.out.println("join : "+s1);
        
        String s2 = "Hello user how are you ? ";
        String words[] = s2.split(" ");
        for(String word : words){
            System.out.println(word);
        }
        
        char ch[] = s2.toCharArray();
        for(char element : ch){
            System.out.print("\t"+element);
        }
        System.out.println();
        
        byte bt[] = s2.getBytes();
        for(byte b : bt){
            System.out.print("\t"+b);
        }
    }
}
