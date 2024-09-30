import java.util.StringJoiner;
public class StringDemo3 
{
    public static void main(String[] args) {
//        StringJoiner sj = new StringJoiner("\n");
//    StringJoiner sj = new StringJoiner("\\n");
//      StringJoiner sj = new StringJoiner("--@@--");
//      StringJoiner sj = new StringJoiner("\t");
      StringJoiner sj = new StringJoiner("\\t");
        sj.add(null);
        sj.add("Indore");
        sj.add("");
        sj.add("Ujjain");
        sj.add("Bhopal");
        sj.add("Jabalpur");
        System.out.println("Elements : "+sj);
    }
}
