import java.util.Scanner;
public class patient {

    String name;
    int age;
    int id;
    String PGender;
    static int Pcounter;
    int Dc;

    void PateinfDetial(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name of Patient");
        name=sc.nextLine();
        System.out.println("Enter age of Patient");
        age=sc.nextInt();
        System.out.println("Enter 1 for Male 2 for Female ");
        int a=sc.nextInt();
        
        switch (1) {
            case 1:
                PGender="Male";
                break;
                case 2:
                PGender="Female";
                break;
                default:
            System.out.println("Enter a valid number");
            break;
        }

        id=++Pcounter;

        
    }
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter number of patient will handel today");
    int numP=sc.nextInt();
    patient P[]=new patient[numP];
    int counter=0;

        P[0]=new patient();
        P[0].PateinfDetial();

    System.out.println("----------Patient details----------");
    System.out.println("Name is "+P[0].name);
    System.out.println("id P"+P[0].id);
    System.out.println("Gender "+P[0].PGender);
    System.out.println("Age "+P[0].age);






    }
}