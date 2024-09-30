/*4. Write a program to store transaction details of a customer in a file and counts how many times amount is Deposited and Withdrawed. */
import java.io.*;
import java.util.Scanner;

public class Prog4 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int DT = 0, CT = 0;
        File file = new File("C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Prog4.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        int t = 0;
        int pt;
        do {
            System.out.println("Do you want to perform transaction\nif yes press 1 otherwise press 0");
            pt = sc.nextInt();
            do {
                if(pt != 1){break;}
                System.out.println("Do you want to Deposit or Withdraw \npress 1 fot Deposit \npress 2 fo Withdraw \notherwise press 0 ");
                t = sc.nextInt();
            } while (t > 2 || t < 0);

            if (t == 1) {
                System.out.println("Enter Deposit amount ");
                int c = sc.nextInt();
                try (FileOutputStream fout = new FileOutputStream(file, true);) {
                    byte bt[] = ("Amount Deposited " + c + " \n").getBytes();
                    fout.write(bt);
                    System.out.println("Data inserted Successfully");
                } catch (IOException e) {
                    System.out.println("Exception : " + e);
                }
            } else if (t == 2) {
                System.out.println("Enter Withdraw amount ");
                int c = sc.nextInt();
                try (FileOutputStream fout = new FileOutputStream(file, true);) {
                    byte bt[] = ("Amount Withdrawed " + c + "\n").getBytes();
                    fout.write(bt);
                    System.out.println("Data inserted Successfully");
                } catch (IOException e) {
                    System.out.println("Exception : " + e);
                }
            }
        } while (pt == 1);
        System.out.println("Transaction process completed successfully");

        try (FileInputStream Fin = new FileInputStream(file)) {
            while (true) {
                int x = Fin.read();
                if (x == -1) {
                    break;
                }
                System.out.print((char) x);
                if ((char) x == 'D') {
                    CT++;
                }

                if ((char) x == 'W') {
                    DT++;
                }
            }
        } catch (Exception e) {
            System.out.println("Excepttion : " + e);
        }
        System.out.println("Number Of Deposit Transaction " + CT + "\nNumber Of Withdraw Transaction " + DT);
    }
}
