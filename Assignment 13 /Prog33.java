//33. Create a class MathOperation containing method ‘multiply’ to calculate
// multiply of following arguments.
// a. two integers
// b. three float
// c. all elements of array
// d. one double and one integer


import java.util.Scanner;
 class MathOperation {
    void multiply(int a,int b){
        System.out.println("The multiply  Of  Integer value -> a and b : "+(a*b));

    }
    void multiply(float c,float d,float e){
        System.out.println("The multiply  Of  Float value -> c,d,e : "+(c*d*e));

    }
    void multiply(int []array,int size){
        System.out.println("The multiply  Of  All Elements are");
        int multiply=1;
        for(int i=0;i<size;i++){
            multiply= multiply*array[i];
          }
          System.out.println("multiply of elemnts are :"+multiply);      

         }
    void multiply(double f,int g){
        System.out.println("The multiply  Of  Integer value -> a and b : "+(f*g));

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of two variable a and b in integer :");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("enter the value of three variable c,d and e in float :");
        float c = sc.nextFloat();
        float d = sc.nextFloat();
        float e = sc.nextFloat();
        System.out.println("enter the size of array :");
        int size = sc.nextInt();
        System.out.println("enter the value of array :");
        int array []= new int[size];
        for(int i=0;i<size;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("enter the two value one in double and second in integer :");
        double f= sc.nextDouble();
        int g = sc.nextInt();
        MathOperation obj = new MathOperation();
        obj.multiply(a,b);
        obj.multiply(c,d,e);
        obj.multiply(array,size);
        obj.multiply(f,g);
    }
    
}