/*34. Create a class Person with properties (name and age) with following features.
a. Default age of person should be 18;
b. A person object can be initialized with name and age;
c. Method to display name and age of person34. 
Create and use copy constructor for above problem. */
class Person {
    String name;
    int age = 18;

    Person(String name) {
        this.name = name;
    }

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Person(Person p) {
        this.name = p.name;
        this.age = p.age;
    }

    void display() {
        System.out.println("Name of Person : " + this.name + "\nage of Person : " + this.age);
    }

    public static void main(String[] args) {
        Person obj = new Person("hemant");
        Person obj1 = new Person("Ritik", 34);
        Person object1 = new Person(obj1);
        obj.display();
        obj1.display();
        object1.display();
    }
}
