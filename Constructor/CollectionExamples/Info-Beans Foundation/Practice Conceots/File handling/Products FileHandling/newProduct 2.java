import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

class produtcs_File {
    static Scanner sc = new Scanner(System.in);
    private String name;
    private double price;
    private int product_id;

    public produtcs_File() {
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

    public static void main(String[] args) {
        double maxPrice = 0;
        String maxProductName = "";
        System.out.println("Enter Number of Products ");
        byte num = sc.nextByte();
        produtcs_File[] products = new produtcs_File[num];
        String MaxlengpNme = "";
        for (int i = 0; i < products.length; i++) {
            products[i] = new produtcs_File();
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxProductName = products[i].name;

            }
            if (products[i].name.length() > MaxlengpNme.length()) {
                MaxlengpNme = products[i].name;
            }
        }

        try (FileWriter writer = new FileWriter(
                "/Users/vikasjoshi/Desktop/Info-Beans Foundation/Practice Conceots/File handling/products.txt")) {
            writer.write("Product Id\tName\tPrice\n");

            for (produtcs_File product : products) {
                writer.write(
                        "\t" + product.getId() + " \t   " + product.getName() + " \t " + product.getPrice() + "\n");
            }

            writer.write("\nProduct Maximum price : " + maxPrice);
            writer.close();

            System.out.println("Product with greatest price ");
            System.out.println("Name : " + maxProductName);
            System.out.println("Price : " + maxPrice);
            System.out.println("Product With Maximum Lenght " + MaxlengpNme);

        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            File read = new File("/Users/vikasjoshi/Desktop/Info-Beans Foundation/Practice Conceots/File handling/products.txt");
            Scanner myReader = new Scanner(read);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (Exception e) {
    }
    }
}