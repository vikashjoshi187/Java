import java.util.Scanner;
public class Toll_Fun {
public String vehicle_1(int wekd ,char ezps,float tm ){
String price="";
    if (ezps == 'p' || ezps == 'P') {
                    if (wekd <= 7) {
                            if (wekd <= 5) {
                            if (tm <= 24) {// CONDITION FOR PEAK TIME
                                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.13.75";
                                }
                                else { // ELSE CONDITION FOR OFF PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.11.75";
                                }
                            }
                        }
                        else if (wekd > 5) {
                            if (tm < 24) {// CONDITION FOR VALID TIME
                                if (tm >= 11 && tm <= 21) {
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.13.75";
                                }
                                else {// CONDITION FOR OFF PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.11.75";
                                }
                            }
                        }
                    }
                }
                else {// ELSE CONDITION FOR NO PASS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.16.00";
                }
                return price;
            }
            public String vehicle_2(int wekd ,char ezps,float tm ){
                String price="";
                if (ezps == 'p' || ezps == 'P') {////// CONDITION FOR CHECKING FOR EZPASS
                if (wekd <= 3) {// CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00";
                        }
                    else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                        price="YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00";
                        }
                    }
                    else if (wekd == 4) {// CONDITION FOR THRUSDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                        price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00";
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 24) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHETHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00";
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURSTHE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00";
                        }
                    }
                    else if (wekd == 5) { // CONDITION FOR FRIDAY
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00";
                        }                        
                        else {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00";
                        }
                    }
                    else if (wekd == 6) {// CONDITION FOR SATURDAY
                        if (tm >= 11 && tm <= 21) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00";
                        }
                        else {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00";
                        }
                    }
                    else if (wekd == 7) { // CONDITION FOR SUNDAY
                        if (tm >= 11 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00";
                        }
                        else if (tm <= 10 && tm <= 24) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00";
                        }
                    }
                }
                else {
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.44.00";
                }
                return price;
            }
            public String vehicle_3(int wekd ,char ezps,float tm ){
                String price="";
                if (ezps == 'p' || ezps == 'P') { // CONDITION FOR CHECKING FOR EZPASS
                    // CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                    if (wekd <= 3) {
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00";
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00";
                        }
                    }
                    else if (wekd == 4) {// CONDITION FOR THRUSDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) { // CONDITION FOR CHECKING PEAK TIME
                        price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00";
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00";
                        }
                    }
                    else if (wekd == 5) { // CONDITION FOR FRIDAY
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                        price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00";
                        }
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00";
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00";
                        }
                    }
                    else if (wekd == 6) {// CONDITION FOR SATURDAY
                        if (tm >= 11 && tm <= 21) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00";
                        }
                        else {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00";
                        }
                    }
                    else if (wekd == 7) {// CONDITION FOR SUNDAY
                        if (tm >= 11 && tm <= 20) { // CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00";
                        }
                        else if (tm <= 10 && tm <= 24) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00";
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="THE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00";
                        }
                    }
                }
                else { // CONDITION FOR NO EZPASS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.66.00";
                }
                return price;
            }
            public String vehicle_4(int wekd ,char ezps,float tm ){
                String price="";
                if (ezps == 'p' || ezps == 'P') {// CONDITION FOR CHECKING FOR EZPASS
                    if (wekd <= 3) {// CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) { // CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00";
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00";
                        }
                    }
                    else if (wekd == 4) {// CONDITION FOR THRUSDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00";
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00";
                        }
                    }
                    else if (wekd == 5) { // CONDITION FOR FRIDAY
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00";
                        }
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) { // CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00";
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00";
                        }
                    }
                    else if (wekd == 6) {// CONDITION FOR SATURDAY
                        if (tm >= 11 && tm <= 21) { // CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00";
                        }
                        else {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00";
                        }
                    }
                    else if (wekd == 7) {// CONDITION FOR SUNDAY
                        if (tm >= 11 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00";
                        }
                        else if (tm <= 10 && tm <= 24) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00";
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="THE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00";
                        }
                    }
                }
                else {// CONDITION FOR NO EZPASS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.88.00";
                }
                return price;
            }
            public String vehicle_5(int wekd ,char ezps,float tm ){
                String price="";
                    if (ezps == 'p' || ezps == 'P') {// CONDITION FOR CHECKING FOR EZPASS
                    if (wekd <= 3) { // CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00";
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00";
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00";
                        }
                    }
                    else if (wekd == 4) {// CONDITION FOR THRUSDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00";
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00";
                        }
                    }
                    else if (wekd == 5) {// CONDITION FOR FRIDAY
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00";
                        }
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00";
                        }
                    }
                    else if (wekd == 6) { // CONDITION FOR SATURDAY
                        if (tm >= 11 && tm <= 21) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00";
                        }
                        else {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00";
                        }
                    }
                    else if (wekd == 7) {// CONDITION FOR SUNDAY
                        if (tm >= 11 && tm <= 20) { // CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00";
                        }
                        else if (tm <= 10 && tm <= 24) { // CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00";
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="THE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00";
                        }
                    }
                }
                else {// CONDITION FOR NO EZPASS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.110.00";
                }
                return price;
            }
            public String vehicle_6(int wekd ,char ezps,float tm ){
                Scanner sc=new Scanner(System.in);
                String  price="";
                int axl;
                do {
                    System.out.println("ENTER NUMBER OF ADDITIONAL AXELS IF MORE THEN 6");
                    axl=sc.nextInt();
                    if (axl>11) {
                        System.out.println("PLEASE REENTER VALID NUMBER OF AXELS");
                    }
                } while (axl>11 || axl<=0);
                if (ezps == 'p' || ezps == 'P') { // CONDITION FOR CHECKING FOR EZPASS
                    if (wekd <= 3) {// CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl));
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl));
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs."+(99+(16*axl));
                        }
                    }
                    else if (wekd == 4) {// CONDITION FOR THRUSDAY
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl));
                        }
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) { // CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl));
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(99+(16*axl));
                        }
                    }
                    else if (wekd == 5) { // CONDITION FOR FRIDAY
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl));
                        }
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl));
                        }
                        else {// CONDITION FOR OVER NIGHT
                            price="YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(99+(16*axl));
                        }
                    }
                    else if (wekd == 6) {// CONDITION FOR SATURDAY
                        if (tm >= 11 && tm <= 21) {// CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl));
                        }
                        else {// CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl));
                        }
                    }
                    else if (wekd == 7) { // CONDITION FOR SUNDAY
                        if (tm >= 11 && tm <= 20) { // CONDITION FOR CHECKING PEAK TIME
                            price="YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl));
                        }
                        else if (tm <= 10 && tm <= 24) {  // CONDITION FOR CHECKING OFF PEAK TIME
                            price="YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl));
                        }
                        else { // CONDITION FOR OVER NIGHT
                            price="THE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(16*axl));
                        }
                    }
                }
                else { // CONDITION FOR NO EZPASS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.132.00";
                }
                return price;
            }
            public String vehicle_7(int wekd ,char ezps,float tm ){
                Scanner sc=new Scanner(System.in);
                String price="";
                int axl;
                do {
                    System.out.println("ENTER NUMBER OF ADDITIONAL AXELS IF MORE THEN 6");
                    axl=sc.nextInt();
                    if (axl>11) {
                        System.out.println("PLEASE REENTER VALID NUMBER OF AXELS");
                    }
                } while (axl>11 || axl<=0);
                if (ezps == 'p' || ezps == 'P') {// CHECKING CONDITION FOR EZPASS
                    if (wekd <= 7) {// CHECKING CONDITION FOR VALID WEEK DAY
                        if (wekd <= 5) {// IF CONDITION FOR WEEK DAY
                            if (tm <= 24) {// IF CONDITION FOR VALID TIME
                                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR PEAK TIME
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(24+(axl*10.5));
                                }
                                else {// ELSE CONDITION FOR OFF PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(22+(axl*10.5));
                                }
                            }
                            else {// ELSE CONDITION FOR INVALID TIME INPUT
                                price="PLEASE ENTER THE VALID TIME";
                            }
                        }
                        else if (wekd > 5) {// CONDITION FOR WEEKEND DAY
                            if (tm < 24) {// CONDITION FOR VALID TIME
                                if (tm >= 11 && tm <= 21) {// CONTITION CHEK FOR PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(24+(axl*10.5));
                                }
                                else {// CONDITION FOR OFF PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(24+(axl*10.5));
                                }
                            }
                            else {// ELSE CONDITION FOR INVALD TIME INPUT
                                price="PLEASE ENTER A VALID TIME ";
                            }
                        }
                    }
                }
                else {
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.34.00";
                }
            return price;
            }
            public String vehicle_8_9(int wekd ,char ezps,float tm ){
                String price="";
                if (ezps == 'p' || ezps == 'P') {// CHECKING CONDITION FOR EZPASS
                    if (wekd <= 7) {// CHECKING CONDITION FOR VALID WEEK DAY
                        if (wekd <= 5) { // IF CONDITION FOR WEEK DAY
                            if (tm <= 24) {// IF CONDITION FOR VALID TIME
                                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) { // CONDITION FOR PEAK TIME
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00";
                                }
                                else {// ELSE CONDITION FOR OFF PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00";
                                }
                            }
                        }
                        else if (wekd > 5) {// CONDITION FOR WEEKEND DAY
                            if (tm < 24) {// CONDITION FOR VALID TIME
                                if (tm >= 11 && tm <= 21) {// CONTITION CHEK FOR PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00";
                                }
                                else {// CONDITION FOR OFF PEAK HOURS
                                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00";
                                }
                            }
                        }
                    }
                }
                else {// ELSE CONDITION FOR NO PASS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.25.00";
                }
                return price;
            }
            public String vehicle_10(int wekd ,char ezps,float tm ){
                String price=""; 
if (ezps == 'p' || ezps == 'P') {
    if (wekd <= 7) {// CHECKING CONDITION FOR VALID WEEK DAY
        if (wekd <= 5) {// IF CONDITION FOR WEEK DAY
            if (tm <= 24) {// IF CONDITION FOR VALID TIME
                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {// CONDITION FOR PEAK TIME
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.12.75";
                }
                else { // ELSE CONDITION FOR OFF PEAK HOURS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.10.75";
                }
            }
        }
        else if (wekd > 5) { // CONDITION FOR WEEKEND DAY
            if (tm < 24) {// CONDITION FOR VALID TIME
                if (tm >= 11 && tm <= 21) { // CONTITION CHEK FOR PEAK HOURS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.12.75";
                }
                else {  // CONDITION FOR OFF PEAK HOURS
                    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.10.75";
                }
            }
        }
    }
}
else {
    price="THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.16.00";
}
return price;
}
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Toll_Fun obj=new Toll_Fun();
        String price="";
        int vcl, wekd;
        float tm;
        char ezps;
        do {// GETTING VEHICLES INFORMATION
        System.out.println("Enter 1 for VEHICLES WITH TWO AXLES AND SINGLE REAR WHEELS \nENTER 2 FOR 2 VEHICLES WITH TWO AXLES AND DUAL REAR WHEELS \nENRER 3 FOR VEHICLES WITH THREE AXLES \nENTER 4 FOR VEHICLES WITH FOUR AXLES \nENTER 5 FOR VEHICLES WITH FIVE AXLES \nENTER 6 FOR VEHICLES WITH AT LEAST SIX AXLES  \nENTER 7 FOR CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER \nENTER 8 FOR TWO AXLE BUSES AND MINI BUSES* \nENTER 9 FOR THREE AXLE BUSES AND MINI BUSES* \nENTER 10 FOR MOTORCYCLE ");
        vcl = sc.nextInt();
        if (vcl<=0 || vcl>10) {
            System.out.println("PLEASE RE ENTER VEHICLE TYPE");
        }
    } while (vcl<=0 || vcl>10);
    
    
    do {
    System.out.println("ENTER 1 FOR MONDAY \nENTER 2 FOR TUESDAY \nENTER 3 FOR WEDNESDAY\nENTER 4 FOR THRUSDAY\nENTER 5 FOR FRIDAY\nENTER 6 SATURDAY\nENTER 7 FOR SUNDAY  ");
    wekd = sc.nextInt();
    if (vcl<=wekd || vcl>7) {
        System.out.println("PLEASE RE ENTER WEEK DAY");
        }
    } while (wekd<=0 || wekd>7);
    
    
    do {
    System.out.println("ENTER P FOR EZPASS C FOR CASH");
    ezps = sc.next().charAt(0);
    if (ezps!='p' && ezps!='P' && ezps!='c'&& ezps!='C') {
        System.out.println("PLEASE RE INTER A VAILD OPTION");
    }
} while (ezps!='p' && ezps!='P' && ezps!='c'&& ezps!='C');


