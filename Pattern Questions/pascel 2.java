import java.util.Scanner;
public class pascel{/*
        1 
       1 1 
      1 2 1 
     1 3 3 1 
    1 4 6 4 1 
   1 5 10 10 5 1 
  1 6 15 20 15 6 1
     */
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        for(int i =0;i<row;i++){
            for(int sp=0;sp<=row-i;sp++){
                System.out.print(" ");
            }
                for(int j=0;j<=i;j++){
                    int ifact = 1;
                    int jfact = 1;
                    int ijfact = 1;
                    for(int x =1;x<=i;x++){
                        ifact *= x;
                    }
                    for(int x =1;x<=j;x++){
                        jfact *= x;
                    }
                    for(int x =1;x<=(i-j);x++){
                        ijfact *= x;
                    }
                System.out.print(ifact/(jfact*ijfact)+" ");
                }
                System.out.println();
        }
    }
}