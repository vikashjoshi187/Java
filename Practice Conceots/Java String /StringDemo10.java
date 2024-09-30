// remove duplicate elements
/*
input : aaaaabbbbaaaabbccddddbbbbbdd
output : abcd
*/
class TestMain1{
    static String removeDuplicates(String s){
        String output = "";
        for(int i=0;i<s.length();i++){
                String ch = ""+s.charAt(i);
                if(output.contains(ch)==false)
                {
                    output+=ch;
                }
            }
        return output;
    }
}
public class StringDemo10 
{
    public static void main(String[] args) { 
        String input = "aaaaabbbbaaaabbccddddbbbbbdd";
        String uniqueElements = TestMain1.removeDuplicates(input);
        System.out.println("input : "+input);
        for(int i=0;i<uniqueElements.length();i++){
            char ch = uniqueElements.charAt(i);
            int count=0;
            for(int j=0;j<input.length();j++){
                if(ch==input.charAt(j))
                    count++;
            }
                System.out.println(ch+" occurs "+count+" times");
        }    
    }
}
