import java.util.Scanner;

import javax.xml.transform.Source;

public class nest_swtch {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itm;
        System.out.println("Enter 1 for tea :");
        System.out.println("Enter 2 for coffee :");
        System.out.println("Enter 3 for samosa :");
        itm = sc.nextInt();
        switch (itm) {
            case 1: {
                System.out.println("YOU HAVE CHOSEN TEA");
                System.out.println("enter 1 for black tea ");
                System.out.println("enter 2 for green tea ");
                System.out.println("enter 3 for rainbow tea ");
                int tt = sc.nextInt();
                System.out.println("Enter no of cup of tea you want");
                int nt = sc.nextInt();
                switch (tt) {
                    case 1:
                        System.out.println("you have choosen black tea the  " + (nt * 100));
                        break;

                    case 2:
                        System.out.println("you have choosen green tea the  " + (nt * 120));
                        break;

                    default:
                        System.out.println("you have choosen rainbow tea the  " + (nt * 1000));
                        break;
                }
                break;
            }
            // case 2
            case 2: {
                System.out.println("YOU HAVE CHOSEN COFFEE");
                System.out.println("enter 1 for black coffee ");
                System.out.println("enter 2 for green coffee ");
                System.out.println("enter 3 for rainbow coffee ");
                int tt = sc.nextInt();
                System.out.println("Enter no of cup of coffee you want");
                int nt = sc.nextInt();
                switch (tt) {
                    case 1:
                        System.out.println("you have choosen black coffee the  " + (nt * 250));
                        break;

                    case 2:
                        System.out.println("you have choosen green coffee the  " + (nt * 200));
                        break;

                    default:
                        System.out.println("you have choosen rainbow coffee the  " + (nt * 2000));
                        break;
                }
                break;
            }
            // case 3
            case 3: {
                System.out.println("YOU HAVE CHOSEN SAMOSA");
                System.out.println("enter 1 for fried samosa ");
                System.out.println("enter 2 for baked samosa ");
                System.out.println("enter 3 for cheese samosa ");
                int tt = sc.nextInt();
                System.out.println("Enter no of number of samosa you want");
                int nt = sc.nextInt();
                switch (tt) {
                    case 1:
                        System.out.println("you have choosen fried samosa the  " + (nt * 250));
                        break;

                    case 2:
                        System.out.println("you have choosen baked samosa the  " + (nt * 200));
                        break;

                    default:
                        System.out.println("you have choosen cheese samosa the  " + (nt * 2000));
                        break;
                }
                break;
            }
            // DEFAULT
            default: {
                System.out.println("INVALID ITEM NUMBER ENTERED");
            }

        }

    }
}