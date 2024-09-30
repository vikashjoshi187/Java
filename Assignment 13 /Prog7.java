/*  7.Store six user’s account information using class created in above problem and calculate
   -total money deposited in all accounts
   -list all account number with balance greater than 1000 */

import java.util.Scanner;
class Prog7 {
  int accno;
  String name;
  double blc;
  double amt, with;
  int age;
  static double totaldep;
  static int count = 0;

  void get_Data() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter account number of user " + (count + 1));
    accno = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Name of user " + (count + 1));
    name = sc.nextLine();
    System.out.println("\u001B[36m enter your age");
    age = sc.nextInt();
  }

  float deposit() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter amount to deposit");
    float amt = sc.nextFloat();
    totaldep += amt;
    blc = amt;
    return amt;
  }

  float withdrawl() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter amount to withdrawl");
    float with = sc.nextFloat();
    do {
      if (with < amt && with > 0) {
        blc = blc - with;
      } else
        System.out.println("enter valid amount to withdraw");
    } while (with > amt && with < 0);
    return with;
  }

  void display() {
    System.out.println("Account number: " + accno);
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
    System.out.println("deposited amount: " + amt);
    System.out.println("withdrawl amount: " + with);
    System.out.println("total balance: " + blc);
  }

  void blc1000(Prog7 user[]) {
    System.out.println("account with Greater than 1000 blc");
    for (int i = 0; i < user.length; i++) {
      if (user[i].blc > 1000) {
        System.out.println("Account number is " + user[i].accno);
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Prog7 obj = new Prog7();
    Prog7 user[] = new Prog7[6];
    System.out.println("enter users details");
    for (int i = 0; i < user.length; i++) {
      user[i] = new Prog7();
      user[i].get_Data();
      count++;
    }
    int opC;
    do {
      System.out.println("Press 1-->deposit\nPress 2-->withdrawl\npress 3-->account Details");
      opC = sc.nextInt();
      switch (opC) {
        case 1:
          for (int i = 0; i < count; i++) {
            user[i].amt = user[i].deposit();
          }
          break;
        case 2:
          for (int i = 0; i < count; i++) {
            user[i].with = user[i].withdrawl();
          }
          break;
        case 3:
          System.out.println(" user's details ");
          System.out.println("for acount details enter your account number");
          int act_n = sc.nextInt();
          for (int i = 0; i < count; i++) {
            if (act_n == user[i].accno)
              user[i].display();
            else
              System.out.println("enter a valid account number");
          }
          break;
        default:
          System.out.println("Please Enter a valid option");
      }
    } while (opC < 1 && opC > 3);
    System.out.println("total deposited amount in all account" + totaldep);
    obj.blc1000(user);
  }
}
