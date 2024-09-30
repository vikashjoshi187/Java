import java.util.Scanner;
class oBHK
{
    double hallarea,roomarea,price;
    oBHK()
    {
        hallarea = 0.0;
        roomarea = 0.0;
        price = 0.0;
    }
    oBHK(double hallarea,double roomarea,double price)
    {
        this.hallarea = hallarea;
        this.roomarea = roomarea;
        this.price = price;
    }
    void show()
    {
        System.out.println("area of hall:"+hallarea);
        System.out.println("area of room:"+roomarea);
        System.out.println("price of flat:"+price);
    }
}
class tBHK extends oBHK
{

    double room2area;
    tBHK()
    {
        room2area = 0.0;
    }
    tBHK(double hallarea,double roomarea,double price,double room2area)
    {
        super(hallarea, roomarea, price);
        this.room2area = room2area;
    }
      @Override
      void show()
    {
        System.out.println("area of hall:"+hallarea);
        System.out.println("area of room:"+roomarea);
        System.out.println("price of flat:"+price);
        System.out.println("area of second room:"+room2area);
    }
   
}
class Ass13_40_oops {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        tBHK[] flats = new tBHK[3];
        for(int i =0;i<flats.length;i++)
        {
            System.out.println("\n\nEnter Information of Flat "+(i+1));
            System.out.println("\nenter hall area:");
            double hallarea = sc.nextDouble();
            System.out.println("enter area first Room :");
            double roomarea = sc.nextDouble();
            System.out.println("enter area of second room:");
            double room2area = sc.nextDouble();
            System.out.println("enter price :");
            double price = sc.nextDouble();
            flats[i] = new tBHK(hallarea,roomarea,price,room2area);
        }
        double totalprice = 0;
        for(int i=0;i<flats.length;i++)
        {
            System.out.println("\n\nDetails of Flat "+(i+1));
            flats[i].show();
            totalprice+=flats[i].price;
        }
        System.out.println("Total price of three 2BHK flats:"+totalprice);
    }
}
