public class ThreadDemo6 extends Thread
{
    public void run(){
        System.out.println("Name : "+Thread.currentThread().getName()+"\tPriority : "+Thread.currentThread().getPriority()+"\tId : "+Thread.currentThread().getId());
    }
    public static void main(String[] args) {
        ThreadDemo6 th1 = new ThreadDemo6();
        ThreadDemo6 th2 = new ThreadDemo6();
        ThreadDemo6 th3 = new ThreadDemo6();
        th1.setName("ABC");
        th2.setName("PQR");
        th3.setName("XYZ");
        
//        th1.setPriority(Thread.MIN_PRIORITY);
//        th2.setPriority(Thread.NORM_PRIORITY);
//        th3.setPriority(Thread.MAX_PRIORITY);

        th1.setPriority(2);
        th2.setPriority(8);
        th3.setPriority(4);
 
            th1.start();
            th2.start();
            th3.start();
    }
}
