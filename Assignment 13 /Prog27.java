/* 27. Create a class Shape with one member function
 a) double calcArea()
    Create a class Rectangle with two data members (length and breadth) and inherits Shape and calculate the area
    Create a class Circle with one data members (radius) and inherits Shape and calculate the area  */

import java.util.Scanner;
class Shape {
    double area;

    double calcArea(int r) {
        return area;
    }
}

class Rectangl extends Shape {
    int length, breadth;

    double calcArea() {
        area = length * breadth;
        return area;
    }

    void getDetails(int l, int b) {
        length = l;
        breadth = b;
        System.out.println("Area of rectangle is " + calcArea());
    }
}

class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;

    }

    double calcArea() {
        area = Math.PI * (radius * radius);
        return area;
    }
}

class Prog27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circlr");
        double r = sc.nextDouble();
        Circle cobj = new Circle(r);
        System.out.println("Area of circle is " + cobj.calcArea());
        System.out.println("enter length and breadth of the Rectangle");
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        Rectangl robj = new Rectangl();
        robj.getDetails(length, breadth);
    }
}