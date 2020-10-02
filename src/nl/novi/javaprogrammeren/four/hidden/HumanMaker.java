package nl.novi.javaprogrammeren.four.hidden;

public class HumanMaker {

    private Human human;

    public HumanMaker() {
        this.human = new Human("Emiel");
    }
    public String getHumanName() {
        return this.human.getName();
    }
}
