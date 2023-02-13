package L113_OOP_MasterChallenge;

public class Drink extends Item {

    private String Size;

    public Drink(String type, double price, String size) {
        super(type, price);
        Size = size;
        if (size == "s") {
            price = 1.00;
        } else if (size == "m") {
            price = 1.50;
        } else if (size == "l") {
            price = 2.00;
        } else {
            price = 2.50;
        }
    }
}