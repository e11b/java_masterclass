package L111_PolymorphismChallenge;

public class HybridCar extends Car{

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String description) {
        super(description);
    }

    public HybridCar(String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.printf("Hybrid -> %d cylinders are fired up.%n", cylinders );
        System.out.printf("Hybrid -> switch %d kWh on, Ready! %n", batterySize);

    }

    @Override
    protected void runEngine() {
        System.out.printf("Gas -> usage exceeds the avg: %.2f %n", avgKmPerLitre);
    }

}