do {
    System.out.println("ENTER TIME OF ARRIWAL OF VEHICLE");
        tm = sc.nextFloat();
        if (tm<0 || tm>24) {
            System.out.println("PLEASE REENTER A VLID TIME");
        }
    } while (tm<0 || tm>24);   
            
    
    if (vcl == 1) {// CHECKIING CONDITION FOR VEHICLE TYPE 1
            price= obj.vehicle_1(wekd, ezps, tm);
            System.out.println(price);
        } 
            else if (vcl == 2) {// CHECKING CONDITION FOR VEHICLA TYPE 2 VEHICLES WITH TWO AXLES
            price= obj.vehicle_2(wekd, ezps, tm);
            System.out.println(price);
            }
            else if (vcl == 3) {//CHECKING CONDITION FOR VEHICLA TYPE 3 VEHICLES WITH THREE
                price= obj.vehicle_3(wekd, ezps, tm);
            System.out.println(price);
                
            }
            else if (vcl == 4) {// CHECKING CONDITION FOR VEHICLE TYPE 4 VEHICLES WITH THREE
                price= obj.vehicle_4(wekd, ezps, tm);
                System.out.println(price);
            }
            else if (vcl == 5) {//CHECKING CONDITION FOR VEHICLES TYPE 5 VEHICLES WITH FIVE AXLES
                price= obj.vehicle_5(wekd, ezps, tm);
                System.out.println(price);
            }
            else if (vcl == 6) {// CHECKING CONDITION FOR VEHICLES TYPE 6 VEHICLES WITH AT LEAST SIX AXLES
                price= obj.vehicle_6(wekd, ezps, tm);
                System.out.println(price);
            }
            if (vcl == 7) {//CONDITION FOR VECHCLE TYPE 7 CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER
                obj.vehicle_7(wekd, ezps, tm);
                System.out.println(price);
            }
            if (vcl == 8 || vcl==9) { ///CONDITION FOR VECHCLE TYPE 8CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER
                price=obj.vehicle_8_9(wekd, ezps, tm);
                System.out.println(price);
            }
            if (vcl ==10) {//CONDITION FOR VECHCLE TYPE 10 MOTORCYCLE
                price=obj.vehicle_10(wekd, ezps, tm);
                System.out.println(price);
        }
    }
}