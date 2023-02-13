package L113_OOP_MasterChallenge;

public class Sides extends Item {

    public Sides(String type, double price) {
        super(type, price);
        if (type == "regular fries"){
            price = 2.00;
        } else if (type == "onion rings"){
            price = 3.00;
        } else if (type == "curly fries"){
            price = 2.50;
        } else if (type == "cookies"){
            price = 1.50;
        } else if (type == "salad"){
            price = 5.00;
        }
    }



}
