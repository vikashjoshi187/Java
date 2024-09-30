/*13. Write a program to create UserDefined Exception(Other then classroom example). */
class MyException extends Exception {
    public MyException(String s) {
        super(s);
    }
}

public class Prog13 {
    public static void main(String args[]) {
        try {
            throw new MyException("try block excute");
        } catch (MyException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
