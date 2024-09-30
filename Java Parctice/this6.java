 class A {
    
    A returnObj(B bObj){

        return this;

    }
    void display(){
        System.out.println("Sexy");
    }


    
}


class B{


    public static void main(String[] args) {

        A obj=new A();
       A Dobj = obj.returnObj(new B());

      Dobj.display();q

        
    }
}
