public class ThreadDemo11
{
    public static void main(String[] args) {
/*
        Runnable obj = new Runnable(){
            public void run(){
                System.out.println("run method executes");
            }
        };
        Thread th = new Thread(obj);
        th.start();
*/
 /*       
        Thread th = new Thread(new Runnable(){
            public void run(){
                System.out.println("run method executes");
            }
        });
        th.start();
*/
 /*       
        new Thread(new Runnable(){
            public void run(){
                System.out.println("run method executes");
            }
        }).start();
   */
   /*     
        Thread td = new Thread(){
            @Override
            public void run(){
                System.out.println("run method executes");
            }
        };
        td.start();
  */
        /*
       new Thread(){
            @Override
            public void run(){
                System.out.println("run method executes");
            }
        }.start();
       */
    /*
        Runnable obj = ()->System.out.println("run method executes");
        Thread th = new Thread(obj);
        th.start();
  */  
        Thread th = new Thread(()->System.out.println("run method executes"));
        th.start();
 
        
       new Thread(()->System.out.println("run method executes")).start();
       
     }
}
