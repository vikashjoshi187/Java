/*  Create a class Distance with data members (feet and inch).Write a program showing the concept of passing object in a 
function and returning object from a function (add the data members of both the objects and find out the total feet and inches). */

import java.util.Scanner;
class Distance {
    int feet, inch, totalFeet, totalInches;
    Distance () {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Feet : ");
        feet = sc.nextInt();
        System.out.println("Enter Inch : ");
        inch = sc.nextInt(); 
    }
    Distance add(Distance obj1) {
        totalFeet = feet + obj1.feet;
        totalInches = inch + obj1.inch;

        return this;
    }
}

class Prog20 {
    public static void main(String args[]) {
        Distance obj = new Distance();
        Distance obj1 = new Distance();
        obj1 = obj.add(obj1);
        System.out.println("Total Feet : "+obj1.totalFeet);
        System.out.println("Total Inch : "+obj1.totalInches);
    }
}
