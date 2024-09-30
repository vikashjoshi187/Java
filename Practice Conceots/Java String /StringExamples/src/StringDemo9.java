// remove duplicate elements
/*
input : aaaaabbbbaaaabbccddddbbbbbdd
output : abcd
*/
class TestMain{
    static String removeDuplicates(String s){
        String output = "";
//            for(int i=0;i<s.length();i++){
//                char ch = s.charAt(i);
//                if(output.contains(ch+"")==false)
//                    output+=ch;
//            }
        
        for(int i=0;i<s.length();i++){
                String ch = ""+s.charAt(i);
                if(output.contains(ch)==false)
                    output+=ch;
            }
        return output;
    }
}
public class StringDemo9 
{
    public static void main(String[] args) { 
        String input = "aaaaabbbbaaaabbccddddbbbbbdd";
        String output = TestMain.removeDuplicates(input);
        System.out.println("input : "+input);
        System.out.println("output : "+output);
    }
}
