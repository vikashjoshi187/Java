public class ThreadDemo4 extends Thread
{
    // public void run(){
    //     Thread th = Thread.currentThread();
    //     System.out.println("Thread Name : "+th.getName());
    //     System.out.println("Thread Group name : "+th.getThreadGroup().getName());
    //     System.out.println("Thread Priority : "+th.getPriority());
    //     System.out.println("Thread Id : "+th.getId());
    // }
 public void  run(){
       System.out.println("Thread Name : "+this.getName());
       System.out.println("Thread Group name : "+this.getThreadGroup().getName());
       System.out.println("Thread Priority : "+this.getPriority());
       System.out.println("Thread Id : "+this.getId());
   }
    public static void main(String[] args) {
        ThreadDemo4 th = new ThreadDemo4();
        th.start();
    }
}
