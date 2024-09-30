import java.util.Scanner;

public class medicine_08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cst;
        System.out.println("ENTER 1 FOR RETAILERS \nENTER 2 FOR WHOLE SCELLER");
        cst = sc.nextInt();
        switch (cst) {// SWITCH OPEN FOR WHOLE SELLER OR RETAIULLER
            case 1: {// CASE OPEN FOR RETIALER
                System.out.println(
                        "Enter 1 for Acetaminophen\nEnterv 2 for Adderall\nEnter 3 for AMITRIPTYLINE\nEnter 4 for AMLODIIPINE\nEnter 5 for AMOXICILLIN\n");
                cst = sc.nextInt();
                switch (cst) {
                    case 1: {// CASE FOR Acetaminophen
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 5) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 5 UNITS
                            System.out.println("THE TOTAL AMOUNT ON MEDICINE ACETAMINOPHEN ON " + cst + " UNITS IS "
                                    + (cst * 100));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 5 UNITS ARE ALLOW TO SEEL TO THE RETAILER");
                        }
                        break;
                    } // CASE ENDS FOR ACETAMINOPHEN TYPE 1

                    case 2: {// CASE FOR ADDERALL
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 5) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 5 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE ADDERALL ON " + cst + " UNITS IS " + (cst * 200));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 5 UNITS ARE ALLOW TO SEEL TO THE RETAILER");
                        }
                        break;
                    } // CASE ENDS FOR ADDERALL TYPE 2\

                    case 3: {// CASE FOR AMITRIPTYLINE
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 5) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 5 UNITS
                            System.out.println("THE TOTAL AMOUNT ON MEDICINE AMITRIPTYLINE ON " + cst + " UNITS IS "
                                    + (cst * 300));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 5 UNITS ARE ALLOW TO SEEL TO THE RETAILER");
                        }
                        break;
                    } // CASE ENDS FOR AMITRIPTYLINE TYPE 3

                    case 4: {// CASE FOR AMLODIIPINE
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 5) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 5 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE AMLODIIPINE ON " + cst + " UNITS IS " + (cst * 400));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 5 UNITS ARE ALLOW TO SEEL TO THE RETAILER");
                        }
                        break;
                    } // CASE ENDS FOR AMLODIIPINE TYPE 4

                    case 5: {// CASE FOR AMOXICILLIN
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 5) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 5 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE AMOXICILLIN ON " + cst + " UNITS IS " + (cst * 500));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 5 UNITS ARE ALLOW TO SEEL TO THE RETAILER");
                        }
                        break;
                    } // CASE ENDS FOR AMOXICILLIN TYPE 5

                    default: {// DEFAULT FOR INVALID MEDICINE NUMBER
                        System.out.println("INVALID MEDICINE NUMBER");
                        break;
                    } // DEFAULT EDS FOR INVALID MEDICINE NUMBER
                }
                break;
            } // CASE ENDS FOR RETAILER

            case 2: {// CASE OPEN FOR WHOLESELLER
                System.out.println(
                        "Enter 1 for Acetaminophen\nEnterv 2 for Adderall\nEnter 3 for AMITRIPTYLINE\nEnter 4 for AMLODIIPINE\nEnter 5 for AMOXICILLIN\nENTER 6 FOR BACITRACIN\nENTER 7 FOR BACLOFEN\nENTER 8 FOR BACTRIM\nENTER 9 FOR BACTRIM-DS\n ENTER 10 BACTROBAN");
                cst = sc.nextInt();
                switch (cst) {
                    case 1: {// CASE FOR Acetaminophen
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMBACTROBAN
                            System.out.println("THE TOTAL AMOUNT ON MEDICINE ACETAMINOPHEN ON " + cst + " UNITS IS "
                                    + (cst * 100));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR ACETAMINOPHEN TYPE 1

                    case 2: {// CASE FOR ADDERALL
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE ADDERALL ON " + cst + " UNITS IS " + (cst * 200));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR ADDERALL TYPE 2\

                    case 3: {// CASE FOR AMITRIPTYLINE
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println("THE TOTAL AMOUNT ON MEDICINE AMITRIPTYLINE ON " + cst + " UNITS IS "
                                    + (cst * 300));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR AMITRIPTYLINE TYPE 3

                    case 4: {// CASE FOR AMLODIIPINE
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE AMLODIIPINE ON " + cst + " UNITS IS " + (cst * 400));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR AMLODIIPINE TYPE 4

                    case 5: {// CASE FOR AMOXICILLIN
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE AMOXICILLIN ON " + cst + " UNITS IS " + (cst * 500));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR AMOXICILLIN TYPE 5

                    case 6: {// CASE FOR BACITRACIN
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE BACITRACIN ON " + cst + " UNITS IS " + (cst * 600));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR BACITRACBACLOFEN

                    case 7: {// CASE FOR BACLOFEN
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE BACLOFEN ON " + cst + " UNITS IS " + (cst * 700));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR BACLOFEN TYPE 7

                    case 8: {// CASE FOR BACTRIM
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE BACTRIM ON " + cst + " UNITS IS " + (cst * 800));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR BACTRIM TYPE 8

                    case 9: {// CASE FOR BACTRIM-DS
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE BACTRIM-DS ON " + cst + " UNITS IS " + (cst * 900));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR BACTRIM-DS TYPE 9

                    case 10: {// CASE FOR BACTROBAN
                        System.out.println("ENTER QUNANTITY IN UNIT");
                        cst = sc.nextInt();
                        if (cst <= 100) {// IF CONDITION TO LIMIT THE COUSTMER FOR MAXIMUM 100 UNITS
                            System.out.println(
                                    "THE TOTAL AMOUNT ON MEDICINE BACTROBAN ON " + cst + " UNITS IS " + (cst * 1000));
                        } else {// ELSE CONDITION FOR EXECDING THE LIMIT
                            System.out.println("NO MEDICINE MORE THEN 100 UNITS ARE ALLOW TO SEEL TO THE WHOLESELLER");
                        }
                        break;
                    } // CASE ENDS FOR BACTROBAN TYPE 10

                    default: {// DEFAULT FOR INVALID MEDICINE NUMBER
                        System.out.println("INVALID MEDICINE NUMBER");
                        break;
                    } // DEFAULT EDS FOR INVALID MEDICINE NUMBER
                }
                break;
            } // CASE ENDS FOR WHOLESELLER
            default: {
                System.out.println("ENVALID COUSTMER INFORMATION");
                break;
            }
        }
    }
}
