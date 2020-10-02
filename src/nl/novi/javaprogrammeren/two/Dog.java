package nl.novi.javaprogrammeren.two;

public class Dog extends Animal {

    public Dog(String name, int amountOfLegs) {
        super(name, amountOfLegs);
    }

    @Override
    public void pet() {

    }

    @Override
    public String toString() {
        StringBuilder strBuilder = new StringBuilder("This dog: \n");
        strBuilder.append("Name: "+ this.name + "\n");
        strBuilder.append("Number of legs: "+ this.amountOfLegs);
        return strBuilder.toString();
    }
}
