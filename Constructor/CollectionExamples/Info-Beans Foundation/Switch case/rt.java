import java.util.Scanner;
class vehical{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter vihcal");
    int p,d,v = sc.nextInt();
        float ax;
        double t;
        char o ;
    // ...........vichal 1...........
    switch(v){
           case 1 : System.out.println("Enter payment mode pass for 1 and cash for 2");
                  p = sc.nextInt();
                  switch(p){
                      case 1 : System.out.println("Enter day ");
                               System.out.println("Enter 1 for mon, tue , wed , thu , fri ");
                               System.out.println("Enter 2 for sat ,sun ");
                                d = sc.nextInt();
                                t = sc.nextDouble();
                                System.out.println("Enter time");
                                if(t<0 && t>24){
                                    System.out.println("time vot valid");
                                }
                            else {
                                switch(d){
                                    case 1:
                                             if((t>=6 && t<=10) ||(t>=16 && t<=20)){
                                                System.out.println("peak houre");
                                            }
                                            else{
                                                System.out.println("Off peak houre");
                                            }
                                            break;
                                   
                                    case 2 : System.out.println("Enter time");
                                             t = sc.nextInt();
                                             if((t>=11 && t<=21)){
                                                 System.out.println("peak houre");
                                             }  
                                             else{
                                                 System.out.println("off peak");
                                             } 
                                             break;  
                                    default : System.out.println("invalid day");  
                                    break;                                              
                                }
                            }        

                       case 2 : System.out.println("case Rs. ");
                       break;
                      default : System.out.println("invalid input");
                      break;
                   }
   //   vehical 2...................

case 2 : System.out.println("Enter payment mode pass for 1 and cash for 2");
                  p = sc.nextInt();
                  switch(p){
                      case 1 : System.out.println("Enter days ");
                        System.out.println("Enter 1 for mon, tue , wed ");
                        System.out.println("Enter 2 for thu ");
                        System.out.println("Enter 4 for friday ");
                         System.out.println("Enter 5 for saturday");
                            d = sc.nextInt();
                                System.out.println("Enter time");
                                t = sc.nextDouble();
                                if(t<0 && t>24){
                                    System.out.println("time vot valid");
                                }
                            else {
                                switch(d){
                                   case 1: System.out.println("Enter time");
                                     t = sc.nextDouble();
                                    if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24 )||(t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 2 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                      if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 3 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 4 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;        
                            case 5 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;                 

                                                                    //  d close
                                }
                            }        

                       case 2 : System.out.println("case Rs. ");
                       break;
                      default : System.out.println("invalid input");
                      break;
                   }
// ..........vehical 3..................
case 3 : System.out.println("Enter payment mode pass for 1 and cash for 2");
                  p = sc.nextInt();
                  switch(p){
                      case 1 : System.out.println("Enter days ");
                        System.out.println("Enter 1 for mon, tue , wed ");
                        System.out.println("Enter 2 for thu ");
                        System.out.println("Enter 4 for friday ");
                         System.out.println("Enter 5 for saturday");
                            d = sc.nextInt();
                                System.out.println("Enter time");
                                t = sc.nextDouble();
                                if(t<0 && t>24){
                                    System.out.println("time vot valid");
                                }
                            else {
                                switch(d){
                                   case 1: System.out.println("Enter time");
                                     t = sc.nextDouble();
                                    if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24 )||(t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 2 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                      if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 3 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 4 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;        
                            case 5 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;                 

                                                                    //  d close
                                }
                            }        

                       case 2 : System.out.println("case Rs. ");
                       break;
                      default : System.out.println("invalid input");
                      break;
                   }

// ,,,,,,,,,vehical 4 ..................
case 4 : System.out.println("Enter payment mode pass for 1 and cash for 2");
                  p = sc.nextInt();
                  switch(p){
                      case 1 : System.out.println("Enter days ");
                        System.out.println("Enter 1 for mon, tue , wed ");
                        System.out.println("Enter 2 for thu ");
                        System.out.println("Enter 4 for friday ");
                         System.out.println("Enter 5 for saturday");
                            d = sc.nextInt();
                                System.out.println("Enter time");
                                t = sc.nextDouble();
                                if(t<0 && t>24){
                                    System.out.println("time vot valid");
                                }
                            else {
                                switch(d){
                                   case 1: System.out.println("Enter time");
                                     t = sc.nextDouble();
                                    if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24 )||(t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 2 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                      if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 3 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 4 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;        
                            case 5 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;                 

                                                                    //  d close
                                }
                            }        

                       case 2 : System.out.println("case Rs. ");
                       break;
                      default : System.out.println("invalid input");
                      break;
                   }
// ,,,,,,,,,,,,,,,,,,,,,,,,,vehical 5 ............
case 5 : System.out.println("Enter payment mode pass for 1 and cash for 2");
                  p = sc.nextInt();
                  switch(p){
                      case 1 : System.out.println("Enter days ");
                        System.out.println("Enter 1 for mon, tue , wed ");
                        System.out.println("Enter 2 for thu ");
                        System.out.println("Enter 4 for friday ");
                         System.out.println("Enter 5 for saturday");
                            d = sc.nextInt();
                                System.out.println("Enter time");
                                t = sc.nextDouble();
                                if(t<0 && t>24){
                                    System.out.println("time vot valid");
                                }
                            else {
                                switch(d){
                                   case 1: System.out.println("Enter time");
                                     t = sc.nextDouble();
                                    if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24 )||(t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 2 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                      if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=0 && t<6)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 3 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;
                            case 4 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=6 && t<=10)||(t>=16 && t<=20)){
                                         System.out.println("Peak houre ");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;        
                            case 5 : System.out.println("Enter time ");
                                     t =sc.nextDouble();
                                     if((t>=11 && t<=21)){
                                         System.out.println("Peak houre ");
                                     }
                                     else if((t>=10 && t<24)){
                                         System.out.println("overnight houre");
                                     }
                                     else{
                                         System.out.println("off pick houre");
                                     }
                                     break ;                 

                                                                    //  d close
                                }
                            }        

