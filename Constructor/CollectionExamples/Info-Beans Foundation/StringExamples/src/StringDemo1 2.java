import java.util.StringTokenizer;
public class StringDemo1 
{
    public static void main(String[] args) {
        String str = "Hello User, Welcome to Java String";
        StringTokenizer st = new StringTokenizer(str," ");
//        while (st.hasMoreTokens()) {
//            System.out.println(st.nextToken());
//        }
        System.out.println("-------------------------");
        while (st.hasMoreElements()) {
            System.out.println(st.nextElement());
        }
    }
}
