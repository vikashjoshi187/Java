import java.util.Scanner;

public class MENU_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JMB");
        int menu1, thli, thanu, sup, tm, veg, sutr = 0;
        String SUP = null, VEG = null;
        System.out.println("ENTER 1 FOR VEGETARIAN MENU\nENTER 2 FOR Only For Ladies - Timing: 4 to 6pm (After 6pm 20/- per hour/per head Extra \nENTER 3 FOR BRAKE FAST");
        menu1 = sc.nextInt();
        System.out.println("ENTER HOW MUCH DOU WANT FOR THE FUNCTION IN HOURS");
        tm = sc.nextInt();

        if (tm > 3) {// IF CONDITION FOR EXTRA TIME

            tm = (tm - 3) * 1500;

        } // IF CONDITION FOR EXTRA TIME ENDS

        switch (menu1) {// SWITCH FOR MENU FOR MAIN MENU
            case 1: {// CASE 1 FOR VEGETARIAN MENU
                System.out.println("YOU HAVE SELECTED VEGETARIAN MENU");
                System.out.println(
                        "ENTER 1 FOR THALI 310\nENTER 2 FOR THALI 360\nENTER 3 FOR THALI 410 \nENTER 4 FOR THALI 470\nENTER 5 FOR THALI 600\nENTER 6 FOR THALI 700");
                thli = sc.nextInt();

                switch (thli) {// SWITCH FOR THALI

                    case 1: {// CASE FOR THALI 310
                        System.out.println("YOU HAVE SELECTED FOR THALI 310");
                        System.out.println("WHAT DO YOU WANT ENTER 1 FOR SOUPS\nENTER 2 FOR WELCOME DRINKS");
                        sutr = sc.nextInt();
                        switch (sutr) {
                            case 1: {// CASE 1 FOR SOUPS
                                System.out.println("YOU HAVE CHOOSEN TO TAKE SOUPS");
                                System.out.println("PLEASE SELEcT WHICH TYPE OF SOUP YOU WANT");
                                System.out.println(
                                        "ENTER 1 FOR TOMATO SOUP\nENTER 2 FOR VEG MANCHO\nENTER 3 FOR HOT AND SOUR VEG\nENTER 4 FOR LEMON CORIENDER");
                                sup = sc.nextInt();
                                switch (sup) {// SWITCH FOR TYPES SOUP
                                    case 1: {// CASE FOR TOMATO SOUP
                                        SUP = "YOU HAVE SELECTED FOR TOMATO SOUP";
                                        break;
                                    } // CASE FOR TOMATO SOUP ENDS

                                    case 2: {// CASE FOR VEG SOUP
                                        SUP = "YOU HAVE SELECTED FOR VEG SOUP";
                                        break;
                                    } // CASE FOR VEG SOUP ENDS

                                    case 3: {// CASE FOR HOT AND SOUR VEG SOUP
                                        SUP = "YOU HAVE SELECTED FOR HOT AND SOUR VEG SOUP";
                                        break;
                                    } // CASE FOR HOT AND SOUR VEG SOUP ENDS

                                    case 4: {// CASE FOR LEMON CORIENDER SOUP
                                        SUP = "YOU HAVE SELECTED FOR LEMON CORIENDER SOUP";
                                        break;
                                    } // CASE FOR LEMON CORIENDER SOUP ENDS

                                    default: {// DEFAULT FOR INVALID SOUP TYPE ENDS
                                        System.out.println("PLEASE ENTER A VALID SOUP TYPE");
                                        System.exit(0);
                                        break;
                                    } // DEFAULT FOR INVALID SOUP TYPE ENDS

                                }// SWITCH FOR SOUP TYPES ENDS
                                break;
                            } // CASE 1 FOR SOUPS ENDS

                            case 2: {// CASE 2 FOR WELCOME DRINKS
                                System.out.println("YOU HAVE CHOOSE TO TAKE WELCOME DRINKS");
                                System.out.println("PLEASE SELEcT WHICH TYPE OF SOUP YOU WANT");
                                System.out.println(
                                        "ENTER 1 FOR Blue Lagoon\nENTER 2 FOR Blowgun Kesher Pista\nENTER 3 FOR Fresh Lime Water\nENTER 4 FOR Butter Milk\nENTER 5 FOR Orange Pink City\nENTER 6 FOR Strawberry Delight\nENTER 7 FOR Jal Jeera\nENTER 8 FOR Rasna Water");
                                sup = sc.nextInt();
                                switch (sup) {// SWITCH FOR TYPES SOUP
                                    case 1: {// CASE FOR TOMATO SOUP
                                        SUP = "YOU HAVE SELECTED FOR Blue Lagoon";
                                        break;
                                    } // CASE FOR TOMATO SOUP ENDS

                                    case 2: {// CASE FOR VEG SOUP
                                        SUP = "YOU HAVE SELECTED FOR Blowgun Kesher Pista";
                                        break;
                                    } // CASE FOR VEG SOUP ENDS

                                    case 3: {// CASE FOR HOT AND SOUR VEG SOUP
                                        SUP = "YOU HAVE SELECTED FOR Fresh Lime Water";
                                        break;
                                    } // CASE FOR HOT AND SOUR VEG SOUP ENDS

                                    case 4: {// CASE FOR LEMON CORIENDER SOUP
                                        SUP = "YOU HAVE SELECTED FOR Butter Milk";
                                        break;
                                    } // CASE FOR LEMON CORIENDER SOUP ENDS

                                    case 5: {// CASE FOR LEMON CORIENDER SOUP
                                        SUP = "YOU HAVE SELECTED FOR Orange Pink City";
                                        break;
                                    } // CASE FOR LEMON CORIENDER SOUP ENDS

                                    case 6: {// CASE FOR LEMON CORIENDER SOUP
                                        SUP = "YOU HAVE SELECTED FOR Strawberry Delight";
                                        break;
                                    } // CASE FOR LEMON CORIENDER SOUP ENDS

                                    case 7: {// CASE FOR LEMON CORIENDER SOUP
                                        SUP = "YOU HAVE SELECTED FOR Jal Jeera";
                                        break;
                                    } // CASE FOR LEMON CORIENDER SOUP ENDS

                                    case 8: {// CASE FOR LEMON CORIENDER SOUP
                                        SUP = "YOU HAVE SELECTED FOR FOR Rasna Water";
                                        break;
                                    } // CASE FOR LEMON CORIENDER SOUP ENDS

                                    default: {// DEFAULT FOR INVALID WELCOME DRINK TYPE ENDS
                                        System.out.println("PLEASE ENTER A VALID WELCOME DRINK TYPE");
                                        System.exit(0);
                                        break;
                                    } // DEFAULT FOR INVALID WELCOME DRINK TYPE ENDS

                                }// SWITCH FOR SOUP TYPES ENDS

                                break;
                            } // CASE 2 FOR WELCOME DRINKS ENDS

                            default: {// DEFAULT FOR INVALID DRINK TYPE
                                System.out.println("NO SUCH TYPE OF DRINKS AVILABLE");
                                System.exit(sutr);
                                break;
                            } // DEFAULT FOR INVALID DRINK TYPE
                        }

                        System.out.println("PLEASE SELECT ANY VEGITABLES FORM THIS BELOW LIST");

                        System.out.println("ENTER 1 FOR Nav Ratan Korma \nEnter 2 for Lahori Aloo with Mutter\nEnter 3 for Mix Veg\nEnter 4 for Green Chana (Seasonal)\nEnter 5 for Corn Palak\nEnter 6 for Aloo 65\nEnter 7 for Aloo Mutter\nEnter 8 for Aloo Capsicum\nEnter 9 for Aloo Do Pyaza\nEnter 10 for Aloo Gobhi/Tomato\nEnter 11 for Gobhi Mutter\nEnter 12 for Kadi Puniabi\nEnter 13 for Veg. Kofta (Gol)\nEnter 14 for Methi Mutter Malai\nEnter 15 for Harvali Kofta\nEnter 16 for Chana Masala\nEnter 17 for Bhindi Masala\nEnter 18 for Jeera Aloo\nEnter 19 for Dum Aloo\nEnter 20 for Guirati Aloo\nEnter 21 for Tinda Masala\nEnter 22 for Aloo Palak\nEnter 23 for Seasonal Veg\nEnter 24 for Bhindi Do Pyaza\nEnter 25 for Veg. Kolhapuri\nEnter 26 for Corn Capsicum");
                        veg = sc.nextInt();

                        switch (veg) {// SWITCH FOR VEFITABLES
                            case 1: {
                                VEG = "YOU ORDED VEGITABLE OF Nav Ratan Korma";

                                break;
                            }
                            case 2: {
                                VEG = "YOU ORDED VEGITABLE OF Lahori Aloo with Mutter";

                                break;
                            }

                            case 3: {
                                VEG = "YOU ORDED VEGITABLE OF for Mix Veg";

                                break;
                            }

                            case 4: {
                                VEG = "YOU ORDED VEGITABLE OF Green Chana (Seasonal)";

                                break;
                            }

                            case 5: {
                                VEG = "YOU ORDED VEGITABLE OF Corn Palak";

                                break;
                            }

                            case 6: {
                                VEG = "YOU ORDED VEGITABLE OF Aloo 65";

                                break;
                            }

                            case 7: {
                                VEG = "YOU ORDED VEGITABLE OF Aloo Mutter";

                                break;
                            }

                            case 8: {
                                VEG = "YOU ORDED VEGITABLE OF Aloo Capsicum";

                                break;
                            }

                            case 9: {
                                VEG = "YOU ORDED VEGITABLE OF Aloo Do Pyaza";

                                break;
                            }

                            case 10: {
                                VEG = "YOU ORDED VEGITABLE OF Aloo Gobhi";

                                break;
                            }

                            case 11: {
                                VEG = "YOU ORDED VEGITABLE OF Gobhi Mutter";

                                break;
                            }

                            case 12: {
                                VEG = "YOU ORDED VEGITABLE OF Kadi Puniabi";

                                break;
                            }

                            case 13: {
                                VEG = "YOU ORDED VEGITABLE OF Veg. Kofta (Gol)";

                                break;
                            }

                            case 14: {
                                VEG = "YOU ORDED VEGITABLE OF Methi Mutter Malai";

                                break;
                            }

                            case 15: {
                                VEG = "YOU ORDED VEGITABLE OF Harvali Kofta";

                                break;
                            }

                            case 16: {
                                VEG = "YOU ORDED VEGITABLE OF Chana Masala";

                                break;
                            }
                            case 17: {
                                VEG = "YOU ORDED VEGITABLE OF Bhindi Masala";

                                break;
                            }

                            case 18: {
                                VEG = "YOU ORDED VEGITABLE OF Jeera Aloo";

                                break;
                            }

                            case 19: {
                                VEG = "YOU ORDED VEGITABLE OF Dum Aloo";

                                break;
                            }

                            case 20: {
                                VEG = "YOU ORDED VEGITABLE OF Guirati Aloo";

                                break;
                            }

                            case 21: {
                                VEG = "YOU ORDED VEGITABLE OF Tinda Masala";

                                break;
                            }

                            case 22: {
                                VEG = "YOU ORDED VEGITABLE OF Aloo Palak";

                                break;
                            }

                            case 23: {
                                VEG = "YOU ORDED VEGITABLE OF Seasonal Veg";

                                break;
                            }

                            case 24: {
                                VEG = "YOU ORDED VEGITABLE OF Bhindi Do Pyaza";

                                break;
                            }
                            case 25: {
                                VEG = "YOU ORDED VEGITABLE OF Veg. Kolhapuri";

                                break;
                            }

                            case 26: {
                                VEG = "YOU ORDED VEGITABLE OF for Corn Capsicum";

                                break;
                            }
                            default: {// DEFAULT FOR INVALID
                                System.out.println("ENTER A VALID VEGITABLE NUMBER");
                                System.exit(veg);
                                break;
                            } // DEFAULT FOR INVALID ENDS
                        }// SWITCH FOR VEFITABLES ENDS
                      


                        System.out.println("ENTER 1 FOR Nav Ratan Korma \nEnter 2 for Lahori Aloo with Mutter\nEnter 3 for Mix Veg\nEnter 4 for Green Chana (Seasonal)\nEnter 5 for Corn Palak\nEnter 6 for Aloo 65\nEnter 7 for Aloo Mutter\nEnter 8 for Aloo Capsicum\nEnter 9 for Aloo Do Pyaza\nEnter 10 for Aloo Gobhi/Tomato\nEnter 11 for Gobhi Mutter\nEnter 12 for Kadi Puniabi\nEnter 13 for Veg. Kofta (Gol)\nEnter 14 for Methi Mutter Malai\nEnter 15 for Harvali Kofta\nEnter 16 for Chana Masala\nEnter 17 for Bhindi Masala\nEnter 18 for Jeera Aloo\nEnter 19 for Dum Aloo\nEnter 20 for Guirati Aloo\nEnter 21 for Tinda Masala\nEnter 22 for Aloo Palak\nEnter 23 for Seasonal Veg\nEnter 24 for Bhindi Do Pyaza\nEnter 25 for Veg. Kolhapuri\nEnter 26 for Corn Capsicum");
                        veg = sc.nextInt();

                        switch (veg) {// SWITCH FOR VEFITABLES
                            case 1: {
                                VEG = VEG+" AND VEGITABLE OF Nav Ratan Korma";

                                break;
                            }
                            case 2: {
                                VEG = VEG+" AND VEGITABLE OF Lahori Aloo with Mutter";

                                break;
                            }

                            case 3: {
                                VEG = VEG+" AND VEGITABLE OF for Mix Veg";

                                break;
                            }

                            case 4: {
                                VEG = VEG+" AND VEGITABLE OF Green Chana (Seasonal)";

                                break;
                            }

                            case 5: {
                                VEG = VEG+" AND VEGITABLE OF Corn Palak";

                                break;
                            }

                            case 6: {
                                VEG = VEG+" AND VEGITABLE OF Aloo 65";

                                break;
                            }

                            case 7: {
                                VEG = VEG+" AND VEGITABLE OF Aloo Mutter";

                                break;
                            }

                            case 8: {
                                VEG = VEG+" AND VEGITABLE OF Aloo Capsicum";

                                break;
                            }

                            case 9: {
                                VEG = "AND VEGITABLE OF Aloo Do Pyaza";

                                break;
                            }

                            case 10: {
                                VEG = "AND VEGITABLE OF Aloo Gobhi";

                                break;
                            }

                            case 11: {
                                VEG = VEG+" AND VEGITABLE OF Gobhi Mutter";

                                break;
                            }

                            case 12: {
                                VEG = VEG+" AND VEGITABLE OF Kadi Puniabi";

                                break;
                            }

                            case 13: {
                                VEG = VEG+" AND VEGITABLE OF Veg. Kofta (Gol)";

                                break;
                            }

                            case 14: {
                                VEG = VEG+" AND VEGITABLE OF Methi Mutter Malai";

                                break;
                            }

                            case 15: {
                                VEG = VEG+" AND VEGITABLE OF Harvali Kofta";

                                break;
                            }

                            case 16: {
                                VEG = VEG+" AND VEGITABLE OF Chana Masala";

                                break;
                            }
                            case 17: {
                                VEG = VEG+" AND VEGITABLE OF Bhindi Masala";

                                break;
                            }

                            case 18: {
                                VEG = VEG+" AND VEGITABLE OF Jeera Aloo";

                                break;
                            }

                            case 19: {
                                VEG = VEG+" AND VEGITABLE OF Dum Aloo";

                                break;
                            }

                            case 20: {
                                VEG = VEG+" AND VEGITABLE OF Guirati Aloo";

                                break;
                            }

                            case 21: {
                                VEG = VEG+" AND VEGITABLE OF Tinda Masala";

                                break;
                            }

                            case 22: {
                                VEG = VEG+" AND VEGITABLE OF Aloo Palak";

                                break;
                            }

                            case 23: {
                                VEG = VEG+" AND VEGITABLE OF Seasonal Veg";

                                break;
                            }

                            case 24: {
                                VEG = VEG+" AND VEGITABLE OF Bhindi Do Pyaza";

                                break;
                            }
                            case 25: {
                                VEG = VEG+" AND VEGITABLE OF Veg. Kolhapuri";

                                break;
                            }

                            case 26: {
                                VEG = VEG+" AND VEGITABLE OF for Corn Capsicum";

                                break;
                            }
                            default: {// DEFAULT FOR INVALID
                                System.out.println("ENTER A VALID VEGITABLE NUMBER");
                                System.exit(veg);
                                break;
                            } // DEFAULT FOR INVALID ENDS
                        }// SWITCH FOR VEFITABLES ENDS



                  





                        break;
                    } // CASE FOR THALI 310 ENDS

                    default: {// DEFAULT FOR INVALID THALI
                        System.out.println("NO SUCH TYPE OF THALI EXIST");
                        System.exit(2);
                        break;
                    } // DEFAULT FOR INVALID THALI

                }// SWITCH FOR THALI ENDS

                break;
            } // CASE 1 FOR VEGETARIAN MENU ENDS

            default: {// DEFAUL FOR INVALID MENU SELECTION
                System.out.println("INVALID MENU SELECTED");
                System.exit(2);
                break;
            } // DEFAUL FOR INVALID MENU SELECTION ENDS
        }

        // String SUP, VEG;
        System.out.println("EXTRA PRICE IS " + tm);
        System.out.println(SUP);
        System.out.println(VEG);

    }
}
