
// program showing the concept of String
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;

class StringDemo8 {
    public static void main(String args[]) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println(("Enter stirng1"));
        // String s1=sc.next();
        // System.out.println(("Enter stirng2"));
        // String s2=sc.next();
        String s1[] = { "A", "a", "r", "t", "i" };
        String s2[] = { "a", "A", "t", "i", "r" };

        Arrays.sort(s1);
        Arrays.sort(s2);

        boolean b = true;
        if (s1.length == s2.length) {

            for (int i = 0; i < s2.length; i++) {
                for (int j = 0; j < s2.length; j++) {
                    if (s1[i] != s2[j]) {
                        b = false;
                        
                    } else {
                        b = true;
                    }

                }


            }
        } else {
            System.out.println("Not anagram");
        }

        if (b) {
            System.out.println("anama gram");

        }

        else {
            System.out.println("anagram  not");

        }

    }
}
