
import java.util.Scanner;
public class RENTAL_12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nm, add, wrk, rent=null, thng=null;
        int age,r,tt,p=0;
        System.out.println("ENTER YOUR NAME");
        nm = sc.next();
        System.out.println("ENTER YOUR AGE");
        age = sc.nextInt();
        System.out.println("ENTER YOUR ADDRESS");
        add=sc.next();
        System.out.println("WTHAT DO DU DO STUDENT OR EMPLOYEE");
        wrk = sc.next();
        System.out.println("ENTER 1 FOR RENTING CAR \nENTER 2 FOR RENTING HOUSE");
        r = sc.nextInt();

        switch (r) {
            case 1: {
                rent = "YOU CHOOSE TO RENT CAR";
                System.out.println("ENTER 1 FOR FULL SIZE CAR\nENTER 2 FOR COMPACT CAR");
                tt=sc.nextInt();
                switch (tt) {
                    case 1:{
                        thng="YOU RENTED A FULL SIZE CAR";
                         p=12000;
                        
                        break;
                    }
                    case 2:{
                        thng="YOU RENTED A COMPACT SIZE CAR";
                        p=10000;
                        
                        break;
                    }
                    default:{
                        System.out.println("DON'T HAVE THIS TYPE OF CAR");
                        break;
                    
                    }
                }
                break;
            }

            
            
            case 2: {
                rent = "YOU CHOOSE TO RENT HOUSE";
                
                System.out.println("ENTER 1 FOR FULL SIZE HOUSE\nENTER 2 FOR COMPACT HOUSE");
                tt=sc.nextInt();
                switch (tt) {
                    case 1:{
                        thng="YOU RENTED A FULL SIZE HOUSE";

                        p=15000;
                        break;
                    }
                    case 2:{
                        thng="YOU RENTED A COMPACT SIZE HOUSE";

                        p=12000;
                        break;
                    }
                    default:{
                        System.out.println("DON'T HAVE THIS TYPE OF HOUSE");
                        break;
                    
                    }
                }
                break;
            }

            default: {
                System.out.println("THIS TYPE OF HOUSE DON'T EXIST");
                break;
            }
        }

        System.out.println("RENTER NAME " + nm);
        System.out.println("YOUR AGE IS "+age);
        System.out.println("PROFESSION "+wrk);
        System.out.println("RENTER'S ADDRESS IS "+add);
        System.out.println(rent);
        System.out.println(thng);
        System.out.println("TOTAL AMOUNT PRICE FOR RENTING IS "+p);
        

    }
}