                       case 2 : System.out.println("case Rs. ");
                       break;
                      default : System.out.println("invalid input");
                      break;
                   }
                }
            }
        }

// ................6.....................
// case 6 : System.out.println("Enter payment mode pass for 1 and cash for 2");
//                   p = sc.nextInt();
//                   switch(p){
//                       case 1 : System.out.println("Enter days ");
//                         System.out.println("Enter 1 for mon, tue , wed ");
//                         System.out.println("Enter 2 for thu ");
//                         System.out.println("Enter 4 for friday ");
//                          System.out.println("Enter 5 for saturday");
//                             d = sc.nextInt();
//                                 System.out.println("Enter time");
//                                 t = sc.nextDouble();
//                                 if(t<0 && t>24){
//                                     System.out.println("time vot valid");
//                                 }
//                             else {
//                                 switch(d){
//                                    case 1: System.out.println("Enter time");
//                                      t = sc.nextDouble();
//                                     if((t>=6 && t<=10)||(t>=16 && t<=20)){
//                                         //  System.out.println("Peak houre ");
//                                         System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                          System.out.println("Peak houre rs"+ (114.00+(ax*19.00)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                          System.out.println("Peak houre rs 114.00");

//                                     }
//                                       }
//                                      else if((t>=10 && t<24 )||(t>=0 && t<6)){
//                                         //  System.out.println("overnight houre");
//                                         System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                         System.out.println("overnight houre rs"+ (99.00+(ax*16.50)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                         System.out.println("overnight houre rs. 99.00");
//                                     }
//                                      }
//                                      else{
//                                         //  System.out.println("off pick houre");
//                                           System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                      System.out.println("off pick houre rs"+ (108.00+(ax*18.00)));

                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                      System.out.println("off pick houre rs 108.00");


