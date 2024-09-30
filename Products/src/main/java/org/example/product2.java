import java.io.*;
import java.util.*;

class Product2 implements Serializable {
    static Scanner sc = new Scanner(System.in);
    String name;
    double price;
    int product_id;

    public Product2() {
        System.out.println("Enter Product I'd : ");
        product_id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Product Name : ");
        name = sc.nextLine();
        System.out.println("Enter price");
        price = sc.nextInt();
    }

    public int getId() {
        return product_id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return product_id+"\t"+name+"\t"+price;
    }

    public static void main(String[] args) {
        List<Product2> products = new ArrayList<Product2>();
        System.out.println("Enter Number Of Products : ");
        int num = sc.nextInt();
        for(int i = 0; i < num; i++){
            products.add(new Product2());
        }

        File file = new File("Product\\Product2.txt");

        try (FileOutputStream writer = new FileOutputStream(file);
             ObjectOutputStream oos = new ObjectOutputStream(writer);) {
            oos.writeObject(products);
        } catch (IOException e) {
            System.out.println("Exception : " + e);
        }

        try(FileInputStream reader = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(reader);) {
            List<Product2> obj = (ArrayList<Product2>)ois.readObject();
            for (Product2 product1 : obj) {
                System.out.println(product1);
            }
            double maxprice=0;
            String maxlengthproduct="";
            String smallLenghtproduct= products.get(1).name;
            for (Product2 p: products) {
                if ( p.price > maxprice){
                    maxprice=p.price;
                }
                if (p.name.length()>maxlengthproduct.length()){
                    maxlengthproduct=p.name;
                }

                if (p.name.length()<smallLenghtproduct.length()){
                    smallLenghtproduct=p.name;
                }
            }
            System.out.println("Product With Higest Price is "+maxprice);
            System.out.println("Product With smallest name is "+smallLenghtproduct);
            System.out.println("Product with largest name is "+maxlengthproduct);
        } catch (Exception e) {
            System.out.println("Error : " + e);
        }
    }
}