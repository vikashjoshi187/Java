/* 6.Create a class account with data members (accno, name, balance). Create function members
   a)getdata() to accept member data from user
   b)deposit(float money) to deposit money in account
   c)withdraw(float money) to withdraw money from account 
   d)display() to show account info   */
  
import java.io.*;
import java.util.Scanner;

class Account {
  int accno;
  String name;
  float blc;
  int age;
  char[] pasword;

  static int count = 0;

  void get_Data() {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter account number of user " + (count + 1));
    accno = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter Name of user " + (count + 1));
    name = sc.nextLine();
    Console cons = System.console(); // console mask password
    pasword = cons.readPassword("\u001B[36menter password");
    String s = new String(pasword);
    System.out.println("\u001B[36m enter your age");
    age = sc.nextInt();
  }

  void display() {
    System.out.println("Account number: " + accno);
    System.out.println("Name : " + name);
    System.out.println("Age : " + age);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    Account obj = new Account();
    Account user[] = new Account[6];
    System.out.println("enter users details");
    int choice = 0;
    choice = 0;
    for (int i = 0; i < user.length; i++) {
      do {
        user[i] = new Account();
        user[i].get_Data();
        System.out.println("value i " + i);
        count++;
        System.out.println("1 for continue 2 for exit");
        choice = sc.nextInt();
        break;
      } while (choice == 1);

    }
    System.out.println("count value" + count);
    System.out.println(" user's details ");
    for (int i = 0; i < count; i++) {
      user[i].display();
    }
  }
}