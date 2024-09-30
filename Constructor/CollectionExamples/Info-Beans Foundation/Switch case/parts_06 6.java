import java.util.Scanner;
public class parts_06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int prt,qnt;
        System.out.println("WELCOME TO JDM SPAIR PARTS");
        System.out.println("ENTER 1 FOR CLUTCH\nENTER 2 FOR TURBO\nENTER THREE FOR EXAHAUST\nENTER 4 FOR ALLOYS\nENTER 5 FOR PISTON");
        prt=sc.nextInt();
        if(prt>5){
            System.out.println("PLEASE ENTER A VALD PART NUMBER");
            System.exit(5);
        }
        System.out.println("ENTER HOW MUCH QUANTITY YOU WANT IN UNITS");
            qnt=sc.nextInt();
            if(qnt>5){
                System.out.println("YOU CAN NOT BUY MORE THEN 5 UNITS");
                System.exit(5);
            }
    
            switch (prt) {//SWITCH CASE FOR PART
            case 1:{//CASE FOR CLUTCH
                System.out.println("THE TOTAL AMOUNT CLUTCH FOR "+qnt+" UNITS IS "+(qnt*10000));
                break;}//CASE FOR CLUTCH ENDS
                
                case 2:{//CASE FOR TURBO
                    System.out.println("THE TOTAL AMOUNT TURBO FOR "+qnt+" UNITS IS "+(qnt*1500));
                    break;}//CASE FOR TURBO ENDS
    

                    case 3:{//CASE FOR EXAHAUSST
                        System.out.println("THE TOTAL AMOUNT EXAHAUST FOR "+qnt+" UNITS IS "+(qnt*5000));
                        break;}//CASE FOR EXAHAUSST ENDS
        

                        case 4:{//CASE FOR ALLOYS
                            System.out.println("THE TOTAL AMOUNT ALLOYS FOR "+qnt+" UNITS IS "+(qnt*40000));
                            break;}//CASE FOR ALLOYS ENDS
            

                            case 5:{//CASE FOR PISTON
                                System.out.println("THE TOTAL AMOUNT PISTON FOR "+qnt+" UNITS IS "+(qnt*3000));
                                break;}//CASE FOR PISTON ENDS
                
        }
    
    }
    
}
