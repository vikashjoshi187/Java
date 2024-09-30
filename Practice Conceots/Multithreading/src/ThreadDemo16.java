// program showing the concept of static synchronization
/*
shared resources : 
     [ Andrew ]
     [ Mathew]
     [ Simon ]
*/
class First2{
    /*shared resources*/
    synchronized static void display(String name){
        System.out.print(" [ ");
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(name);
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.println(" ] ");        
    }
    
    void show(){
        System.out.println("show method called");
    }
}
class Second2 extends Thread{
    String name;
    public Second2(String name) {
        this.name=name;
        start();
    }
    @Override
    public void run(){
            First2.display(name);   
    }
}
public class ThreadDemo16
{
    public static void main(String[] args) {
        Second2 s1 = new Second2("Andrew");
        Second2 s2 = new Second2("Mathew");
        Second2 s3 = new Second2("Simon");        
        First2.display("Jackson");
        First2 obj = new First2();
        obj.show();
    }
}


