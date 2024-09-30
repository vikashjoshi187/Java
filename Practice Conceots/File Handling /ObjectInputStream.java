
/**
 * ObjectInputStream
 */
import java.io.*;

class objectInputStream implements Serializable {

    int age;
    String name;
    double per;

    objectInputStream(int age, String name, double per) {
        this.age = age;
        this.name = name;
        this.per = per;
    }

    @Override
    public String toString() {
        return age + " " + name + " " + per;
    }

    public static void main(String[] args) {
        objectInputStream obj2 = new objectInputStream(31, "Addrew", 78.9);
        File file = new File(
                "/Users/vikasjoshi/Desktop/Info-Beans Foundation/JAVA /Practice Conceots/FileHandling/AartiJoshiFolder/vikas.txt");

        try (FileOutputStream fout = new FileOutputStream(file, true);

                ObjectOutputStream oos = new ObjectOutputStream(fout);) {
            oos.writeObject(obj2);
            System.out.println("Data Written Sucessfully!!!");

        } catch (Exception e) {
            System.out.println(e);
        }

        // --------------------------------------reading file throw object
        // inputstream-------------------

        try (FileInputStream fin = new FileInputStream(file);
                ObjectInputStream obin = new ObjectInputStream(fin);)

        {
            objectInputStream bj = (objectInputStream)obin.readObject();
            System.out.println(bj);

        } catch (Exception e) {
            System.out.println("Not readable" + e);
        }

    }
}
// chain
// debouncing
// Bouncing
// cookies
