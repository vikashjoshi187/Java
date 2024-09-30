
/*  25.Create a class Publication with two data members (title and price).Declare two member function:-
    a)getData():- for accepting data from user.
    b)putData():- for displaying data.
    
    Create another class Sales with three data member ((s1,s2,s3) which accepts the sales of three months).
    Declare two member function :-
    a)getSales():- for accepting three month sales. 
    b)showsales():- for displaying sales.
    
    Create one more class Book with one data member (pages).
    Declare two member function :- 
    a)getBookDetail():- which accepts the book details which includes title, price, sales and pages. 
    b)showBookDetail():- which displays the book details which includes title, price, sales and pages. */
import java.util.Scanner;
class sales {
    int s1, s2, s3;

    void getsales(int s1, int s2, int s3) {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }
}

class Publication extends sales {
    private String title;
    private double price;

    void getData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter title : ");
        title = sc.nextLine();
        System.out.println("Enter price  : ");
        price = sc.nextDouble();
    }

    void PutData() {
        System.out.println("Title  : " + title);
        System.out.println("price  : " + price);
    }

    void showsales() {
        System.out.println("sales 1 : " + s1);
        System.out.println("sales 2 : " + s2);
        System.out.println("sales 3 : " + s3);
    }
}

class demo {
    public static void main(String args[]) {
        Publication obj = new Publication();
        obj.getData();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three sales : ");
        int s1 = sc.nextInt();
        int s2 = sc.nextInt();
        int s3 = sc.nextInt();

        obj.getsales(s1, s2, s3);
        obj.PutData();
        obj.showsales();
    }
}