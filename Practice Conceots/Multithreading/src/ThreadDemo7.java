public class ThreadDemo7 extends Thread
{
    public void run(){
        if(Thread.currentThread().isDaemon())
            System.out.println(Thread.currentThread().getName()+" is Service Provider Thread");
        else
            System.out.println(Thread.currentThread().getName()+" is User Thread");
    }
    public static void main(String[] args) {
        ThreadDemo7 th1 = new ThreadDemo7();
        ThreadDemo7 th2 = new ThreadDemo7();
        ThreadDemo7 th3 = new ThreadDemo7();
       
        th1.setDaemon(true);
        th2.setDaemon(false);
       
            th1.start();
            th2.start();
            th3.start();
    }
}
