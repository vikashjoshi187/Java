 class A {
    
    A(){
        this(5);

    }

    A(int x){
        this(12,23);
        System.out.println("X is"+x);
    }

    A(int x,int y){
                System.out.println("X is "+x+" Y is "+y);

    }
  public static void main(String[] args) {
       new A(); 
   
   
    }
    
}
