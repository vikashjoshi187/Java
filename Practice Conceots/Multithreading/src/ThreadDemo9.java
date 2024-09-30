public class ThreadDemo9 extends Thread
{
    public void run(){
//        try{
//            Thread.sleep(2000);
//        }catch(InterruptedException e){}
        System.out.println("Name : "+Thread.currentThread().getName());
    }
    public static void main(String[] args) {
        
        ThreadGroup obj = new ThreadGroup("MyGroup");
        ThreadDemo9 myobj = new ThreadDemo9();
       
        Thread th1 = new Thread(obj,myobj, "ThreadName 1");
       th1.start();
        Thread th2 = new Thread(obj,myobj, "ThreadName 2");
        th2.start();
        Thread th3 = new Thread(obj,myobj, "ThreadName 3");
        obj.list();
        th3.start();
        System.out.println("count before list() : "+obj.activeCount());
        System.out.println("count after list() : "+obj.activeCount());
       
    }
}
