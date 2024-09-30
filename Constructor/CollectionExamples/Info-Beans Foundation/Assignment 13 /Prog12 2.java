/*  Create a Class Calculate with two data members(num,num1)Declare two member function.
a) create parameterized constructor which takes two integer value and	initialize members with this pointer.
b)sum() :- which displays the number using this */

import java.util.Scanner;
class Calculate {
    int num, num1;

    Calculate(int num, int num1) {
        this.num = num;
        this.num1 = num1;
    }

    void sum() {
        int sum = num + num1;
        System.out.println("Sum is : " + sum);
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num : ");
        int num = sc.nextInt();
        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();
        Calculate obj = new Calculate(num, num1);
        obj.sum();
    }
}