
    import java.util.Scanner;

    public class prog_20 {
        //15)WAP to count no. Of elements which are the multiple of 10.
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of number you want to add");
            int num = sc.nextInt();
            int arr[] = new int[num];
            int ev = 0;
    
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter numver " + i);
                arr[i] = sc.nextInt();
                if (arr[i]%10==0) {
                    ev++;
    
                } 
    
            }
System.out.println("The number  elements which are the multiple of 10 are "+ev);
        }
    }
    