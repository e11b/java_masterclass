package Ex_40;

public class Holden extends Car{

    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() +" engine is starting");
    }

    @Override
    public void accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating!");
    }

    @Override
    public void brake() {
        System.out.println(getClass().getSimpleName() +"'s breaks activated");
    }
}
