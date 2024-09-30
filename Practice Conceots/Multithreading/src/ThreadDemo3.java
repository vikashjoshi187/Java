//interface Runnable{
// void run();
//}
//class Thread implements Runnable{
//    @Override
//    public void run(){
//        
//    }
//}

public class ThreadDemo3 extends Thread
{
    
        public void start(){
           Thread th = Thread.currentThread();
           System.out.println("Thread Name : "+th.getName());
           System.out.println("Thread Group name : "+th.getThreadGroup().getName());
           System.out.println("Thread Priority : "+th.getPriority());
           System.out.println("Thread Id : "+th.getId());
        }



    // public void start(){
    //     System.out.println("Thread Name : "+this.getName());
    //     System.out.println("Thread Group name : "+this.getThreadGroup().getName());
    //     System.out.println("Thread Priority : "+this.getPriority());
    //     System.out.println("Thread Id : "+this.getId());
    // }
    public static void main(String[] args) {
        ThreadDemo3 th = new ThreadDemo3();
        th.start();
    }
}
