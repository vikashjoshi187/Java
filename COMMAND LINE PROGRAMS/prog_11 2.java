public class prog_11 {
    public static void main(String[] args) {
        System.out.println("Given Array Is");
        for (int i = 0; i < args.length; i++) {
            System.out.print(args[i] + "\t");
        }
        System.out.println();
        for (int i = 1; i < args.length; i++) {
            int temp = Integer.parseInt(args[i]);
            int j = i - 1;
            while (j >= 0 && Integer.parseInt(args[j]) > temp) {
                args[j + 1] = args[j];
                j--;
            }
            args[j + 1] = "" + temp;
        }
        System.out.println("After Insertion Sort ");
        for (String a : args){
            System.out.print(a + "\t");
        }
        System.out.println();
    }
}