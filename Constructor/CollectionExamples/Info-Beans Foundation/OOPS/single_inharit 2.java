
/**
 * Program to show thw concept  of single level  inheritence 
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

/**
 * inheritence
 */
public class single_inharit {

    public static void main(String[] args) {
        triangle t1 = new triangle();


    }

}
