class Demo1 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
            try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
            System.out.println("---> "+i);
        }
    }
}
class Demo2 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++){
              try{Thread.sleep(1000);}catch(InterruptedException e){System.out.println("Exception : "+e);}
            System.out.println("--------------> "+i);
        }
    }
}
public class ThreadDemo12
{
    public static void main(String[] args) {
        new Thread(new Demo1()).start();
        new Thread(new Demo2()).start();
    }
}
