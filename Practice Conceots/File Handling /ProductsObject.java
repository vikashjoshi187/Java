
import java.io.*;
import java.util.Scanner;

public class ProductsObject implements Serializable{

    int id;
    String pName, desc;
    float price;

    ProductsObject(int id, String pName, String desc, float price) {

        this.id = id;
        this.pName = pName;
        this.desc = desc;
        this.price = price;
    }

    @Override
    public String toString() {
        return id + " " + pName + " " + price + " " + desc;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number of  products");
        int size = sc.nextInt();

        ProductsObject[] proArr = new ProductsObject[size];

        for (int i = 0; i < proArr.length; i++) {

            System.out.println("Enter product id \n ");
            int id = sc.nextInt();

            sc.nextLine();

            System.out.println("Enter product Name \n ");
            String pName = sc.nextLine();

            System.out.println("Enter product price \n ");
            float price = sc.nextFloat();
            sc.nextLine();

            System.out.println("Enter product Description \n ");
            String desc = sc.nextLine();
            proArr[i] = new ProductsObject(id, pName, desc, price);
        }

        File file = new File(
                "/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas.txt");

        try (FileOutputStream fout = new FileOutputStream(file, true);
                ObjectOutputStream oos = new ObjectOutputStream(fout);) {

            oos.writeObject(proArr);
            System.out.println("Data Inserted Sucessfully!!!!");

        } catch (Exception e) {
            System.out.println("This is Error " + e);
        }
        
        
        
        
        System.out.println("--------------------------------------------------------------------");
        try (FileInputStream fin=new FileInputStream(file);
            ObjectInputStream obin=new ObjectInputStream(fin)){
            ProductsObject pobjArr[]=(ProductsObject[])obin.readObject();

                for (ProductsObject productsObject : pobjArr) {

                    System.out.println(productsObject+"\n");
                    
                }



            
        } catch (Exception e) {
            System.out.println("This is Error " + e);

        }


        sc.close();
       

    }

}
/*
 *this variations
 * Constructor
 * String 
 * Exception
 * File handling
 * interface
 * Abstraction
 * 
 */