import java.util.Scanner;


public class car_fs_22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch, size, f, cpn;
        double ds, pd, pcc, pfc, dis, tdp;
        System.out.println("do you want to rent a car Enter your choice in Y is for yes  or N is for no ");
        ch = sc.next().charAt(0);
        if (ch == 'y' || ch == 'Y') {
            System.out.println("Enter which type of car do you want");
            size = sc.next().charAt(0);
            if (size == 'C' || size == 'c') {
                System.out.println("Your rented car size is compact ");
                System.out.println("Enter the price for renting the car");
                pcc = sc.nextDouble();

                System.out.println("Do you have coupon enter answer in Y for yes  or N for no");
                cpn = sc.next().charAt(0);
                if (cpn == 'y' || cpn == 'Y') {
                    System.out.println("Enter how much dicount is mentioned in coupon");
                    pd = sc.nextDouble();
                    System.out.println("Enter the price for renting the car");
                    pcc = sc.nextDouble();
                    dis = (pcc / 100) * pd;
                    tdp = pcc - dis;
                    System.out.println(
                            "Congratulation you have 7% off on the rentd car \nThe discounted price is Rs." + tdp);
                } else {
                    System.out.println("No cupon code the price for rented car is " + pcc);
                }
            }
             else if (size == 'f' || size == 'F') {
                System.out.println("Your rented car size is full-size");
                System.out.println("Enter the price for renting the car");
                pfc = sc.nextDouble();
                System.out.println("Do you have coupon enter answer in Y for yes  or N for no");
                cpn = sc.next().charAt(0);

                if (cpn == 'y' || cpn == 'Y') {
                    System.out.println("Enter how much dicount is mentioned in coupon");
                    pd = sc.nextDouble();

                    dis = (pfc / 100) * pd;
                    tdp = pfc - dis;
                    System.out.println(
                            "Congratulation you have 7% off on the rentd car \nThe discounted price is Rs." + tdp);
                } else {
                    System.out.println("No cupon code the price for rented car is " + pfc);
                }
            }
        } else if (ch == 'n' || ch == 'N') {
            System.out.println("You don't need a car");
        } else {
            System.out.println("Invalid choice");
        }
    }
}
