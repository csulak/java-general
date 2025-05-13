package examples.abstractClasses;

public abstract class Dog extends Animal {
    protected String breed;
    protected String color;
    
    public Dog(String name, int age, String breed, String color) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
        this.color = color;
    }
    
    // Concrete method that can be used by all Dog subclasses
    public void wagTail() {
        System.out.println(name + " is wagging their tail!");
    }
    
    // Abstract method specific to dogs
    public abstract void fetch();
} 