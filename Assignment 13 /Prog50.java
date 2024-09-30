import java.util.Scanner;

class Prog50 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] weekdays = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        System.out.print("Enter a day position (0-6): ");
        int position = sc.nextInt();

        try {
            // Print the name of the weekday at the specified position
            String weekday = weekdays[position];
            System.out.println("The weekday at position " + position + " is " + weekday);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception if the position is outside the range of the array
            System.out.println("Error: Position " + position + " is outside the range of the weekday array.");
        }
    }
}
