import java.util.Scanner;

public class bill_37 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float untlm,untcm;
        System.out.println("Enter number of units of last month");
        untlm = sc.nextFloat();
        System.out.println("Enter number of units of current month");
        untcm = sc.nextFloat();
        untcm=untcm-untlm;
if(untcm>0){
        if (untcm > 0 && untcm <= 100) {
            untcm = untcm * 2;
            System.out.println("The monthely bill is Rs." + untcm);
        }
       else if (untcm >=101  && untcm <= 200) {
            untcm = untcm * 3;
            System.out.println("The monthely bill is Rs." + untcm);
        }
       else if (untcm > 201 && untcm <= 300) {
            untcm = untcm * 4;
            System.out.println("The monthely bill is Rs." + untcm);
        }
      else  {
            untcm = untcm * 5;
            System.out.println("The monthely bill is Rs." + untcm);
        }
    }
    else{
        System.out.println("Enter unit in positive value");
    }

    }
}