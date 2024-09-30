import java.text.BreakIterator;
import java.util.Scanner;
public class prog2_day {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int a;
       System.out.println("Enter a number for day");
       a=sc.nextInt();
       if(a<=0 || a>7){
        System.out.println("Please enter a valid number");
       }

       switch (a) {
       /*  if(a<=0 || a>7){
            System.out.println("Please enter a valid number");
           }
           break;*/
        case 1:
            System.out.println("Monday");
            break;
            case 2:
            System.out.println("tuesday");
            break;
            case 3:
            System.out.println("Wednesday");
            break;
            case 4:
            System.out.println("Thrusday");
            break;
            case 5:
            System.out.println("Friday");
            break;
            case 6:
            System.out.println("Saturday");
            break;
       
        default:
        System.out.println("Sunday");
            break;
       }

    }
}