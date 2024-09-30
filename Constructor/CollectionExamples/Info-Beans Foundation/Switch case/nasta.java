import java.util.Scanner;

public class nasta {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itm;
        System.out.println("Enter 1 for tea :");
        System.out.println("Enter 2 for coffee :");
        System.out.println("Enter 3 for samosa :");
        itm = sc.nextInt();
        switch (itm) {
            case 1: {
                System.out.println("number of cups want to order");
                int c = sc.nextInt();
                System.out.println("The total amount is :" + (c * 100));
                break;
            }
            
            case 2: {
                System.out.println("number of cups of coffee want to order");
                int c = sc.nextInt();
                System.out.println("The total amount is :" + (c * 250));
                break;
            }
            
            case 3: {
                System.out.println("number of soamosa  want to order");
                int c = sc.nextInt();
                System.out.println("The total amount is :" + (c * 150));
                break;
            }
            default: {
                System.out.println("INVALID ITEM NUMBER");
                break;
            }

        }

    }
}