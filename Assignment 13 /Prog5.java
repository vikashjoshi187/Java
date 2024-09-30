/*  Write a program to Define a class TEST in java with following description: Private Members
TestCode of type integer 
Description of type string
Candidates of type integer (total candidates appearing) 
CenterReqd (number of centers required) of type integer

A member function calcCenter() to calculate and return the number of centers.(Students per center is not more than 50).

Public Members
-A function schedule() to allow user to enter values for TestCode, Description, Candidates & call function calcCenter() to calculate the number of Centres
-A function displayTest() to allow user to view the content of of a Test */

import java.util.Scanner;
class Test {
    private int testCode;
    private String description;
    private int candidates;
    private int centerReqd;

    public void schedule() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Test code : ");
        testCode = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Descriptions : ");
        description = sc.nextLine();

        System.out.println("Enter Candidates");
        candidates = sc.nextInt();
        centerReqd = calcCenter();
    }

    public void displayTest() {
        System.out.println("* * T E S T   I N F O R M A T I O N * * ");
        System.out.println("\nTest Code : " + testCode);
        System.out.println("\nTest Description : " + description);
        System.out.println("\nTotal Candidates  : " + candidates);
        System.out.println("\nNumber of Centers Required : " + centerReqd);
    }

    private int calcCenter() {
        return (candidates + 49) / 50;
    }

    public static void main(String args[]) {
        Test obj = new Test();
        obj.schedule();
        obj.displayTest();
    }
}