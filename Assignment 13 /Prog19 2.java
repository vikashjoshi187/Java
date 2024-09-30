/*  Create a class Distance with data members (feet and inch).Write a program showing the concept of passing object 
in a function and add the data members of both the objects and find out the total feet and inches. */

import java.util.Scanner;
class Distance {
    int feet, inch;
    Distance () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Feet : ");
        feet = sc.nextInt();
        System.out.println("Enter Inch : ");
        inch = sc.nextInt(); 
    }
    void add(Distance obj1) {
        int totalFeet = feet + obj1.feet;
        int totalInches = inch + obj1.inch;

        System.out.println("Total Feet : "+totalFeet);
        System.out.println("Total Inch : "+totalInches);
    }
}

class Prog19 {
    public static void main(String args[]) {
        Distance obj = new Distance();
        Distance obj1 = new Distance();
        obj.add(obj1);
    }
}