/*6.Write a program to store your shopping details in a binary file(shopping.dat) with information itemName, price, quantity. (Use ObjectOutputStream to store Item class object ) */
import java.io.*;

public class Prog6 implements Serializable {
    private String itemName;
    private double price;
    private int quantity;

    public Prog6(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void main(String[] args) {
        String fileName = "C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Details.txt";

        Prog6 Register = new Prog6("Register", 78.56, 12);
        Prog6 pen = new Prog6("Pen", 14.99, 1);
        Prog6 Scale = new Prog6("Scale", 5.99, 3);

        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName);
            ObjectOutputStream oos = new ObjectOutputStream(fileOutputStream)) {
            oos.writeObject(Register);
            oos.writeObject(pen);
            oos.writeObject(Scale);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double getprice() {
    return price;
    }
}
