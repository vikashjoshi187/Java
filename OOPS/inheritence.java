/**
 * Program to show thw cpncep of inheritence Innerinheritence
 */
class Shape {
    String color;
}
class triangle extends Shape {//This class will inherit the properties and method 
                              //of Shape class 
                              //with the help of extends key word  

}

/**
 * inheritence
 */
public class inheritence {

    public static void main(String[] args) {
        triangle t1 = new triangle();

        t1.color = "red";
    }

}