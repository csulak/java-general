package examples.abstractClasses;

public abstract class Animal {
    protected String name;
    protected int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Abstract method that must be implemented by subclasses
    public abstract void makeSound();
} 