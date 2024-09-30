public class WrapperDemo5 
{
    public static void main(String[] args) {
        char ch='a';
        System.out.println(""+Character.isAlphabetic(ch));
        System.out.println(""+Character.isDigit(ch));
        System.out.println(""+Character.isSpace(ch));//The method isSpace(char) from the type Character is deprecated since version 1.1
        System.out.println(""+Character.isWhitespace(ch));
        System.out.println(""+Character.isLowerCase(ch));
        System.out.println(""+Character.isUpperCase(ch));
    }
}
