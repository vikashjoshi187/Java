import java.util.Scanner;
public class I_vote_19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char i;
        int age;
        
        System.out.println("Enter the first letter of your character");
        i=sc.next().charAt(0);
        System.out.println("Enter your age");
        age=sc.nextInt();

        if (i==105 || i==73) {
            if(age>=18){
                System.out.println("You can vote");
            }
        }
        else{
            System.out.println("not a indian can't vote");
        }


    }
}
