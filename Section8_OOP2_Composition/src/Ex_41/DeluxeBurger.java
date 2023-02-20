package Ex_41;

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public DeluxeBurger(){
        this.addHamburgerAddition1("CHIPS", 0);
        this.addHamburgerAddition2("7-UP", 0);
    }

    @Override
    public void addHamburgerAddition1(String addition1Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String addition1Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String addition1Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String addition1Name, double price) {
        System.out.println("No additional items can be added to a deluxe burger");
    }

    @Override
    public double itemizeHamburger() {
        return 19.10;
    }
}
