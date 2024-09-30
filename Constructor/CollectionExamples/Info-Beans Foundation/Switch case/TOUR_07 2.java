import java.util.Scanner;
public class TOUR_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ml, pml, fml, chl, pchl, vcl, sct = 0, psct, amt;

        System.out.println("ENTER SOURCE PLACE");// TAKING INPUT FOR SOURCE PLACE
        String src = sc.nextLine();

        System.out.println("ENTER DESTINATION PLACE");// TAKING INPUT FOR DESTINATION PLACE
        String dst = sc.nextLine();

        System.out.println("ENTER DATE :-DD/MM/YY");// TAKING INPUT FOR DATE
        String dt = sc.next();

        System.out.println("ENTER 1 FOR MONDAY\nENTER 2 FOR TUESDAY\nENTER 3 FOR WEDNESDAY\nENTER 4 FOR THRUSDAY\nENTER 5 FOR FRIDAY\nENTER 6 FOR SATURDAY\nENTER 7 FOR SUNDAY");// TAKING INPUT FOR DAY
        int dy = sc.nextInt();

        if (dy > 5) {// IF CONDITION FOR VALID WEEK END
            System.out.println("SORRY NO BOOKIN AVIALBLE\nTHANK YOU!");
            System.exit(0);
        }

        System.out.println("ENTER NUMBER OF MALES");// TAKING INPUR FOR NUMBER OF MALES
        ml = sc.nextInt();

        System.out.println("ENTER NUMBER OF FEMALES");// TAKING INPUR FOR NUMBER OF FEMALES
        fml = sc.nextInt();

        System.out.println("ENTER NUMBER OF CHILDREN");// TAKING INPUR FOR NUMBER OF CHILDREN
        chl = sc.nextInt();

        System.out.println("ENTER NUMBER OF SENIOR CITIZENS");// TAKING INPUR FOR NUMBER OF SENIOR CITIZENS
        sct = sc.nextInt();

        System.out.println("ENTER 1 FOR BUS\nENTER 2 FOR TRAIN\nENTER 3 FOR FLIGHT");
        vcl = sc.nextInt();
        switch (vcl) {// SWITCH FOR VEHICLES
            case 1: {// CASE FOR BUS
                System.out.println("ENTER PRICE FOR ADULTS");// TAKING PRICE FOR ADULTS
                pml = sc.nextInt();

                System.out.println("ENTER PRICE FOR CHILDREN");// TAKING PRICE FOR ADULTS
                pchl = sc.nextInt();

                System.out.println("ENTER PRICE FOR SENIOR CITIZEN");// TAKING PRICE FOR ADULTS
                psct = sc.nextInt();

                //amt = (ml * pml) + (fml * pml) + (chl * pchl) + (psct + sct);
                amt=(((ml+fml))-sct)*pml+(chl * pchl) + (psct * sct);

                System.out.println("THE TOTAL PRICE FOR THE TRIWILL BE Rs." + amt);

                break;
            } // CASE ENDS FOR BUS
            case 2: {// CASE FOR TRAIN

                System.out.println("ENTER PRICE FOR ADULTS");// TAKING PRICE FOR ADULTS
                pml = sc.nextInt();

                System.out.println("ENTER PRICE FOR CHILDREN");// TAKING PRICE FOR ADULTS
                pchl = sc.nextInt();

                System.out.println("ENTER PRICE FOR SENIOR CITIZEN");// TAKING PRICE FOR ADULTS
                psct = sc.nextInt();

                //amt = (ml * pml) + (fml * pml) + (chl * pchl) + (psct + sct);
                amt=(((ml+fml))-sct)*pml+(chl * pchl) + (psct * sct);
            

                System.out.println("THE TOTAL PRICE FOR THE TRIWILL BE Rs." + amt);

                break;
            } // CASE ENDS FOR TRAIN
             case 3: {// CASE FOR FLIGHT

                System.out.println("ENTER PRICE FOR ADULTS");// TAKING PRICE FOR ADULTS
                pml = sc.nextInt();

                System.out.println("ENTER PRICE FOR CHILDREN");// TAKING PRICE FOR ADULTS
                pchl = sc.nextInt();

                System.out.println("ENTER PRICE FOR SENIOR CITIZEN");// TAKING PRICE FOR ADULTS
                psct = sc.nextInt();
                
               // amt = (ml * pml) + (fml * pml) + (chl * pchl) + (psct + sct);
                amt=(((ml+fml))-sct)*pml+(chl * pchl) + (psct * sct);
                
                System.out.println("THE TOTAL PRICE FOR THE TRIWILL BE Rs." + amt);
                break;
            } // CASE ENDS FOR FLIGHT
            
            default: {// DEFAULT FOR INVALID VEHICLE TYPE
                System.out.println("PLEASE ENTER A VALID VEHICLE TYPE");
                break;
            } // DEFAULT ENDS FOR INVALID VEHICLE TYPE
        }

    }
}
