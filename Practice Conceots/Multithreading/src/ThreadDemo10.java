public class ThreadDemo10 implements Runnable
{
    @Override
    public void run(){
        System.out.println("run method executes");
    }
    public static void main(String[] args) {
          ThreadDemo10 obj = new ThreadDemo10();
          Thread th= new Thread(obj);
          th.start();

//           Thread th= new Thread(new ThreadDemo10());
//           th.start();

//           new Thread(new ThreadDemo10()).start();
    }
}
