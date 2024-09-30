class Voter {
    private int voterId;
    private String name;
    private int age;

    public Voter(int voterId, String name, int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("invalid age for voter");
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
            Voter voter1 = new Voter(1, "Alice", 20);
            Voter voter2 = new Voter(2, "Bob", 17);
            System.out.println(voter1.getName() + " is " + voter1.getAge() + " years old and can vote.");
            System.out.println(voter2.getName() + " is " + voter2.getAge() + " years old and cannot vote.");
    }
}
