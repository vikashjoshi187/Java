import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class COPY {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO JMB");
        int menu1, thli, thanu, sup, tm, veg, sutr = 0, dal = 0, rice, roti, ice, pds, pnd, crd, pns, chns, bfst, bft;
        String SUP = null, VEG = null, DAL = null, RICE = null, ROTI = null, ICE = null, PDS = null, PND = null,
                BFT = null,
                CRD = null, PNS = null, CHNS = null;
        System.out.println(
                "ENTER 1 FOR VEGETARIAN MENU\nENTER 2 FOR Only For Ladies - Timing: 4 to 6pm (After 6pm 20/- per hour/per head Extra \nENTER 3 FOR BRAKE FAST");
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
                if (thli > 6) {
                    System.out.println("NO SUCH TYPE OF THALI EXIST");
                    System.exit(0);

                }

                System.out.println("PLEASE SELECT ANY VEGITABLES FORM THIS BELOW LIST");

                System.out.println(
                        "ENTER 1 FOR Nav Ratan Korma \nEnter 2 for Lahori Aloo with Mutter\nEnter 3 for Mix Veg\nEnter 4 for Green Chana (Seasonal)\nEnter 5 for Corn Palak\nEnter 6 for Aloo 65\nEnter 7 for Aloo Mutter\nEnter 8 for Aloo Capsicum\nEnter 9 for Aloo Do Pyaza\nEnter 10 for Aloo Gobhi/Tomato\nEnter 11 for Gobhi Mutter\nEnter 12 for Kadi Puniabi\nEnter 13 for Veg. Kofta (Gol)\nEnter 14 for Methi Mutter Malai\nEnter 15 for Harvali Kofta\nEnter 16 for Chana Masala\nEnter 17 for Bhindi Masala\nEnter 18 for Jeera Aloo\nEnter 19 for Dum Aloo\nEnter 20 for Guirati Aloo\nEnter 21 for Tinda Masala\nEnter 22 for Aloo Palak\nEnter 23 for Seasonal Veg\nEnter 24 for Bhindi Do Pyaza\nEnter 25 for Veg. Kolhapuri\nEnter 26 for Corn Capsicum");
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

                System.out.println(
                        "ENTER 1 FOR Nav Ratan Korma \nEnter 2 for Lahori Aloo with Mutter\nEnter 3 for Mix Veg\nEnter 4 for Green Chana (Seasonal)\nEnter 5 for Corn Palak\nEnter 6 for Aloo 65\nEnter 7 for Aloo Mutter\nEnter 8 for Aloo Capsicum\nEnter 9 for Aloo Do Pyaza\nEnter 10 for Aloo Gobhi/Tomato\nEnter 11 for Gobhi Mutter\nEnter 12 for Kadi Puniabi\nEnter 13 for Veg. Kofta (Gol)\nEnter 14 for Methi Mutter Malai\nEnter 15 for Harvali Kofta\nEnter 16 for Chana Masala\nEnter 17 for Bhindi Masala\nEnter 18 for Jeera Aloo\nEnter 19 for Dum Aloo\nEnter 20 for Guirati Aloo\nEnter 21 for Tinda Masala\nEnter 22 for Aloo Palak\nEnter 23 for Seasonal Veg\nEnter 24 for Bhindi Do Pyaza\nEnter 25 for Veg. Kolhapuri\nEnter 26 for Corn Capsicum");
                veg = sc.nextInt();

                switch (veg) {// SWITCH FOR VEFITABLES
                    case 1: {
                        VEG = VEG + " AND VEGITABLE OF Nav Ratan Korma";

                        break;
                    }
                    case 2: {
                        VEG = VEG + " AND VEGITABLE OF Lahori Aloo with Mutter";

                        break;
                    }

                    case 3: {
                        VEG = VEG + " AND VEGITABLE OF for Mix Veg";

                        break;
                    }

                    case 4: {
                        VEG = VEG + " AND VEGITABLE OF Green Chana (Seasonal)";

                        break;
                    }

                    case 5: {
                        VEG = VEG + " AND VEGITABLE OF Corn Palak";

                        break;
                    }

                    case 6: {
                        VEG = VEG + " AND VEGITABLE OF Aloo 65";

                        break;
                    }

                    case 7: {
                        VEG = VEG + " AND VEGITABLE OF Aloo Mutter";

                        break;
                    }

                    case 8: {
                        VEG = VEG + " AND VEGITABLE OF Aloo Capsicum";

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
                        VEG = VEG + " AND VEGITABLE OF Gobhi Mutter";

                        break;
                    }

                    case 12: {
                        VEG = VEG + " AND VEGITABLE OF Kadi Puniabi";

                        break;
                    }

                    case 13: {
                        VEG = VEG + " AND VEGITABLE OF Veg. Kofta (Gol)";

                        break;
                    }

                    case 14: {
                        VEG = VEG + " AND VEGITABLE OF Methi Mutter Malai";

                        break;
                    }

                    case 15: {
                        VEG = VEG + " AND VEGITABLE OF Harvali Kofta";

                        break;
                    }

                    case 16: {
                        VEG = VEG + " AND VEGITABLE OF Chana Masala";

                        break;
                    }
                    case 17: {
                        VEG = VEG + " AND VEGITABLE OF Bhindi Masala";

                        break;
                    }

                    case 18: {
                        VEG = VEG + " AND VEGITABLE OF Jeera Aloo";

                        break;
                    }

                    case 19: {
                        VEG = VEG + " AND VEGITABLE OF Dum Aloo";

                        break;
                    }

                    case 20: {
                        VEG = VEG + " AND VEGITABLE OF Guirati Aloo";

                        break;
                    }

                    case 21: {
                        VEG = VEG + " AND VEGITABLE OF Tinda Masala";

                        break;
                    }

                    case 22: {
                        VEG = VEG + " AND VEGITABLE OF Aloo Palak";

                        break;
                    }

                    case 23: {
                        VEG = VEG + " AND VEGITABLE OF Seasonal Veg";

                        break;
                    }

                    case 24: {
                        VEG = VEG + " AND VEGITABLE OF Bhindi Do Pyaza";

                        break;
                    }
                    case 25: {
                        VEG = VEG + " AND VEGITABLE OF Veg. Kolhapuri";

                        break;
                    }

                    case 26: {
                        VEG = VEG + " AND VEGITABLE OF for Corn Capsicum";

                        break;
                    }
                    default: {// DEFAULT FOR INVALID
                        System.out.println("ENTER A VALID VEGITABLE NUMBER");
                        System.exit(veg);
                        break;
                    } // DEFAULT FOR INVALID ENDS
                }// SWITCH FOR VEFITABLES ENDS

                System.out.println(
                        "ENTER 1 FOR Dal Fry\nENTER 2 FOR Dal Tadka\nENTER 3 FOR Dal Makhani\nENTER 4 FOR Dal Panchrangi");

                dal = sc.nextInt();
                switch (dal) {// SWITHCH FOR DAL
                    case 1: {// CASE 1 FOR FRY DAL
                        DAL = "YOU SELECTED DAL FRY";
                        break;
                    } // CASE 1 FOR FRY DAL ENDS

                    case 2: {// CASE 1 FOR DAL TADAKA
                        DAL = "YOU SELECTED DAL TADKA ";
                        break;
                    } // CASE 1 FOR DAL TADAKA ENDS

                    case 3: {// CASE 1 FOR DAL MAHKHANI
                        DAL = "YOU SELECTED DAL MAHKHANI";
                        break;
                    } // CASE 1 FOR DAL MAHKHANI ENDS

                    case 4: {// CASE 1 FOR DAL PANCHRANGI
                        DAL = "YOU SELECTED DAL PANCHRANGI ";
                        break;
                    } // CASE 1 FOR DAL PANCHRANGI ENDS

                    default: {// DEFAULT FOR INVALID DALL TYPE
                        System.out.println("NO SUCH TYPE OF DAL AVILABLE");
                        System.exit(dal);
                        break;
                    } // DEFAULT FOR INVALID DALL TYPE
                }// SWITHCH FOR DAL ENDS

                System.out.println(
                        "ENTER 1 FOR Rice\nENTER 2 FOR Jeera Rice\nENTER 3 FOR Green Peas Pulao\nENTER 4 FOR Veg Pulao\nENTER 5 FOR Veg Fried Rice\nENTER 6 FOR Veg Biryani");
                rice = sc.nextInt();
                switch (rice) {// SWITCH FOR RICE
                    case 1: {// CASE 1 FOR FOR RICE
                        RICE = "YOU SELECTED RICE";
                        break;
                    } // CASE 1 FOR FOR RICE ENDS

                    case 2: {// CASE 1 FOR FOR JEERA RICE
                        RICE = "YOU SELECTED JEERA RICE";
                        break;
                    } // CASE 1 FOR FOR JEERA RICE ENDS

                    case 4: {// CASE 1 FOR FOR VEG PULAO
                        RICE = "YOU SELECTED VEG PULAO";
                        break;
                    } // CASE 1 FOR FOR VEG PULAO ENDS

                    case 3: {// CASE 1 FOR FOR GREEN PEAS PULAO
                        RICE = "YOU SELECTED GREEN PEAS PULAO";
                        break;
                    } // CASE 1 FOR FOR GREEN PEAS PULAO ENDS

                    case 5: {// CASE 1 FOR FOR VEG FRIED RICE
                        RICE = "YOU SELECTED VEG FRIED RICE";
                        break;
                    } // CASE 1 FOR FOR VEG FRIED RICE ENDS

                    case 6: {// CASE 1 FOR FOR VEG BIRYANI
                        RICE = "YOU SELECTED VEG BIRYANI";
                        break;
                    } // CASE 1 FOR FOR VEG BIRYANI ENDS

                    default: {// DEFAULT FOR INVALID RICE TYPE
                        System.out.println("ENTER A VAILD RICE TYPE");
                        System.exit(rice);
                        break;
                    } // DEFAULT FOR INVALID RICE TYPE ENDS
                }// SWITCH FOR RICE END

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
                }// SWITCH ENDS FOR SECLECTING FOR SOUPS AND WELCOME DRINKS

                System.out.println(
                        "ENTER 1 FOR ROTI\nENTER 2 FOR PARTHA\nENTER 3 FOR FOR KULCHA\nENTER 4 FOR NAAN\nENTER 5 FOR MESSI ROTI\nENTER 6 FOR MEETHI POORI");
                roti = sc.nextInt();
                switch (roti) {// SWITCH FOR ROTI
                    case 1: {// CASE 1 FOR ROTI ENDS

                        ROTI = "YOU SELECTED ROTI";
                        break;
                    } // CASE 1 FOR ROTI ENDS

                    case 2: {// CASE 1 FOR PARATHA ENDS

                        ROTI = "YOU SELECTED PARATHA";
                        break;
                    } // CASE 1 FOR PARATHA ENDS

                    case 3: {// CASE 1 FOR KULCHA ENDS

                        ROTI = "YOU SELECTED KULCHA";
                        break;
                    } // CASE 1 FOR KULCHA ENDS

                    case 4: {// CASE 1 FOR NAAN ENDS

                        ROTI = "YOU SELECTED NAAN";
                        break;
                    } // CASE 1 FOR NAAN ENDS

                    case 5: {// CASE 1 FOR MESSI ROTI ENDS

                        ROTI = "YOU SELECTED MESSI ROTI";
                        break;
                    } // CASE 1 FOR MESSI ROTI ENDS

                    case 6: {// CASE 1 FOR MEETHI POORI ENDS

                        ROTI = "YOU SELECTED MEETHI POORI";
                        break;
                    } // CASE 1 FOR MEETHI POORI ENDS

                    default: {
                        System.out.println("PLEASE ENTER A VALID ITEM NUMBER FOR ROTI");
                        System.exit(roti);
                        break;
                    }
                }// SWITCH FOR ROTI ENDS

                System.out.println(
                        "ENTER 1 FOR •Gulab Jamun \nENTER 2 FOR Gajar Ka Halwa\nENTER 3 FOR Moong Ka Halwa\nENTER 4 FOR Shree Khand\nENTER 5 FOR Aam Khand\nENTER 6 FOR Vanilla\nENTER 7 FOR Butter Scotch\nENTER 8 FOR Sitaphal Basundi");
                ice = sc.nextInt();
                switch (ice) {// SWITCH FOR ICE CREAM AND SWEET DISH

                    case 1: {// CASE 1 FOR GULAB JAMUN
                        ICE = "YOU SELECTED Gulab Jamun";
                        break;
                    } // CASE 1 FOR Gulab Jamun ENDS

                    case 2: {// CASE 1 FOR Gajar Ka Halwa
                        ICE = "YOU SELECTED Gajar Ka Halwa";
                        break;
                    } // CASE 1 FOR Gajar Ka Halwa ENDS

                    case 3: {// CASE 1 FOR Moong Ka Halwa
                        ICE = "YOU SELECTED Moong Ka Halwa";
                        break;
                    } // CASE 1 FOR Moong Ka Halwa ENDS

                    case 4: {// CASE 1 FOR Shree Khand
                        ICE = "YOU SELECTED Shree Khand";
                        break;
                    } // CASE 1 FOR Shree Khand ENDS

                    case 5: {// CASE 1 FOR Aam Khand
                        ICE = "YOU SELECTED Aam Khand";
                        break;
                    } // CASE 1 FOR Aam Khand ENDS

                    case 6: {// CASE 1 FOR Vanilla
                        ICE = "YOU SELECTED Vanilla";
                        break;
                    } // CASE 1 FOR Vanilla ENDS

                    case 7: {// CASE 1 FOR Butter Scotch
                        ICE = "YOU SELECTED Butter Scotch";
                        break;
                    } // CASE 1 FOR Butter Scotch ENDS

                    case 8: {// CASE 1 FOR Sitaphal Basundi
                        ICE = "YOU SELECTED Sitaphal Basundi";
                        break;
                    } // CASE 1 FOR Sitaphal Basundi ENDS

                    default: {
                        System.out.println("PLEASE ENTER A VALID SWEET DISH NUMBER");
                        System.exit(ice);
                        break;
                    }
                }// SWITCH FOR ICE CREAM AND SWEET DISH ENDS
                 /////////////////////////
                if (thli == 3) {// IF CONDITION FOR ONLY ONE TYPE OF STARTER
                    ///////////////////////////////////////////////////////////////////////////
                    System.out.println(
                            "ENTER 1 FOR Mix Veg Pakoda\nENTER 2 FOR Veg Finger\nENTER 3 FOR Bread Pakoda\nENTER 4 FOR Methi Kabab\nENTER 5 FOR Paneer Pudina Tikkaa\nENTER 6 FOR Dragon Aloo\nENTER 7 FOR Saboo Dana\nENTER 8 FOR Finger Chips\nENTER 9 FOR Aloo Corn Kabab\nENTER 10 FOR Veg Cutlet\nENTER 11 FOR Veg Kothey\nENTER 12 FOR Hara Bhara Kabab \nENTER 13 FOR Corn Chat \nENTER 14 FOR Aloo Chat\nENTER 15 FOR Saboo Dana vada \nENTER 16 FOR Veg Manchurian Dry \nENTER 17 FOR Tandoori Manchurian \nENTER 18 FOR Chinese Corn Kebab");
                    pds = sc.nextInt();
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda

                            PDS = "YOU SELECTED Mix Veg Pakoda";

                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS

                        case 2: {// CASE 1 FOR Veg Finger

                            PDS = "YOU SELECTED Veg Finger";

                            break;
                        } // CASE 1 FOR Veg Finger ENDS

                        case 3: {// CASE 1 FOR Bread Pakoda

                            PDS = "YOU SELECTED Bread Pakoda";

                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS

                        case 4: {// CASE 1 FOR Methi Kabab

                            PDS = "YOU SELECTED Methi Kabab";

                            break;
                        } // CASE 1 FOR Methi Kabab ENDS

                        case 5: {// CASE 1 FOR Moong Pakoda

                            PDS = "YOU SELECTED Moong Pakoda";

                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS

                        case 6: {// CASE 1 FOR Dragon Aloo

                            PDS = "YOU SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 7: {// CASE 1 FOR Saboo Dana

                            PDS = "YOU SELECTED Saboo Dana";

                            break;
                        } // CASE 1 FOR Saboo Dana ENDS

                        case 8: {// CASE 1 FOR Finger Chips

                            PDS = "YOU SELECTED Finger Chips";

                            break;
                        } // CASE 1 FOR Finger Chips ENDS

                        case 9: {// CASE 1 FOR Aloo Corn Kabab

                            PDS = "YOU SELECTED  Aloo Corn Kabab";

                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS

                        case 10: {// CASE 1 FOR Dragon Aloo

                            PDS = "YOU SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 11: {// CASE 1 FOR Veg Kothey

                            PDS = "YOU SELECTED Veg Kothey";

                            break;
                        } // CASE 1 FOR Veg Kothey ENDS

                        case 12: {// CASE 1 FOR Hara Bhara Kabab

                            PDS = "YOU SELECTED Hara Bhara Kabab";

                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS

                        case 13: {// CASE 1 FOR Corn Chat

                            PDS = "YOU SELECTED Corn Chat";

                            break;
                        } // CASE 1 FOR Corn Chat ENDS

                        case 14: {// CASE 1 FOR Aloo Chat

                            PDS = "YOU SELECTED Aloo Chat";

                            break;
                        } // CASE 1 FOR Aloo Chat ENDS

                        case 15: {// CASE 1 FOR Saboo Dana vada

                            PDS = "YOU SELECTED Saboo Dana vada";

                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS

                        case 16: {// CASE 1 FOR Veg Manchurian Dry

                            PDS = "YOU SELECTED Veg Manchurian Dry";

                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS

                        case 17: {// CASE 1 FOR Tandoori Manchurian

                            PDS = "YOU SELECTED Tandoori Manchurian";

                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS

                        case 18: {// CASE 1 FOR Chinese Corn Kebab

                            PDS = "YOU SELECTED Chinese Corn Kebab";

                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("INVALID STARTER TYPE");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }

                } // IF CONDITION FOR ONLY ONE TYPE OF STARTER ENDS

                if (thli == 4 || thli == 5) {// IF CONDITION FOR ONLY TWO TYPE OF STARTER
                    System.out.println("SELECTE STARTER 1");
                    System.out.println(
                            "ENTER 1 FOR Mix Veg Pakoda\nENTER 2 FOR Veg Finger\nENTER 3 FOR Bread Pakoda\nENTER 4 FOR Methi Kabab\nENTER 5 FOR Paneer Pudina Tikkaa\nENTER 6 FOR Dragon Aloo\nENTER 7 FOR Saboo Dana\nENTER 8 FOR Finger Chips\nENTER 9 FOR Aloo Corn Kabab\nENTER 10 FOR Veg Cutlet\nENTER 11 FOR Veg Kothey\nENTER 12 FOR Hara Bhara Kabab \nENTER 13 FOR Corn Chat \nENTER 14 FOR Aloo Chat\nENTER 15 FOR Saboo Dana vada \nENTER 16 FOR Veg Manchurian Dry \nENTER 17 FOR Tandoori Manchurian \nENTER 18 FOR Chinese Corn Kebab");
                    pds = sc.nextInt();
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda

                            PDS = "YOU SELECTED Mix Veg Pakoda";

                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS

                        case 2: {// CASE 1 FOR Veg Finger

                            PDS = "YOU SELECTED Veg Finger";

                            break;
                        } // CASE 1 FOR Veg Finger ENDS

                        case 3: {// CASE 1 FOR Bread Pakoda

                            PDS = "YOU SELECTED Bread Pakoda";

                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS

                        case 4: {// CASE 1 FOR Methi Kabab

                            PDS = "YOU SELECTED Methi Kabab";

                            break;
                        } // CASE 1 FOR Methi Kabab ENDS

                        case 5: {// CASE 1 FOR Moong Pakoda

                            PDS = "YOU SELECTED Moong Pakoda";

                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS

                        case 6: {// CASE 1 FOR Dragon Aloo

                            PDS = "YOU SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 7: {// CASE 1 FOR Saboo Dana

                            PDS = "YOU SELECTED Saboo Dana";

                            break;
                        } // CASE 1 FOR Saboo Dana ENDS

                        case 8: {// CASE 1 FOR Finger Chips

                            PDS = "YOU SELECTED Finger Chips";

                            break;
                        } // CASE 1 FOR Finger Chips ENDS

                        case 9: {// CASE 1 FOR Aloo Corn Kabab

                            PDS = "YOU SELECTED  Aloo Corn Kabab";

                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS

                        case 10: {// CASE 1 FOR Dragon Aloo

                            PDS = "YOU SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 11: {// CASE 1 FOR Veg Kothey

                            PDS = "YOU SELECTED Veg Kothey";

                            break;
                        } // CASE 1 FOR Veg Kothey ENDS

                        case 12: {// CASE 1 FOR Hara Bhara Kabab

                            PDS = "YOU SELECTED Hara Bhara Kabab";

                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS

                        case 13: {// CASE 1 FOR Corn Chat

                            PDS = "YOU SELECTED Corn Chat";

                            break;
                        } // CASE 1 FOR Corn Chat ENDS

                        case 14: {// CASE 1 FOR Aloo Chat

                            PDS = "YOU SELECTED Aloo Chat";

                            break;
                        } // CASE 1 FOR Aloo Chat ENDS

                        case 15: {// CASE 1 FOR Saboo Dana vada

                            PDS = "YOU SELECTED Saboo Dana vada";

                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS

                        case 16: {// CASE 1 FOR Veg Manchurian Dry

                            PDS = "YOU SELECTED Veg Manchurian Dry";

                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS

                        case 17: {// CASE 1 FOR Tandoori Manchurian

                            PDS = "YOU SELECTED Tandoori Manchurian";

                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS

                        case 18: {// CASE 1 FOR Chinese Corn Kebab

                            PDS = "YOU SELECTED Chinese Corn Kebab";

                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("INVALID STARTER TYPE");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }

                    System.out.println("SELECTE STARTER 2");

                    System.out.println(
                            "ENTER 1 FOR Mix Veg Pakoda\nENTER 2 FOR Veg Finger\nENTER 3 FOR Bread Pakoda\nENTER 4 FOR Methi Kabab\nENTER 5 FOR Paneer Pudina Tikkaa\nENTER 6 FOR Dragon Aloo\nENTER 7 FOR Saboo Dana\nENTER 8 FOR Finger Chips\nENTER 9 FOR Aloo Corn Kabab\nENTER 10 FOR Veg Cutlet\nENTER 11 FOR Veg Kothey\nENTER 12 FOR Hara Bhara Kabab \nENTER 13 FOR Corn Chat \nENTER 14 FOR Aloo Chat\nENTER 15 FOR Saboo Dana vada \nENTER 16 FOR Veg Manchurian Dry \nENTER 17 FOR Tandoori Manchurian \nENTER 18 FOR Chinese Corn Kebab");
                    pds = sc.nextInt();
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda

                            PDS = PDS + "AND SELECTED Mix Veg Pakoda";

                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS

                        case 2: {// CASE 1 FOR Veg Finger

                            PDS = PDS + "AND SELECTED Veg Finger";

                            break;
                        } // CASE 1 FOR Veg Finger ENDS

                        case 3: {// CASE 1 FOR Bread Pakoda

                            PDS = PDS + "AND SELECTED Bread Pakoda";

                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS

                        case 4: {// CASE 1 FOR Methi Kabab

                            PDS = PDS + "AND SELECTED Methi Kabab";

                            break;
                        } // CASE 1 FOR Methi Kabab ENDS

                        case 5: {// CASE 1 FOR Moong Pakoda

                            PDS = PDS + "AND SELECTED Moong Pakoda";

                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS

                        case 6: {// CASE 1 FOR Dragon Aloo

                            PDS = PDS + "AND SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 7: {// CASE 1 FOR Saboo Dana

                            PDS = PDS + "AND SELECTED Saboo Dana";

                            break;
                        } // CASE 1 FOR Saboo Dana ENDS

                        case 8: {// CASE 1 FOR Finger Chips

                            PDS = PDS + "AND SELECTED Finger Chips";

                            break;
                        } // CASE 1 FOR Finger Chips ENDS

                        case 9: {// CASE 1 FOR Aloo Corn Kabab

                            PDS = PDS + "AND SELECTED  Aloo Corn Kabab";

                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS

                        case 10: {// CASE 1 FOR Dragon Aloo

                            PDS = PDS + "AND SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 11: {// CASE 1 FOR Veg Kothey

                            PDS = PDS + "AND SELECTED Veg Kothey";

                            break;
                        } // CASE 1 FOR Veg Kothey ENDS

                        case 12: {// CASE 1 FOR Hara Bhara Kabab

                            PDS = PDS + "AND SELECTED Hara Bhara Kabab";

                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS

                        case 13: {// CASE 1 FOR Corn Chat

                            PDS = PDS + "AND SELECTED Corn Chat";

                            break;
                        } // CASE 1 FOR Corn Chat ENDS

                        case 14: {// CASE 1 FOR Aloo Chat

                            PDS = PDS + "AND SELECTED Aloo Chat";

                            break;
                        } // CASE 1 FOR Aloo Chat ENDS

                        case 15: {// CASE 1 FOR Saboo Dana vada

                            PDS = PDS + "AND SELECTED Saboo Dana vada";

                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS

                        case 16: {// CASE 1 FOR Veg Manchurian Dry

                            PDS = PDS + "AND SELECTED Veg Manchurian Dry";

                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS

                        case 17: {// CASE 1 FOR Tandoori Manchurian

                            PDS = PDS + "AND SELECTED Tandoori Manchurian";

                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS

                        case 18: {// CASE 1 FOR Chinese Corn Kebab

                            PDS = PDS + "AND SELECTED Chinese Corn Kebab";

                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("INVALID STARTER TYPE");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }
                }
                if (thli == 6) {// IF CONDITION FOR THREE TYPE OF STARTER
                    System.out.println("SELECTE STARTER 1");
                    System.out.println(
                            "ENTER 1 FOR Mix Veg Pakoda\nENTER 2 FOR Veg Finger\nENTER 3 FOR Bread Pakoda\nENTER 4 FOR Methi Kabab\nENTER 5 FOR Paneer Pudina Tikkaa\nENTER 6 FOR Dragon Aloo\nENTER 7 FOR Saboo Dana\nENTER 8 FOR Finger Chips\nENTER 9 FOR Aloo Corn Kabab\nENTER 10 FOR Veg Cutlet\nENTER 11 FOR Veg Kothey\nENTER 12 FOR Hara Bhara Kabab \nENTER 13 FOR Corn Chat \nENTER 14 FOR Aloo Chat\nENTER 15 FOR Saboo Dana vada \nENTER 16 FOR Veg Manchurian Dry \nENTER 17 FOR Tandoori Manchurian \nENTER 18 FOR Chinese Corn Kebab");
                    pds = sc.nextInt();
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda

                            PDS = "YOU SELECTED Mix Veg Pakoda";

                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS

                        case 2: {// CASE 1 FOR Veg Finger

                            PDS = "YOU SELECTED Veg Finger";

                            break;
                        } // CASE 1 FOR Veg Finger ENDS

                        case 3: {// CASE 1 FOR Bread Pakoda

                            PDS = "YOU SELECTED Bread Pakoda";

                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS

                        case 4: {// CASE 1 FOR Methi Kabab

                            PDS = "YOU SELECTED Methi Kabab";

                            break;
                        } // CASE 1 FOR Methi Kabab ENDS

                        case 5: {// CASE 1 FOR Moong Pakoda

                            PDS = "YOU SELECTED Moong Pakoda";

                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS

                        case 6: {// CASE 1 FOR Dragon Aloo

                            PDS = "YOU SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 7: {// CASE 1 FOR Saboo Dana

                            PDS = "YOU SELECTED Saboo Dana";

                            break;
                        } // CASE 1 FOR Saboo Dana ENDS

                        case 8: {// CASE 1 FOR Finger Chips

                            PDS = "YOU SELECTED Finger Chips";

                            break;
                        } // CASE 1 FOR Finger Chips ENDS

                        case 9: {// CASE 1 FOR Aloo Corn Kabab

                            PDS = "YOU SELECTED  Aloo Corn Kabab";

                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS

                        case 10: {// CASE 1 FOR Dragon Aloo

                            PDS = "YOU SELECTED Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 11: {// CASE 1 FOR Veg Kothey

                            PDS = "YOU SELECTED Veg Kothey";

                            break;
                        } // CASE 1 FOR Veg Kothey ENDS

                        case 12: {// CASE 1 FOR Hara Bhara Kabab

                            PDS = "YOU SELECTED Hara Bhara Kabab";

                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS

                        case 13: {// CASE 1 FOR Corn Chat

                            PDS = "YOU SELECTED Corn Chat";

                            break;
                        } // CASE 1 FOR Corn Chat ENDS

                        case 14: {// CASE 1 FOR Aloo Chat

                            PDS = "YOU SELECTED Aloo Chat";

                            break;
                        } // CASE 1 FOR Aloo Chat ENDS

                        case 15: {// CASE 1 FOR Saboo Dana vada

                            PDS = "YOU SELECTED Saboo Dana vada";

                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS

                        case 16: {// CASE 1 FOR Veg Manchurian Dry

                            PDS = "YOU SELECTED Veg Manchurian Dry";

                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS

                        case 17: {// CASE 1 FOR Tandoori Manchurian

                            PDS = "YOU SELECTED Tandoori Manchurian";

                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS

                        case 18: {// CASE 1 FOR Chinese Corn Kebab

                            PDS = "YOU SELECTED Chinese Corn Kebab";

                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("INVALID STARTER TYPE");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }

                    System.out.println("SELECTE STARTER 2");
                    System.out.println(
                            "ENTER 1 FOR Mix Veg Pakoda\nENTER 2 FOR Veg Finger\nENTER 3 FOR Bread Pakoda\nENTER 4 FOR Methi Kabab\nENTER 5 FOR Paneer Pudina Tikkaa\nENTER 6 FOR Dragon Aloo\nENTER 7 FOR Saboo Dana\nENTER 8 FOR Finger Chips\nENTER 9 FOR Aloo Corn Kabab\nENTER 10 FOR Veg Cutlet\nENTER 11 FOR Veg Kothey\nENTER 12 FOR Hara Bhara Kabab \nENTER 13 FOR Corn Chat \nENTER 14 FOR Aloo Chat\nENTER 15 FOR Saboo Dana vada \nENTER 16 FOR Veg Manchurian Dry \nENTER 17 FOR Tandoori Manchurian \nENTER 18 FOR Chinese Corn Kebab");
                    pds = sc.nextInt();
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda

                            PDS = PDS + ",Mix Veg Pakoda";

                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS

                        case 2: {// CASE 1 FOR Veg Finger

                            PDS = PDS + ",Veg Finger";

                            break;
                        } // CASE 1 FOR Veg Finger ENDS

                        case 3: {// CASE 1 FOR Bread Pakoda

                            PDS = PDS + ",Bread Pakoda";

                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS

                        case 4: {// CASE 1 FOR Methi Kabab

                            PDS = PDS + ",Methi Kabab";

                            break;
                        } // CASE 1 FOR Methi Kabab ENDS

                        case 5: {// CASE 1 FOR Moong Pakoda

                            PDS = PDS + ",Moong Pakoda";

                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS

                        case 6: {// CASE 1 FOR Dragon Aloo

                            PDS = PDS + ",Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 7: {// CASE 1 FOR Saboo Dana

                            PDS = PDS + ",Saboo Dana";

                            break;
                        } // CASE 1 FOR Saboo Dana ENDS

                        case 8: {// CASE 1 FOR Finger Chips

                            PDS = PDS + ",Finger Chips";

                            break;
                        } // CASE 1 FOR Finger Chips ENDS

                        case 9: {// CASE 1 FOR Aloo Corn Kabab

                            PDS = PDS + ", Aloo Corn Kabab";

                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS

                        case 10: {// CASE 1 FOR Dragon Aloo

                            PDS = PDS + ",Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS

                        case 11: {// CASE 1 FOR Veg Kothey

                            PDS = PDS + ",Veg Kothey";

                            break;
                        } // CASE 1 FOR Veg Kothey ENDS

                        case 12: {// CASE 1 FOR Hara Bhara Kabab

                            PDS = PDS + ",Hara Bhara Kabab";

                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS

                        case 13: {// CASE 1 FOR Corn Chat

                            PDS = PDS + ",Corn Chat";

                            break;
                        } // CASE 1 FOR Corn Chat ENDS

                        case 14: {// CASE 1 FOR Aloo Chat

                            PDS = PDS + ",Aloo Chat";

                            break;
                        } // CASE 1 FOR Aloo Chat ENDS

                        case 15: {// CASE 1 FOR Saboo Dana vada

                            PDS = PDS + ",Saboo Dana vada";

                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS

                        case 16: {// CASE 1 FOR Veg Manchurian Dry

                            PDS = PDS + ",Veg Manchurian Dry";

                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS

                        case 17: {// CASE 1 FOR Tandoori Manchurian

                            PDS = PDS + ",Tandoori Manchurian";

                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS

                        case 18: {// CASE 1 FOR Chinese Corn Kebab

                            PDS = PDS + ",Chinese Corn Kebab";

                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("INVALID STARTER TYPE");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }
                    System.out.println("SELECTE STARTER 3");
                    System.out.println(
                            "ENTER 1 FOR Mix Veg Pakoda\nENTER 2 FOR Veg Finger\nENTER 3 FOR Bread Pakoda\nENTER 4 FOR Methi Kabab\nENTER 5 FOR Paneer Pudina Tikkaa\nENTER 6 FOR Dragon Aloo\nENTER 7 FOR Saboo Dana\nENTER 8 FOR Finger Chips\nENTER 9 FOR Aloo Corn Kabab\nENTER 10 FOR Veg Cutlet\nENTER 11 FOR Veg Kothey\nENTER 12 FOR Hara Bhara Kabab \nENTER 13 FOR Corn Chat \nENTER 14 FOR Aloo Chat\nENTER 15 FOR Saboo Dana vada \nENTER 16 FOR Veg Manchurian Dry \nENTER 17 FOR Tandoori Manchurian \nENTER 18 FOR Chinese Corn Kebab");
                    pds = sc.nextInt();
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda

                            PDS = PDS + "AND Mix Veg Pakoda";
                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS
                        case 2: {// CASE 1 FOR Veg Finger

                            PDS = PDS + "AND Veg Finger";
                            break;
                        } // CASE 1 FOR Veg Finger ENDS
                        case 3: {// CASE 1 FOR Bread Pakoda

                            PDS = PDS + "AND Bread Pakoda";
                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS
                        case 4: {// CASE 1 FOR Methi Kabab

                            PDS = PDS + "AND Methi Kabab";
                            break;
                        } // CASE 1 FOR Methi Kabab ENDS
                        case 5: {// CASE 1 FOR Moong Pakoda

                            PDS = PDS + "AND Moong Pakoda";
                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS
                        case 6: {// CASE 1 FOR Dragon Aloo

                            PDS = PDS + "AND Dragon Aloo";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 7: {// CASE 1 FOR Saboo Dana

                            PDS = PDS + "AND Saboo Dana";
                            break;
                        } // CASE 1 FOR Saboo Dana ENDS
                        case 8: {// CASE 1 FOR Finger Chips

                            PDS = PDS + "AND Finger Chips";
                            break;
                        } // CASE 1 FOR Finger Chips ENDS
                        case 9: {// CASE 1 FOR Aloo Corn Kabab

                            PDS = PDS + "AND  Aloo Corn Kabab";
                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS
                        case 10: {// CASE 1 FOR Dragon Aloo
                            PDS = PDS + "AND Dragon Aloo";

                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 11: {// CASE 1 FOR Veg Kothey
                            PDS = PDS + "AND Veg Kothey";
                            break;
                        } // CASE 1 FOR Veg Kothey ENDS
                        case 12: {// CASE 1 FOR Hara Bhara Kabab
                            PDS = PDS + "AND Hara Bhara Kabab";
                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS
                        case 13: {// CASE 1 FOR Corn Chat
                            PDS = PDS + "AND Corn Chat";
                            break;
                        } // CASE 1 FOR Corn Chat ENDS
                        case 14: {// CASE 1 FOR Aloo ChaPDS = PDS + "AND Aloo Chat";
                            break;
                        } // CASE 1 FOR Aloo Chat ENDS
                        case 15: {// CASE 1 FOR Saboo Dana vada
                            PDS = PDS + "AND Saboo Dana vada";
                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS
                        case 16: {// CASE 1 FOR Veg Manchurian Dry
                            PDS = PDS + "AND Veg Manchurian Dry";
                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS
                        case 17: {// CASE 1 FOR Tandoori Manchurian

                            PDS = PDS + "AND Tandoori Manchurian";
                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS
                        case 18: {// CASE 1 FOR Chinese Corn Kebab

                            PDS = PDS + "AND Chinese Corn Kebab";
                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("INVALID STARTER TYPE");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }

                    System.out.println("SELECT CHINEASE ITEM");
                    System.out.println(
                            "ENTER 1 FOR Backed Veg\nENTER 2 FOR Veg Manchurian\nENTER 3 FOR Veg Noodles\nENTER 4 FOR Backed Palak\nENTER 5 FOR Backed Palak\nENTER 6 FOR Veg Fried Rice");
                    chns = sc.nextInt();
                    switch (chns) {// SWITCH FOR CHINESE ITEM
                        case 1: {// CASE FOR Backed Veg

                            CHNS = "YOU SELECTED Backed Veg";
                            break;
                        } // CASE FOR Backed Veg ENDS
                        case 2: {// CASE FOR Veg Manchurian

                            CHNS = "YOU SELECTED Veg Manchurian";
                            break;
                        } // CASE FOR Veg Manchurian ENDS
                        case 3: {// CASE FOR Veg Noodles

                            CHNS = "YOU SELECTED Veg Noodles";
                            break;
                        } // CASE FOR Veg Noodles ENDS
                        case 4: {// CASE FOR Backed Palak

                            CHNS = "YOU SELECTED Backed Palak";
                            break;
                        } // CASE FOR Backed Palak ENDS
                        case 5: {// CASE FOR Backed Palak

                            CHNS = "YOU SELECTED Backed Palak";
                            break;
                        } // CASE FOR Backed Palak ENDS
                        case 6: {// CASE FOR Fried Rice

                            CHNS = "YOU SELECTED Fried Rice";
                            break;
                        } // CASE FOR Fried Rice ENDS
                        default: {
                            break;
                        }
                    }// SWITCH FOR CHINESE ITEM CASE

                } // IF CONDITION FOR ONLY THREE TYPE OF STARTER ENDS

                ////////////// PANEER DISH ////////////////////////
                System.out.println("SELECT THE PANEER DISH");
                System.out.println(
                        "ENTER 1 FOR Paneer Butter Masala\nENTER 2 FOR Paneer Punjabi\nENTER 3 FOR Paneer Palak\nENTER 4 FOR Paneer Mutter\nENTER 5 FOR •Paneer Do Pyaza\nENTER 6 FOR Paneer Tikka Masala\nENTER 7 FOR Paneer Kadai\nENTER 8 FOR Methi Paneer\nENTER 9 FOR Corn Paneer\nENTER 10 FOR •Paneer Kolhapuri\nENTER 11 FOR Paneer Chatpatta");
                pnd = sc.nextInt();
                switch (pnd) {// SWITCH FOR PANEER DISH
                    case 1: {// CASE FOR Paneer Butter Masala
                        PND = "YOU SELECTED Paneer Butter Masala";
                        break;
                    } // CASE FOR Paneer Butter Masala ENDS
                    case 2: {// CASE FOR Paneer Punjabi
                        PND = "YOU SELECTED Paneer Punjabi";
                        break;
                    } // CASE FOR Paneer Punjabi ENDS
                    case 3: {// CASE FOR Paneer Palak
                        PND = "YOU SELECTED Paneer Palak";
                        break;
                    } // CASE FOR Paneer Palak ENDS

                    case 4: {// CASE FOR Paneer Mutte
                        PND = "YOU SELECTED Paneer Mutter";
                        break;
                    } // CASE FOR Paneer Mutter ENDS
                    case 5: {// CASE FOR Paneer Do Pyaza
                        PND = "YOU SELECTED Paneer Do Pyaza";
                        break;
                    } // CASE FOR Paneer Do Pyaza ENDS
                    case 6: {// CASE FOR Paneer Tikka Masala
                        PND = "YOU SELECTED Paneer Tikka Masala";
                        break;
                    } // CASE FOR Paneer Tikka Masala ENDS
                    case 7: {// CASE FOR Paneer Kadai
                        PND = "YOU SELECTED Paneer Kadai";
                        break;
                    } // CASE FOR Paneer Kadai ENDS
                    case 8: {// CASE FOR Methi Paneer
                        PND = "YOU SELECTED Methi Paneer";
                        break;
                    } // CASE FOR Methi Paneer ENDS
                    case 9: {// CASE FOR Corn Paneer
                        PND = "YOU SELECTED Corn Paneer";
                        break;
                    } // CASE FOR Corn Paneer ENDS
                    case 10: {// CASE FOR Paneer Kolhapuri
                        PND = "YOU SELECTED Paneer Kolhapuri";
                        break;
                    } // CASE FOR Paneer Kolhapuri ENDS
                    case 11: {// CASE FOR FOR Paneer Chatpatta
                        PND = "YOU SELECTED FOR Paneer Chatpatta";
                        break;
                    } // CASE FOR FOR Paneer Chatpatta ENDS
                    default: {// DEFAULT FOR INVALID PANEER DISH
                        System.out.println("THIS TYPE OF PANEER DISH IS NOT AVIAVLE");
                        System.exit(pnd);
                        break;
                    } // DEFAULT FOR INVALID PANEER DISH ENDS
                }// SWITCH FOR PANEER DISH ENDS

                System.out.println("SELECT CURD DISH");
                System.out.println(
                        "ENTER 1 FOR Veg Raita\nENTER 2 FOR Loki Raita\nENTER 3 FOR Aloo Raita\nENTER 4 FOR Dahi Papdi\nENTER 5 FOR Boondi Raita\nENTER 6 FOR Fruit Raita\nENTER 7 FOR Dahi Vada");
                crd = sc.nextInt();
                switch (crd) {// SWITCH FOR CURD DISH
                    case 1: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Veg Raita";
                        break;
                    } // CASE FOR CURD DISH END
                    case 2: {// CASE FOR Loki Raita
                        CRD = "YOU SELECTED Loki Raita";
                        break;
                    } // CASE FOR Loki Raita END
                    case 3: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Aloo Raita";
                        break;
                    } // CASE FOR CURD DISH END
                    case 4: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Dahi Papdi";
                        break;
                    } // CASE FOR CURD DISH END
                    case 5: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Boondi Raita";
                        break;
                    } // CASE FOR CURD DISH END
                    case 6: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Fruit Raita";
                        break;
                    } // CASE FOR CURD DISH END
                    case 7: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Dahi Vada";
                        break;
                    } // CASE FOR CURD DISH END
                    default: {// DEFAULT FOR INVALID CURD DISH
                        System.out.println("PLEASE ENTER A VAID CURD DISH TYPE");
                        System.exit(crd);
                        break;
                    } // DEFAULT FOR INVALID CURD DISH ENDS
                }// SWITCH FOR CURD DISH ENDS

                if (thli == 6 || thli == 7) {// IF CONDITION FOR PANEER STARTER
                    System.out.println(
                            "ENTER 1 FOR Paneer Chilli\nENTER 2 FOR •Paneer Tikka\nENTER 3 FOR Dragon Paneer\nENTER 4 FOR Paneer 65\nENTER 5 FOR Paneer Pudina Tikkaa\nENTER 6 FOR Paneer Achari Tikka ");
                    pns = sc.nextInt();
                    switch (pns) {
                        case 1: {// CASE 1 FOR Paneer Chilli
                            PDS = "YOU SELECTED Paneer Chilli";
                            break;
                        } // CASE 1 FOR Paneer Chilli ENDS
                        case 2: {// CASE 1 FOR •Paneer Tikka
                            PDS = "YOU SELECTED •Paneer Tikka";
                            break;
                        } // CASE 1 FOR •Paneer Tikka ENDS
                        case 3: {// CASE 1 FOR Dragon Paneer
                            PDS = "YOU SELECTED Dragon Paneer";
                            break;
                        } // CASE 1 FOR Dragon Paneer ENDS
                        case 4: {// CASE 1 FOR Paneer 65
                            PDS = "YOU SELECTED Paneer 65";
                            break;
                        } // CASE 1 FOR Paneer 65 ENDS
                        case 5: {// CASE 1 FOR Paneer Pudina Tikkaa
                            PDS = "YOU SELECTED Paneer Pudina Tikkaa";
                            break;
                        } // CASE 1 FOR Paneer Pudina Tikkaa ENDS
                        case 6: {// CASE 1 FOR Paneer Achari Tikka
                            PDS = "YOU SELECTED Paneer Achari Tikka";
                            break;
                        } // CASE 1 FOR Paneer Achari Tikka ENDS
                        default: {
                            break;
                        }
                    }// IF CONDITION FOR ONLY TWO TYPE OF STARTER ENDS
                } // IF CONDITION FOR PANEER STARTER

                switch (thli) {// SWITCH FOR THALI

                    case 1: {// CASE FOR THALI 310
                        // System.out.println("YOU HAVE SELECTED FOR THALI 310");

                        break;
                    } // CASE FOR THALI 310 ENDS

                }// SWITCH FOR THALI ENDS

                System.out.println("EXTRA PRICE IS " + tm);
                System.out.println(PDS);
                System.out.println(SUP);
                System.out.println(VEG);
                System.out.println(DAL);
                System.out.println(RICE);
                System.out.println(ICE);
                System.out.println(CRD);
                System.out.println(PDS);
                System.out.println("CHINESE ITEM SELECTED IS " + CHNS);

                break;
            } // CASE 1 FOR VEGETARIAN MENU ENDS

            case 2: {// CASE FOR BRAKRFAST

                System.out.println("SELECTION FOR BRAKEFAST");
                System.out.println("ENTER 1 FOR Rs.200 PLATE\nENTER 2 FOR Rs.250 PLATE \nENTER 3 FOR Rs.250 PLATE");
                bfst = sc.nextInt();
                switch (bfst) {
                    case 1: {// CASE FOR Rs.200 PLATE
                        System.out.println("YOU SELECTED FOR Rs.230 PLATE");
                        System.out.println(
                                "ENTER 1 FOR PHOA\nENTER 2 FOR JALEBI\nENTER 3 FOR BREAD ITEM\nENTER 4 FOR TEA OR COFFEE");
                        bft = sc.nextInt();
                        switch (bft) {// SWITCH FOR BRAKEFAST TYPE
                            case 1: {// case for phoa
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET POHA";
                                break;
                            } // case for phoa ends

                            case 3: {// case for BREAD ITEM
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET BREAD ITEM";
                                break;
                            } // case for BREAD ITEM ends

                            case 2: {// case for JALEBI
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET JALEBI";
                                break;
                            } // case for JALEBI ends

                            case 4: {// case for TEA OR COFFEE
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET TEA OR COFFEE";
                                break;
                            } // case for TEA OR COFFEE ends

                            default: {// DEFAULT FOR INVALID ITEM NUMBER
                                System.out.println("INVALID ITEM NUMBER");
                                System.exit(bft);
                                break;
                            } // DEFAULT FOR INVALID ITEM NUMBER ENDS
                        }
                        break;
                    } // CASE FOR Rs.200 PLATE ENDS

                    case 2: {// CASE FOR Rs.230 PLATE
                        System.out.println("YOU SELECTED FOR Rs.230 PLATE");
                        System.out.println(
                                "ENTER 1 FOR PHOA\nENTER 2 FOR JALEBI\nENTER 3 FOR BREAD ITEM\nENTER 4 FOR TEA OR COFFEE\nENTER 5 FOR Heavy Snaks");
                        bft = sc.nextInt();
                        switch (bft) {// SWITCH FOR BRAKEFAST TYPE
                            case 1: {// case for phoa
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET POHA";
                                break;
                            } // case for phoa ends

                            case 3: {// case for BREAD ITEM
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET BREAD ITEM";
                                break;
                            } // case for BREAD ITEM ends

                            case 2: {// case for JALEBI
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET JALEBI";
                                break;
                            } // case for JALEBI ends

                            case 4: {// case for TEA OR COFFEE
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET TEA OR COFFEE";
                                break;
                            } // case for TEA OR COFFEE ends

                            case 5: {// case for Heavy Snaks
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET Heavy Snaks";
                                break;
                            } // case for Heavy Snaks ends

                            default: {// DEFAULT FOR INVALID ITEM NUMBER
                                System.out.println("INVALID ITEM NUMBER");
                                System.exit(bft);
                                break;
                            } // DEFAULT FOR INVALID ITEM NUMBER ENDS
                        }
                        break;
                    } // CASE FOR Rs.230 PLATE ENDS

                    case 3: {// CASE FOR Rs.250 PLATE
                        System.out.println("YOU SELECTED FOR Rs.250 PLATE");
                        System.out.println(
                                "ENTER 1 FOR PHOA\nENTER 2 FOR JALEBI\nENTER 3 FOR BREAD ITEM\nENTER 4 FOR TEA OR COFFEE\nENTER 5 FOR Heavy Snaks");
                        bft = sc.nextInt();
                        switch (bft) {// SWITCH FOR BRAKEFAST TYPE
                            case 1: {// case for phoa
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET POHA";
                                break;
                            } // case for phoa ends

                            case 3: {// case for BREAD ITEM
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET BREAD ITEM";
                                break;
                            } // case for BREAD ITEM ends

                            case 2: {// case for JALEBI
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET JALEBI";
                                break;
                            } // case for JALEBI ends

                            case 4: {// case for TEA OR COFFEE
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET TEA OR COFFEE";
                                break;
                            } // case for TEA OR COFFEE ends

                            case 5: {// case for Heavy Snaks
                                BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET Heavy Snaks";
                                break;
                            } // case for Heavy Snaks ends

                            default: {// DEFAULT FOR INVALID ITEM NUMBER
                                System.out.println("INVALID ITEM NUMBER");
                                System.exit(bft);
                                break;
                            } // DEFAULT FOR INVALID ITEM NUMBER ENDS
                        }
                        break;
                    } // CASE FOR Rs.250 PLATE ENDS

                    default: {/// DEFAULT FOR INVALID PLAT NUMBER
                        System.out.println("INVALID PLAT NUMBER");
                        break;
                    } /// DEFAULT FOR INVALID PLAT NUMBER ENDS
                }// CASE FOR Rs.200 PLATE ENDS

                break;

            } // CASE FOR BRAKRFAST ENDS

            default: {// DEFAUL FOR INVALID MENU SELECTION
                System.out.println("INVALID MENU SELECTED");
                System.exit(2);
                break;
            } // DEFAUL FOR INVALID MENU SELECTION ENDS
        }

        // String SUP, VEG;
        /*
         * System.out.println("EXTRA PRICE IS " + tm);
         * System.out.println(PDS);
         * System.out.println(SUP);
         * System.out.println(VEG);
         * System.out.println(DAL);
         * System.out.println(RICE);
         * System.out.println(ICE);
         * System.out.println(CRD);
         * System.out.println(PDS);
         * System.out.println("CHINESE ITEM SELECTED IS " + CHNS);
         */

    }
}
