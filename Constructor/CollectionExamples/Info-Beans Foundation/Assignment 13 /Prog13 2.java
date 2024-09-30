/* 13.Create class Plot with data members length and breadth. Create constructor. Create member functions
a)float calcArea()->to return area of plot
b)Plot compare(Plot p)-> which takes Object of Plot class as argument and return 0 if area of argument object is same as current
 object, 1 if current object area is > then argument object and -1 if area of argument object is > then current object.  */

import java.util.Scanner;
class Plot {
    int length, breadth;
    Plot() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length : ");
        length = sc.nextInt();
        System.out.println("Enter Breadth : ");
        breadth = sc.nextInt();
    }
    float calcArea() {
        return length*breadth;
    }
    int compare(Plot obj1) {
        float area1 = calcArea();
        float area2 = obj1.calcArea();
        System.out.println("Area 1 : "+area1);
        System.out.println("Area 2 : "+area2);
        if (area1 == area2) {
            return 0;
        } else if (area1 > area2) {
            return 1;
        } else {
            return -1;
        }
    }
}
class Prog13 {
    public static void main(String args[]) {
        Plot obj = new Plot();
        Plot obj1 = new Plot();
        int result = obj.compare(obj1);

        if (result == 0) {
            System.out.println("Both Area Are Same.");
        } else if (result == 1) {
            System.out.println("Area1 is Greater than Area2.");
        } else {
            System.out.println("Area2 is Greater than Area1.");
        }
    }
}