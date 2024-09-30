/**
 * Program to show thw concept  of Hierarchical inheritence 
 */
class Shape {
    public void area(){
       System.out.println("It displays area  ");

    }
}
class triangle extends Shape {//This class will inherit the properties and method 
                         //of Shape class with the help of extends key word 
    public void area(int l,int b){
       System.out.println(1/2*b*l);
    }                      

}

class circle extends Shape {//This circle class will inherit the properties and method 
                            //of Shape class with the help of extends key word 
public void area(int r){
System.out.println((3.14)*r*r);
}                      

}

/**
* inheritence
*/
public class Hierarchical_Inherit {

public static void main(String[] args) {
   triangle t1 = new triangle();


}

}

