   
                 // GETTING VEHICLES INFORMATION
                 System.out.println(
                     "Enter 1 for VEHICLES WITH TWO AXLES AND SINGLE REAR WHEELS \nENTER 2 FOR 2 VEHICLES WITH TWO AXLES AND DUAL REAR WHEELS \nENRER 3 FOR VEHICLES WITH THREE AXLES \nENTER 4 FOR VEHICLES WITH FOUR AXLES \nENTER 5 FOR VEHICLES WITH FIVE AXLES \nENTER 6 FOR VEHICLES WITH AT LEAST SIX AXLES  \nENTER 7 FOR CLASS 1 OR 11 INCLUDING CLASS 1 RECREATIONAL VEHICLES) WITH TRAILER \nENTER 8 FOR TWO AXLE BUSES AND MINI BUSES* \nENTER 9 FOR THREE AXLE BUSES AND MINI BUSES* \nENTER 10 FOR MOTORCYCLE ");
             vcl = sc.nextInt();
            // CONDITION FOR VALID VEHICLE TYPE
             if(vcl<=10){
                 System.out.println(
                     "ENTER 1 FOR MONDAY \nENTER 2 FOR TUESDAY \nENTER 3 FOR WEDNESDAY\nENTER 4 FOR THRUSDAY\nENTER 5 FOR FRIDAY\nENTER 6 SATURDAY\nENTER 7 FOR SUNDAY  ");
             wekd = sc.nextInt();
             //CONDTION FOR  VALID DAY
             if(wekd<=7){
                 System.out.println("ENTER TIME OF ARRIWAL OF VEHICLE");
                 tm = sc.nextFloat();
         
                     System.out.println("ENTER P FOR EZPASS C FOR CASH");
                     ezps = sc.next().charAt(0);
                 //CONDITION FOR EZPASS
                 if(ezps=='p' || ezps=='P'){
                     System.out.println("YOU HAVE EZPASS");
                 }
                 //ELSE CONDITION FOR CASH 
                 else{
                     System.out.println("NO EZPASS DETECTED PAY BAY CASH");
                 }
         
                 }
                 //ELSE CONDITION FOR INVALID TIME
                 else{
                     System.out.println("PLEASE ENTER VALID TIME");
                 }
         
             }
             //ELSE CONDITION FOR INVALID WEEK DYA
             else{
                 System.out.println("PLEASE ENTER VALID WEEK DAY");
             }
         }
             //ELSE CONDITION FOR INVALID VEHICLE TYPE
             else{
                 System.out.println("PLEASE ENTER VALID VEHICLE TYPE");
             }
             