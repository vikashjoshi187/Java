public class StringDemo7 
{
    public static void main(String[] args) {
        String str1 = args[0];
        String str2 = args[1];
        System.out.println("conpareTo : "+str1.compareTo(str2));
        System.out.println("conpareToIgnoreCase : "+str1.compareToIgnoreCase(str2));
    }
}
