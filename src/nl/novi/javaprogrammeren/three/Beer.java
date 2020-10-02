package nl.novi.javaprogrammeren.three;

public class Beer {
    private String brand;
    static int beerCount = 0;

    public Beer(String brand) {
        this.brand = brand;
        System.out.println("Er is weer een biertje getapt!");
        beerCount++;
        System.out.println("Dit is biertje nummer: " + beerCount);
    }

    public String getBrand() {
        return brand;
    }


    public static int getAmountOfBeersTapped() {
        return beerCount;
    }

    public static int getTappedBeersAmount() {
        return beerCount;
    }
}
