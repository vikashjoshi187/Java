import java.lang.Math;

public class area_trngl_10 {
    public static void main(String args[]){
       double A,a=55,b=66,c=77,s;
       s=(a+b+c)/2;
       A= Math.sqrt(s*(s-a)*(s-b)*(s-c));
       System.out.print("the area of trianglr is "+A);
    }
}
