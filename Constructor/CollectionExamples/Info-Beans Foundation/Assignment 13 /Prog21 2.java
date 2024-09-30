/*Create a class Alpha and Beta. Both classes contain one data member of type integer. Write a program to find which 
  class data member is greater */

import java.util.Scanner;
class Alpha {
    int a;

    int alpha(int a) {
        this.a = a;
        return a;
    }
}

class Beta {
    int b;

    int beta(int b) {
        this.b = b;
        return b;
    }

    void comapre(int ap, int bp) {
        if (ap > bp) {
            System.out.println("Alpha Data memenber is Greater : ");
        } else if (bp > ap) {
            System.out.println("Beta Data member is Greater : ");
        } else {
            System.out.println("Both are equal : ");
        }
    }
}

class classes {
    public static void main(String arga[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alpha data meber a : ");
        int a = sc.nextInt();
        System.out.println("Enetr beta data member b : ");
        int b = sc.nextInt();
        Alpha A = new Alpha();
        int ap = A.alpha(a);
        Beta B = new Beta();
        int bp = B.beta(b);
        B.comapre(ap, bp);
    }
}