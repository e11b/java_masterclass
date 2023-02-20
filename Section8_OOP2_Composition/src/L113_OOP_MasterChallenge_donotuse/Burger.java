package L113_OOP_MasterChallenge_donotuse;

public class Burger extends Item {

    private String topping;
    private double toppingTotal = 0;

    public Burger(String type, double price) {
            super(type, price);
    }

    public double getBurgerTotal(){
        return toppingTotal;


    }
}
