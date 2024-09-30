import java.util.Scanner;

    public class prog_19 {
        //14)WAP to count no. Of elements which lies in between 50 and 100
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of number you want to add");
            int num = sc.nextInt();
            int arr[] = new int[num];
            int ev = 0;
    
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter numver " + i);
                arr[i] = sc.nextInt();
                if (arr[i] >= 50 && arr[i]<=100) {
                    ev++;
    
                } 
    
            }
    
            System.out.println("The number elements which lies in between 50 and 100 are "+ev);
        }
    }
    