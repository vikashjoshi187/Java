



/**
 * Program to show thw concept  of multi level  inheritence 
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

class equi_triangle extends triangle {//This equi_traingle class will inherit the properties and method 
                                     //of triangle class with the help of extends key word 
public void area(int l,int b){
System.out.println(1/2*b*l);
}                      

}

/**
* inheritence
*/
public class multi_inherit {

public static void main(String[] args) {
   triangle t1 = new triangle();


}

}
