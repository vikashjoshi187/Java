public class ThreadDemo8 extends Thread
{
    public void run(){
            try{ Thread.sleep(2000); }catch(InterruptedException e){ System.out.println("Exception : "+e);}
        System.out.println("Name : "+Thread.currentThread().getName()+"\tStatus : "+Thread.currentThread().isAlive());
    }
    public static void main(String[] args) {
        ThreadDemo8 th1 = new ThreadDemo8();
        ThreadDemo8 th2 = new ThreadDemo8();
        ThreadDemo8 th3 = new ThreadDemo8();
            th1.start();
            th2.start();
            th3.start();

            try{ Thread.sleep(1000); }catch(InterruptedException e){ System.out.println("Exception : "+e);}
            
            System.out.println("th1 : "+th1.isAlive());
            System.out.println("th2 : "+th2.isAlive());
            System.out.println("th3 : "+th3.isAlive());
    }
}
