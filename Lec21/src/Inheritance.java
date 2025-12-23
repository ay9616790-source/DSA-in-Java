// Main class
public class Inheritance {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name="Rocky";// create Dog object
       d.eat();            // inherited from Animal
        d.breadth();        // inherited from Animal
        d.voic();           // Dog’s own method
    }
}

// Base class
class Animal {
    String name;

    void eat() {
        System.out.println("Animal is eating");
    }

    void breadth() {
        System.out.println("Animal is breathing");
    }
}

// Derived class
class Dog extends Animal {
    void voic() {
        System.out.println("Dog is barking");
    }
}
