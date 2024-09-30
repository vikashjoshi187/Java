/* 28.Create a class BankAccount with one data member(balance).Declare four methods
a)BankAccount() :- which initialize the data member with 0. 
b)void deposit(double amount) :- which adds balance in amount.
c)void withdraw(double amount) :- which deducts balance in amount.
d)double getBalance() :- which returns the balance.
Create a class SavingAccount with two data members(interest_rate and min_balance).
* Declare a member function
a)setInterestRate() :- which sets the interest and use the above methods to calculate the account balance.  */

import java.util.Scanner;
class BankAccount {
    static Scanner sc = new Scanner(System.in);
    static double balance;

    BankAccount() {
        balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount)
            balance -= amount;
        else {
            System.out.println("Insufficient Balance");
            System.exit(0);
        }
    }

    double getBalance() {
        return balance;
    }
}

class SavingAccount extends BankAccount {
    double interest_rate, min_balance, balance;
    SavingAccount(double interest_rate, double min_balance, double balance) {
        this.interest_rate = interest_rate;
        this.min_balance = min_balance;
        this.balance = balance;
    }

    void setInterestRate() {
        System.out.println(balance);
        double interest = balance + (balance * (interest_rate / 100));
        System.out.println("Amount After Interest -> "+interest);
        if (balance < min_balance) {
            System.out.println("Minimum Balance not Maintained");
        }
    }
}

class Prog28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount obj = new BankAccount();
        System.out.println("Enter Current Balance :- ");
        double balance1 = sc.nextFloat();
        obj.deposit(balance1);
        
        System.out.println("Enter Deposit Money :- ");
        float deposit = sc.nextFloat();
        obj.deposit(deposit);

        System.out.println("Enter Withdrawl Money :- ");
        float withdraw = sc.nextFloat();
        obj.withdraw(withdraw);
        
        double balance = obj.getBalance();
        System.out.println("Enter Interest Rate :- ");
        double rate = sc.nextDouble();
        System.out.println("Minimum Balance :- ");
        double min_balance = sc.nextDouble();
        SavingAccount obj1 = new SavingAccount(rate, min_balance, balance);
        obj1.setInterestRate();
    }
}