import java.util.Scanner;

public class re_tol_44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vcl, wekd,axl;
        float tm;
        char ezps;
        // GETTING VEHICLES INFORMATION
        System.out.println(
                "Enter 1 for VEHICLES WITH TWO AXLES AND SINGLE REAR WHEELS \nENTER 2 FOR 2 VEHICLES WITH TWO AXLES AND DUAL REAR WHEELS \nENRER 3 FOR VEHICLES WITH THREE AXLES \nENTER 4 FOR VEHICLES WITH FOUR AXLES \nENTER 5 FOR VEHICLES WITH FIVE AXLES \nENTER 6 FOR VEHICLES WITH AT LEAST SIX AXLES  \nENTER 7 FOR CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER \nENTER 8 FOR TWO AXLE BUSES AND MINI BUSES* \nENTER 9 FOR THREE AXLE BUSES AND MINI BUSES* \nENTER 10 FOR MOTORCYCLE ");
        vcl = sc.nextInt();
        System.out.println(
                "ENTER 1 FOR MONDAY \nENTER 2 FOR TUESDAY \nENTER 3 FOR WEDNESDAY\nENTER 4 FOR THRUSDAY\nENTER 5 FOR FRIDAY\nENTER 6 SATURDAY\nENTER 7 FOR SUNDAY  ");
        wekd = sc.nextInt();
        System.out.println("ENTER P FOR EZPASS C FOR CASH");
        ezps = sc.next().charAt(0);
        System.out.println("ENTER TIME OF ARRIWAL OF VEHICLE");
        tm = sc.nextFloat();
        // CONDITION FOR VALID VEHICLE TYPE
        if (vcl <= 10) {
            // CHECKIING CONDITION FOR VEHICLE TYPE 1
            if (vcl == 1) {
                // CHECKING CONDITION FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR VALID WEEK DAY
                    if (wekd <= 7) {
                        // IF CONDITION FOR WEEK DAY
                        if (wekd <= 5) {
                            // IF CONDITION FOR VALID TIME
                            if (tm <= 24) {
                                // CONDITION FOR PEAK TIME
                                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.13.75");
                                }
                                // ELSE CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.11.75");
                                }
                            }
                            // ELSE CONDITION FOR INVALID TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER THE VALID TIME");
                            }
                        }
                        // CONDITION FOR WEEKEND DAY
                        else if (wekd > 5) {
                            // CONDITION FOR VALID TIME
                            if (tm < 24) {
                                // CONTITION CHEK FOR PEAK HOURS
                                if (tm >= 11 && tm <= 21) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.13.75");
                                }
                                // CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.11.75");
                                }
                            }
                            // ELSE CONDITION FOR INVALD TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER A VALID TIME ");
                            }
                        }
                    }
                    // ELSE CONDITION FOR INVALID DAY INPUT
                    else {
                        System.out.println("PLEASE ENTER A VALID WEEKDAY");
                    }
                }
                // ELSE CONDITION FOR NO PASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.16.00");
                }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// CHECKING CONDITION FOR VEHICLA TYPE 2 VEHICLES WITH TWO AXLES AND
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// DUAL
            else if (vcl == 2) {
                // CONDITION FOR CHECKING FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                    if (wekd <= 3) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00");
                        }
                    }
                    // CONDITION FOR THRUSDAY
                    else if (wekd == 4) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHETHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURSTHE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00");
                        }
                    }
                    // CONDITION FOR FRIDAY
                    else if (wekd == 5) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                        }
                    }
                    // CONDITION FOR SATURDAY
                    else if (wekd == 6) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 21) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                        }
                    }
                    // CONDITION FOR SUNDAY
                    else if (wekd == 7) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm <= 10 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00");
                        }
                    }
                }
                // CONDITION FOR NO EZPASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.44.00");
                }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// CHECKING CONDITION FOR VEHICLA TYPE 3 VEHICLES WITH THREE
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
            else if (vcl == 3) {
                // CONDITION FOR CHECKING FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                    if (wekd <= 3) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00");
                        }
                    }
                    // CONDITION FOR THRUSDAY
                    else if (wekd == 4) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00");
                        }
                    }
                    // CONDITION FOR FRIDAY
                    else if (wekd == 5) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00");
                        }
                    }
                    // CONDITION FOR SATURDAY
                    else if (wekd == 6) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 21) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                        }
                    }
                    // CONDITION FOR SUNDAY
                    else if (wekd == 7) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm <= 10 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("THE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00");
                        }
                    }
                }
                // CONDITION FOR NO EZPASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// CHECKING CONDITION FOR VEHICLE TYPE 4 VEHICLES WITH THREE
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (vcl == 4) {
                // CONDITION FOR CHECKING FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                    if (wekd <= 3) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                        }
                    }
                    // CONDITION FOR THRUSDAY
                    else if (wekd == 4) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                        }
                    }
                    // CONDITION FOR FRIDAY
                    else if (wekd == 5) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                        }
                    }
                    // CONDITION FOR SATURDAY
                    else if (wekd == 6) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 21) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                        }
                    }
                    // CONDITION FOR SUNDAY
                    else if (wekd == 7) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm <= 10 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("THE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                        }
                    }
                }
                // CONDITION FOR NO EZPASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.88.00");
                }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// CHECKING CONDITION FOR VEHICLES TYPE 5 VEHICLES WITH FIVE AXLES///////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (vcl == 5) {
                // CONDITION FOR CHECKING FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                    if (wekd <= 3) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00");
                        }
                    }
                    // CONDITION FOR THRUSDAY
                    else if (wekd == 4) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00");
                        }
                    }
                    // CONDITION FOR FRIDAY
                    else if (wekd == 5) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00");
                        }
                    }
                    // CONDITION FOR SATURDAY
                    else if (wekd == 6) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 21) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00");
                        }
                    }
                    // CONDITION FOR SUNDAY
                    else if (wekd == 7) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.95.00");
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm <= 10 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.90.00");
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("THE TOLL APPILED ON YOUR VEHICLE IS Rs.82.00");
                        }
                    }
                }
                // CONDITION FOR NO EZPASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.110.00");
                }
            }
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////// CHECKING CONDITION FOR VEHICLES TYPE 6 VEHICLES WITH AT LEAST SIX AXLES///////////////////////////////////////////////////////////////////////////
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            else if (vcl == 6) {
                ///GETTING NUMBER OF ADDITIONAL AXELS
                System.out.println("ENTER NUMBER OF ADDITIONAL AXELS IF MORE THEN 6");
                axl=sc.nextInt();
                // CONDITION FOR CHECKING FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR MONDAY TO WEDNESDAY
                    if (wekd <= 3) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl)));
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl)));
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS THE TOLL APPILED ON YOUR VEHICLE IS Rs."+(99+(16*axl)));
                        }
                    }
                    // CONDITION FOR THRUSDAY
                    else if (wekd == 4) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 7 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl)));
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 11 && tm <= 15 || tm >= 21 && tm < 22) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl)));
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(99+(16*axl)));
                        }
                    }
                    // CONDITION FOR FRIDAY
                    else if (wekd == 5) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl)));
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm >= 1 && tm <= 5 || tm >= 21 && tm < 22 || tm >= 21 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl)));
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("YOU ARRIVED ON OVER-NIGHT HOURS \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(99+(16*axl)));
                        }
                    }
                    // CONDITION FOR SATURDAY
                    else if (wekd == 6) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 21) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl)));
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl)));
                        }
                    }
                    // CONDITION FOR SUNDAY
                    else if (wekd == 7) {
                        // CONDITION FOR CHECKING PEAK TIME
                        if (tm >= 11 && tm <= 20) {
                            System.out.println("YOU ARRIVED ON PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(114+(19*axl)));
                        }
                        // CONDITION FOR CHECKING OFF PEAK TIME
                        else if (tm <= 10 && tm <= 24) {
                            System.out.println("YOU ARRIVED ON OFF PEAK TIME \nTHE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(18*axl)));
                        }
                        // CONDITION FOR OVER NIGHT
                        else {
                            System.out.println("THE TOLL APPILED ON YOUR VEHICLE IS Rs."+(108+(16*axl)));
                        }
                    }
                }
                // CONDITION FOR NO EZPASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.132.00");
                }
            }
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////CONDITION FOR VECHCLE TYPE 7 CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER//////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

            if (vcl == 7) {
                 ///GETTING NUMBER OF ADDITIONAL AXELS
                System.out.println("ENTER NUMBER OF ADDITIONAL AXELS IF MORE THEN 6");
                axl=sc.nextInt();
                // CHECKING CONDITION FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR VALID WEEK DAY
                    if (wekd <= 7) {
                        // IF CONDITION FOR WEEK DAY
                        if (wekd <= 5) {
                            // IF CONDITION FOR VALID TIME
                            if (tm <= 24) {
                                // CONDITION FOR PEAK TIME
                                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(24+(axl*10.5)));
                                }
                                // ELSE CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(22+(axl*10.5)));
                                }
                            }
                            // ELSE CONDITION FOR INVALID TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER THE VALID TIME");
                            }
                        }
                        // CONDITION FOR WEEKEND DAY
                        else if (wekd > 5) {
                            // CONDITION FOR VALID TIME
                            if (tm < 24) {
                                // CONTITION CHEK FOR PEAK HOURS
                                if (tm >= 11 && tm <= 21) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(24+(axl*10.5)));
                                }
                                // CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs."+(24+(axl*10.5)));
                                }
                            }
                            // ELSE CONDITION FOR INVALD TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER A VALID TIME ");
                            }
                        }
                    }
                    // ELSE CONDITION FOR INVALID DAY INPUT
                    else {
                        System.out.println("PLEASE ENTER A VALID WEEKDAY");
                    }
                }
                // ELSE CONDITION FOR NO PASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.34.00");
                }
            }
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////CONDITION FOR VECHCLE TYPE 8CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER//////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (vcl == 8 || vcl==9) {
                // CHECKING CONDITION FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR VALID WEEK DAY
                    if (wekd <= 7) {
                        // IF CONDITION FOR WEEK DAY
                        if (wekd <= 5) {
                            // IF CONDITION FOR VALID TIME
                            if (tm <= 24) {
                                // CONDITION FOR PEAK TIME
                                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00");
                                }
                                // ELSE CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00");
                                }
                            }
                            // ELSE CONDITION FOR INVALID TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER THE VALID TIME");
                            }
                        }
                        // CONDITION FOR WEEKEND DAY
                        else if (wekd > 5) {
                            // CONDITION FOR VALID TIME
                            if (tm < 24) {
                                // CONTITION CHEK FOR PEAK HOURS
                                if (tm >= 11 && tm <= 21) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00");
                                }
                                // CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.14.00");
                                }
                            }
                            // ELSE CONDITION FOR INVALD TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER A VALID TIME ");
                            }
                        }
                    }
                    // ELSE CONDITION FOR INVALID DAY INPUT
                    else {
                        System.out.println("PLEASE ENTER A VALID WEEKDAY");
                    }
                }
                // ELSE CONDITION FOR NO PASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.25.00");
                }
            }
             ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            /////////////////////////////CONDITION FOR VECHCLE TYPE 10 MOTORCYCLE//////////////////////////////////////////////////////////////////////////////////
            ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            if (vcl ==10) {
                // CHECKING CONDITION FOR EZPASS
                if (ezps == 'p' || ezps == 'P') {
                    // CHECKING CONDITION FOR VALID WEEK DAY
                    if (wekd <= 7) {
                        // IF CONDITION FOR WEEK DAY
                        if (wekd <= 5) {
                            // IF CONDITION FOR VALID TIME
                            if (tm <= 24) {
                                // CONDITION FOR PEAK TIME
                                if (tm >= 6 && tm <= 10 || tm >= 16 && tm <= 20) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.12.75");
                                }
                                // ELSE CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.10.75");
                                }
                            }
                            // ELSE CONDITION FOR INVALID TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER THE VALID TIME");
                            }
                        }
                        // CONDITION FOR WEEKEND DAY
                        else if (wekd > 5) {
                            // CONDITION FOR VALID TIME
                            if (tm < 24) {
                                // CONTITION CHEK FOR PEAK HOURS
                                if (tm >= 11 && tm <= 21) {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.12.75");
                                }
                                // CONDITION FOR OFF PEAK HOURS
                                else {
                                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.10.75");
                                }
                            }
                            // ELSE CONDITION FOR INVALD TIME INPUT
                            else {
                                System.out.println("PLEASE ENTER A VALID TIME ");
                            }
                        }
                    }
                    // ELSE CONDITION FOR INVALID DAY INPUT
                    else {
                        System.out.println("PLEASE ENTER A VALID WEEKDAY");
                    }
                }
                // ELSE CONDITION FOR NO PASS
                else {
                    System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.16.00");
                }
            }
        }
        // ELSE CONDITION FOR INVALID VEHICLE TYPE
        else {
            System.out.println("PLEASE ENTER A VALID VEHICLE TYPE");
        }
    }
}
