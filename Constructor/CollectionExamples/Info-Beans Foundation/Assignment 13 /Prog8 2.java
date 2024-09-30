/*Write a program to calculate the area of a rectangle, which accepts value from the user and displays it. 
  Use Constructor to initialize member */

import java.util.Scanner;
class rectangle
{
    double lenght;
    double widht;
   rectangle(double length, double width) 
   {
        this.lenght = length;
        this.widht = width;
    }
    double area()
    {
        double area = lenght*widht;
        return area;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lenght of rectangle : ");
        double lenght = sc.nextInt();
        System.out.println("Enter widht of rectangle : ");
        double widht = sc.nextInt();
        rectangle obj = new rectangle(lenght,widht);
       System.out.println("area of rectangle is  : "+ obj.area());
    }
}