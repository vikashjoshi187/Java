public class prog_8 {
    //8)WAP showing the concept of Bubble sort  (Ascending order | Descending order)
public static void main(String[] args) {
    System.out.println("Array Elements :- ");
    for (String a : args) {
        System.out.print(a + "\t");
    }
    System.out.println();
    
    for (int i = 0; i < args.length - 1; i++) {  
        for (int j = 0; j < args.length - i - 1; j++) {
            if (args[j].compareTo(args[j + 1]) > 0) {
                String temp = args[j];
                args[j] = args[j + 1];
                args[j + 1] = temp;
            }
        }
    }
    

    System.out.println("Array  After Selection Sort ");
    for (String a : args) {
        System.out.print(a + "\t");
    }
    System.out.println();

}
    
}
