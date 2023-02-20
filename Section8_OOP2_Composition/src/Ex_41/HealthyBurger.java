package Ex_41;

public class HealthyBurger extends Hamburger{

    private String healthyExtra1Name; private double healthyExtra1Price;
    private String healthyExtra2Name; private double healthyExtra2Price;


    public HealthyBurger(String name, String meat, double price, String breadRollType) {
        super(name, meat, price, breadRollType);
    }

    public void addHealthyAddition1(String healthyExtra1Name, double healthyExtra1Price){
        this.healthyExtra1Name = healthyExtra1Name;
        this.healthyExtra1Price = healthyExtra1Price;
        }

    public void addHealthyAddition2(String healthyExtra2Name, double healthyExtra2Price){
        this.healthyExtra2Name = healthyExtra2Name;
        this.healthyExtra2Price = healthyExtra2Price;
    }

//    @Override
//    public double itemizeHamburger() {
//        System.out.println("HealthBurger order");
////        return price + healthyExtra1Price + healthyExtra2Price;
//    }
//}
