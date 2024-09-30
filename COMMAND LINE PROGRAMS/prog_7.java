public class prog_7 {
    // 7)WAP showing the concept of Selection sort (Ascending order | Descending
    // order)
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            for (int j = i + 1; j < args.length; j++) {
                if (args[i].compareTo(args[j]) > 0) {
                    String temp = args[i];
                    args[i] = args[j];
                    args[j] = temp;
                }
            }
        }
        for (String a : args) {
            System.out.print(a + "\t");
        }
        System.out.println();
    }
}