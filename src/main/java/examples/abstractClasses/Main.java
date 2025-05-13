package examples.abstractClasses;

public class Main {
    public static void main(String[] args) {
        // Cannot instantiate abstract classes:
        // Animal animal = new Animal("Generic", 1); // This would cause error
        // Dog dog = new Dog("Generic", 2, "Unknown", "Brown"); // This would cause error
        
        // Can instantiate concrete class Labrador
        Labrador labrador = new Labrador("Max", 3, "Yellow");
        
        // Using methods from Animal class
        System.out.println("Demonstrating Animal methods:");
        labrador.makeSound();
        
        // Using methods from Dog class
        System.out.println("\nDemonstrating Dog methods:");
        labrador.wagTail();
        labrador.fetch();
        
        // Accessing inherited fields
        System.out.println("\nDemonstrating inherited fields:");
        System.out.println("Name: " + labrador.name);
        System.out.println("Age: " + labrador.age);
        System.out.println("Breed: " + labrador.breed);
        System.out.println("Color: " + labrador.color);
    }
} 