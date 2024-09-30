/*Create a class Product with data members (pid, pname, amount) and declare and define the member function 
1.acceptProduct()-- which accept product details.
2.displayProduct() -- display product information. */

import java.util.Scanner;
class Product
{
    int pid;
    String pname;
    int amount;
    void acceptProduct()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter product id : ");
        pid = sc.nextInt();
        System.out.println("Enter product name : ");
        pname = sc.nextLine();sc.nextLine();
        System.out.println("Enter amonut : ");
        amount = sc.nextInt();
    }
    void displayProduct()
    {
        System.out.println("\t--------: Product Details :------ ");
        System.out.println("\nproduct id : "+pid);
        System.out.println("\nProduct name : "+pname);
        System.out.println("\nProduct amount : "+amount);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter number of product : ");
        int num = sc.nextInt();
        Product p [] = new Product[num];

        for(int i=0;i<p.length;i++)
        {
            p[i] = new Product();
            p[i].acceptProduct();
        }
        for(Product pobj : p)
        {
            pobj.displayProduct();
        }

    }
}