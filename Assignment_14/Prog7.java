/*7. Write a program to read data from shopping.dat file creted in above problem and find total money spent on all shopping items. . (Use ObjectInputStream to read Item class object ). */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

class Prog7 {
    public static void main(String[] args) {
        try {
            FileInputStream fileIn = new FileInputStream(
                    "C:\\Users\\Mahakal\\Desktop\\InfoBean\\Assignment_14\\Prog6_shopping.dat");
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);

            double totalAmount = 0.0;
            boolean endOfFile = false;

            while (!endOfFile) {
                try {
                    Prog6 item = (Prog6) objectIn.readObject();
                    System.out.println(item.getClass());
                    totalAmount += item.getprice();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    endOfFile = true;
                }
            }
            objectIn.close();

            System.out.println("Total money spent on all shopping items: $" + totalAmount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
