/*12. Write a program showing the concept of Thread Synchronization(Other then classroom example). */
class A implements Runnable {
    int token = 1;

    public void run() {
        synchronized (this) {
            Thread t = Thread.currentThread();
            String name = t.getName();
            System.out.println(token + ".....alloted to " + name);
            token++;
        }
    }
}

public class Prog12 {
    public static void main(String[] args) {
        A a1 = new A();
        Thread t1 = new Thread(a1);
        Thread t2 = new Thread(a1);
        Thread t3 = new Thread(a1);
        t1.setName("t1");
        t2.setName("t2");
        t3.setName("t3");
        t1.start();
        t2.start();
        t3.start();
    }
}
