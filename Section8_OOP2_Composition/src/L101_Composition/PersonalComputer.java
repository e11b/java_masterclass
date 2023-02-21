package L101_Composition;

public class PersonalComputer extends Product{

    private Chassis computerCase;
    private Monitor monitor;
    private Mobo mobo;

    public PersonalComputer(String model, String manufacturer,
                            Chassis computerCase, Monitor monitor, Mobo mobo) {
        super(model, manufacturer);
        this.computerCase = computerCase;
        this.monitor = monitor;
        this.mobo = mobo;
    }

    public Chassis getComputerCase() {
        return computerCase;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Mobo getMobo() {
        return mobo;
    }
}
