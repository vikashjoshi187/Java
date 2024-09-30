/* Create a Class Number with two member function.
a)showNum() :- which displays the first number using this
b)dispNum() :- which displays the second number using this */

import java.util.Scanner;
class Number 
{
    int num,num1;
    Number(int num,int num1)
    {
        this.num=num;
        this.num1=num1;
    }
    void showNum()
    {
        System.out.println("first num  is :  "+num);   
    }
    void dispNum()
    {
        System.out.println("second number is : "+num1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number : ");
        int num = sc.nextInt();
        System.out.println("Enter Second number : ");
        int num1 = sc.nextInt();
        Number obj = new Number(num,num1);
        obj.showNum();
        obj.dispNum();
    }
}