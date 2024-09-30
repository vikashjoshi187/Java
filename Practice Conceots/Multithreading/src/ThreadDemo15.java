// program showing the concept of synchronized method
/*
shared resources : 
     [ Andrew ]
     [ Mathew]
     [ Simon ]
*/
class First1{
    /*shared resources*/
    synchronized void display(String name){
        System.out.print(" [ ");
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(name);
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.println(" ] ");        
    }
}
class Second1 extends Thread{
    First1 fobj;
    String name;
    public Second1(First1 fobj,String name) {
        this.fobj=fobj;
        this.name=name;
        start();
    }
    @Override
    public  void run(){
            fobj.display(name);   
   }
}
public class ThreadDemo15
{
    public static void main(String[] args) {
        First1 fobj = new First1();
        Second1 s1 = new Second1(fobj,"Andrew");
        Second1 s2 = new Second1(fobj,"Mathew");
        Second1 s3 = new Second1(fobj,"Simon");        
    }
}


