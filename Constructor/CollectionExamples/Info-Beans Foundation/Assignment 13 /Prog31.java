/*31.Create a class to calculate Area of circle with one data member to store the radius and another to store area value. Create method members
1. init - to input radius from user
2. calc - to calculate area
3. display- to display area */
import java.util.Scanner;
class calculate
{
    float area;
    int radius;
    void Inti()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius : ");
        radius = sc.nextInt();
    }
    void calc()
    {
        area = (float)Math.PI * (radius*radius);
    }
    void display()
    {
        System.out.println("Area of circle is : "+area);
    }
    public static void main(String args[])
    {
        calculate obj = new calculate();
        obj.Inti();
        obj.calc();
        obj.display();
    }
}
