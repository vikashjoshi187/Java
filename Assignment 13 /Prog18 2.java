/*  18.Create a class Max with one data member(v) and functions
a)getV(): which is use to read variable value
b)display() : to display value
c)check() : which return an object of Max class and find maximum value using one objects as argument.
(use this keyword to return an object).   */

import java.util.Scanner;
class Max {
    int v;

    void getV() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int v = sc.nextInt();
        this.v = v;
    }

    int check(Max obj2) {
        if (v > obj2.v) {
            return v;
        } else {
            return obj2.v;
        }
    }

    void Display(int a) {
        System.out.println("The value of v is " + a);
    }

    public static void main(String[] args) {

        Max obj = new Max();
        Max obj1 = new Max();

        obj.getV();
        obj1.getV();

        int ca = obj.check(obj);
        obj.Display(ca);
    }
}