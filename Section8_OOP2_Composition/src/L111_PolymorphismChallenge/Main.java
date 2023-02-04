package L111_PolymorphismChallenge;

public class Main {

    public static void main(String[] args) {

        Car car = new Car("2022 Chalk Porsche 718 GTS ");
        runRace(car);

        Car porsche = new GasPoweredCar("2022 Chalk Porsche 718 GTS",
                15.4, 6);
        runRace(porsche);

        Car tesla = new ElectricCar("2022 Red Tesla Model 3", 568, 75);
        runRace(tesla);

        Car ferrariHybrid = new HybridCar("2022 Black Ferrari SF90 Stradale", 16, 8, 8);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car){
        car.startEngine();
        car.drive();
    }
}
