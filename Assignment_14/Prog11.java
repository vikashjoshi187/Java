// /*11. Write a program showing the concept of Deadlock(Other then classroom example). */
class pen {
}

class peper {
}

public class Prog11 {
    public static void main(String[] args) {
        pen pn = new pen();
        peper pr = new peper();

        new Thread() {
            public void run() {
                synchronized (pn) {
                    System.out.println("Thread 1 pen needed paper....!!");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Exception > " + e);
                    }
                    synchronized (pr) {
                        System.out.println("Thread 1 paper needed pen...!!");
                    }
                }
            }
        }.start();

        new Thread() {
            public void run() {
                synchronized (pr) {
                    System.out.println("Thread 2 pen needed paper....!!");
                    try {
                        Thread.sleep(1000);
                    } catch (Exception e) {
                        System.out.println("Exception > " + e);
                    }
                    synchronized (pn) {
                        System.out.println("Thread 2 paper needed pen...!!");
                    }
                }
            }
        }.start();

    }
}
