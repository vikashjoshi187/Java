import java.util.Scanner;

public class loppschar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();

        // for A
        /*for (int i = num; i >= 1; i--) {

            if (i == num / 2) {
                for (int j = 1; j <= num / 2; j++) {
                    System.out.print("*");

                }

            }
            for (int j = 1; j <= num; j++) {
                if (j == i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }
            for (int j = num; j >= 1; j--) {
                if (j == i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();

        }*/
//FOR A
        if (num % 2 != 0) {
            num++;

        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if ( i == 1 || j == 1 || j == num || i == num / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");

















        // FOR B

        if (num % 2 != 0) {
            num++;

        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || i == 1 || j == 1 || j == num || i == num / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        // FOR C

        System.out.println("\n\n");
        if (num % 2 != 0) {
            num++;

        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || i == 1 || j == 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");
        // FOR D

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || i == 1 || j == 1 || j == num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");
        // for E

        if (num % 2 != 0) {
            num++;

        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || i == 1 || j == 1 || i == num / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");
        // for F

        if (num % 2 != 0) {
            num++;

        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == 1 || j == 1 || i == num / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");
        // for G error

        if (num % 2 != 0) {
            num++;

        }
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (j > i / 2 || j == 1 || i == num / 2) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");
        // for H
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num / 2 || j == 1 || j == num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        // for I
        System.out.println("\n\n");

        if (num % 2 == 0) {
            num++;

        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (j == (num / 2) + 1 || i == 1 || i == num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }






        // for J
        System.out.println("\n\n");

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (j == num  || (i >=num-2 && j==1)|| i == num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }



        // for K
        System.out.println("\n\n");

        for (int i = 0; i < num/2; i++) {
            for (int j = 1; j <= num/2; j++) {

                if (j == 1 || j==(num/2)-i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        for (int i = 2; i <= num/2; i++) {
            for (int j = 1; j <= num/2; j++) {

                if (j == 1 || j==i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }





        System.out.println("\n\n");
        // FOR L

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || j == 1) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");


          // FOR M

          for (int i = 1; i <= num/2; i++) {
            for (int j = 1; j <= num/2; j++) {

                if ( j == 1|| j==i ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            for (int j = num/2; j >=1; j--) {

                if ( j == 1|| j==i ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");



        
        
        
        
        
        
        
        // FOR N

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if ( j == 1|| j==num || j==i ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }




        System.out.println("\n\n");
        // FOR O

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || i == 1 || j == 1 || j == num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }




        
        
        
        System.out.println("\n\n");
        // FOR P

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == (num/2)+1 || i == 1 || j == 1 || (i <= (num/2)+1)&& j==num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");

        // for Q
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || i == 1 || j == 1 || j == num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }
                if (i == num && j == num) {
                    for (int k = 1; k <= num / 2; k++) {
                        System.out.print("*");
                    }

                }
            }
            System.out.println();

        }

        System.out.println("\n\n");


        // FOR R

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == (num/2)+1 || i == 1 || j == 1 || (i <= (num/2)+1) && j==num || (i>num/2)&&j==i) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }





        System.out.println("\n\n");
        // FOR S
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (i == num || i== (num/2)+1|| i == 1 || i<=num/2 && j == 1 || i>=(num/2)+1 && j == num ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }








       
        System.out.println("\n\n");
 // for T
        if (num % 2 == 0) {
            num++;

        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (j == (num / 2) + 1 || i == 1 ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }




        // for U
        System.out.println("\n\n");

        if (num % 2 == 0) {
            num++;

        }

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {

                if (j == 1 || j==num || i == num) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        
        
        
        
        
        
        //for v 
        
        for (int i = 1; i <= num; i++) {

            for (int j = 1; j <= num; j++) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            for (int j = num; j >=1; j--) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }









        //for W 
        
        for (int i = num; i >= 1; i--) {
            for (int j = 1; j <= num/2; j++) {

                if ( j == 1|| j==i ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            for (int j = num/2; j >=1; j--) {

                if ( j == 1|| j==i ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }

        System.out.println("\n\n");
        
         
        
        
        
        
        //for X
        
        for (int i = 1; i <= num/2; i++) {

            for (int j = 1; j <= num/2; j++) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            for (int j = num/2; j >=1; j--) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
         
        for (int i = num/2; i >= 1; i--) {
            for (int j = 1; j <= num/2; j++) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            for (int j = num/2; j >=1; j--) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }







        //for Y 
        System.out.println("\n\n");
        
        for (int i = 1; i <= num/2; i++) {

            for (int j = 1; j <= num/2; j++) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }

            for (int j = num/2; j >=1; j--) {
                if(j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
          
        for (int j = 1; j <= num; j++) {

                for (int j2 = 1; j2 < num; j2++) {
                    if (j2==num) {
                        System.out.print("*");
                        
                    }
                    else{
                        System.out.print(" ");
                    }
                    System.out.println();
                    
                }
                
            }


            // FOR Z

        for (int i = 1; i <= num; i++) {
            for (int j = num; j >= 1; j--) {

                if (   j==i|| i==1 || i==num ) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");
                }

            }
            System.out.println();

        }
        




















    }

}
