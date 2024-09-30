/*  Create a class to calculate addition of two numbers (data member) using following member functions. Create members function
1.init - to input numbers from user
2.add - to calculate and display result   */

import java.util.Scanner;
class Prog2 {
    int a, b;

    void getNumber(){
        System.out.println("Enter two number : ");
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        add();
    }
    void add () {
        int sum = a + b;
        System.out.println("Sum is : " + sum);
    }

    public static void main(String args[]) {
        Prog2 obj = new Prog2();
        obj.getNumber();
    }
}
