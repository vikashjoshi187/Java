import java.util.Scanner;
public class JMB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t\t\t\t\t\t\tWELCOME TO JMB");
        int menu1, thli, thanu, sup, tm = 0, veg, sutr = 0, dal = 0, rice, roti, ice, pds, pnd, crd, pns, chns, bfst,
                bft, ppl, snks, snk, ktp, kti, amt = 0, gamt = 0, eppl=0,eptm=0,tc=0;
    String SUP = " ", VEG = " ", DAL = " ", RICE = " ", ROTI = " ", ICE = " ", PDS = " ", PND = " ",
                SNK = " ", BFT = " ", KTI = " ", CRD = " ", PNS = " ", CHNS = " ", TCI = " ", SNKS = " ",TC=" ";
        System.out.println("\u001B[32m"+ "\t\t\t\t\t\t\tENTER 1 FOR VEGETARIAN MENU\n\t\t\t\t\t\t\tENTER 2 FOR BRAKFAST\n\t\t\t\t\t\t\tENTER 3 FOR Only For Ladies"+ "\u001B[0m");
        menu1 = sc.nextInt();
        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINTER NUMBERS OF PEOPLE COMING" + "\u001B[0m");
        ppl = sc.nextInt();
        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
        if (ppl <= 0 || ppl<50) {
            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VLID NUMBER OF PEOPLE" + "\u001B[0m");
            System.exit(4);
        }
        System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tENTER HOW MUCH TIME DO YOU WANT FOR THE FUNCTION IN HOURS" + "\u001B[0m");
        tm = sc.nextInt();
        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
        if (tm <= 0) {
            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VLID TIME" + "\u001B[0m");
            System.exit(4);
        }

        if (menu1==1 || menu1==2) {
    if (tm > 3) {// IF CONDITION FOR EXTRA TIME
        eptm = (tm - 3) * 1500;
    }
    
    }
    if (menu1==3) {
        System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tENTER NUMBER OF PEOPLE CAME"+ "\u001B[0m");
        eppl = sc.nextInt();
        if (eppl <= 0) {
            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VLID NUMBER OF PEOPLE" + "\u001B[0m");
            System.exit(4);
        }

        if (tm > 3) {// IF CONDITION FOR EXTRA TIME
            eptm = (tm - 3) * 20;
        }
        if(eppl>ppl){//condition extra  people arried 
            eppl=eppl-ppl;
        ppl=eppl+ppl;
        }
        else if (eppl==ppl){//condition equal people arried  

        eppl=eppl-ppl;
        }
        else{//condition for less people arrived people 
            ppl=ppl-(ppl-eppl);
            eppl=0;
        }
    
    }
if (menu1 == 1) {//condition for extra people 
            System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tENTER NUMBER OF PEOPLE CAME"+ "\u001B[0m");
            eppl = sc.nextInt();
            if (eppl <= 0) {
                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VLID NUMBER OF PEOPLE" + "\u001B[0m");
                System.exit(4);
            }
            if (eppl > ppl + 10) {
                eppl = ppl+(eppl - (ppl + 10));
                ppl=eppl;
                System.out.println(ppl);////////////////////////
            }
        }
        // IF CONDITION FOR EXTRA TIME ENDS
        switch (menu1) {// SWITCH FOR MENU FOR MAIN MENU
            case 1: {// CASE 1 FOR VEGETARIAN MENU
                System.out.println("\u001B[31m"+"\t\t\t\t\t\t\tYOU HAVE SELECTED VEGETARIAN MENU"+ "\u001B[0m");
                System.out.println("\u001B[32m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR THALI 310\n\t\t\t\t\t\t\tENTER 2 FOR THALI 360\n\t\t\t\t\t\t\tENTER 3 FOR THALI 410 \n\t\t\t\t\t\t\tENTER 4 FOR THALI 470\n\t\t\t\t\t\t\tENTER 5 FOR THALI 600\n\t\t\t\t\t\t\tENTER 6 FOR THALI 700"
                        + "\u001B[0m");
                thli = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                if (thli > 6) {
                    System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tNO SUCH TYPE OF THALI EXIST" + "\u001B[0m");
                    System.exit(0);
                }
                if (thli == 1) {
                    amt = ppl * 310 + eptm;
                    gamt = ((amt / 100) * 9) + amt;
                } 
                else if (thli == 2) {
                    amt = ppl * 360+ eptm;
                    gamt = ((amt / 100) * 9) + amt;
                } 
                else if (thli == 3) {
                    amt = ppl * 410+ eptm;
                    gamt = ((amt / 100) * 9) + amt;
                } 
                else if (thli == 4) {
                    amt = ppl * 470+ eptm;
                    gamt = ((amt / 100) * 9) + amt;
                } 
                else if (thli == 5) {
                    amt = ppl * 600+ eptm;
                    gamt = ((amt / 100) * 9) + amt;
                }
                else if (thli == 6) {
                    amt = ppl * 700+ eptm;
                    gamt = ((amt / 100) * 9) + amt;
                }
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tPLEASE SELECT ANY VEGITABLES FORM THIS BELOW LIST\n"+ "\u001B[0m");
                System.out.println("\u001B[32m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR Nav Ratan Korma \n\t\t\t\t\t\t\tEnter 2 for Lahori Aloo with Mutter\n\t\t\t\t\t\t\tEnter 3 for Mix Veg\n\t\t\t\t\t\t\tEnter 4 for Green Chana (Seasonal)\n\t\t\t\t\t\t\tEnter 5 for Corn Palak\n\t\t\t\t\t\t\tEnter 6 for Aloo 65\n\t\t\t\t\t\t\tEnter 7 for Aloo Mutter\n\t\t\t\t\t\t\tEnter 8 for Aloo Capsicum\n\t\t\t\t\t\t\tEnter 9 for Aloo Do Pyaza\n\t\t\t\t\t\t\tEnter 10 for Aloo Gobhi/Tomato\n\t\t\t\t\t\t\tEnter 11 for Gobhi Mutter\n\t\t\t\t\t\t\tEnter 12 for Kadi Puniabi\n\t\t\t\t\t\t\tEnter 13 for Veg. Kofta (Gol)\n\t\t\t\t\t\t\tEnter 14 for Methi Mutter Malai\n\t\t\t\t\t\t\tEnter 15 for Harvali Kofta\n\t\t\t\t\t\t\tEnter 16 for Chana Masala\n\t\t\t\t\t\t\tEnter 17 for Bhindi Masala\n\t\t\t\t\t\t\tEnter 18 for Jeera Aloo\n\t\t\t\t\t\t\tEnter 19 for Dum Aloo\n\t\t\t\t\t\t\tEnter 20 for Guirati Aloo\n\t\t\t\t\t\t\tEnter 21 for Tinda Masala\n\t\t\t\t\t\t\tEnter 22 for Aloo Palak\n\t\t\t\t\t\t\tEnter 23 for Seasonal Veg\n\t\t\t\t\t\t\tEnter 24 for Bhindi Do Pyaza\n\t\t\t\t\t\t\tEnter 25 for Veg. Kolhapuri\n\t\t\t\t\t\t\tEnter 26 for Corn Capsicum"
                        + "\u001B[0m");
                veg = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (veg) {// SWITCH FOR VEFITABLES
                    case 1: {
                        VEG = "YOU ORDED VEGITABLE OF Nav Ratan Korma" + "\u001B[0m";
                        break;
                    }
                    case 2: {
                        VEG = "YOU ORDED VEGITABLE OF Lahori Aloo with Mutter" + "\u001B[0m";
                        break;
                    }
                    case 3: {
                        VEG = "YOU ORDED VEGITABLE OF for Mix Veg" + "\u001B[0m";
                        break;
                    }
                    case 4: {
                        VEG = "YOU ORDED VEGITABLE OF Green Chana (Seasonal)" + "\u001B[0m";
                        break;
                    }
                    case 5: {
                        VEG = "YOU ORDED VEGITABLE OF Corn Palak" + "\u001B[0m";
                        break;
                    }
                    case 6: {
                        VEG = "YOU ORDED VEGITABLE OF Aloo 65" + "\u001B[0m";
                        break;
                    }
                    case 7: {
                        VEG = "YOU ORDED VEGITABLE OF Aloo Mutter" + "\u001B[0m";
                        break;
                    }
                    case 8: {
                        VEG = "YOU ORDED VEGITABLE OF Aloo Capsicum" + "\u001B[0m";
                        break;
                    }
                    case 9: {
                        VEG = "YOU ORDED VEGITABLE OF Aloo Do Pyaza" + "\u001B[0m";
                        break;
                    }
                    case 10: {
                        VEG = "YOU ORDED VEGITABLE OF Aloo Gobhi" + "\u001B[0m";
                        break;
                    }
                    case 11: {
                        VEG = "YOU ORDED VEGITABLE OF Gobhi Mutter" + "\u001B[0m";
                        break;
                    }
                    case 12: {
                        VEG = "YOU ORDED VEGITABLE OF Kadi Puniabi" + "\u001B[0m";
                        break;
                    }
                    case 13: {
                        VEG = "YOU ORDED VEGITABLE OF Veg. Kofta (Gol)" + "\u001B[0m";
                        break;
                    }
                    case 14: {
                        VEG = "YOU ORDED VEGITABLE OF Methi Mutter Malai" + "\u001B[0m";
                        break;
                    }
                    case 15: {
                        VEG = "YOU ORDED VEGITABLE OF Harvali Kofta" + "\u001B[0m";
                        break;
                    }
                    case 16: {
                        VEG = "YOU ORDED VEGITABLE OF Chana Masala" + "\u001B[0m";
                        break;
                    }
                    case 17: {
                        VEG = "YOU ORDED VEGITABLE OF Bhindi Masala" + "\u001B[0m";
                        break;
                    }
                    case 18: {
                        VEG = "YOU ORDED VEGITABLE OF Jeera Aloo" + "\u001B[0m";

                        break;
                    }
                    case 19: {
                        VEG = "YOU ORDED VEGITABLE OF Dum Aloo" + "\u001B[0m";
                        break;
                    }
                    case 20: {
                        VEG = "YOU ORDED VEGITABLE OF Guirati Aloo" + "\u001B[0m";
                        break;
                    }
                    case 21: {
                        VEG = "YOU ORDED VEGITABLE OF Tinda Masala" + "\u001B[0m";
                        break;
                    }
                    case 22: {
                        VEG = "YOU ORDED VEGITABLE OF Aloo Palak" + "\u001B[0m";
                        break;
                    }
                    case 23: {
                        VEG = "YOU ORDED VEGITABLE OF Seasonal Veg" + "\u001B[0m";
                        break;
                    }
                    case 24: {
                        VEG = "YOU ORDED VEGITABLE OF Bhindi Do Pyaza" + "\u001B[0m";
                        break;
                    }
                    case 25: {
                        VEG = "YOU ORDED VEGITABLE OF Veg. Kolhapuri" + "\u001B[0m";
                        break;
                    }
                    case 26: {
                        VEG = "YOU ORDED VEGITABLE OF for Corn Capsicum" + "\u001B[0m";
                        break;
                    }
                    default: {// DEFAULT FOR INVALID
                        System.out.println("ENTER A VALID VEGITABLE NUMBER" + "\u001B[0m");
                        System.exit(veg);
                        break;
                    } // DEFAULT FOR INVALID ENDS
                }// SWITCH FOR VEFITABLES ENDS
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT VEGITABLE\n"+ "\u001B[0m");
                System.out.println("\u001B[32m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR Nav Ratan Korma \n\t\t\t\t\t\t\tEnter 2 for Lahori Aloo with Mutter\n\t\t\t\t\t\t\tEnter 3 for Mix Veg\n\t\t\t\t\t\t\tEnter 4 for Green Chana (Seasonal)\n\t\t\t\t\t\t\tEnter 5 for Corn Palak\n\t\t\t\t\t\t\tEnter 6 for Aloo 65\n\t\t\t\t\t\t\tEnter 7 for Aloo Mutter\n\t\t\t\t\t\t\tEnter 8 for Aloo Capsicum\n\t\t\t\t\t\t\tEnter 9 for Aloo Do Pyaza\n\t\t\t\t\t\t\tEnter 10 for Aloo Gobhi/Tomato\n\t\t\t\t\t\t\tEnter 11 for Gobhi Mutter\n\t\t\t\t\t\t\tEnter 12 for Kadi Puniabi\n\t\t\t\t\t\t\tEnter 13 for Veg. Kofta (Gol)\n\t\t\t\t\t\t\tEnter 14 for Methi Mutter Malai\n\t\t\t\t\t\t\tEnter 15 for Harvali Kofta\n\t\t\t\t\t\t\tEnter 16 for Chana Masala\n\t\t\t\t\t\t\tEnter 17 for Bhindi Masala\n\t\t\t\t\t\t\tEnter 18 for Jeera Aloo\n\t\t\t\t\t\t\tEnter 19 for Dum Aloo\n\t\t\t\t\t\t\tEnter 20 for Guirati Aloo\n\t\t\t\t\t\t\tEnter 21 for Tinda Masala\n\t\t\t\t\t\t\tEnter 22 for Aloo Palak\n\t\t\t\t\t\t\tEnter 23 for Seasonal Veg\n\t\t\t\t\t\t\tEnter 24 for Bhindi Do Pyaza\n\t\t\t\t\t\t\tEnter 25 for Veg. Kolhapuri\n\t\t\t\t\t\t\tEnter 26 for Corn Capsicum"
                        + "\u001B[0m");
                veg = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (veg) {// SWITCH FOR VEFITABLES
                    case 1: {
                        VEG = VEG+ "\u001B[32m" + " AND VEGITABLE OF Nav Ratan Korma" + "\u001B[0m";
                        break;
                    }
                    case 2: {
                        VEG = VEG +"\u001B[32m" +" AND VEGITABLE OF Lahori Aloo with Mutter" + "\u001B[0m";
                        break;
                    }
                    case 3: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF for Mix Veg" + "\u001B[0m";
                        break;
                    }
                    case 4: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Green Chana (Seasonal)" + "\u001B[0m";
                        break;
                    }
                    case 5: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Corn Palak" + "\u001B[0m";
                        break;
                    }
                    case 6: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Aloo 65" + "\u001B[0m";
                        break;
                    }
                    case 7: {
                        VEG = VEG+ "\u001B[32m" + " AND VEGITABLE OF Aloo Mutter" + "\u001B[0m";
                        break;
                    }
                    case 8: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Aloo Capsicum" + "\u001B[0m";
                        break;
                    }
                    case 9: {
                        VEG = VEG+"\u001B[32m"+"AND VEGITABLE OF Aloo Do Pyaza" + "\u001B[0m";
                        break;
                    }
                    case 10: {
                        VEG = "\u001B[32m" +"AND VEGITABLE OF Aloo Gobhi" + "\u001B[0m";
                        break;
                    }
                    case 11: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Gobhi Mutter" + "\u001B[0m";
                        break;
                    }
                    case 12: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Kadi Puniabi" + "\u001B[0m";
                        break;
                    }
                    case 13: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Veg. Kofta (Gol)" + "\u001B[0m";
                        break;
                    }
                    case 14: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Methi Mutter Malai" + "\u001B[0m";
                        break;
                    }
                    case 15: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Harvali Kofta" + "\u001B[0m";
                        break;
                    }
                    case 16: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Chana Masala" + "\u001B[0m";
                        break;
                    }
                    case 17: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Bhindi Masala" + "\u001B[0m";
                        break;
                    }
                    case 18: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Jeera Aloo" + "\u001B[0m";
                        break;
                    }
                    case 19: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Dum Aloo" + "\u001B[0m";
                        break;
                    }
                    case 20: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Guirati Aloo" + "\u001B[0m";
                        break;
                    }
                    case 21: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Tinda Masala" + "\u001B[0m";
                        break;
                    }
                    case 22: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF Aloo Palak" + "\u001B[0m";
                        break;
                    }
                    case 23: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Seasonal Veg" + "\u001B[0m";
                        break;
                    }
                    case 24: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Bhindi Do Pyaza" + "\u001B[0m";
                        break;
                    }
                    case 25: {
                        VEG = VEG + "\u001B[32m" +" AND VEGITABLE OF Veg. Kolhapuri" + "\u001B[0m";
                        break;
                    }
                    case 26: {
                        VEG = VEG +"\u001B[32m" + " AND VEGITABLE OF for Corn Capsicum" + "\u001B[0m";
                        break;
                    }
                    default: {// DEFAULT FOR INVALID
                        System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tENTER A VALID VEGITABLE NUMBER" + "\u001B[0m");
                        System.exit(veg);
                        break;
                    } // DEFAULT FOR INVALID ENDS
                }// SWITCH FOR VEFITABLES ENDS
                
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT DAAL TYPE\n"+ "\u001B[0m");
                System.out.println("\u001B[32m"+ "\t\t\t\t\t\t\tENTER 1 FOR Dal Fry\n\t\t\t\t\t\t\tENTER 2 FOR Dal Tadka\n\t\t\t\t\t\t\tENTER 3 FOR Dal Makhani\n\t\t\t\t\t\t\tENTER 4 FOR Dal Panchrangi"+ "\u001B[0m");
                dal = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (dal) {// SWITHCH FOR DAL
                    case 1: {// CASE 1 FOR FRY DAL
                        DAL = "YOU SELECTED DAL FRY" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR FRY DAL ENDS
                    case 2: {// CASE 1 FOR DAL TADAKA
                        DAL = "YOU SELECTED DAL TADKA " + "\u001B[0m";
                        break;
                    } // CASE 1 FOR DAL TADAKA ENDS
                    case 3: {// CASE 1 FOR DAL MAHKHANI
                        DAL = "YOU SELECTED DAL MAHKHANI" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR DAL MAHKHANI ENDS
                    case 4: {// CASE 1 FOR DAL PANCHRANGI
                        DAL = "YOU SELECTED DAL PANCHRANGI " + "\u001B[0m";
                        break;
                    } // CASE 1 FOR DAL PANCHRANGI ENDS
                    default: {// DEFAULT FOR INVALID DALL TYPE
                        System.out.println("\u001B[31m"+"NO SUCH TYPE OF DAL AVILABLE" + "\u001B[0m");
                        System.exit(dal);
                        break;
                    } // DEFAULT FOR INVALID DALL TYPE
                }// SWITHCH FOR DAL ENDS
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT RICE TYPE\n"+ "\u001B[0m");

                System.out.println("\u001B[32m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR Rice\n\t\t\t\t\t\t\tENTER 2 FOR Jeera Rice\n\t\t\t\t\t\t\tENTER 3 FOR Green Peas Pulao\n\t\t\t\t\t\t\tENTER 4 FOR Veg Pulao\n\t\t\t\t\t\t\tENTER 5 FOR Veg Fried Rice\n\t\t\t\t\t\t\tENTER 6 FOR Veg Biryani"
                        + "\u001B[0m");
                rice = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (rice) {// SWITCH FOR RICE
                    case 1: {// CASE 1 FOR FOR RICE
                        RICE = "YOU SELECTED RICE" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR FOR RICE ENDS
                    case 2: {// CASE 1 FOR FOR JEERA RICE
                        RICE = "YOU SELECTED JEERA RICE" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR FOR JEERA RICE ENDS
                    case 4: {// CASE 1 FOR FOR VEG PULAO
                        RICE = "YOU SELECTED VEG PULAO" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR FOR VEG PULAO ENDS
                    case 3: {// CASE 1 FOR FOR GREEN PEAS PULAO
                        RICE = "YOU SELECTED GREEN PEAS PULAO" + "\u001B[0m" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR FOR GREEN PEAS PULAO ENDS
                    case 5: {// CASE 1 FOR FOR VEG FRIED RICE
                        RICE = "YOU SELECTED VEG FRIED RICE" + "\u001B[0m" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR FOR VEG FRIED RICE ENDS
                    case 6: {// CASE 1 FOR FOR VEG BIRYANI
                        RICE = "YOU SELECTED VEG BIRYANI" + "\u001B[0m" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR FOR VEG BIRYANI ENDS
                    default: {// DEFAULT FOR INVALID RICE TYPE
                        System.out.println("\u001B[31m" +"\t\t\t\t\t\t\t\t\t\t\t\t\t\tENTER A VAILD RICE TYPE" + "\u001B[0m" + "\u001B[0m");
                        System.exit(rice);
                        break;
                    } // DEFAULT FOR INVALID RICE TYPE ENDS
                }// SWITCH FOR RICE END
                System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tWHAT DO YOU WANT ENTER 1 FOR SOUPS\n\t\t\t\t\t\t\tENTER 2 FOR WELCOME DRINKS"+ "\u001B[0m" + "\u001B[0m");
                sutr = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (sutr) {
                    case 1: {// CASE 1 FOR SOUPS
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tYOU HAVE CHOOSEN TO TAKE SOUPS" + "\u001B[0m" + "\u001B[0m");
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE SELECT WHICH TYPE OF SOUP YOU WANT" + "\u001B[0m" + "\u001B[0m");
                        System.out.println("\u001B[32m"+ "\t\t\t\t\t\t\tENTER 1 FOR TOMATO SOUP\n\t\t\t\t\t\t\tENTER 2 FOR VEG MANCHO\n\t\t\t\t\t\t\tENTER 3 FOR HOT AND SOUR VEG\n\t\t\t\t\t\t\tENTER 4 FOR LEMON CORIENDER"+ "\u001B[0m" + "\u001B[0m");
                        sup = sc.nextInt();
                        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                        switch (sup) {// SWITCH FOR TYPES SOUP
                            case 1: {// CASE FOR TOMATO SOUP
                                SUP = "YOU HAVE SELECTED FOR TOMATO SOUP" + "\u001B[0m" + "\u001B[0m";
                                break;
                            } // CASE FOR TOMATO SOUP ENDS
                            case 2: {// CASE FOR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR VEG SOUP" + "\u001B[0m" + "\u001B[0m";
                                break;
                            } // CASE FOR VEG SOUP ENDS
                            case 3: {// CASE FOR HOT AND SOUR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR HOT AND SOUR VEG SOUP" + "\u001B[0m" + "\u001B[0m";
                                break;
                            } // CASE FOR HOT AND SOUR VEG SOUP ENDS
                            case 4: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR LEMON CORIENDER SOUP" + "\u001B[0m" + "\u001B[0m";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS
                            default: {// DEFAULT FOR INVALID SOUP TYPE ENDS
                                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tPLEASE ENTER A VALID SOUP TYPE" + "\u001B[0m" + "\u001B[0m");
                                System.exit(0);
                                break;
                            } // DEFAULT FOR INVALID SOUP TYPE ENDS
                        }// SWITCH FOR SOUP TYPES ENDS
                        break;
                    } // CASE 1 FOR SOUPS ENDS
                    case 2: {// CASE 2 FOR WELCOME DRINKS
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tYOU HAVE CHOOSE TO TAKE WELCOME DRINKS" + "\u001B[0m");
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE SELEcT WHICH TYPE OF SOUP YOU WANT" + "\u001B[0m");
                        System.out.println("\u001B[32m"+ "\t\t\t\t\t\t\tENTER 1 FOR Blue Lagoon\n\t\t\t\t\t\t\tENTER 2 FOR Blowgun Kesher Pista\n\t\t\t\t\t\t\tENTER 3 FOR Fresh Lime Water\n\t\t\t\t\t\t\tENTER 4 FOR Butter Milk\n\t\t\t\t\t\t\tENTER 5 FOR Orange Pink City\n\t\t\t\t\t\t\tENTER 6 FOR Strawberry Delight\n\t\t\t\t\t\t\tENTER 7 FOR Jal Jeera\n\t\t\t\t\t\t\tENTER 8 FOR Rasna Water"+ "\u001B[0m");
                        sup = sc.nextInt();
                        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                        switch (sup) {// SWITCH FOR TYPES SOUP
                            case 1: {// CASE FOR TOMATO SOUP
                                SUP = "YOU HAVE SELECTED FOR Blue Lagoon" + "\u001B[0m";
                                break;
                            } // CASE FOR TOMATO SOUP ENDS
                            case 2: {// CASE FOR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR Blowgun Kesher Pista" + "\u001B[0m";
                                break;
                            } // CASE FOR VEG SOUP ENDS
                            case 3: {// CASE FOR HOT AND SOUR VEG SOUP
                                SUP = "YOU HAVE SELECTED FOR Fresh Lime Water" + "\u001B[0m";
                                break;
                            } // CASE FOR HOT AND SOUR VEG SOUP ENDS
                            case 4: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Butter Milk" + "\u001B[0m";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS
                            case 5: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Orange Pink City" + "\u001B[0m";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS
                            case 6: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Strawberry Delight" + "\u001B[0m";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS
                            case 7: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR Jal Jeera" + "\u001B[0m";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS
                            case 8: {// CASE FOR LEMON CORIENDER SOUP
                                SUP = "YOU HAVE SELECTED FOR FOR Rasna Water" + "\u001B[0m";
                                break;
                            } // CASE FOR LEMON CORIENDER SOUP ENDS
                            default: {// DEFAULT FOR INVALID WELCOME DRINK TYPE ENDS
                                System.out.println(
                                        "\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID WELCOME DRINK TYPE" + "\u001B[0m");
                                System.exit(0);
                                break;
                            } // DEFAULT FOR INVALID WELCOME DRINK TYPE ENDS
                        }// SWITCH FOR SOUP TYPES ENDS
                        break;
                    } // CASE 2 FOR WELCOME DRINKS ENDS
                    default: {// DEFAULT FOR INVALID DRINK TYPE
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tNO SUCH TYPE OF DRINKS AVILABLE" + "\u001B[0m");
                        System.exit(sutr);
                        break;
                    } // DEFAULT FOR INVALID DRINK TYPE
                }// SWITCH ENDS FOR SECLECTING FOR SOUPS AND WELCOME DRINKS
                 /////////////////////////////////////////////
                 System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT ROTI TYPE\n"+ "\u001B[0m");

                System.out.println("\u001B[32m"+ "\t\t\t\t\t\t\tENTER 1 FOR ROTI\n\t\t\t\t\t\t\tENTER 2 FOR PARTHA\n\t\t\t\t\t\t\tENTER 3 FOR FOR KULCHA\n\t\t\t\t\t\t\tENTER 4 FOR NAAN\n\t\t\t\t\t\t\tENTER 5 FOR MESSI ROTI\n\t\t\t\t\t\t\tENTER 6 FOR MEETHI POORI"+ "\u001B[0m");
                roti = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (roti) {// SWITCH FOR ROTI
                    case 1: {// CASE 1 FOR ROTI ENDS
                        ROTI = "YOU SELECTED ROTI" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR ROTI ENDS
                    case 2: {// CASE 1 FOR PARATHA ENDS
                        ROTI = "YOU SELECTED PARATHA" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR PARATHA ENDS
                    case 3: {// CASE 1 FOR KULCHA ENDS
                        ROTI = "YOU SELECTED KULCHA" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR KULCHA ENDS
                    case 4: {// CASE 1 FOR NAAN ENDS
                        ROTI = "YOU SELECTED NAAN" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR NAAN ENDS
                    case 5: {// CASE 1 FOR MESSI ROTI ENDS
                        ROTI = "YOU SELECTED MESSI ROTI" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR MESSI ROTI ENDS
                    case 6: {// CASE 1 FOR MEETHI POORI ENDS
                        ROTI = "YOU SELECTED MEETHI POORI" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR MEETHI POORI ENDS
                    default: {
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID ITEM NUMBER FOR ROTI" + "\u001B[0m");
                        System.exit(roti);
                        break;
                    }
                }// SWITCH FOR ROTI END
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT SWEET DISH\n"+ "\u001B[0m");

                System.out.println("\u001B[35m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR •Gulab Jamun \n\t\t\t\t\t\t\tENTER 2 FOR Gajar Ka Halwa\n\t\t\t\t\t\t\tENTER 3 FOR Moong Ka Halwa\n\t\t\t\t\t\t\tENTER 4 FOR Shree Khand\n\t\t\t\t\t\t\tENTER 5 FOR Aam Khand\n\t\t\t\t\t\t\tENTER 6 FOR Vanilla\n\t\t\t\t\t\t\tENTER 7 FOR Butter Scotch\n\t\t\t\t\t\t\tENTER 8 FOR Sitaphal Basundi"
                        + "\u001B[0m");
                ice = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (ice) {// SWITCH FOR ICE CREAM AND SWEET DISH
                    case 1: {// CASE 1 FOR GULAB JAMUN
                        ICE = "YOU SELECTED Gulab Jamun" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Gulab Jamun ENDS
                    case 2: {// CASE 1 FOR Gajar Ka Halwa
                        ICE = "YOU SELECTED Gajar Ka Halwa" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Gajar Ka Halwa ENDS
                    case 3: {// CASE 1 FOR Moong Ka Halwa
                        ICE = "YOU SELECTED Moong Ka Halwa" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Moong Ka Halwa ENDS
                    case 4: {// CASE 1 FOR Shree Khand
                        ICE = "YOU SELECTED Shree Khand" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Shree Khand ENDS
                    case 5: {// CASE 1 FOR Aam Khand
                        ICE = "YOU SELECTED Aam Khand" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Aam Khand ENDS
                    case 6: {// CASE 1 FOR Vanilla
                        ICE = "YOU SELECTED Vanilla" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Vanilla ENDS
                    case 7: {// CASE 1 FOR Butter Scotch
                        ICE = "YOU SELECTED Butter Scotch" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Butter Scotch ENDS
                    case 8: {// CASE 1 FOR Sitaphal Basundi
                        ICE = "YOU SELECTED Sitaphal Basundi" + "\u001B[0m";
                        break;
                    } // CASE 1 FOR Sitaphal Basundi ENDS
                    default: {
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID SWEET DISH NUMBER" + "\u001B[0m");
                        System.exit(ice);
                        break;
                    }
                }// SWITCH FOR ICE CREAM AND SWEET DISH ENDS
                 /////////////////////////
                if (thli == 3) {// IF CONDITION FOR ONLY ONE TYPE OF STARTER
                    ///////////////////////////////////////////////////////////////////////////
                    System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT STARTER \n"+ "\u001B[0m");

                    System.out.println("\u001B[35m"+ "\t\t\t\t\t\t\tENTER 1 FOR Mix Veg Pakoda\n\t\t\t\t\t\t\tENTER 2 FOR Veg Finger\n\t\t\t\t\t\t\tENTER 3 FOR Bread Pakoda\n\t\t\t\t\t\t\tENTER 4 FOR Methi Kabab\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Dragon Aloo\n\t\t\t\t\t\t\tENTER 7 FOR Saboo Dana\n\t\t\t\t\t\t\tENTER 8 FOR Finger Chips\n\t\t\t\t\t\t\tENTER 9 FOR Aloo Corn Kabab\n\t\t\t\t\t\t\tENTER 10 FOR Veg Cutlet\n\t\t\t\t\t\t\tENTER 11 FOR Veg Kothey\n\t\t\t\t\t\t\tENTER 12 FOR Hara Bhara Kabab \n\t\t\t\t\t\t\tENTER 13 FOR Corn Chat \n\t\t\t\t\t\t\tENTER 14 FOR Aloo Chat\n\t\t\t\t\t\t\tENTER 15 FOR Saboo Dana vada \n\t\t\t\t\t\t\tENTER 16 FOR Veg Manchurian Dry \n\t\t\t\t\t\t\tENTER 17 FOR Tandoori Manchurian \n\t\t\t\t\t\t\tENTER 18 FOR Chinese Corn Kebab"+ "\u001B[0m");
                    pds = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda
                            PDS = "YOU SELECTED Mix Veg Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS
                        case 2: {// CASE 1 FOR Veg Finger
                            PDS = "YOU SELECTED Veg Finger" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Finger ENDS
                        case 3: {// CASE 1 FOR Bread Pakoda
                            PDS = "YOU SELECTED Bread Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS
                        case 4: {// CASE 1 FOR Methi Kabab
                            PDS = "YOU SELECTED Methi Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Methi Kabab ENDS

                        case 5: {// CASE 1 FOR Moong Pakoda
                            PDS = "YOU SELECTED Moong Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS
                        case 6: {// CASE 1 FOR Dragon Aloo
                            PDS = "YOU SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 7: {// CASE 1 FOR Saboo Dana
                            PDS = "YOU SELECTED Saboo Dana" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana ENDS
                        case 8: {// CASE 1 FOR Finger Chips
                            PDS = "YOU SELECTED Finger Chips" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Finger Chips ENDS
                        case 9: {// CASE 1 FOR Aloo Corn Kabab
                            PDS = "YOU SELECTED  Aloo Corn Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS
                        case 10: {// CASE 1 FOR Dragon Aloo
                            PDS = "YOU SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 11: {// CASE 1 FOR Veg Kothey
                            PDS = "YOU SELECTED Veg Kothey" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Kothey ENDS

                        case 12: {// CASE 1 FOR Hara Bhara Kabab
                            PDS = "YOU SELECTED Hara Bhara Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS
                        case 13: {// CASE 1 FOR Corn Chat
                            PDS = "YOU SELECTED Corn Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Corn Chat ENDS
                        case 14: {// CASE 1 FOR Aloo Chat
                            PDS = "YOU SELECTED Aloo Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Chat ENDS
                        case 15: {// CASE 1 FOR Saboo Dana vada
                            PDS = "YOU SELECTED Saboo Dana vada" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS
                        case 16: {// CASE 1 FOR Veg Manchurian Dry
                            PDS = "YOU SELECTED Veg Manchurian Dry" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS
                        case 17: {// CASE 1 FOR Tandoori Manchurian
                            PDS = "YOU SELECTED Tandoori Manchurian" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS
                        case 18: {// CASE 1 FOR Chinese Corn Kebab
                            PDS = "YOU SELECTED Chinese Corn Kebab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID STARTER TYPE" + "\u001B[0m");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }
                } // IF CONDITION FOR ONLY ONE TYPE OF STARTER ENDS
                if (thli == 4 || thli == 5) {// IF CONDITION FOR ONLY TWO TYPE OF STARTER
                    System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT STARTER 1\n"+ "\u001B[0m");

                    System.out.println("\u001B[35m"
                            + "\t\t\t\t\t\t\tENTER 1 FOR Mix Veg Pakoda\n\t\t\t\t\t\t\tENTER 2 FOR Veg Finger\n\t\t\t\t\t\t\tENTER 3 FOR Bread Pakoda\n\t\t\t\t\t\t\tENTER 4 FOR Methi Kabab\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Dragon Aloo\n\t\t\t\t\t\t\tENTER 7 FOR Saboo Dana\n\t\t\t\t\t\t\tENTER 8 FOR Finger Chips\n\t\t\t\t\t\t\tENTER 9 FOR Aloo Corn Kabab\n\t\t\t\t\t\t\tENTER 10 FOR Veg Cutlet\n\t\t\t\t\t\t\tENTER 11 FOR Veg Kothey\n\t\t\t\t\t\t\tENTER 12 FOR Hara Bhara Kabab \n\t\t\t\t\t\t\tENTER 13 FOR Corn Chat \n\t\t\t\t\t\t\tENTER 14 FOR Aloo Chat\n\t\t\t\t\t\t\tENTER 15 FOR Saboo Dana vada \n\t\t\t\t\t\t\tENTER 16 FOR Veg Manchurian Dry \n\t\t\t\t\t\t\tENTER 17 FOR Tandoori Manchurian \n\t\t\t\t\t\t\tENTER 18 FOR Chinese Corn Kebab"
                            + "\u001B[0m");
                    pds = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR

                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda
                            PDS = "YOU SELECTED Mix Veg Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS
                        case 2: {// CASE 1 FOR Veg Finger
                            PDS = "YOU SELECTED Veg Finger" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Finger ENDS
                        case 3: {// CASE 1 FOR Bread Pakoda
                            PDS = "YOU SELECTED Bread Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS
                        case 4: {// CASE 1 FOR Methi Kabab
                            PDS = "YOU SELECTED Methi Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Methi Kabab ENDS
                        case 5: {// CASE 1 FOR Moong Pakoda
                            PDS = "YOU SELECTED Moong Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS
                        case 6: {// CASE 1 FOR Dragon Aloo
                            PDS = "YOU SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 7: {// CASE 1 FOR Saboo Dana
                            PDS = "YOU SELECTED Saboo Dana" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana ENDS
                        case 8: {// CASE 1 FOR Finger Chips
                            PDS = "YOU SELECTED Finger Chips" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Finger Chips ENDS
                        case 9: {// CASE 1 FOR Aloo Corn Kabab
                            PDS = "YOU SELECTED  Aloo Corn Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS
                        case 10: {// CASE 1 FOR Dragon Aloo
                            PDS = "YOU SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 11: {// CASE 1 FOR Veg Kothey
                            PDS = "YOU SELECTED Veg Kothey" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Kothey ENDS
                        case 12: {// CASE 1 FOR Hara Bhara Kabab
                            PDS = "YOU SELECTED Hara Bhara Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS
                        case 13: {// CASE 1 FOR Corn Chat
                            PDS = "YOU SELECTED Corn Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Corn Chat ENDS
                        case 14: {// CASE 1 FOR Aloo Chat
                            PDS = "YOU SELECTED Aloo Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Chat ENDS
                        case 15: {// CASE 1 FOR Saboo Dana vada
                            PDS = "YOU SELECTED Saboo Dana vada" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS
                        case 16: {// CASE 1 FOR Veg Manchurian Dry
                            PDS = "YOU SELECTED Veg Manchurian Dry" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS
                        case 17: {// CASE 1 FOR Tandoori Manchurian
                            PDS = "YOU SELECTED Tandoori Manchurian" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS
                        case 18: {// CASE 1 FOR Chinese Corn Kebab
                            PDS = "YOU SELECTED Chinese Corn Kebab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID STARTER TYPE" + "\u001B[0m");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }
                    System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT STARTER 2\n"+ "\u001B[0m");

                    System.out.println("\u001B[35m"
                            + "\t\t\t\t\t\t\tENTER 1 FOR Mix Veg Pakoda\n\t\t\t\t\t\t\tENTER 2 FOR Veg Finger\n\t\t\t\t\t\t\tENTER 3 FOR Bread Pakoda\n\t\t\t\t\t\t\tENTER 4 FOR Methi Kabab\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Dragon Aloo\n\t\t\t\t\t\t\tENTER 7 FOR Saboo Dana\n\t\t\t\t\t\t\tENTER 8 FOR Finger Chips\n\t\t\t\t\t\t\tENTER 9 FOR Aloo Corn Kabab\n\t\t\t\t\t\t\tENTER 10 FOR Veg Cutlet\n\t\t\t\t\t\t\tENTER 11 FOR Veg Kothey\n\t\t\t\t\t\t\tENTER 12 FOR Hara Bhara Kabab \n\t\t\t\t\t\t\tENTER 13 FOR Corn Chat \n\t\t\t\t\t\t\tENTER 14 FOR Aloo Chat\n\t\t\t\t\t\t\tENTER 15 FOR Saboo Dana vada \n\t\t\t\t\t\t\tENTER 16 FOR Veg Manchurian Dry \n\t\t\t\t\t\t\tENTER 17 FOR Tandoori Manchurian \n\t\t\t\t\t\t\tENTER 18 FOR Chinese Corn Kebab"
                            + "\u001B[0m");
                    pds = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR

                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda
                            PDS = PDS + "AND SELECTED Mix Veg Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS
                        case 2: {// CASE 1 FOR Veg Finger
                            PDS = PDS + "AND SELECTED Veg Finger" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Finger ENDS
                        case 3: {// CASE 1 FOR Bread Pakoda
                            PDS = PDS + "AND SELECTED Bread Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS
                        case 4: {// CASE 1 FOR Methi Kabab
                            PDS = PDS + "AND SELECTED Methi Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Methi Kabab ENDS
                        case 5: {// CASE 1 FOR Moong Pakoda
                            PDS = PDS + "AND SELECTED Moong Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS
                        case 6: {// CASE 1 FOR Dragon Aloo
                            PDS = PDS + "AND SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 7: {// CASE 1 FOR Saboo Dana
                            PDS = PDS + "AND SELECTED Saboo Dana" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana ENDS
                        case 8: {// CASE 1 FOR Finger Chips
                            PDS = PDS + "AND SELECTED Finger Chips" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Finger Chips ENDS
                        case 9: {// CASE 1 FOR Aloo Corn Kabab
                            PDS = PDS + "AND SELECTED  Aloo Corn Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS
                        case 10: {// CASE 1 FOR Dragon Aloo
                            PDS = PDS + "AND SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 11: {// CASE 1 FOR Veg Kothey
                            PDS = PDS + "AND SELECTED Veg Kothey" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Kothey ENDS
                        case 12: {// CASE 1 FOR Hara Bhara Kabab
                            PDS = PDS + "AND SELECTED Hara Bhara Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS
                        case 13: {// CASE 1 FOR Corn Chat
                            PDS = PDS + "AND SELECTED Corn Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Corn Chat ENDS
                        case 14: {// CASE 1 FOR Aloo Chat
                            PDS = PDS + "AND SELECTED Aloo Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Chat ENDS
                        case 15: {// CASE 1 FOR Saboo Dana vada
                            PDS = PDS + "AND SELECTED Saboo Dana vada" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS
                        case 16: {// CASE 1 FOR Veg Manchurian Dry
                            PDS = PDS + "AND SELECTED Veg Manchurian Dry" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS
                        case 17: {// CASE 1 FOR Tandoori Manchurian
                            PDS = PDS + "AND SELECTED Tandoori Manchurian" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS
                        case 18: {// CASE 1 FOR Chinese Corn Kebab
                            PDS = PDS + "AND SELECTED Chinese Corn Kebab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID STARTER TYPE" + "\u001B[0m");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }
                }
                if (thli == 6) {// IF CONDITION FOR THREE TYPE OF STARTER
                    System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT STARTER 1\n"+ "\u001B[0m");

                    System.out.println("\u001B[35m"
                            + "\t\t\t\t\t\t\tENTER 1 FOR Mix Veg Pakoda\n\t\t\t\t\t\t\tENTER 2 FOR Veg Finger\n\t\t\t\t\t\t\tENTER 3 FOR Bread Pakoda\n\t\t\t\t\t\t\tENTER 4 FOR Methi Kabab\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Dragon Aloo\n\t\t\t\t\t\t\tENTER 7 FOR Saboo Dana\n\t\t\t\t\t\t\tENTER 8 FOR Finger Chips\n\t\t\t\t\t\t\tENTER 9 FOR Aloo Corn Kabab\n\t\t\t\t\t\t\tENTER 10 FOR Veg Cutlet\n\t\t\t\t\t\t\tENTER 11 FOR Veg Kothey\n\t\t\t\t\t\t\tENTER 12 FOR Hara Bhara Kabab \n\t\t\t\t\t\t\tENTER 13 FOR Corn Chat \n\t\t\t\t\t\t\tENTER 14 FOR Aloo Chat\n\t\t\t\t\t\t\tENTER 15 FOR Saboo Dana vada \n\t\t\t\t\t\t\tENTER 16 FOR Veg Manchurian Dry \n\t\t\t\t\t\t\tENTER 17 FOR Tandoori Manchurian \n\t\t\t\t\t\t\tENTER 18 FOR Chinese Corn Kebab"
                            + "\u001B[0m");
                    pds = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda
                            PDS = "YOU SELECTED Mix Veg Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS
                        case 2: {// CASE 1 FOR Veg Finger
                            PDS = "YOU SELECTED Veg Finger" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Finger ENDS
                        case 3: {// CASE 1 FOR Bread Pakoda
                            PDS = "YOU SELECTED Bread Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS
                        case 4: {// CASE 1 FOR Methi Kabab
                            PDS = "YOU SELECTED Methi Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Methi Kabab ENDS
                        case 5: {// CASE 1 FOR Moong Pakoda
                            PDS = "YOU SELECTED Moong Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS
                        case 6: {// CASE 1 FOR Dragon Aloo
                            PDS = "YOU SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 7: {// CASE 1 FOR Saboo Dana
                            PDS = "YOU SELECTED Saboo Dana" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana ENDS
                        case 8: {// CASE 1 FOR Finger Chips
                            PDS = "YOU SELECTED Finger Chips" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Finger Chips ENDS
                        case 9: {// CASE 1 FOR Aloo Corn Kabab
                            PDS = "YOU SELECTED  Aloo Corn Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS
                        case 10: {// CASE 1 FOR Dragon Aloo
                            PDS = "YOU SELECTED Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 11: {// CASE 1 FOR Veg Kothey
                            PDS = "YOU SELECTED Veg Kothey" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Kothey ENDS
                        case 12: {// CASE 1 FOR Hara Bhara Kabab
                            PDS = "YOU SELECTED Hara Bhara Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS
                        case 13: {// CASE 1 FOR Corn Chat
                            PDS = "YOU SELECTED Corn Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Corn Chat ENDS
                        case 14: {// CASE 1 FOR Aloo Chat
                            PDS = "YOU SELECTED Aloo Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Chat ENDS
                        case 15: {// CASE 1 FOR Saboo Dana vada
                            PDS = "YOU SELECTED Saboo Dana vada" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS
                        case 16: {// CASE 1 FOR Veg Manchurian Dry
                            PDS = "YOU SELECTED Veg Manchurian Dry" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS
                        case 17: {// CASE 1 FOR Tandoori Manchurian
                            PDS = "YOU SELECTED Tandoori Manchurian" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS
                        case 18: {// CASE 1 FOR Chinese Corn Kebab
                            PDS = "YOU SELECTED Chinese Corn Kebab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID STARTER TYPE" + "\u001B[0m");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }

                    System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT STARTER 2\n"+ "\u001B[0m");

                    System.out.println("\u001B[35m"
                            + "\t\t\t\t\t\t\tENTER 1 FOR Mix Veg Pakoda\n\t\t\t\t\t\t\tENTER 2 FOR Veg Finger\n\t\t\t\t\t\t\tENTER 3 FOR Bread Pakoda\n\t\t\t\t\t\t\tENTER 4 FOR Methi Kabab\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Dragon Aloo\n\t\t\t\t\t\t\tENTER 7 FOR Saboo Dana\n\t\t\t\t\t\t\tENTER 8 FOR Finger Chips\n\t\t\t\t\t\t\tENTER 9 FOR Aloo Corn Kabab\n\t\t\t\t\t\t\tENTER 10 FOR Veg Cutlet\n\t\t\t\t\t\t\tENTER 11 FOR Veg Kothey\n\t\t\t\t\t\t\tENTER 12 FOR Hara Bhara Kabab \n\t\t\t\t\t\t\tENTER 13 FOR Corn Chat \n\t\t\t\t\t\t\tENTER 14 FOR Aloo Chat\n\t\t\t\t\t\t\tENTER 15 FOR Saboo Dana vada \n\t\t\t\t\t\t\tENTER 16 FOR Veg Manchurian Dry \n\t\t\t\t\t\t\tENTER 17 FOR Tandoori Manchurian \n\t\t\t\t\t\t\tENTER 18 FOR Chinese Corn Kebab"
                            + "\u001B[0m");
                    pds = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda
                            PDS = PDS + ",Mix Veg Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS
                        case 2: {// CASE 1 FOR Veg Finger
                            PDS = PDS + ",Veg Finger" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Finger ENDS
                        case 3: {// CASE 1 FOR Bread Pakoda
                            PDS = PDS + ",Bread Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS
                        case 4: {// CASE 1 FOR Methi Kabab
                            PDS = PDS + ",Methi Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Methi Kabab ENDS
                        case 5: {// CASE 1 FOR Moong Pakoda
                            PDS = PDS + ",Moong Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS
                        case 6: {// CASE 1 FOR Dragon Aloo
                            PDS = PDS + ",Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 7: {// CASE 1 FOR Saboo Dana
                            PDS = PDS + ",Saboo Dana" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana ENDS
                        case 8: {// CASE 1 FOR Finger Chips
                            PDS = PDS + ",Finger Chips" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Finger Chips ENDS

                        case 9: {// CASE 1 FOR Aloo Corn Kabab
                            PDS = PDS + ", Aloo Corn Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS
                        case 10: {// CASE 1 FOR Dragon Aloo
                            PDS = PDS + ",Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 11: {// CASE 1 FOR Veg Kothey
                            PDS = PDS + ",Veg Kothey" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Kothey ENDS
                        case 12: {// CASE 1 FOR Hara Bhara Kabab
                            PDS = PDS + ",Hara Bhara Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS
                        case 13: {// CASE 1 FOR Corn Chat
                            PDS = PDS + ",Corn Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Corn Chat ENDS
                        case 14: {// CASE 1 FOR Aloo Chat
                            PDS = PDS + ",Aloo Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Chat ENDS
                        case 15: {// CASE 1 FOR Saboo Dana vada
                            PDS = PDS + ",Saboo Dana vada" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS
                        case 16: {// CASE 1 FOR Veg Manchurian Dry
                            PDS = PDS + ",Veg Manchurian Dry" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS
                        case 17: {// CASE 1 FOR Tandoori Manchurian
                            PDS = PDS + ",Tandoori Manchurian" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS
                        case 18: {// CASE 1 FOR Chinese Corn Kebab
                            PDS = PDS + ",Chinese Corn Kebab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID STARTER TYPE" + "\u001B[0m");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS///////////////////////////////////////
                    }

                    System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT STARTER 3\n"+ "\u001B[0m");

                    System.out.println("\u001B[35m"
                            + "\t\t\t\t\t\t\tENTER 1 FOR Mix Veg Pakoda\n\t\t\t\t\t\t\tENTER 2 FOR Veg Finger\n\t\t\t\t\t\t\tENTER 3 FOR Bread Pakoda\n\t\t\t\t\t\t\tENTER 4 FOR Methi Kabab\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Dragon Aloo\n\t\t\t\t\t\t\tENTER 7 FOR Saboo Dana\n\t\t\t\t\t\t\tENTER 8 FOR Finger Chips\n\t\t\t\t\t\t\tENTER 9 FOR Aloo Corn Kabab\n\t\t\t\t\t\t\tENTER 10 FOR Veg Cutlet\n\t\t\t\t\t\t\tENTER 11 FOR Veg Kothey\n\t\t\t\t\t\t\tENTER 12 FOR Hara Bhara Kabab \n\t\t\t\t\t\t\tENTER 13 FOR Corn Chat \n\t\t\t\t\t\t\tENTER 14 FOR Aloo Chat\n\t\t\t\t\t\t\tENTER 15 FOR Saboo Dana vada \n\t\t\t\t\t\t\tENTER 16 FOR Veg Manchurian Dry \n\t\t\t\t\t\t\tENTER 17 FOR Tandoori Manchurian \n\t\t\t\t\t\t\tENTER 18 FOR Chinese Corn Kebab"
                            + "\u001B[0m");
                    pds = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                    switch (pds) {
                        case 1: {// CASE 1 FOR Mix Veg Pakoda
                            PDS = PDS + "AND Mix Veg Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Mix Veg Pakoda ENDS
                        case 2: {// CASE 1 FOR Veg Finger
                            PDS = PDS + "AND Veg Finger" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Finger ENDS
                        case 3: {// CASE 1 FOR Bread Pakoda
                            PDS = PDS + "AND Bread Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Bread Pakoda ENDS
                        case 4: {// CASE 1 FOR Methi Kabab
                            PDS = PDS + "AND Methi Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Methi Kabab ENDS
                        case 5: {// CASE 1 FOR Moong Pakoda
                            PDS = PDS + "AND Moong Pakoda" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Moong Pakoda ENDS
                        case 6: {// CASE 1 FOR Dragon Aloo
                            PDS = PDS + "AND Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 7: {// CASE 1 FOR Saboo Dana
                            PDS = PDS + "AND Saboo Dana" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana ENDS
                        case 8: {// CASE 1 FOR Finger Chips
                            PDS = PDS + "AND Finger Chips" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Finger Chips ENDS
                        case 9: {// CASE 1 FOR Aloo Corn Kabab
                            PDS = PDS + "AND  Aloo Corn Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Aloo Corn Kababo ENDS
                        case 10: {// CASE 1 FOR Dragon Aloo
                            PDS = PDS + "AND Dragon Aloo" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Aloo ENDS
                        case 11: {// CASE 1 FOR Veg Kothey
                            PDS = PDS + "AND Veg Kothey" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Kothey ENDS
                        case 12: {// CASE 1 FOR Hara Bhara Kabab
                            PDS = PDS + "AND Hara Bhara Kabab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Hara Bhara Kabab ENDS
                        case 13: {// CASE 1 FOR Corn Chat
                            PDS = PDS + "AND Corn Chat" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Corn Chat ENDS
                        case 14: {// CASE 1 FOR Aloo ChaPDS = PDS + "AND Aloo Chat";
                            break;
                        } // CASE 1 FOR Aloo Chat ENDS
                        case 15: {// CASE 1 FOR Saboo Dana vada
                            PDS = PDS + "AND Saboo Dana vada" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Saboo Dana vada ENDS
                        case 16: {// CASE 1 FOR Veg Manchurian Dry
                            PDS = PDS + "AND Veg Manchurian Dry" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Veg Manchurian Dry ENDS
                        case 17: {// CASE 1 FOR Tandoori Manchurian

                            PDS = PDS + "AND Tandoori Manchurian" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Tandoori Manchurian ENDS
                        case 18: {// CASE 1 FOR Chinese Corn Kebab
                            PDS = PDS + "AND Chinese Corn Kebab" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Chinese Corn Kebab ENDS
                        default: {// DEFAULT FOR INVALID STARTER TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID STARTER TYPE" + "\u001B[0m");
                            System.exit(pds);
                            break;
                        } // DEFAULT FOR INVALID STARTER TYPE ENDS
                    }

                    System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECt CHINESE ITEM\n"+ "\u001B[0m");
System.out.println("\u001B[35m"
                            + "\t\t\t\t\t\t\tENTER 1 FOR Backed Veg\n\t\t\t\t\t\t\tENTER 2 FOR Veg Manchurian\n\t\t\t\t\t\t\tENTER 3 FOR Veg Noodles\n\t\t\t\t\t\t\tENTER 4 FOR Backed Palak\n\t\t\t\t\t\t\tENTER 5 FOR Backed Palak\n\t\t\t\t\t\t\tENTER 6 FOR Veg Fried Rice"
                            + "\u001B[0m");
                    chns = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR

                    switch (chns) {// SWITCH FOR CHINESE ITEM
                        case 1: {// CASE FOR Backed Veg
                            CHNS = "YOU SELECTED Backed Veg" + "\u001B[0m";
                            break;
                        } // CASE FOR Backed Veg ENDS
                        case 2: {// CASE FOR Veg Manchurian
                            CHNS = "YOU SELECTED Veg Manchurian" + "\u001B[0m";
                            break;
                        } // CASE FOR Veg Manchurian ENDS
                        case 3: {// CASE FOR Veg Noodles
                            CHNS = "YOU SELECTED Veg Noodles" + "\u001B[0m";
                            break;
                        } // CASE FOR Veg Noodles ENDS
                        case 4: {// CASE FOR Backed Palak
                            CHNS = "YOU SELECTED Backed Palak" + "\u001B[0m";
                            break;
                        } // CASE FOR Backed Palak ENDS
                        case 5: {// CASE FOR Backed Palak
                            CHNS = "YOU SELECTED Backed Palak" + "\u001B[0m";
                            break;
                        } // CASE FOR Backed Palak ENDS
                        case 6: {// CASE FOR Fried Rice
                            CHNS = "YOU SELECTED Fried Rice" + "\u001B[0m";
                            break;
                        } // CASE FOR Fried Rice ENDS
                        default: {
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID CHINESE ITEM" + "\u001B[0m");
                            break;
                        }
                    }// SWITCH FOR CHINESE ITEM CASE
                } // IF CONDITION FOR ONLY THREE TYPE OF STARTER ENDS
                  ////////////// PANEER DISH ////////////////////////
                  System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT THE PANEER DISH\n"+ "\u001B[0m");
                System.out.println("\u001B[35m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR Paneer Butter Masala\n\t\t\t\t\t\t\tENTER 2 FOR Paneer Punjabi\n\t\t\t\t\t\t\tENTER 3 FOR Paneer Palak\n\t\t\t\t\t\t\tENTER 4 FOR Paneer Mutter\n\t\t\t\t\t\t\tENTER 5 FOR •Paneer Do Pyaza\n\t\t\t\t\t\t\tENTER 6 FOR Paneer Tikka Masala\n\t\t\t\t\t\t\tENTER 7 FOR Paneer Kadai\n\t\t\t\t\t\t\tENTER 8 FOR Methi Paneer\n\t\t\t\t\t\t\tENTER 9 FOR Corn Paneer\n\t\t\t\t\t\t\tENTER 10 FOR •Paneer Kolhapuri\n\t\t\t\t\t\t\tENTER 11 FOR Paneer Chatpatta"
                        + "\u001B[0m");
                pnd = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (pnd) {// SWITCH FOR PANEER DISH
                    case 1: {// CASE FOR Paneer Butter Masala
                        PND = "YOU SELECTED Paneer Butter Masala" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Butter Masala ENDS
                    case 2: {// CASE FOR Paneer Punjabi
                        PND = "YOU SELECTED Paneer Punjabi" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Punjabi ENDS
                    case 3: {// CASE FOR Paneer Palak
                        PND = "YOU SELECTED Paneer Palak" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Palak ENDS
                    case 4: {// CASE FOR Paneer Mutte
                        PND = "YOU SELECTED Paneer Mutter" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Mutter ENDS
                    case 5: {// CASE FOR Paneer Do Pyaza
                        PND = "YOU SELECTED Paneer Do Pyaza" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Do Pyaza ENDS
                    case 6: {// CASE FOR Paneer Tikka Masala
                        PND = "YOU SELECTED Paneer Tikka Masala" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Tikka Masala ENDS
                    case 7: {// CASE FOR Paneer Kadai
                        PND = "YOU SELECTED Paneer Kadai" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Kadai ENDS
                    case 8: {// CASE FOR Methi Paneer
                        PND = "YOU SELECTED Methi Paneer" + "\u001B[0m";
                        break;
                    } // CASE FOR Methi Paneer ENDS
                    case 9: {// CASE FOR Corn Paneer
                        PND = "YOU SELECTED Corn Paneer" + "\u001B[0m";
                        break;
                    } // CASE FOR Corn Paneer ENDS
                    case 10: {// CASE FOR Paneer Kolhapuri
                        PND = "YOU SELECTED Paneer Kolhapuri" + "\u001B[0m";
                        break;
                    } // CASE FOR Paneer Kolhapuri ENDS
                    case 11: {// CASE FOR FOR Paneer Chatpatta
                        PND = "YOU SELECTED FOR Paneer Chatpatta" + "\u001B[0m";
                        break;
                    } // CASE FOR FOR Paneer Chatpatta ENDS
                    default: {// DEFAULT FOR INVALID PANEER DISH
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tTHIS TYPE OF PANEER DISH IS NOT AVIAVLE" + "\u001B[0m");
                        System.exit(pnd);
                        break;
                    } // DEFAULT FOR INVALID PANEER DISH ENDS
                }// SWITCH FOR PANEER DISH ENDS
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECT CURD DISH\n"+ "\u001B[0m");
                System.out.println("\u001B[35m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR Veg Raita\n\t\t\t\t\t\t\tENTER 2 FOR Loki Raita\n\t\t\t\t\t\t\tENTER 3 FOR Aloo Raita\n\t\t\t\t\t\t\tENTER 4 FOR Dahi Papdi\n\t\t\t\t\t\t\tENTER 5 FOR Boondi Raita\n\t\t\t\t\t\t\tENTER 6 FOR Fruit Raita\n\t\t\t\t\t\t\tENTER 7 FOR Dahi Vada"
                        + "\u001B[0m");
                crd = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (crd) {// SWITCH FOR CURD DISH
                    case 1: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Veg Raita" + "\u001B[0m";
                        break;
                    } // CASE FOR CURD DISH END
                    case 2: {// CASE FOR Loki Raita
                        CRD = "YOU SELECTED Loki Raita" + "\u001B[0m";
                        break;
                    } // CASE FOR Loki Raita END
                    case 3: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Aloo Raita" + "\u001B[0m";
                        break;
                    } // CASE FOR CURD DISH END
                    case 4: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Dahi Papdi" + "\u001B[0m";
                        break;
                    } // CASE FOR CURD DISH END
                    case 5: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Boondi Raita" + "\u001B[0m";
                        break;
                    } // CASE FOR CURD DISH END
                    case 6: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Fruit Raita" + "\u001B[0m";
                        break;
                    } // CASE FOR CURD DISH END
                    case 7: {// CASE FOR CURD DISH
                        CRD = "YOU SELECTED Dahi Vada" + "\u001B[0m";
                        break;
                    } // CASE FOR CURD DISH END
                    default: {// DEFAULT FOR INVALID CURD DISH
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\tPLEASE ENTER A VAID CURD DISH TYPE" + "\u001B[0m");
                        System.exit(crd);
                        break;
                    } // DEFAULT FOR INVALID CURD DISH ENDS
                }// SWITCH FOR CURD DISH ENDS
                if (thli == 6 || thli == 7) {// IF CONDITION FOR PANEER STARTER
                    System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tSELECT FOR PNEER STARTER" + "\u001B[0m");
                    System.out.println("\u001B[35m"
                            + "\t\t\t\t\t\t\tENTER 1 FOR Paneer Chilli\n\t\t\t\t\t\t\tENTER 2 FOR •Paneer Tikka\n\t\t\t\t\t\t\tENTER 3 FOR Dragon Paneer\n\t\t\t\t\t\t\tENTER 4 FOR Paneer 65\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Paneer Achari Tikka "
                            + "\u001B[0m");
                    pns = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR

                    switch (pns) {
                        case 1: {// CASE 1 FOR Paneer Chilli
                            PDS = "YOU SELECTED Paneer Chilli" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Paneer Chilli ENDS
                        case 2: {// CASE 1 FOR •Paneer Tikka
                            PDS = "YOU SELECTED •Paneer Tikka" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR •Paneer Tikka ENDS
                        case 3: {// CASE 1 FOR Dragon Paneer
                            PDS = "YOU SELECTED Dragon Paneer" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Dragon Paneer ENDS
                        case 4: {// CASE 1 FOR Paneer 65
                            PDS = "YOU SELECTED Paneer 65" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Paneer 65 ENDS
                        case 5: {// CASE 1 FOR Paneer Pudina Tikkaa
                            PDS = "YOU SELECTED Paneer Pudina Tikkaa" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Paneer Pudina Tikkaa ENDS
                        case 6: {// CASE 1 FOR Paneer Achari Tikka
                            PDS = "YOU SELECTED Paneer Achari Tikka" + "\u001B[0m";
                            break;
                        } // CASE 1 FOR Paneer Achari Tikka ENDS
                        default: {
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tENTER A VALID PANEER STARTER TYPE" + "\u001B[0m");
                            System.exit(5);
                            break;
                        }
                    }// SWITCH FOR PANEER STARTER ENDS
                } // IF CONDITION FOR PANEER STARTER
                switch (thli) {// SWITCH FOR THALI
                    case 1: {// CASE FOR THALI 310
                        // System.out.println("YOU HAVE SELECTED FOR THALI 310");
                        break;
                    } // CASE FOR THALI 310 ENDS

                }// SWITCH FOR THALI ENDS
                System.out.println("\u001B[32m" + "\t\t\t\t\t\t\tJMB BILL"+"\u001B[0m");
                System.out.println("\u001B[32m" + "\t\t\t\t\t\t\tEXTRA PRICE FOR EXTRA TIME IS  " + eptm + "\u001B[0m");
                System.out.println("\u001B[32m" + "\t\t\t\t\t\t\t"+PDS + "\n" + "\u001B[32m" + "\t\t\t\t\t\t\t"+SUP + "\n" + "\u001B[32m" + "\t\t\t\t\t\t\t"+VEG + "\n"
                        + "\u001B[32m" + "\t\t\t\t\t\t\t"+DAL + "\n" + "\u001B[32m" + "\t\t\t\t\t\t\t"+RICE + "\n" + "\u001B[32m" + "\t\t\t\t\t\t\t"+ICE + "\n"
                        + "\u001B[32m" + "\t\t\t\t\t\t\t"+CRD + "\n" + "\u001B[32m" + "\t\t\t\t\t\t\t"+PDS + "\n" + "\u001B[32m"
                        + "\t\t\t\t\t\t\tCHINESE ITEM SELECTED IS " +CHNS + "\n" +"\u001B[32m" +"\t\t\t\t\t\t\tNUMBER OF PEOPLE COME IN THE FUNCTION IS............................"+eppl+"\u001B[32m" + "\n\t\t\t\t\t\t\tTOTAL WITHOUT GST IS ...............................................Rs." + amt
                        + "\n" + "\u001B[32m" + "\t\t\t\t\t\t\tTOTAL WITH GST IS ..................................................Rs." + gamt + "\u001B[0m");
                break;
            } // CASE 1 FOR VEGETARIAN MENU ENDS
             case 2: {// CASE FOR BRAKRFAST
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tSELECTION FOR BRAKEFAST\n"+ "\u001B[0m");
                System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tENTER 1 FOR Rs.200 PLATE\n\t\t\t\t\t\t\tENTER 2 FOR Rs.230 PLATE \n\t\t\t\t\t\t\tENTER 3 FOR Rs.250 PLATE"+ "\u001B[0m");
                bfst = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                if (bfst == 1) {
                    amt = ppl * 200 + eptm;
                    gamt = ((amt / 100) * 9) + amt;
                }
                if (bfst == 2) {
                    amt = ppl * 230 + eptm;
                    gamt = ((amt * 9) / 100) + amt;
                }
                if (bfst == 3) {
                    amt = ppl * 250 + eptm;
                    gamt = ((amt *9) / 100) + amt;
                }
                switch (bfst) {
                    case 1: {// CASE FOR Rs.200 PLATE
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tYOU SELECTED FOR Rs.200 PLATE");
                        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                        
                        System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tENTER 1 FOR TEA \n\t\t\t\t\t\t\tENTER 2 FOR COFFEE");
                        tc=sc.nextInt();

                        switch (tc) {
                            case 1:{
                                TC="YOU SELECTED FOR TEA";
                                break;
                          }
                            default:{
                                    TC="YOU SELECTED FOR COFFEE";
                                    break;}
                        }
                       
                    BFT = "YOU SELECTED rs.200 PLATE IN WHICH YOU GET \n\t\t\t\t\t\t\tPOHA\n\t\t\t\t\t\t\tJALABI\n\t\t\t\t\t\t\tBREAD ITEM\n\t\t\t\t\t\t\tHEAVY SNACKS\n";
                            
                        break;
                    } // CASE FOR Rs.200 PLATE ENDS
                    case 2: {// CASE FOR Rs.230 PLATE
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tYOU SELECTED FOR Rs.230 PLATE");
                        System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tENTER 1 FOR TEA \n\t\t\t\t\t\t\tENTER 2 FOR COFFEE");
                        tc=sc.nextInt();

                        switch (tc) {
                            case 1:{
                                TC="YOU SELECTED FOR TEA";
                                break;
                             }
                            default:{
                                    TC="YOU SELECTED FOR COFFEE";
                                    break;}
                        }
                        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                        BFT = "YOU SELECTED rs.230 PLATE IN WHICH YOU GET \n\t\t\t\t\t\t\tPOHA\n\t\t\t\t\t\t\tJALABI\n\t\t\t\t\t\t\tBREAD ITEM\n\t\t\t\t\t\t\tHEAVY SNACKS\n";
                                
                        break;
                    } // CASE FOR Rs.230 PLATE ENDS
                    case 3: {// CASE FOR Rs.250 PLATE
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tYOU SELECTED FOR Rs.250 PLATE\n"+ "\u001B[0m");
                        System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tENTER 1 FOR TEA \n\t\t\t\t\t\t\tENTER 2 FOR COFFEE");
                        tc=sc.nextInt();

                        switch (tc) {
                            case 1:{
                                TC="YOU SELECTED FOR TEA";
                                break;

                            }
                                
                        default:{
                                    TC="YOU SELECTED FOR COFFEE";

                                break;}
                        }
                        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                        
                                BFT = "YOU SELECTED rs.250 PLATE IN WHICH YOU GET \n\t\t\t\t\t\t\tPOHA\n\t\t\t\t\t\t\tJALABI\n\t\t\t\t\t\t\tBREAD ITEM\n\t\t\t\t\t\t\tHEAVY SNACKS\n";
                              
                        break;
                    } // CASE FOR Rs.250 PLATE ENDS
                    default: {/// DEFAULT FOR INVALID PLAT NUMBER
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID PLAT NUMBER"+ "\u001B[0m");
                        System.exit(9);
                        break;
                    } /// DEFAULT FOR INVALID PLAT NUMBER ENDS
                }// CASE FOR Rs.200 PLATE ENDS
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\t\t\tJMB BILL\n"+ "\u001B[0m");
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\t"+BFT+ "\u001B[0m");
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\t"+TC+ "\u001B[0m");
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tEXTRA PRICE FOR EXTRA TIMES IS ............................................"+eptm+ "\u001B[0m");
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tTIMES FOR FUNCTION  ........................................................"+tm+ "\u001B[0m");
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tNUMBER OF PEOPLE CAME......................................................"+ppl+ "\u001B[0m");
                System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tTOTAL AMOUNT WITHOUt GST..................................................Rs." + amt+ "\u001B[0m");
                System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tTOTAL AMOUNT WITH GST.....................................................Rs." + gamt+ "\u001B[0m");
                break;
            } // CASE FOR BRAKRFAST ENDS
            
        case 3: {// CASE FOR MAIN LADIES
                System.out.println("\u001B[31m"+ "\t\t\t\t\t\t\tYOU SELECTED FOR For Ladies\n"+ "\u001B[0m");
                System.out.println("\u001B[35m"+ "\t\t\t\t\t\t\tENTER 1 FOR Rs.250 PLATE\n\t\t\t\t\t\t\tENTER 2 FOR Rs.300 PLATE\n\t\t\t\t\t\t\tENTER 3 FOR Rs.350 PLATE\n "+ "\u001B[0m");
                ktp = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                if (ktp == 1) {
                    amt = ppl * 250 + tm;
                    gamt = ((amt / 100) * 9) + amt;
                }
                if (ktp == 2) {
                    amt = ppl * 300 + tm;
                    gamt = ((amt / 100) * 9) + amt;
                }
                if (ktp == 5) {
                    amt = ppl * 350 + tm;
                    gamt = ((amt / 100) * 9) + amt;
                }
                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tWHAT DO YOU WANT ENTER 1 FOR SOUPS\n\t\t\t\t\t\t\tENTER 2 FOR WELCOME DRINKS \n"+ "\u001B[0m");
                sutr = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                switch (sutr) {
                    case 1: {// CASE 1 FOR SOUPS
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tYOU HAVE CHOOSEN TO TAKE SOUPS\n"+ "\u001B[0m");
                        System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tPLEASE SELEcT WHICH TYPE OF SOUP YOU WANT"+ "\u001B[0m");
                        System.out.println("\u001B[35m"+ "\t\t\t\t\t\t\tENTER 1 FOR TOMATO SOUP\n\t\t\t\t\t\t\tENTER 2 FOR VEG MANCHO\n\t\t\t\t\t\t\tENTER 3 FOR HOT AND SOUR VEG\n\t\t\t\t\t\t\tENTER 4 FOR LEMON CORIENDER"+ "\u001B[0m");
                        sup = sc.nextInt();
                        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
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
                                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID SOUP TYPE"+ "\u001B[0m");
                                System.exit(0);
                                break;
                            } // DEFAULT FOR INVALID SOUP TYPE ENDS
                        }// SWITCH FOR SOUP TYPES ENDS
                        break;
                    } // CASE 1 FOR SOUPS ENDS
                    case 2: {// CASE 2 FOR WELCOME DRINKS
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tYOU HAVE CHOOSE TO TAKE WELCOME DRINKS");
                        System.out.println("\u001B[35m" + "\t\t\t\t\t\t\tPLEASE SELEcT WHICH TYPE OF SOUP YOU WANT");
                        System.out.println("\u001B[35m"+ "\t\t\t\t\t\t\tENTER 1 FOR Blue Lagoon\n\t\t\t\t\t\t\tENTER 2 FOR Blowgun Kesher Pista\n\t\t\t\t\t\t\tENTER 3 FOR Fresh Lime Water\n\t\t\t\t\t\t\tENTER 4 FOR Butter Milk\n\t\t\t\t\t\t\tENTER 5 FOR Orange Pink City\n\t\t\t\t\t\t\tENTER 6 FOR Strawberry Delight\n\t\t\t\t\t\t\tENTER 7 FOR Jal Jeera\n\t\t\t\t\t\t\tENTER 8 FOR Rasna Water"+ "\u001B[0m");
                        sup = sc.nextInt();
                        System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                        switch (sup) {// SWITCH FOR TYPES SOU
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
                                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID WELCOME DRINK TYPE"+ "\u001B[0m");
                                System.exit(0);
                                break;
                            } // DEFAULT FOR INVALID WELCOME DRINK TYPE ENDS
                        }// SWITCH FOR SOUP TYPES ENDS
                        break;
                    } // CASE 2 FOR WELCOME DRINKS ENDS

                    default: {// DEFAULT FOR INVALID DRINK TYPE
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tNO SUCH TYPE OF DRINKS AVILABLE"+ "\u001B[0m");
                        System.exit(sutr);
                        break;
                    } // DEFAULT FOR INVALID DRINK TYPE
                }// SWITCH ENDS FOR SECLECTING FOR SOUPS AND WELCOME DRINKS
                 ///////////// STARTERS
                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tSELECT STARTERS YOU WANT\n"+ "\u001B[0m");
                System.out.println("\u001B[35m"
                        + "\t\t\t\t\t\t\tENTER 1 FOR Mix Veg Pakoda\n\t\t\t\t\t\t\tENTER 2 FOR Veg Finger\n\t\t\t\t\t\t\tENTER 3 FOR Bread Pakoda\n\t\t\t\t\t\t\tENTER 4 FOR Methi Kabab\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Dragon Aloo\n\t\t\t\t\t\t\tENTER 7 FOR Saboo Dana\n\t\t\t\t\t\t\tENTER 8 FOR Finger Chips\n\t\t\t\t\t\t\tENTER 9 FOR Aloo Corn Kabab\n\t\t\t\t\t\t\tENTER 10 FOR Veg Cutlet\n\t\t\t\t\t\t\tENTER 11 FOR Veg Kothey\n\t\t\t\t\t\t\tENTER 12 FOR Hara Bhara Kabab \n\t\t\t\t\t\t\tENTER 13 FOR Corn Chat \n\t\t\t\t\t\t\tENTER 14 FOR Aloo Chat\n\t\t\t\t\t\t\tENTER 15 FOR Saboo Dana vada \n\t\t\t\t\t\t\tENTER 16 FOR Veg Manchurian Dry \n\t\t\t\t\t\t\tENTER 17 FOR Tandoori Manchurian \n\t\t\t\t\t\t\tENTER 18 FOR Chinese Corn Kebab"+ "\u001B[0m");
                pds = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
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
                    case 9: {// CASE 1 FOR Aloo Cor
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
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID STARTER TYPE"+ "\u001B[0m");
                        System.exit(pds);
                        break;
                    } // DEFAULT FOR INVALID STARTER TYPE ENDS
                }
                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tSELECT SWEET DISH YOU WANT\n"+ "\u001B[0m");
                ////////////// SWEET DISH
                System.out.println("\u001B[35m"+"\t\t\t\t\t\t\tENTER 1 FOR •Gulab Jamun \n\t\t\t\t\t\t\tENTER 2 FOR Gajar Ka Halwa\n\t\t\t\t\t\t\tENTER 3 FOR Moong Ka Halwa\n\t\t\t\t\t\t\tENTER 4 FOR Shree Khand\n\t\t\t\t\t\t\tENTER 5 FOR Aam Khand\n\t\t\t\t\t\t\tENTER 6 FOR Vanilla\n\t\t\t\t\t\t\tENTER 7 FOR Butter Scotch\n\t\t\t\t\t\t\tENTER 8 FOR Sitaphal Basundi"+ "\u001B[0m"+ "\u001B[0m");
                ice = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
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
                        System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID SWEET DISH NUMBER"+ "\u001B[0m");
                        System.exit(ice);
                        break;
                    }
                }// SWITCH FOR ICE CREAM AND SWEET DISH ENDS
                if (ktp == 1 || ktp == 2) {// if for tea coffee
                    TCI = "YOU SELETED TEA OR COFFEE";
                    System.out.println("\u001B[35m"+ "\t\t\t\t\t\t\tENTER 1 FOR Idli/Vada Shambhar\n\t\t\t\t\t\t\tENTER 2 FOR PaV BhaJi\n\t\t\t\t\t\t\tENTER 3 FOR Chhola Kulcha\n\t\t\t\t\t\t\tENTER 4 FOR Methi Paratha\n\t\t\t\t\t\t\tENTER 5 FOR Stuffed Paratha\n\t\t\t\t\t\t\tENTER 6 FOR Muli Paratha\n\t\t\t\t\t\t\tENTER 7 FOR Noodles\n\t\t\t\t\t\t\tENTER 8 FOR Chhole Bhatura\n\t\t\t\t\t\t\tENTER 9 FOR Chhola Poori\n\t\t\t\t\t\t\tENTER 10 FOR Paratha with Dahi\n\t\t\t\t\t\t\tENTER 11 FOR • Aloo Paratha\n\t\t\t\t\t\t\tENTER 12 FOR Gobhi Paratha"+ "\u001B[0m");
                    snks = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                    switch (snks) {// SWITCH FOR SNAKS
                        case 1: {// CASE FOR Idli/Vada Shambha
                            SNKS = "YOU SELECTED Idli/Vada Shambha";
                            break;
                        } // CASE FOR Idli/Vada Shambha ENDS
                        case 2: {// CASE FOR PaV BhaJi
                            SNKS = "YOU SELECTED PaV BhaJi";
                            break;
                        } // CASE FOR PaV BhaJi ENDS
                        case 3: {// CASE FOR CHOLA KULCHA
                            SNKS = "YOU SELECTED CHOLA KULCHA";
                            break;
                        } // CASE FOR CHOLA KULCHA ENDS
                        case 4: {// CASE FFOR Methi Paratha
                            SNKS = "YOU SELECTFOR Methi Paratha";
                            break;
                        } // CASE FFOR Methi Paratha ENDS
                        case 5: {// CASE FOR Stuffed Paratha
                            SNKS = "YOU SELECTED Stuffed Paratha";
                            break;
                        } // CASE FOR Stuffed Paratha ENDS
                        case 6: {// CASE FOR Muli Paratha
                            SNKS = "YOU SELECTED Muli Paratha ";
                            break;
                        } // CASE FOR Muli Paratha ENDS
                        case 7: {// CASE FOR Noodles
                            SNKS = "YOU SELECTED Noodles ";
                            break;
                        } // CASE FOR Noodles ENDS
                        case 8: {// CASE FOR Chhole Bhatura
                            SNKS = "YOU SELECTED Chhole Bhatura ";
                            break;
                        } // CASE FOR Chhole Bhatura ENDS
                        case 9: {// CASE FOR Chhola Poori
                            SNKS = "YOU SELECTED Chhola Poori ";
                            break;
                        } // CASE FOR Chhola Poori ENDS
                        case 10: {// CASE FOR Paratha with Dahi
                            SNKS = "YOU SELECTED Paratha with Dahi ";
                            break;
                        } // CASE FOR Paratha with Dahi ENDS
                        case 11: {// CASE FOR Aloo Paratha
                            SNKS = "YOU SELECTED Aloo Paratha ";
                            break;
                        } // CASE FOR Aloo Paratha ENDS
                        case 12: {// CASE FOR Gobhi Paratha
                            SNKS = "YOU SELECTED Gobhi Paratha ";
                            break;
                        } // CASE FOR Gobhi Paratha ENDS
                        default: {// DEFAULT FOR INVALID SNAKS TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID SNACKS TYPE"+ "\u001B[0m");
                            System.exit(8);
                            break;
                        } // DEFAULT FOR INVALID SNAKS TYPE
                    }// SWITCH FOR SNAKS ENDS
                } // if for tea coffee ends
                else {// if for tea ior icecream ends
                    TCI = "YOU SELETED TEA OR ICECREAM";
                    /// FOR 2 SNAKS
                    System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tSELECT TWO SACKS\n");
                    System.out.println("\u001B[35m"+ "\t\t\t\t\t\t\tENTER 1 FOR Idli/Vada Shambhar\n\t\t\t\t\t\t\tENTER 2 FOR PaV BhaJi\n\t\t\t\t\t\t\tENTER 3 FOR Chhola Kulcha\n\t\t\t\t\t\t\tENTER 4 FOR Methi Paratha\n\t\t\t\t\t\t\tENTER 5 FOR Stuffed Paratha\n\t\t\t\t\t\t\tENTER 6 FOR Muli Paratha\n\t\t\t\t\t\t\tENTER 7 FOR Noodles\n\t\t\t\t\t\t\tENTER 8 FOR Chhole Bhatura\n\t\t\t\t\t\t\tENTER 9 FOR Chhola Poori\n\t\t\t\t\t\t\tENTER 10 FOR Paratha with Dahi\n\t\t\t\t\t\t\tENTER 11 FOR • Aloo Paratha\n\t\t\t\t\t\t\tENTER 12 FOR Gobhi Paratha"+ "\u001B[0m");
                    snks = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                    switch (snks) {// SWITCH FOR SNAKS
                        case 1: {// CASE FOR Idli/Vada Shambha
                            SNKS = "YOU SELECTED Idli/Vada Shambha";
                            break;
                        } // CASE FOR Idli/Vada Shambha END
                        case 2: {// CASE FOR PaV BhaJi
                            SNKS = "YOU SELECTED PaV BhaJi";
                            break;
                        } // CASE FOR PaV BhaJi END
                        case 3: {// CASE FOR CHOLA KULCHA
                            SNKS = "YOU SELECTED CHOLA KULCHA";
                            break;
                        } // CASE FOR CHOLA KULCHA END
                        case 4: {// CASE FFOR Methi Paratha
                            SNKS = "YOU SELECTFOR Methi Paratha";
                            break;
                        } // CASE FFOR Methi Paratha END
                        case 5: {// CASE FOR Stuffed Paratha
                            SNKS = "YOU SELECTED Stuffed Paratha";
                            break;
                        } // CASE FOR Stuffed Paratha END
                        case 6: {// CASE FOR Muli Paratha
                            SNKS = "YOU SELECTED Muli Paratha ";
                            break;
                        } // CASE FOR Muli Paratha END
                        case 7: {// CASE FOR Noodles
                            SNKS = "YOU SELECTED Noodles ";
                            break;
                        } // CASE FOR Noodles END
                        case 8: {// CASE FOR Chhole Bhatura
                            SNKS = "YOU SELECTED Chhole Bhatura ";
                            break;
                        } // CASE FOR Chhole Bhatura END
                        case 9: {// CASE FOR Chhola Poori
                            SNKS = "YOU SELECTED Chhola Poori ";
                            break;
                        } // CASE FOR Chhola Poori END
                        case 10: {// CASE FOR Paratha with Dahi
                            SNKS = "YOU SELECTED Paratha with Dahi ";
                            break;
                        } // CASE FOR Paratha with Dahi END
                        case 11: {// CASE FOR Aloo Paratha
                            SNKS = "YOU SELECTED Aloo Paratha ";
                            break;
                        } // CASE FOR Aloo Paratha END
                        case 12: {// CASE FOR Gobhi Paratha
                            SNKS = "YOU SELECTED Gobhi Paratha ";
                            break;
                        } // CASE FOR Gobhi Paratha END
                        default: {// DEFAULT FOR INVALID SNAKS TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID SNACKS TYPE");
                            System.exit(8);
                            break;
                        } // DEFAULT FOR INVALID SNAKS TYPE
                    }// SWITCH FOR SNAKS ENDS
                    System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tSELECT SACKS 2\n");
                     System.out.println("\u001B[35m"+"\t\t\t\t\t\t\tENTER 1 FOR Idli/Vada Shambhar\n\t\t\t\t\t\t\tENTER 2 FOR PaV BhaJi\n\t\t\t\t\t\t\tENTER 3 FOR Chhola Kulcha\n\t\t\t\t\t\t\tENTER 4 FOR Methi Paratha\n\t\t\t\t\t\t\tENTER 5 FOR Stuffed Paratha\n\t\t\t\t\t\t\tENTER 6 FOR Muli Paratha\n\t\t\t\t\t\t\tENTER 7 FOR Noodles\n\t\t\t\t\t\t\tENTER 8 FOR Chhole Bhatura\n\t\t\t\t\t\t\tENTER 9 FOR Chhola Poori\n\t\t\t\t\t\t\tENTER 10 FOR Paratha with Dahi\n\t\t\t\t\t\t\tENTER 11 FOR • Aloo Paratha\n\t\t\t\t\t\t\tENTER 12 FOR Gobhi Paratha"+ "\u001B[0m");
                    snks = sc.nextInt();
                    System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CLEAR
                    switch (snks) {// SWITCH FOR SNAKS
                        case 1: {// CASE FOR Idli/Vada Shambha
                            SNKS = SNKS + "AND SELECTED Idli/Vada Shambha";
                            break;
                        } // CASE FOR Idli/Vada Shambha ENDS
                        case 2: {// CASE FOR PaV BhaJi
                            SNKS = SNKS + "AND SELECTED PaV BhaJi";
                            break;
                        } // CASE FOR PaV BhaJi ENDS
                        case 3: {// CASE FOR CHOLA KULCHA
                            SNKS = SNKS + "AND SELECTED CHOLA KULCHA";
                            break;
                        } // CASE FOR CHOLA KULCHA ENDS
                        case 4: {// CASE FFOR Methi Paratha
                            SNKS = SNKS + "AND SELECTFOR Methi Paratha";
                            break;
                        } // CASE FFOR Methi Paratha ENDS
                        case 5: {// CASE FOR Stuffed Paratha
                            SNKS = SNKS + "AND SELECTED Stuffed Paratha";
                            break;
                        } // CASE FOR Stuffed Paratha ENDS
                        case 6: {// CASE FOR Muli Paratha
                            SNKS = SNKS + "AND SELECTED Muli Paratha ";
                            break;
                        } // CASE FOR Muli Paratha ENDS
                        case 7: {// CASE FOR Noodles
                            SNKS = SNKS + "AND SELECTED Noodles ";
                            break;
                        } // CASE FOR Noodles ENDS
                        case 8: {// CASE FOR Chhole Bhatura
                            SNKS = SNKS + "AND SELECTED Chhole Bhatura ";
                            break;
                        } // CASE FOR Chhole Bhatura ENDS
                        case 9: {// CASE FOR Chhola Poori
                            SNKS = SNKS + "AND SELECTED Chhola Poori ";
                            break;
                        } // CASE FOR Chhola Poori ENDS
                        case 10: {// CASE FOR Paratha with Dahi
                            SNKS = SNKS + "AND SELECTED Paratha with Dahi ";
                            break;
                        } // CASE FOR Paratha with Dahi ENDS
                        case 11: {// CASE FOR Aloo Paratha
                            SNKS = SNKS + "AND SELECTED Aloo Paratha ";
                            break;
                        } // CASE FOR Aloo Paratha ENDS
                        case 12: {// CASE FOR Gobhi Paratha
                            SNKS = SNKS + "AND SELECTED Gobhi Paratha ";
                            break;
                        } // CASE FOR Gobhi Paratha ENDS
                        default: {// DEFAULT FOR INVALID SNAKS TYPE
                            System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tPLEASE ENTER A VALID SNACKS TYPE"+ "\u001B[0m");
                            System.exit(8);
                            break;
                        } // DEFAULT FOR INVALID SNAKS TYPE
                    }// SWITCH FOR SNAKS ENDS
                } // if for tea ior icecream ends
                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tSELECT FOR PNEER STARTER\n");
                System.out.println("\u001B[35m"+ "\t\t\t\t\t\t\tENTER 1 FOR Paneer Chilli\n\t\t\t\t\t\t\tENTER 2 FOR •Paneer Tikka\n\t\t\t\t\t\t\tENTER 3 FOR Dragon Paneer\n\t\t\t\t\t\t\tENTER 4 FOR Paneer 65\n\t\t\t\t\t\t\tENTER 5 FOR Paneer Pudina Tikkaa\n\t\t\t\t\t\t\tENTER 6 FOR Paneer Achari Tikka "+ "\u001B[0m");
                pns = sc.nextInt();
                System.out.println("\033[H\033[2J");// COAMMAND FOR SCREEN CL
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
                        System.out.println("\u001B[31m" + "ENTER A VALID PANEER STARTER TYPE"+ "\u001B[0m");
                        System.exit(5);
                        break;
                    }
                }// SWITCH FOR PANEER STARTER ENDS
                System.out.println("\u001B[31m" +"\t\t\t\t\t\t\tJMB BILL\n");
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\t"+PDS);// PANEER DISH
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\t"+ICE);// SWEET DISH
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\t"+PDS);// PRINT FOR STARTES
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\t"+SUP);
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\t"+TCI);// ORINTS TEA COFFEE ICE CREAM
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tEXTRA PRICE FOR EXTRA TIME IS ...................................." + tm);
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tEXTRA PEOPLE ARRIVED ............................................."+eppl);
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tTOTAL PEOPLE ARRIVES ............................................."+ppl);
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tTOTAL AOUNT WITHOUT GST ........................................Rs." + amt);
                System.out.println("\u001B[35m" +"\t\t\t\t\t\t\tTOTAL AOUNT WITH GST ........................................Rs." + gamt);
                break;
            } // CASE FOR LADIES MAIN ENDS
            default: {// DEFAUL FOR INVALID MENU SELECTION
                System.out.println("\u001B[31m" + "\t\t\t\t\t\t\tINVALID MENU SELECTED");
                System.exit(2);
                break;
            } // DEFAULT FOR INVALID MENU SELECTION ENDS
        }
    }
}
