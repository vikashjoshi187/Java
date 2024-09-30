import java.util.Scanner;
public class frrmula_05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar;
        float pi=3.14f,r,b,h;
        System.out.println("ENTER 1 FOR AREA OF CIRCLE\nENTER 2 FOR AREA OF SQUARE\nENTER 3 FOR RECTANGLE\nENTER 4 FOR AREA OF TRAPZOID");
        ar=sc.nextInt();
        switch (ar) {
            case 1:{
            System.out.println("ENTER RADIUS OF CIRCLE");
            r=sc.nextFloat();
            r=pi*(r*r);
            System.out.println("THE AREA OF CIRCLE IS "+r);
            break;
            }

            case 2:{
                System.out.println("ENTER SIDE OF SQUARE");
                r=sc.nextFloat();
                r=r*r;
                System.out.println("THE AREA OF CIRCLE IS "+r);
            }

            case 3:{
                System.out.println("ENTER LENGHT OF RECTANGLE");
                r=sc.nextFloat();
                System.out.println("ENTER BREATH OF RECTANGLE");
                b=sc.nextFloat();
                r=r*b;
                System.out.println("THE AREA OF RECTANGLE IS "+r);
            }

            case 4:{
                System.out.println("ENTER BASE 1 OF TRAPAZOID");
                r=sc.nextFloat();
                System.out.println("ENTER BASE 2 OF TRAPAZOID");
                b=sc.nextFloat();
                System.out.println("ENTER HEIGHT OF TRAPAZOID");
                h=sc.nextFloat();
                r=((r+b)/2)*h;
                System.out.println("THE AREA OF TRAPAZOID IS "+r);
            }
            default:{System.out.println("INVAlID NUMBER ENTERED");
                break;}
        }
    }
}
