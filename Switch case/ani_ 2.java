import java.util.Scanner;
public class ani_ {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a color ");
        String clr=sc.next();
        switch (clr) {
            case "LION":
            case "Lion":
            case "lioN":
            case "lIOn":
            case "LIoN":
            case "lion":
            System.out.println("animal is LION");
            break;
            case "CAT":
            case "cat":
            case "cAt":
            case "caT":
            case "Cat":
            System.out.println("animal is CAT");
            break;

            case "DOG":
            case "Dog":
            case "dOg":
            case "DOg":
            case "doG":
            case "dog":
            System.out.println("Animal is DOG");
            break;
        
            default:
            System.out.println("not case animal matched");
                break;
        }
    }
}
