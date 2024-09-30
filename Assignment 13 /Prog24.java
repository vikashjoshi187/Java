/* Create a class Rectangle with two protected data members (length and breadth).Declare a Constructor which accepts 
 length and breadth of a Rectangle.
Create another class Area which calculates the area of a Rectangle
Create another class Perimeter which calculates the perimeter of a Rectangle  */

import java.util.Scanner;
class Rectangle {
    protected double lenght;
    protected double widht;

    Rectangle(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }
}

class Area extends Rectangle {

    Area(double lenght, double widht) {
        super(lenght, widht);
    }

    double calculatesArea() {
        return lenght * widht;
    }
}

class perimeter extends Area {
    perimeter(double lenght, double widht) {
        super(lenght, widht);
    }

    double calculatesPeramiter() {
        return 2 * (lenght + widht);
    }
}

class calculate {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght : ");
        double lenght = sc.nextDouble();
        System.out.println("Enter widht : ");
        double widht = sc.nextDouble();
        perimeter obj = new perimeter(lenght, widht);
        System.out.println("Area of rectangle : " + obj.calculatesArea());
        System.out.println("Peramiter of rectangle : " + obj.calculatesPeramiter());
    }
}