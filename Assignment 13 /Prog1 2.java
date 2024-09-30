/*   Write a program that lets the user perform arithmetic operations on two numbers. Your program must be menu driven, allowing the 
 user to select the operation (+, -, *, or /) and input the numbers. Furthermore, your program must consist of following functions:
a). Function showChoice: This function shows the options to the user and explains how to enter data.
b). Function add: This function accepts two number as arguments and returns sum.
c). Function subtract: This function accepts two number as arguments and returns their difference. 
d). Function mulitiply: This function accepts two number as arguments and returns product.
e). Function divide: This function accepts two number as arguments and returns quotient.     */

import java.util.Scanner;
class Prog1 {
    Scanner sc = new Scanner(System.in);
    int a, b, result;

    Prog1() {
        System.out.println("Enter valur of a and b");
        a = sc.nextInt();
        b = sc.nextInt();
    }

    int add() {
        result = a + b;
        return result;
    }

    int subtract() {
        result = a - b;
        return result;
    }

    int mulitiply() {
        result = a * b;
        return result;
    }

    int divide() {
        result = a / b;
        return result;
    }

    void showChoice() {
        System.out.println("Enter  + , - , * , / , : ");
        char opration = sc.next().charAt(0);
        switch (opration) {
            case '+': {
                int x = add();
                System.out.println("value of a+b is :" + x);
                break;
            }
            case '-': {
                int x = subtract();
                System.out.println("value of a-b is :" + x);
                break;
            }
            case '*': {
                int x = mulitiply();
                System.out.println("value of a*b is :" + x);
                break;
            }
            case '/': {
                int x = divide();
                System.out.println("value of a/b is :" + x);
                break;
            }
            default: {
                System.out.println("Invalid opration");
                break;
            }
        }

    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Prog1 obj = new Prog1();
        obj.showChoice();
    }
}