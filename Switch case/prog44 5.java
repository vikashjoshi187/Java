
import java.util.Scanner;

import javax.xml.transform.Source;

public class prog44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vcl, wekd, axl;
        int tm;
        int ezps;
        System.out.println(
                "Enter 1 for VEHICLES WITH TWO AXLES AND SINGLE REAR WHEELS \n\nENTER 2 FOR 2 VEHICLES WITH TWO AXLES AND DUAL REAR WHEELS \nENRER 3 FOR VEHICLES WITH THREE AXLES \nENTER 4 FOR VEHICLES WITH FOUR AXLES \nENTER 5 FOR VEHICLES WITH FIVE AXLES \nENTER 6 FOR VEHICLES WITH AT LEAST SIX AXLES  \nENTER 7 FOR CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER \nENTER 8 FOR TWO AXLE BUSES AND MINI BUSES* \nENTER 9 FOR THREE AXLE BUSES AND MINI BUSES* \nENTER 10 FOR MOTORCYCLE ");
        vcl = sc.nextInt();
        System.out.println("ENTER 1 FOR EZPASS 2 FOR CASH");
        ezps = sc.nextInt();
        switch (vcl) {
            // CASE FOR VEHICLE 1
            case 1: {
                // TAKING WEEKDAY INPUT
                System.out.println(
                        "ENTER 1 FOR MONDAY\nTUESDAY\nWEDNESDAY\nTHRUSDAY\nFRIDAY\n\nENTER 2 FOR \nSATURDAY\nSUNDAY  ");
                wekd = sc.nextInt();
                // TAKING TIME INPUT
                System.out.println("ENTER TIME OF ARRIWAL OF VEHICLE 1 FOR PEAK HOURS AND 2 FOR OFF PEAK HOURS");
                tm = sc.nextInt();
                // CONDITION FOR EZPASS
                switch (ezps) {
                    // CASE FOR WHEN THE USER HAS EZPASS
                    case 1: {
                        // WEEK DAY
                        switch (wekd) {
                            case 1: {// CASE FOR FIRST FIVE DAYS
                                switch (tm) {
                                    case 1: { // CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU HAVE ARRIVED ON PEAK HOURS THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.13.75");
                                        break;
                                    } // CASE ENDS FOR PEAK TIME
                                    case 2: {// CASE FOR OFFF PEAK TIME
                                        System.out.println(
                                                "YOU HAVE ARRIVED ON OFF PEAK HOURS THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.11.75");
                                        break;
                                    } // CASE ENDS FOR OFF PEAK TIME
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    }
                                }// SWITCH CASE ENDS FOR TIMES
                                break;
                            } // CASE ENDS FOR FIRST FIVE DAYS

                            case 2: {// CASE FOR SATURDAY AND SUNDAY
                                switch (tm) {
                                    case 1: { // CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU HAVE ARRIVED ON PEAK HOURS THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.13.75");
                                        break;
                                    } // CASE ENDS FOR PEAK TIME
                                    case 2: {// CASE FOR OFFF PEAK TIME
                                        System.out.println(
                                                "YOU HAVE ARRIVED ON OFF PEAK HOURS THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.11.75");
                                        break;
                                    } // CASE ENDS FOR OFF PEAK TIME
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    }
                                }// SWITCH CASE ENDS FOR TIMES
                                break;
                            } // CASE ENDS FOR SATURDAY AND SUNDAY FIVE

                            // DEFAULT CASE OF INVALID WEEK DAY
                            default: {
                                System.out.println("ENTER A VALID WEEK DAY INFORMATION");
                                break;
                            }

                        }// SWITCHES END FOR FOR WEEKDAYS

                        break;
                    } // CASE ENDS FOR WHEN THE USER HAS EZPASS

                    default: {// DEFAULT CASE FOR NO EZPASS
                        System.out.println("THE AMOUNT OF TOLL APPILED ON YOUR VEHICLE IS Rs.16.00");
                        break;
                    } // SWITCH ENDS FOR EZASS
                }

                break;
            }
            /////////////////////////////////////// CASE END FOR VEHICLE
            /////////////////////////////////////// 1///////////////////////////////////////////

            ////////////////////////////////////// CASE STARTS FOR VEHICLE
            ////////////////////////////////////// 2//////////////////////////////////////////
            case 2: {
                // TAKING WEEKDAY INPUT
                System.out.println(
                        "ENTER 1 FOR MONDAY\nTUESDAY\nWEDNESDAY\n ENTER 2 FOR \nTHRUSDAY\nENTER 3 FOR FRIDAY\nENTER 4 FOR \nSATURDAY\nENTER 5 FOR \nSUNDAY  ");
                wekd = sc.nextInt();
                // SWITCH SATRT FOR EZPASS
                switch (ezps) {
                    //// CASE FOR WHEN THE USER HAS EZPASS
                    case 1: {

                        // SWITCH FOR WEEK
                        switch (wekd) {

                            case 1: {// CASE FOR MONDAY,TUESDAY,WEDNESDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                                        break;
                                    }
                                    case 3: {
                                        System.out.println(
                                                "YOU ARRIVED ON OVERNIGHT TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00");
                                        break;
                                    }

                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    }
                                }
                                break;
                            } // CASE END FOR MONDAY,TUESDAY,WEDNESDAY

                            case 2: {// CASE FOR THRUSDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {// SWITCH FOR TIME
                                    case 1: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 2: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 3: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OVER NIGHT  TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    default: {// DEFAULT FOT INVALID TIME
                                        System.out.println("ENTER VALID TIME");
                                        break;
                                    } // DEFAULT END FOR INVALID TIMES
                                }

                                break;
                            } // CASE END FOR THRUSDAY
                              //////////////////////////////////////// =========================////
                            case 3: {// CASE FOR FRIDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                                        break;
                                    }
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    } // DEFAULT ENDS FOR INVALID TIME
                                }
                                break;
                            } // CASE END FOR FRIDAY

                            case 4: {// CASE FOR SATURDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                                        break;
                                    }
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    } // DEFAULT ENDS FOR INVALID TIME
                                }
                                break;
                            } // CASE END FOR SATURDAY

                            //////////////////
                            case 5: {// CASE FOR SUNDAY
                                // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {// SWITCH FOR TIME
                                    case 1: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.38.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 2: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.36.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 3: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OVER NIGHT  TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.33.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    default: {// DEFAULT FOT INVALID TIME
                                        System.out.println("ENTER VALID TIME");
                                        break;
                                    } // DEFAULT END FOR INVALID TIMES
                                }

                                break;
                            } // CASE END FOR SUNDAY

                            default: {// DEFAULT FOR INVALID WEEKDYA SELECTION
                                System.out.println("ENTER THE VALID WEEK DAY INFORMATION");
                                break;
                            } // DEFAULT FOR INVALID WEEKDYA SELECTION
                        }

                        break;
                    } // CASE ENDS FOR WHEN THE USER HAS EZPASS

                    // DEFAULT FOR WHEN THE USER HAS NO EZPASS
                    default: {
                        System.out.println("NO EZPASS DETECTED AMOUNT PAYBALE IN CASH IS Rs.44.00");
                        break;
                    } // DEFAULT CASE ENS FOR WHEN THE USER HAS EZPASS
                }
                break;
            }
            /////////////////////////////////////////////////////// CASE FOR VEHICLE TYPE 2
            /////////////////////////////////////////////////////// ENDS//////////////////////////////////////////////////////////

            /////////////////////////////////////////////////////// CASE FOR VEHICLE TYPE 3
            /////////////////////////////////////////////////////// SATRT//////////////////////////////////////////////////////////

            case 4: {
                // TAKING WEEKDAY INPUT
                System.out.println(
                        "ENTER 1 FOR MONDAY\nTUESDAY\nWEDNESDAY\n ENTER 2 FOR \nTHRUSDAY\nENTER 3 FOR FRIDAY\nENTER 4 FOR \nSATURDAY\nENTER 5 FOR \nSUNDAY  ");
                wekd = sc.nextInt();
                // SWITCH SATRT FOR EZPASS
                switch (ezps) {
                    //// CASE FOR WHEN THE USER HAS EZPASS
                    case 1: {

                        // SWITCH FOR WEEK
                        switch (wekd) {

                            case 1: {// CASE FOR MONDAY,TUESDAY,WEDNESDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                                        break;
                                    }
                                    case 3: {
                                        System.out.println(
                                                "YOU ARRIVED ON OVERNIGHT TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00");
                                        break;
                                    }

                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    }
                                }
                                break;
                            } // CASE END FOR MONDAY,TUESDAY,WEDNESDAY

                            case 2: {// CASE FOR THRUSDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {// SWITCH FOR TIME
                                    case 1: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                                        break;
                                    } // CASE END FOR PEAK TIME

                                    case 2: {// CASE FOR OFF PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                                        break;
                                    } // CASE END FOR OFF PEAK TIME

                                    case 3: {// CASE FOR NIGHT TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OVER NIGHT  TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00");
                                        break;
                                    } // CASE END FOR NIGHT TIME

                                    default: {// DEFAULT FOT INVALID TIME
                                        System.out.println("ENTER VALID TIME");
                                        break;
                                    } // DEFAULT END FOR INVALID TIMES
                                }

                                break;
                            } // CASE END FOR THRUSDAY
                              //////////////////////////////////////// =========================////
                            case 3: {// CASE FOR FRIDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                                        break;
                                    }
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    } // DEFAULT ENDS FOR INVALID TIME
                                }
                                break;
                            } // CASE END FOR FRIDAY

                            case 4: {// CASE FOR SATURDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                                        break;
                                    }
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    } // DEFAULT ENDS FOR INVALID TIME
                                }
                                break;
                            } // CASE END FOR SATURDAY

                            //////////////////
                            case 5: {// CASE FOR SUNDAY
                                // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {// SWITCH FOR TIME
                                    case 1: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.57.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 2: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.54.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 3: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OVER NIGHT  TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.49.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    default: {// DEFAULT FOT INVALID TIME
                                        System.out.println("ENTER VALID TIME");
                                        break;
                                    } // DEFAULT END FOR INVALID TIMES
                                }

                                break;
                            } // CASE END FOR SUNDAY

                            default: {// DEFAULT FOR INVALID WEEKDYA SELECTION
                                System.out.println("ENTER THE VALID WEEK DAY INFORMATION");
                                break;
                            } // DEFAULT FOR INVALID WEEKDYA SELECTION
                        }

                        break;
                    } // CASE ENDS FOR WHEN THE USER HAS EZPASS

                    // DEFAULT FOR WHEN THE USER HAS NO EZPASS
                    default: {
                        System.out.println("NO EZPASS DETECTED AMOUNT PAYBALE IN CASH IS Rs.44.00");
                        break;
                    } // DEFAULT CASE ENS FOR WHEN THE USER HAS EZPASS
                }
                break;
            }
            /////////////////////////////////////////////////////// CASE FOR VEHICLE TYPE 3
            /////////////////////////////////////////////////////// END//////////////////////////////////////////////////////////

            /////////////////////////////////////////////////////// CASE FOR VEHICLE TYPE 4
            /////////////////////////////////////////////////////// SATRT//////////////////////////////////////////////////////////

            case 3: {
                // TAKING WEEKDAY INPUT
                System.out.println(
                        "ENTER 1 FOR MONDAY\nTUESDAY\nWEDNESDAY\n ENTER 2 FOR \nTHRUSDAY\nENTER 3 FOR FRIDAY\nENTER 4 FOR \nSATURDAY\nENTER 5 FOR \nSUNDAY  ");
                wekd = sc.nextInt();
                // SWITCH SATRT FOR EZPASS
                switch (ezps) {
                    //// CASE FOR WHEN THE USER HAS EZPASS
                    case 1: {

                        // SWITCH FOR WEEK
                        switch (wekd) {

                            case 1: {// CASE FOR MONDAY,TUESDAY,WEDNESDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                                        break;
                                    }
                                    case 3: {
                                        System.out.println(
                                                "YOU ARRIVED ON OVERNIGHT TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                                        break;
                                    }

                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    }
                                }
                                break;
                            } // CASE END FOR MONDAY,TUESDAY,WEDNESDAY

                            case 2: {// CASE FOR THRUSDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {// SWITCH FOR TIME
                                    case 1: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                                        break;
                                    } // CASE END FOR PEAK TIME

                                    case 2: {// CASE FOR OFF PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                                        break;
                                    } // CASE END FOR OFF PEAK TIME

                                    case 3: {// CASE FOR NIGHT TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OVER NIGHT  TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                                        break;
                                    } // CASE END FOR NIGHT TIME

                                    default: {// DEFAULT FOT INVALID TIME
                                        System.out.println("ENTER VALID TIME");
                                        break;
                                    } // DEFAULT END FOR INVALID TIMES
                                }

                                break;
                            } // CASE END FOR THRUSDAY
                              //////////////////////////////////////// =========================////
                            case 3: {// CASE FOR FRIDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                                        break;
                                    }
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    } // DEFAULT ENDS FOR INVALID TIME
                                }
                                break;
                            } // CASE END FOR FRIDAY

                            case 4: {// CASE FOR SATURDAY
                                     // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {
                                    case 1: {
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                                        break;
                                    }
                                    case 2: {
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.73.00");
                                        break;
                                    }
                                    default: {// DEFAULT FOR INVALID TIME
                                        System.out.println("ENTER A VALID TIME");
                                        break;
                                    } // DEFAULT ENDS FOR INVALID TIME
                                }
                                break;
                            } // CASE END FOR SATURDAY

                            //////////////////
                            case 5: {// CASE FOR SUNDAY
                                // TAKING TIME INPUT
                                System.out.println(
                                        "ENTER TIME OF ARRIWAL OF VEHICLE \n1 FOR PEAK HOURS \n 2 FOR OFF PEAK HOURS\nAND 3 FOR OVER NIGHT");
                                tm = sc.nextInt();
                                switch (tm) {// SWITCH FOR TIME
                                    case 1: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.76.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 2: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OFF PEAK TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.72.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    case 3: {// CASE FOR PEAK TIME
                                        System.out.println(
                                                "YOU ARRIVED ON OVER NIGHT  TIME /nTHE TOLL APPILED ON YOUR VEHICLE IS Rs.66.00");
                                        break;
                                    } // CASE END FOR REAK TIME

                                    default: {// DEFAULT FOT INVALID TIME
                                        System.out.println("ENTER VALID TIME");
                                        break;
                                    } // DEFAULT END FOR INVALID TIMES
                                }

                                break;
                            } // CASE END FOR SUNDAY

                            default: {// DEFAULT FOR INVALID WEEKDYA SELECTION
                                System.out.println("ENTER THE VALID WEEK DAY INFORMATION");
                                break;
                            } // DEFAULT FOR INVALID WEEKDYA SELECTION
                        }

                        break;
                    } // CASE ENDS FOR WHEN THE USER HAS EZPASS

                    // DEFAULT FOR WHEN THE USER HAS NO EZPASS
                    default: {
                        System.out.println("NO EZPASS DETECTED AMOUNT PAYBALE IN CASH IS Rs.44.00");
                        break;
                    } // DEFAULT CASE ENS FOR WHEN THE USER HAS EZPASS
                }
                break;
            }
            /////////////////////////////////////////////////////// CASE FOR VEHICLE TYPE
            /////////////////////////////////////////////////////// 4//////////////////////////////////////////////////////
            /////////////////////////////////////////////////////// END//////////////////////////////////////////////////////////

            // DEFAULT CONDITION FOR INVALID VEHICLE TYPE
            default: {
                System.out.println("PELASE ENTER A VALID VEHICLE TYPE");
            }

        }

    }
}
