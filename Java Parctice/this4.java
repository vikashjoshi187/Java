/**
 * this4
 */
 class A {

    void draw(A obj){
        System.out.println("Constructor Called"); 
    }

    void display(){
        this.draw(this);
    }

    public static void main(String[] args) {
        
        A obj=new A();
        obj.display();
    }
}