// 36.Create class Product (pid, price, quantity) with parameterized constructor.
// Create a main function in different class (say XYZ) and perform following task:
// a. Accept five product information from user and store in an array
// b. Find Pid of product with highest price
// c. Create method (with array of product's object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product x quantity of product)

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    Product() {
    }

    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    void display() {
        System.out.println("\nProduct id is : " + pid);
        System.out.println("Product Price is : " + price);
        System.out.println("Product quantity is : " + quantity);
    }

    int HighestPrice(Product p[]) {
        double price = p[0].price;
        int pid = 0;
        for (int i = 0; i < p.length; i++) {
            if (price <= p[i].price) {
                price = p[i].price;
                pid = p[i].pid;
            }
        }
        System.out.println("\nHighest Product Price is : " + price);
        return pid;
    }

    double totalAmount(Product p[]) {
        double price = 0;
        for (int i = 0; i < p.length; i++) {
            price += p[i].price * p[i].quantity;
        }
        return price;
    }
}

class Prog36 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Product product[] = new Product[3];
        for (int i = 0; i < product.length; i++) {
            System.out.println("Enter id of Product " + (i + 1));
            int pid = sc.nextInt();
            System.out.println("Enter Price of Product " + (i + 1));
            double price = sc.nextDouble();
            System.out.println("Enter Quantity of Product " + (i + 1));
            int Quantity = sc.nextInt();
            product[i] = new Product(pid, price, Quantity);
            System.out.println();
        }

        for (Product pobj : product) {
            pobj.display();
        }
        Product pobj = new Product();
        System.out.println("Product id of Highest Expensive product :" + pobj.HighestPrice(product));
        System.out.println("Total Expence of Each Product :" + pobj.totalAmount(product));
    }
}
