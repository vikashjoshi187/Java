import java.util.Scanner;

import javax.xml.transform.Source;
public class s2_fnd_13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        float area,s1,s2;
        System.out.println("Enter area");
        area=sc.nextFloat();
        System.out.println("Enter side 1");
        s1=sc.nextFloat();
        s2=(area*2)/s1;
        System.out.println("The side 2 will be"+s2);
    }
    }

