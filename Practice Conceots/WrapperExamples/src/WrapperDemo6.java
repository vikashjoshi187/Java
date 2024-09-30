import java.util.Scanner;
public class WrapperDemo6 
{
    static void validateMobileNumber(String number){
        boolean status = true;
        int len = number.length();
        if(len==10){
                for(int i=0;i<len;i++){
                    char ch = number.charAt(i);
                    if(!Character.isDigit(ch)){
                        status = false;
                        break;
                    }
                }
        }else
            status = false;
        String msg = status ? "Valid Mobile Number" : "Invalid Mobile Number";
        System.out.println(msg);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 10-digit mobile number : ");
        String number = sc.next();
        validateMobileNumber(number);
    }
}






