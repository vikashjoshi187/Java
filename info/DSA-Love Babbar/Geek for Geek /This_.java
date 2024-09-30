
/**
 * this
 */
import java.util.Scanner;

public class This_ {

    int id;
    String name;
    static int playerCount;
    void playerName(String name) {
        this.name = name;
        this.id = ++playerCount; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        This_ obj = new This_();
        This_ obj2 = new This_();

        System.out.println("Enter the name of player");
        String name = sc.nextLine();
        obj.playerName(name);
        System.out.println("The id of player is "+obj.id);



        System.out.println("Enter the name of player");
        String name2 = sc.nextLine();
        obj2.playerName(name2);
        System.out.println("The id of player is "+obj2.id);
        System.out.println(obj2.playerCount);

    }
}