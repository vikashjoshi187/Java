/*32.Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
● init - to input X and Y from user
● add - to add X and Y and store in R
● multiply - to multiply X and Y and store in R
● power - to calculate X Y and store in R
● display- to display Result R */

import java.util.Scanner;
class MathOperation
{
    double x,y,r;
    void Inti()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter x and y value : ");
        x = sc.nextInt();
        y = sc.nextInt();
    }
    double add()
    {
        r = x+y;
        return r;
    }
    double multiply()
    {
        r = x*y;
        return r;
    }
    double power()
    {
        r = Math.pow(x,y);
        return r;
    }
    void display(double add,double multipaly,double power)
    {
        System.out.println("Add X and Y : "+add);
        System.out.println("multipaly X and Y : "+multipaly);
        System.out.println("Power X and Y : "+power);
    }
    public static void main(String[] args) 
    {
        MathOperation obj = new MathOperation();
        obj.Inti();
        double add = obj.add();   
        double multiply = obj.multiply();
        double power = obj.power(); 
        obj.display(add,multiply,power);
    }
}