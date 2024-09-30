import java.util.StringTokenizer;
import java.util.Scanner;
public class StringDemo2 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String string = sc.nextLine();
        
        System.out.println("Enter String : ");
        String delim = sc.nextLine();
        
        StringTokenizer st = new StringTokenizer(string,delim);
        while (st.hasMoreTokens()) {
            System.out.println(st.nextToken());
        }
//        System.out.println("-------------------------");
//        while (st.hasMoreElements()) {
//            System.out.println(st.nextElement());
//        }
    }
}
