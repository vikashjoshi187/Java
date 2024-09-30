// program showing the concept of synchronized block
/* 
shared resources : 
     [ Andrew ]
     [ Mathew]
     [ Simon ]
*/
class First{
    /*shared resources*/
    void display(String name){
      //  System.out.println("inside display : "+Thread.currentThread().getName());
        System.out.print(" [ ");
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.print(name);
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
        System.out.println(" ] ");        
    }
}
class Second extends Thread{
    First fobj;
    String name;
    public Second(First fobj,String name) {
        this.fobj=fobj;
        this.name=name;
        start();
    }
    @Override
    public void run(){
     //   System.out.println("Statement executes....");

        // once any thread gets a lock, all other threads goes in waiting state
        synchronized(fobj)
        {
      //      System.out.println("inside block : "+Thread.currentThread().getName());
            fobj.display(name);
        }
    //    System.out.println("outside block...."+Thread.currentThread().getName());        
   }
}
public class ThreadDemo14
{
    public static void main(String[] args) {
        First fobj = new First();
        Second s1 = new Second(fobj,"Andrew");
       Second s2 = new Second(fobj,"Mathew");
        Second s3 = new Second(fobj,"Simon");        
    }
}


