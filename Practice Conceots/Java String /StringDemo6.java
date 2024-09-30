public class StringDemo6 
{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Welcome";
        s1.concat(s2);
        System.out.println("concate : "+s1);
        
        String s3 = s1.concat(s2);
        System.out.println("s1.concat(s2) : "+s3);
        
        String s4 = "Hello User How are you ?";
        System.out.println("subString : "+s4.substring(7));
        System.out.println("subString : "+s4.substring(7,17));

        System.out.println("endsWith : "+s1.endsWith("o"));
        System.out.println("endsWith : "+s1.endsWith("O"));
        System.out.println("startsWith : "+s1.startsWith("H"));
        
        String s5 = "HELLW";
        System.out.println("equals : "+s1.equals(s5));
        System.out.println("equalsIgnoreCase : "+s1.equalsIgnoreCase(s5));
        
        System.out.println("compareTo : "+s1.compareTo(s5));
        System.out.println("compareToIgnoreCase : "+s1.compareToIgnoreCase(s5));

    }
}
