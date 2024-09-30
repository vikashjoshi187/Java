/*  Create a class to Prog3 calculate with one data member to store the number and another to store factorial value. 
Create members function
1.init - to input number from user
2.fact - to calculate factorial
3.display- to display answer   */

import java.util.Scanner;
class Prog3 {
    int num;

    Prog3(int num) {
        this.num = num;
    }

    int fact() {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    void dispaly(int fact) {
        System.out.println("Fcatorial : " + fact);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        Prog3 obj = new Prog3(num);
        int fact = obj.fact();
        obj.dispaly(fact);
    }
}