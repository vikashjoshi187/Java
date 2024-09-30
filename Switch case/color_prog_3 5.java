import java.util.Scanner;
public class color_prog_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a color ");
        String clr=sc.next();
        switch (clr) {
            case "red":
            case "Red":
            case "RED":
            case "rEd":
            case "reD":
            System.out.println("RED COLOR");
            break;
            case "Blue":
            case "BLUE":
            case "BluE":
            case "bluE":
            System.out.println("Blue color");
            break;

            case "green":
            case "GREEN":
            case "Green":
            case "greeN":
            System.out.println("Green color");
            break;
        
            default:
            System.out.println("not case color matched");
                break;
        }
    }
}
