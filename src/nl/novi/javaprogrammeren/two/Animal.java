package nl.novi.javaprogrammeren.two;

public abstract class Animal {

    protected int amountOfLegs;
    protected String name;

    public Animal(String name, int amountOfLegs) {
        this.name = name;
        this.amountOfLegs = amountOfLegs;
    }

    public abstract void pet();
}
