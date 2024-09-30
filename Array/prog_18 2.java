
    //13)WAP to count no. Of elements which are greater than or equals to 50
    import java.util.Scanner;

    public class prog_18 {
        // 12)WAP to count no. Of even and odd elements
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of number you want to add");
            int num = sc.nextInt();
            int arr[] = new int[num];
            int  ev = 0;
    
            for (int i = 0; i < arr.length; i++) {
                System.out.println("Enter numver " + i);
                arr[i] = sc.nextInt();
                if (arr[i] >= 50) {
                    ev++;
    
                } 
    
            }
    
            System.out.println("The number elements which are greater than or equals to 50 are "+ev);
        }
    }
    