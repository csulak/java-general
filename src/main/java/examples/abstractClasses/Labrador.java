package examples.abstractClasses;

// Concrete class that extends abstract Dog class
public class Labrador extends Dog {
    
    public Labrador(String name, int age, String color) {
        super(name, age, "Labrador", color);
    }
    
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
    
    @Override
    public void fetch() {
        System.out.println(name + " the Labrador is fetching the ball!");
    }
} 