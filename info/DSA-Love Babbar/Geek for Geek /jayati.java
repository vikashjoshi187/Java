import java.util.Scanner;
class Deatil {

    String name;
    int rollnumber;
    int subject;
    double avg;
    String c;

    void getdeatilstudent() {
        int parsent = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student name");
        name = sc.nextLine();
        System.out.println("Enter roll number : ");
        rollnumber = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter class : ");
        c = sc.nextLine();
        System.out.println("Enter five subject mark : ");
        int mark[] = new int[5];
        System.out.println("Enter mark");
        int i;
        for (i = 0; i < mark.length; i++) {
            mark[i] = sc.nextInt();
            parsent = (parsent + mark[i]);
        }
        double avg = parsent / 5;
        System.out.println("Student paesent : " + avg);
        this.avg = avg;
    }

    void show(Deatil d[]) {
        System.out.println(":----------Student Detail---------:");
        System.out.println("\nStudent Name : " + name);
        System.out.println("\nStudent roll Number : " + rollnumber);
        System.out.println("\nStudent class : " + c);
        System.out.println("\nStudent parsent : " + avg);
        
        for (int i = 0; i < d.length; i++) {
            double avg = d[0].avg;
            if (avg <= d[i].avg) {
                avg = d[i].avg;
            }
        }
        System.out.println("\n\tmimumam avg is : " + avg);
    }
}

class Student {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student number : ");
        int num = sc.nextInt();

        Deatil d[] = new Deatil[num];
    
        for (int i = 0; i < d.length; i++) {
            d[i] = new Deatil();
            d[i].getdeatilstudent();
        }
        System.out.println("Do You want See Deatil yes No : 1  ");
        int no = sc.nextInt();
        switch (no) {
            case 1:
                for (Deatil obj : d) {
                    obj.show(d);
                }
                break;
            default:
                System.out.println("Invalide selection : ");
        }
    }
}