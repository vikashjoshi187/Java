/* 45) Create a program that helps banks to maintain records. It should have following facilities.
o Anybody can create current or saving account with following initial information:account number, name, balance, and branch.
o display account detail for a particular accounts.
o display total money deposited in bank.
o allow deposit and withdrawal in an account .
o for saving account opening balance and minimum balance must be 5000.
o for current account opening balance and minimum balance must be 1000.
o can not withdraw the amount from the account that makes balance less than the minimum balance. */

import java.util.Scanner;
class Bank {
    static int accont = 1;
    static Scanner sc = new Scanner(System.in);
    String name, branch;
    int accNo, balance;

    void getDetails(int minimum_balance) {
        sc.nextLine();
        accNo = accont++;
        System.out.println("Enter Branch Name -> ");
        branch = sc.nextLine();
        System.out.println("Enter Name -> ");
        name = sc.nextLine();
        System.out.println("Enter Balance -> ");
        do {
            balance = sc.nextInt();
            if (balance < minimum_balance)
                System.out
                        .println("Your Deposit Money Must Be Greater Than Minimum Balance (" + minimum_balance + ").");
        } while (balance < minimum_balance);
        display();
    }

    void display() {
        System.out.println("\n --Account Details -- ");
        System.out.println("Account Number : " + accNo);
        System.out.println("Branch : " + branch);
        System.out.println("Name : " + name);
        System.out.println("Balance : " + balance);
    }

    void deposit() {
        System.out.println("Enter Deposit Amount : ");
        int deposit;
        do {
            deposit = sc.nextInt();
            if (deposit < 0)
                System.out.println("Invalid Deposit.. Re-Enter Deposit Amount.");
        } while (deposit < 0);
        balance += deposit;
    }

    void withdraw() {
        System.out.println("Enter Withdrawl Amount : ");
        int withdraw;
        do {
            withdraw = sc.nextInt();
            if (withdraw > balance || withdraw < 0)
                System.out.println("Not Enough Money in your Account.. \nPlease Re-Enter Withdrw Amount.");
        } while (withdraw > balance || withdraw < 0);
        balance -= withdraw;
    }

    int savingAccount() {
        System.out.println("For Saving Account \nMinimum Balance Must be 5000");
        getDetails(5000);
        return accNo;
    }

    int currentAccount() {
        System.out.println("For Current Account \nMinimum Balance Must be 1000");
        getDetails(1000);
        return accNo;
    }
}

class Person extends Bank {
    static int account = 0;

    public static void main(String[] args) {
        Bank arr[] = new Bank[100];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Bank();
        }
        int newAcc = 1;
        do {
            if (newAcc == 1) {
                System.out.println("Please Select Account : \n1 for Saving Account\t2 for Current Account");
                int acc = sc.nextInt();
                switch (acc) {
                    case 1:
                        account = arr[count++].savingAccount();
                        break;
                    case 2:
                        account = arr[count++].currentAccount();
                        break;
                    default:
                        System.out.println("Invalid Selection..");
                }
            } else {
                int Account;
                System.out.println("Enter Account Number : ");
                do {
                    Account = sc.nextInt();
                    if (Account > account || Account <= 0)
                        System.out.println("Invalid Account Number.. Please Re-Enter.");
                } while (Account > account || Account <= 0);
                System.out.println("Enter 1 for Details \t 2 for deposit \t 3 for withdraw");
                int acc = sc.nextInt();
                switch (acc) {
                    case 1:
                        arr[Account - 1].display();
                        break;
                    case 2:
                        arr[Account - 1].deposit();
                        break;
                    case 3:
                        arr[Account - 1].withdraw();
                        break;
                    default:
                        System.out.println("Invalid Selection..");
                }
            }
            System.out.println("\nEnter 1 For New Account \nEnter 2 For Existing Account");
            newAcc = sc.nextInt();
        } while (newAcc == 1 || newAcc == 2);
    }
}
