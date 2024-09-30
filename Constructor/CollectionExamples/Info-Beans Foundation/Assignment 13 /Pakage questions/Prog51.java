/*Create a class Voter(voterId, name, age) with parameterized constructor. The parameterized constructor should 
throw a checked exception if age is less than 18. The message of exception is “invalid age for voter ” . */

import java.util.Scanner;;

class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Invalid Age For Voter");
        }
        this.voterId = voterId;
        this.name = name;
        this.age = age;
    }

    public int getVoterId() {
        return voterId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Prog51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte check;
        do {
            System.out.println("Enter Name of Person : ");
            String name = sc.nextLine();
            System.out.println("Enter Voter-Id : ");
            byte voterId = sc.nextByte();
            System.out.println("Enter Age");
            byte age = sc.nextByte();
            try {
                Voter voter1 = new Voter(voterId, name, age);
                System.out.println(voter1.getName() + " is " + voter1.getAge() + " years old and can vote.");
            } catch (Exception e) {
                System.out.println("Error : " + e);
            }
            System.out.println("\nDo you want to check for another person : \nEnter 1 If Yes\tEnter 2 Of Not");
            check = sc.nextByte();
        } while (check == 1);
    }
}
