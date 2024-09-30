/* 22.Create a class FourWheeler with two data member(category and amount).Declare two members functions.
   a)char getCategory() :- which returns category
   b)int getamount():- which returns amoun  
   Create another class Car with two data members (brand and model).
   Declare two member function:- 
   a)getDetail():- which accepts the brand, model, category and amount of a Car
   b)showDetail():- which displays the category, amount, brand and model.  */

import java.util.Scanner;
class Fourwheeler {
    char category;
    int amount;

    char getCategory(char category) {
        this.category = category;
        return category;

    }

    int getAmount(int amount) {
        this.amount = amount;
        return amount;
    }
}

class Car extends Fourwheeler {
    String brand;
    String model;

    void getDetails(String brand, String model, char category, int amount) {
        getCategory(category);
        getAmount(amount);
        this.brand = brand;
        this.model = model;
    }

    void showDetails() {
        System.out.println("Brand of the car " + brand);
        System.out.println("Model of the car " + model);
        System.out.println("Category of the car " + getCategory(category));
        System.out.println("Price of the car " + getAmount(amount));

    }
}

public class Prog22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter Brand of the car:- ");
        String brand = sc.nextLine();
        System.out.println("enter Model of the car:- ");
        String model = sc.nextLine();
        System.out.println("enter category of the car:- ");
        char category = sc.next().charAt(0);
        System.out.println("enter Price of the car:- ");
        int price = sc.nextInt();
        Car obj = new Car();
        obj.getDetails(brand, model, category, price);
        obj.showDetails();
    }
}