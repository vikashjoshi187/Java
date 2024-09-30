
import java.util.Scanner;

public class Vacination_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age,p=0, y;
        String name=null, add,sn=null,fn=null;
        System.out.println("ENTER CHILD NAME");
        name = sc.next();
        sc.nextLine();
        System.out.println("IS YOUR CHILD AGE IN MONTHS OR IN YEARS PRESS 1 FOR MONTH PRESS 2 FOR YEAR");
        y = sc.nextInt();
        System.out.println("ENTER CHILDS AGE");
        age = sc.nextInt();
        System.out.println("ENTER CHILD ADDRESS");
        add = sc.next();

        if (y == 1) {
            switch (age) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 4:
                    sn="DTwP B 1 DaP booster -1";
                    fn=" Diphtheria, Pertussis, and Tetanus";
                    p=225;
                    break;

                case 6:
                case 7:
                case 8:
                case 9:
                case 10:
                    sn="IPV B 1";
                    fn="FULL NAME Inactivated polio vaccine";
                    p=440;
                    break;

                case 11:
                case 12:
                sn="VACCINE REQURIRED Hib B1";
                fn="Haemophilus influenzae type B";
                p=252;
                    break;

                default: {

                    break;
                }
            }

        }
        else if(y==2){
            switch (age) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 4:
                sn=" DTwP B 1 DaPQ booster -9";
                fn="FULL NAME Diphtheria, Pertussis, and Tetanus";
                p=3250;
                    break;
            }

        }

        else{
            System.out.println("INVALID SELECTION");
        }

       

        System.out.println("VACCINATED");
        System.out.println("NAME IS " + name);
        System.out.println("AGE IS " + age);
        System.out.println("ADDRESS IS " + add);
        System.out.println("VACCINES REQUIRED "+sn);
        System.out.println("FULL NAME "+fn);
        System.out.println("PRICE IS Rs."+p);

    }

}