//                                     }
//                                       }
//                                      break ;
//                             case 2 : System.out.println("Enter time ");
//                                      t =sc.nextDouble();
//                                       if((t>=6 && t<=10)||(t>=16 && t<=20)){
//                                         //  System.out.println("Peak houre ");
//                                           System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                          System.out.println("Peak houre rs"+ (114.00+(ax*19.00)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                          System.out.println("Peak houre rs 114.00");

//                                     }
//                                      }
//                                      else if((t>=0 && t<6)){
//                                         //  System.out.println("overnight houre");
//                                         System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                         System.out.println("overnight houre rs"+ (99.00+(ax*16.50)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                         System.out.println("overnight houre rs. 99.00");
//                                     }
//                                      }
//                                      else{
//                                         //  System.out.println("off pick houre");
//                                          System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                      System.out.println("off pick houre rs"+ (108.00+(ax*18.00)));

                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                      System.out.println("off pick houre rs 108.00");


//                                     }
//                                      }
//                                      break ;
//                             case 3 : System.out.println("Enter time ");
//                                      t =sc.nextDouble();
//                                      if((t>=11 && t<=21)){
//                                         //  System.out.println("Peak houre ");
//                                           System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                          System.out.println("Peak houre rs"+ (114.00+(ax*19.00)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                          System.out.println("Peak houre rs 114.00");

//                                     }
//                                      }
//                                      else{
//                                         //  System.out.println("off pick houre");
//                                          System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                      System.out.println("off pick houre rs"+ (108.00+(ax*18.00)));

                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                      System.out.println("off pick houre rs 108.00");


//                                     }
//                                      }
//                                      break ;
//                             case 4 : System.out.println("Enter time ");
//                                      t =sc.nextDouble();
//                                      if((t>=6 && t<=10)||(t>=16 && t<=20)){
//                                         //  System.out.println("Peak houre ");
//                                           System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                          System.out.println("Peak houre rs"+ (114.00+(ax*19.00)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                          System.out.println("Peak houre rs 114.00");

//                                     }
//                                      }
//                                      else{
//                                         //  System.out.println("off pick houre");
//                                          System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                      System.out.println("off pick houre rs"+ (108.00+(ax*18.00)));

                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                      System.out.println("off pick houre rs 108.00");


//                                     }
//                                      }
//                                      break ;        
//                             case 5 : System.out.println("Enter time ");
//                                      t =sc.nextDouble();
//                                      if((t>=11 && t<=21)){
//                                         //  System.out.println("Peak houre ");
//                                           System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                          System.out.println("Peak houre rs"+ (114.00+(ax*19.00)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                          System.out.println("Peak houre rs 114.00");

//                                     }
//                                      }
//                                      else if((t>=10 && t<24)){
//                                         //  System.out.println("overnight houre");
//                                         System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                         System.out.println("overnight houre rs"+ (99.00+(ax*16.50)));
                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                         System.out.println("overnight houre rs. 99.00");
//                                     }
//                                      }
//                                      else{
//                                         //  System.out.println("off pick houre");
//                                          System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                      System.out.println("off pick houre rs"+ (108.00+(ax*18.00)));

                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                      System.out.println("off pick houre rs 108.00");


//                                     }
//                                      }
//                                      break ;                 

//                                                                     //  d close
//                                 }
//                             }        

//                        case 2 : System.out.println("case Rs. ");
//                                 System.out.println("Do you have an extra axles");
//                                     o = sc.next().charAt(0);
//                                     if(o == 'y' || o == 'Y'){
//                                        System.out.println("Enter number of axles");
//                                        ax = sc.nextInt();
//                                        if(ax>=0 && ax<=10){
//                                      System.out.println("cash rs"+ (132.00+(ax*22.00)));

                                       
//                                        }
//                                     else{
//                                          System.out.println("plz enter axles between 1 to 10");

//                                     }
//                                     }
//                                     else{
//                                      System.out.println("cash rs 132.00");


//                                     }
//                        break;
//                       default : System.out.println("invalid input");
//                       break;
//                    }