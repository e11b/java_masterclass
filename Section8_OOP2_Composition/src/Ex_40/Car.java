package Ex_40;

public class Car {

    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    //getters

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }


    //methods

    public void startEngine(){
        System.out.println(getClass().getSimpleName() +" engine is starting");
    }

    public void accelerate(){
        System.out.println(getClass().getSimpleName() + " is accelerating!");
    }

    public void brake(){
        System.out.println(getClass().getSimpleName() +" breaks activated");
    }
}