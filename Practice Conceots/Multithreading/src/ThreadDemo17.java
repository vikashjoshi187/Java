// program showing the concept of Inter Thread communication (Co-operation of thread)

class Customer{
    int bal;
 
    public Customer(int bal) {
        this.bal = bal;
    }
    
   synchronized void withDraw(int wamt){
        if(wamt<=bal){
            System.out.println("Balance : "+bal);
            System.out.println("Withdrawal amount : "+wamt);
            System.out.println("Remaining Amount : "+(bal = bal-wamt));
        }
        else{
            System.out.println("Low Balance | Need to deposit..!!");
            try{
                wait();
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
            
            System.out.println("Balance : "+bal);
            System.out.println("Withdrawal amount : "+wamt);
            System.out.println("Remaining Amount : "+(bal = bal-wamt));
            
        }        
    }
       synchronized void deposit(int dbal){
            bal += dbal;
            System.out.println("Deposit completed..!\nNow you can withdraw..");
            try{
              //  notify();
                notifyAll();
            }catch(Exception e){
                System.out.println("Exception : "+e);
            }
        }
}
public class ThreadDemo17
{
    public static void main(String[] args) {
        int y = 1000;
        Customer obj = new Customer(y);
        int x = 1600,z=2000;
        Thread th = new Thread(){
            @Override
            public void run(){
                obj.withDraw(x);
            }
        };
        th.start();
        
        Thread th2 = new Thread(){
            @Override
            public void run(){
                obj.withDraw(x);
            }
        };
        th2.start();
        
    if(x>y)
    {
        Thread th1 = new Thread(){
            @Override
            public void run(){
                obj.deposit(z);
            }
        };
        th1.start();
    }
    }
}


