class Demo11 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
            System.out.println("---> "+i);
        }
    }
}
class Demo22 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
              try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
            System.out.println("--------------> "+i);
        }
    }
}
public class ThreadDemo13
{
    public static void main(String[] args) {
        Thread th1 = new Thread(new Demo11());
        Thread th2 = new Thread(new Demo22());
      
        th1.start();
//          try{th1.join();}catch(InterruptedException e){System.out.println("Exception : "+e);}        
         try{Thread.sleep(5000);}catch(InterruptedException e){System.out.println("Exception : "+e);}        
        th2.start();
        System.out.println("STATEMENT EXECUTES");
    }
}
