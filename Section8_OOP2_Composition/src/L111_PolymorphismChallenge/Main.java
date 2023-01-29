package L111_PolymorphismChallenge;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Chalk Porsche 718 GTS ");
        runRace(car);

        Car porsche = new GasPoweredCar("2022 Chalk Porsche 718 GTS",
                15.4, 6);
        runRace(porsche);
    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
