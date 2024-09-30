/*Create a class Box with data members (boxlabel, length , width, height) and function that calculate and return volume 
of that box. Now create a function comapre that take an object of Box class as parameters and show boxlabel of object 
who’s volume is greater? you need to create two object of Box class to compare */

import java.util.Scanner;
class Box
{
    double boxlable,length,width,height;
    void getDetail()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lennght : ");
        length = sc.nextInt();

        System.out.println("Enter widht : ");
        width = sc.nextInt();

        System.out.println("Enter height : ");
        height = sc.nextInt();
    }
    double calculate()
    {
        boxlable = length*width*height;
        return boxlable;      
    }
    void show()
    {
        System.out.println("Lenght : "+length);
        System.out.println("widht : "+width);
        System.out.println("Height : "+height);
        System.out.println("Boxlable : "+boxlable);
    }
    void gretervoulme(Box b[])
    {
       double volume = b[0].boxlable;
       for(int i=0;i<b.length;i++)
       {
            if(volume<=b[i].boxlable)
            {
                volume = b[i].boxlable;
            }
       } 
       System.out.println("\nHighest volume : "+volume);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter box number : ");
        int box = sc.nextInt();
        Box b [] = new Box[box];

        for(int i =0;i<b.length;i++)
        {
            b[i] = new Box();
            b[i].getDetail();
        }
        for(Box poj : b)
        {
            poj.calculate();
            poj.show();
        }
        Box  obj = new Box();
        
        obj.gretervoulme(b);
   sc.close(); }
}