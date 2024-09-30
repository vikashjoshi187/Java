/*29. Create a Abstract class Volume with two data members(radius and height).
Declare two member function
a)getValue() :- which accepts value from user. 
b)showValue() :- which displays valus. 
c)calVol() :- which calculates volumes.
Create a class Cone which uses the above mentioned three methods to calculate the volume of Cone. Create a class Cylinder which uses the above mentioned three methods to calculate the volume of Cylinder.
 */
import java.util.Scanner;
abstract class Volume{
    float radius,height;
    Scanner sc = new Scanner(System.in);
    abstract void getValue();
    abstract void showValue();
    abstract void calcVol();
}
class Cone extends Volume{
    double cone;
    void getValue(){
         System.out.println("Enter radius and height of Cone");
         radius = sc.nextFloat();
         height = sc.nextFloat();
    }
    void showValue(){
        System.out.println("Radius of Cone : "+radius);
        System.out.println("Height of Cone : "+height);
    }
    void calcVol(){
        cone=(3.14*radius*radius*height)/3;
        System.out.println("Volume of Cone "+cone);
    }
}
class Cylinder extends Volume{
    double cylinder;
    void getValue(){
         System.out.println("Enter radius and height of Cylinder");
         radius = sc.nextFloat();
         height = sc.nextFloat();
    }
    void showValue(){
         System.out.println("Radius of Cylinder : "+radius);
         System.out.println("Height of Cylinder : "+height);
    }
    void calcVol(){
         cylinder = 3.14*radius*radius*height;
         System.out.println("Volume of Cylinder "+cylinder);
    }
}
class Abstract1{
    public static void main(String args[])
    {
       Volume vl = new Cone();
       vl.getValue();
       vl.showValue();
       vl.calcVol();
       Volume vl1 = new Cylinder();
       vl1.getValue();
       vl1.showValue();
       vl1.calcVol();
    }
}