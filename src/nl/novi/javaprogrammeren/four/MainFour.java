package nl.novi.javaprogrammeren.four;

import nl.novi.javaprogrammeren.four.hidden.HumanMaker;

public class MainFour {
    public static void main(String[] args) {


        HumanMaker humanMaker = new HumanMaker();
        System.out.println("Human name is: " + humanMaker.getHumanName());
    }
}
