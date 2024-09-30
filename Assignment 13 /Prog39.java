import java.util.Scanner;
class OneBHK{
     double roomArea;
     double hallArea;
     double price;

     OneBHK(){
            this.roomArea=0.0;
            this.hallArea=0.0;
            this.price=0.0;
    }

     OneBHK(double roomArea,double hallArea,double price){
        this.roomArea=roomArea;
        this.hallArea=hallArea;
        this.price=price;
    }

    public void show(){
        System.out.println("Room area : "+this.roomArea);
        System.out.println("Hall area : "+this.hallArea);
        System.out.println("Price : "+this.price);
    }
}
class Prog39 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter Area of Room");
        double roomArea=sc.nextDouble();
        System.out.println("Enter Area of Hall");
        double hallArea=sc.nextDouble();
        System.out.println("Enter price ");
        double price=sc.nextDouble();

        OneBHK obj=new OneBHK();
        System.out.println("Show mathod call by obj");
        obj.show();
        OneBHK obj1=new OneBHK(roomArea,hallArea,price);
        System.out.println("\nShow mathod call by obj1");
        obj1.show();

    }
}
