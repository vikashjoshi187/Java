import java.util.Scanner;
import java.io.*;
public class BAKING_09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String spos, rpos, password, rpassword;
        int ages, age, acnt, dw = 0, acnt1, da;
        Float depo = 0.0f, depo1;
        System.out.println("\u001B[31m"+ "ENTER YOUR MAIL" + "\u001B[0m");// TAKING INPUT EMAIL
        String mil = sc.nextLine();
        System.out.println("\u001B[31m" + "ENTER PASSWORD" + "\u001B[0m");// TAKING INPUT PASSWORD
        Console con = System.console();
        char[] chars = con.readPassword();
        password = new String(chars);
        System.out.println("\u001B[31m" + "ENTER FULL NAME" + "\u001B[0m");// TAKING INPUT FULL NAME
        String name = sc.nextLine();
        System.out.println("\u001B[31m" + "ENTER AGE" + "\u001B[0m");// TAKING INPUT AGE
        age = sc.nextInt();
        System.out.println("\033[H\033[2J");//COAMMAND FOR SCREEN CLEAR
        System.out.println("\u001B[35m" + "ENTER 1 FOR JOIN ACCOUNT" + "\u001B[0m");
        System.out.println("\u001B[34m" + "ENTER 2 FOR SAVINGS ACCOUNT" + "\u001B[0m");
        System.out.println("\u001B[33m" + "ENTER 3 FOR CHILD ACCOUNT" + "\u001B[0m");
        acnt = sc.nextInt();// TAKING INPUT FOR ACCOUNT
        System.out.println("\033[H\033[2J");//COAMMAND FOR SCREEN CLEAR
        if (acnt > 3) {// IF CONDITION FOR VALID ACCOUNT TYPE
            System.out.println("INVALID ACCOUNT CHOICE");
            System.exit(1);
        } // IF CONDITION FOR VALID ACCOUNT TYPE END
        switch (acnt) {// SWITCH FOR ACCOUNTS
            case 1: {// CASE FOR JOINT ACCOUNT
                /// System.out.print("\u000C");
                System.out.println("\u001B[35m" + "YOU HAVE CHOOSEN JOINT ACCOUNT" + "\u001B[0m");
                System.out.println("\u001B[35m" + "ENTER NAME OF SPOUSE" + "\u001B[0m");
                spos = sc.nextLine();
                sc.nextLine();
                System.out.println("\u001B[35m" + "RELATION OF SPOUSE" + "\u001B[0m");
                rpos = sc.nextLine();
        System.out.println("\u001B[35m" + "ENTER AGE OF SPUSE" + "\u001B[0m");
                ages = sc.nextInt();
                sc.nextLine();
                System.out.println("\u001B[35m" + "PLEASE ENTER DEPOSIT DEPOSIT AMOUT" + "\u001B[0m");
                depo = sc.nextFloat();
                if (depo < 5000) {// IF CONDITION FOR MINIMUM AMOUNT
                    System.out.println("\u001B[35m" + "PLEASE DEPOSIT MINIMUM AMOUNT  5000" + "\u001B[0m");
                    System.exit(0);
                } // IF CONDITION FOR MINIMUM AMOUNTENDS
                break;
            } // CASE ENDS FOR JOINT ACCOUNT
            case 2: {// CASE FOR SAVINGS ACCOUNT
                System.out.println("\u001B[34m" + "YOU HAVE COOSEN SAVINGS  ACCOUNT" + "\u001B[0m");
                System.out.print("\u001B[34m" + "ENTER NAME OF NOMINEE" + "\u001B[0m");
                spos = sc.nextLine();
                sc.nextLine();
                System.out.print("\u001B[34m" + "RELATION OF" + "\u001B[0m");
                rpos = sc.nextLine();
                System.out.print("\u001B[34m" + "ENTER AGE OF NOMINEE" + "\u001B[0m");
                age = sc.nextInt();
                System.out.println("\u001B[34m" + "THE MINIMUM DEPOSIT AMOUT IS 2000" + "\u001B[0m");
                System.out.println("\u001B[34m" + "PLEASE ENTER DEPOSIT DEPOSIT AMOUT" + "\u001B[0m");
                depo = sc.nextFloat();
                if (depo < 2000) {// IF CONDITION FOR MINIMUM AMOUNT
                    System.out.println("\u001B[34m" + "PLEASE DEPOSIT MINIMUM AMOUNT  2000" + "\u001B[0m");
                    System.exit(0);
                } // IF CONDITION FOR MINIMUM AMOUNTENDS
                break;
            } // CASE ENDS FOR JOINT ACCOUNT
            case 3: {// CASE FOR CHILD ACCOUNT
                System.out.println("\u001B[33m" + "YOU HAVE COOSEN SAVINGS  ACCOUNT" + "\u001B[0m");
                System.out.print("\u001B[33m" + "ENTER NAME OF CHILD:-  " + "\u001B[0m");
                spos = sc.nextLine();
                sc.nextLine();
                System.out.print("\u001B[33m" + "FATHER NAME :-  " + "\u001B[0m");
                rpos = sc.nextLine();
                System.out.println("\u001B[33m" + "THE MINIMUM DEPOSIT AMOUT IS 1000" + "\u001B[0m");
                System.out.println("\u001B[33m" + "PLEASE ENTER DEPOSIT DEPOSIT AMOUT" + "\u001B[0m");
                depo = sc.nextFloat();
                if (depo < 1000) {// IF CONDITION FOR MINIMUM AMOUNT
                    System.out.println("\u001B[33m" + "PLEASE DEPOSIT MINIMUM AMOUNT 1000" + "\u001B[0m");
                    System.exit(0);
                } // IF CONDITION FOR MINIMUM AMOUNTENDS
                break;
            } // CASE ENDS FOR CHILD ACCOUNT
            default: {/// DEFAAULT FOR INVLID ACCOUNT SELECTION//////
                System.out.println("\u001B[33m" + "INVALID ACCOUNT SELECTION" + "\u001B[0m");
                break;
            }
        }// SWITHCH ENDS FOR ACCOUNTS
        System.out.println("\033[H\033[2J");
        System.out.println("\u001B[31m" + "ENTER PASSWORD" + "\u001B[0m");// TAKING INPUT PASSWORD
        Console con1 = System.console();
        char[] chars1 = con1.readPassword();
        rpassword = new String(chars1);
        if (rpassword.equals(password)) {// IF CONDITION FOR CHECING PASSWORD
            System.out.println("CORRECT PASSOWRD");
            System.out.println("ENTER 1 FOR DEPOSIT \nENTER 2 FOR WITHDRAWAL");
            dw = sc.nextInt();
            System.out.println("\033[H\033[2J");//COAMMAND FOR SCREEN CLEAR
            if (dw > 3 || dw < 0) {// IF CONDITION INVALID PROCESS NUMBER ENTERED
                System.out.println("INVALID PROCESS NUMBER ENTERED");
                System.exit(8);
            } // IF CONDITION INVALID PROCESS NUMBER ENTERED END
            switch (dw) {// SWITCH FOR WITHDRAWAL AND DEPOSIT
                case 1: {// CASE FOR DEPOSIT
                    System.out.println(
                            "ENTER 1 FOR JOIN ACCOUNT\nENTER 2 FOR SAVINGS ACCOUNT\nENTER 3 FOR CHILD ACCOUNT");
                    acnt1 = sc.nextInt();
                    System.out.println("\033[H\033[2J");//COAMMAND FOR SCREEN CLEAR
                    if (acnt1 != acnt) {// CHAECKING CONDITION FOR VALID ACCOUNT
                        System.out.println("YOU DON'T HAVE THIS TYPE OF ACCOUNT");
                        System.exit(0);
                    }
                    switch (acnt) {// SWITCH FOR ACCOUNT TYPE
                        case 1: {// CASE FOR JOINT ACCOUNT
                            System.out.println();
                            System.out.println("YOU SELECTED JOINT ACCOUNT");
                            System.out.println("ENTER AMOUNT FOR YOU WANT TO DEPOSIT");
                            depo1 = sc.nextFloat();
                            depo = depo + depo1;
                            System.out.println(depo);
                            break;
                        } // CASE FOR JOINT ACCOUNT ENDS
                        case 2: {// CASE FOR SAVINGS ACCOUNT
                            System.out.println();
                            System.out.println("YOU SELECTED SAVINGS ACCOUNT");
                            System.out.println("ENTER AMOUNT FOR YOU WANT TO DEPOSIT");
                            depo1 = sc.nextFloat();
                            depo = depo + depo1;
                            break;
                        } // CASE FOR SAVINGS ACCOUNT ENDS
                        case 3: {// CASE FOR CHILD ACCOUNT
                            System.out.println();
                            System.out.println("YOU SELECTED CHILD ACCOUNT");
                            System.out.println("ENTER AMOUNT FOR YOU WANT TO DEPOSIT");
                            depo1 = sc.nextFloat();
                            depo = depo + depo1;
                            break;
                        } // CASE FOR CHILD ACCOUNT ENDS
                        default: {// DEFALUT FOR INVALID ACCOUND NUMBER
                            System.out.println("ENTER A VIID ACCOUNT NUMBER");
                            break;
                        } // DEFALUT FOR INVALID ACCOUND NUMBER ENDS
                    }// SWITCH FOR ACCOUNT TYPE ENDS
                    break;
                } // CASE FOR DEPOSIT ENDS
                case 2: {// CASE FOR WITHDRAW
                    System.out.println("ENTER 1 FOR JOIN ACCOUNT\nENTER 2 FOR SAVINGS ACCOUNT\nENTER 3 FOR CHILD ACCOUNT");
                    acnt1 = sc.nextInt();
                    if (acnt1 != acnt) {// CHAECKING CONDITION FOR VALID ACCOUNT
                        System.out.println("YOU DON'T HAVE THIS TYPE OF ACCOUNT");
                        System.exit(0);
                    }
                    switch (acnt) {// SWITCH FOR ACCOUNT TYPE
                        case 1: {// CASE FOR JOINT ACCOUNT
                            System.out.println();
                            System.out.println("YOU SELECTED JOINT ACCOUNT");
                            System.out.println("ENTER AMOUNT FOR YOU WANT TO WITHDRAW");
                            depo1 = sc.nextFloat();
                            if (depo1 > depo) {// IF CONDITION FOR HIGHER AMOUND WITHDRAWAL
                                System.out.println("NO ENOUGHT BANK BALANCE");
                                System.exit(0);
                            } // IF CONDITION FOR HIGHER AMOUND WITHDRAWAL
                            depo = depo - depo1;
                            System.out.println(depo);
                            break;
                        } // CASE FOR JOINT ACCOUNT ENDS
                        case 2: {// CASE FOR SAVINGS ACCOUNT
                            System.out.println();
                            System.out.println("YOU SELECTED SAVINGS ACCOUNT");
                            System.out.println("ENTER AMOUNT FOR YOU WANT TO WITHDRAW");
                            depo1 = sc.nextFloat();
                            if (depo1 > depo) {// IF CONDITION FOR HIGHER AMOUND WITHDRAWAL
                                System.out.println("NO ENOUGHT BANK BALANCE");
                                System.exit(0);
                            } // IF CONDITION FOR HIGHER AMOUND WITHDRAWAL
                            depo = depo - depo1;
                            break;
                        } // CASE FOR SAVINGS ACCOUNT ENDS
                        case 3: {// CASE FOR CHILD ACCOUNT
                            System.out.println();
                            System.out.println("YOU SELECTED CHILD ACCOUNT");
                            System.out.println("ENTER AMOUNT FOR YOU WANT TO WITHDRAW");
                            depo1 = sc.nextFloat();
                            if (depo1 > depo) {// IF CONDITION FOR HIGHER AMOUND WITHDRAWAL
                                System.out.println("NO ENOUGHT BANK BALANCE");
                                System.exit(0);
                            } // IF CONDITION FOR HIGHER AMOUND WITHDRAWAL
                            depo = depo - depo1;
                            break;
                        } // CASE FOR CHILD ACCOUNT ENDS
                        default: {// DEFALUT FOR INVALID ACCOUND NUMBER
                            System.out.println("ENTER A VIlLD ACCOUNT NUMBER");
                            break;
                        } // DEFALUT FOR INVALID ACCOUND NUMBER ENDS
                    }// SWITCH FOR ACCOUNT TYPE ENDS
                    break;
                } // CASE FOR WITHDRAW ENDS
                default: {// DEFAULT FOR INVALID PROCESS NUMBER
                System.out.println("ENTER A VALID PROCESS NUMBER");
                    break;
                } // DEFAULT FOR INVALID PROCESS NUMBER ENDS
            }// SWITCH FOR WITHDRAWAL AND DEPOSIT ENDS
        } // IF ENDS CONDITION FOR CHECIKNG PASSWORD
        else {// ELSE FOR INVALID PASSWORD
            System.out.println("WRONG PASS");
            System.exit(0);
        } /// ELSE ENDS
        System.out.println("\033[H\033[2J");
        if (acnt == 1) {// IF CONDITION FOR JOINT ACCOUNT
            System.out.println(" YOUR ACCOUNT TYPE IS JOINT ACCOUNT");
            System.out.println("ACCOUNT HOLDER NAME IS " + name);
            if (dw == 1) {// IF CONDITION FOR DEPOSIT
                System.out.println("TRANSICTION PERFROMED IS DEPOSIT");
            } // IF CONDITION FOR DEPOSIT ENDS
            else {// IF CONDITION FOR WITHDRAW
                System.out.println("TRANSICTION PERFROMED IS WITHDRAW");
            } // IF CONDITION FOR WITHDRAW ENDS
            System.out.println("BANK BALANCE IS " + depo);
        } // IF CONDITION FOR JOINT ACCOUNT ENDS
        else if (acnt == 2) {// IF CONDITION FOR SAVINGS ACCOUNT
            System.out.println("YOUR ACCOUNT TYPE IS SAVINGS ACCOUNT");
            System.out.println("ACCOUNT HOLDER NAME IS " + name);
            if (dw == 1) {// IF CONDITION FOR DEPOSIT
                System.out.println("TRANSICTION PERFROMED IS DEPOSIT");
            } // IF CONDITION FOR DEPOSIT ENDS
            else {// IF CONDITION FOR WITHDRAW
                System.out.println("TRANSICTION PERFROMED IS WITHDRAW");
            } // IF CONDITION FOR WITHDRAW ENDS
            System.out.println("BANK BALANCE IS " + depo);
        } // IF CONDITION FOR SAVINGS ACCOUNT ENDS
        else if (acnt == 3) {// IF CONDITION FOR CHILD ACCOUNT
            System.out.println("YOUR ACCOUNT TYPE IS CHILD ACCOUNT");
            System.out.println("ACCOUNT HOLDER NAME IS " + name);
            if (dw == 1) {// IF CONDITION FOR DEPOSIR
                System.out.println("TRANSICTION PERFROMED IS DEPOSIT");
            } // IF CONDITION FOR DEPOSIT ENDS
            else {// IF CONDITION FOR WITHDRAW
                System.out.println("TRANSICTION PERFROMED IS WITHDRAW");
            } // IF CONDITION FOR WITHDRAW ENDS
            System.out.println("BANK BALANCE IS " + depo);
        } // IF CONDITION FOR CHILD ACCOUNT ENDS
        // RESETTING PASSWPRD
        System.out.println("DO YOU WANT TO DEACTIVATE YOUR ACCOUNT\nPRESSE 1 TO DEACTIVATE \nPRESS ANY OTHER KEY TO KEEP ACCOUTNT AS IT IS ");
        da = sc.nextInt();
        System.out.println("\033[H\033[2J");//COAMMAND FOR SCREEN CLEAR
        switch (da) {// SWITCH FOR RESETTING PASS
            case 1: {
                System.out.println("\u001B[31m" + "ENTER OLD PASSWORD" + "\u001B[0m");// TAKING OLD PASSWORD FOR CECKING
                Console con2 = System.console();
                char[] chars2 = con2.readPassword();
                rpassword = new String(chars2);
                if (rpassword.equals(password)) {// IF FOR CHECKING PASSWORD
                    System.out.println("\u001B[31m" + "ENTER YOUR NEW PASSWORD" + "\u001B[0m");// RESETING PASSWORD
                    Console con3 = System.console();
                    char[] chars3 = con2.readPassword();
                    password = new String(chars3);
                } // IF FOR CHECKING PASSWORD ENDS
                else {/// ELSE FOR INVALID PASSWORD PASSWORD
                    System.out.println("INVALID PASSWORD PLEASE ENTER CORRECT PASSWORD");
                } /// ELSE FOR INVALID PASSWORD PASSWORD ENDS
                break;
            } // CASE ENDS FOR RESETTIN PASSWORD
            default: {// DEFAULT FOR NOT CHEANGING PASSWORD
                System.out.println("PASSWORD IS NOT RESET");
                break;
            } // DEFAULT FOR NOT CHEANGING PASSWORD ENDS
        }// SWITCH FOR RESETTING PASS
        System.out.println("THIS IS YOUE NEW PASSWORD " + password);
    }
}
