import java.util.Scanner;

public class JMB_MENU_11 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int itm;
System.out.println("//////////////////////////////////welcome to JMB CAFE/////////////////////////////////////////////////");
        System.out.println("Enter 1 for tea :");
        System.out.println("Enter 2 for coffee :");
        System.out.println("Enter 3 for samosa :");
        itm = sc.nextInt();
       if (itm>3 || itm<0) {
        System.out.println("PLEASE ENTER A VAILD ITEM NUMBER");
        System.exit(itm);
    }
switch (itm) {
            case 1: {
                System.out.println("YOU HAVE CHOSEN TEA");
                System.out.println("enter 1 for black tea ");
                System.out.println("enter 2 for green tea ");
                System.out.println("enter 3 for rainbow tea ");
                int tt = sc.nextInt();
                System.out.println("Enter no of cup of tea you want");
                int nt = sc.nextInt();
                // CASE FOR NUMBER OR ITEMS ORDERED
                switch (tt) {
                    case 1: {
                        System.out.println("you have choosen black tea the  ");
                        System.out.println("DO YOU WANT FULL TEA OF CUTTING PRESS F FOR FULL AND C FOR CUTTING");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {
                            case 'f':
                                System.out.println("YOU HAVE ORDERD FULL BLACK TEA \n THE AMOUNT IS Rs." + (nt * 100));
                                break;

                            case 'F':
                                System.out.println("YOU HAVE ORDERD FULL BLACK TEA \n THE AMOUNT IS Rs." + (nt * 100));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING BLACK TEA \n THE AMOUNT IS Rs." + (nt * 150));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING BLACK TEA \n THE AMOUNT IS Rs." + (nt * 150));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }

                        break;
                    }
                    // CASE 2
                    case 2: {
                        System.out.println("you have choosen green tea the");
                        System.out.println("DO YOU WANT FULL TEA OF CUTTING PRESS F FOR FULL AND C FOR CUTTING");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {
                            case 'f':
                                System.out.println("YOU HAVE ORDERD FULL GREEN TEA \n THE AMOUNT IS Rs." + (nt * 170));
                                break;

                            case 'F':
                                System.out.println("YOU HAVE ORDERD FULL GREEN TEA \n THE AMOUNT IS Rs." + (nt * 170));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING GREEN TEA \n THE AMOUNT IS Rs." + (nt * 100));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING GREEN TEA \n THE AMOUNT IS Rs." + (nt * 100));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }

                        break;
                    }
                    // DEFAULT CONDITION FOR RAINBOW TEA
                    default: {
                        System.out.println("you have choosen rainbow tea the");
                        System.out.println("DO YOU WANT FULL TEA OF CUTTING PRESS F FOR FULL AND C FOR CUTTING");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {

                            case 'f':
                                System.out
                                        .println("YOU HAVE ORDERD FULL RAINBOW TEA \n THE AMOUNT IS Rs." + (nt * 200));
                                break;

                            case 'F':
                                System.out
                                        .println("YOU HAVE ORDERD FULL RAINBOW TEA \n THE AMOUNT IS Rs." + (nt * 200));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING RAINBOW TEA \n THE AMOUNT IS Rs."
                                                + (nt * 180));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING RAINBOW TEA \n THE AMOUNT IS Rs."
                                                + (nt * 180));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }
                        break;
                    }

                }
                break;
            }

            // case 2 FOR COFFEE
            case 2: {
                System.out.println("YOU HAVE CHOSEN COFFEE");
                System.out.println("enter 1 for black coffee ");
                System.out.println("enter 2 for green coffee ");
                System.out.println("enter 3 for rainbow coffee ");
                int tt = sc.nextInt();
                System.out.println("Enter no of cup of coffee you want");
                int nt = sc.nextInt();
                switch (tt) {
                    case 1: {
                        System.out.println("you have choosen black coffee the");
                        System.out.println("DO YOU WANT FULL TEA OF CUTTING PRESS F FOR FULL AND C FOR CUTTING");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {

                            case 'f':
                                System.out
                                        .println("YOU HAVE ORDERD FULL BLACK COFFEE \n THE AMOUNT IS Rs." + (nt * 450));
                                break;

                            case 'F':
                                System.out
                                        .println("YOU HAVE ORDERD FULL BLACK COFFEE \n THE AMOUNT IS Rs." + (nt * 450));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING BLACK COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 400));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING BLACK COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 400));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }
                        break;
                    }

                    // CASE FOR GREEN COFFEE
                    case 2: {
                        System.out.println("you have choosen green coffee the");
                        System.out.println("DO YOU WANT FULL TEA OF CUTTING PRESS F FOR FULL AND C FOR CUTTING");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {

                            case 'f':
                                System.out
                                        .println("YOU HAVE ORDERD FULL GREEN COFFEE \n THE AMOUNT IS Rs." + (nt * 470));
                                break;

                            case 'F':
                                System.out
                                        .println("YOU HAVE ORDERD FULL GREEN COFFEE \n THE AMOUNT IS Rs." + (nt * 470));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING GREEN COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 420));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING GREEN COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 420));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }
                        break;
                    }
                    // DEFAULT CONDITION FOR RAINBOW COFFEE
                    default: {
                        System.out.println("you have choosen rainbow coffee the");
                        System.out.println("DO YOU WANT FULL TEA OF CUTTING PRESS F FOR FULL AND C FOR CUTTING");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {

                            case 'f':
                                System.out
                                        .println("YOU HAVE ORDERD FULL RAINBOW COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 570));
                                break;

                            case 'F':
                                System.out
                                        .println("YOU HAVE ORDERD FULL RAINBOW COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 570));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING RAINBOW COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 520));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD CUTTING RAINBOW COFFEE \n THE AMOUNT IS Rs."
                                                + (nt * 520));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }

                        break;
                    }
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
                    case 1: {
                        System.out.println("you have choosen fried samosa the  " + (nt * 250));
                        System.out.println("DO YOU WANT FULL SIZE OR COMPACT SIZE  PRESS F FOR FULL AND C FOR COMPACT");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {

                            case 'f':
                                System.out
                                        .println("YOU HAVE ORDERD FULL FRIED SAMOSA \n THE AMOUNT IS Rs." + (nt * 70));
                                break;

                            case 'F':
                                System.out
                                        .println("YOU HAVE ORDERD FULL FRIED SAMOSA \n THE AMOUNT IS Rs." + (nt * 70));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD COMPACT FRIED SAMOSA \n THE AMOUNT IS Rs."
                                                + (nt * 50));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD COMPACT FRIED SAMOSA \n THE AMOUNT IS Rs."
                                                + (nt * 50));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }
                        break;
                    }
                    // CASE FOR BAKED SAMOSA
                    case 2: {
                        System.out.println("you have choosen baked samosa");
                        System.out.println("DO YOU WANT FULL SIZE OR COMPACT SIZE  PRESS F FOR FULL AND C FOR COMPACT");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {

                            case 'f':
                                System.out
                                        .println("YOU HAVE ORDERD FULL BAKED SAMOSA \n THE AMOUNT IS Rs." + (nt * 80));
                                break;

                            case 'F':
                                System.out
                                        .println("YOU HAVE ORDERD FULL BAKED SAMOSA \n THE AMOUNT IS Rs." + (nt * 80));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD COMPACT BAKED SAMOSA \n THE AMOUNT IS Rs."
                                                + (nt * 65));
                                break;

                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD COMPACT BAKED SAMOSA \n THE AMOUNT IS Rs."
                                                + (nt * 65));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }
                        break;
                    }

                    // DEFAULT FOR CHEASE SAMAOSA
                    default: {
                        System.out.println("you have choosen cheese samosa the  " + (nt * 2000));
                        System.out.println("DO YOU WANT FULL SIZE OR COMPACT SIZE  PRESS F FOR FULL AND C FOR COMPACT");
                        char ft = sc.next().charAt(0);
                        // CASE FOR CUTTING OR FULL
                        switch (ft) {

                            case 'f':
                                System.out
                                        .println("YOU HAVE ORDERD FULL CHEASE SAMOSA \n THE AMOUNT IS Rs." + (nt * 140));
                                break;

                            case 'F':
                                System.out
                                        .println("YOU HAVE ORDERD FULL CHEASE SAMOSA \n THE AMOUNT IS Rs." + (nt * 140));
                                break;

                            case 'C':
                                System.out
                                        .println("YOU HAVE ORDERD COMPACT CHEASE SAMOSA \n THE AMOUNT IS Rs."
                                                + (nt * 120));
                                break;
                            case 'c':
                                System.out
                                        .println("YOU HAVE ORDERD COMPACT CHEASE SAMOSA \n THE AMOUNT IS Rs."
                                                + (nt * 120));
                                break;

                            default:
                                System.out.println("SORRY INVALID CHOICE");
                                break;
                        }
                        break;
                    }
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