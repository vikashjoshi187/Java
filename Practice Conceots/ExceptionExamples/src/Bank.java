import java.util.Scanner;
class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
class Withdraw{
    int bal;

    public Withdraw(int bal) {
        this.bal=bal;
    }

    public void getWithdraw() throws InsufficientBalanceException{
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter withdrawal amount : ");
            int wamt = sc.nextInt();
            
            if(wamt>bal)
                throw new InsufficientBalanceException("Low Balance");
            else{
                System.out.println("Balance : "+bal);
                System.out.println("Withdrawal amount : "+wamt);
                System.out.println("Remaining Balance : "+(bal-wamt));
            }
    }
}
public class Bank 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter balance : ");
        int bal = sc.nextInt();
        
        Withdraw obj = new Withdraw(bal);
        try{
            obj.getWithdraw();
        }catch(InsufficientBalanceException e){
            System.out.println("Exception : "+e.getMessage());
            System.out.println("Exception : "+e);
            System.out.println("Exception : "+e.getClass().getName());
        }
    }
}
