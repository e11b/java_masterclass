package L101_Composition;

public class Main {

    public static void main(String[] args) {

        Chassis chassis = new Chassis("2208", "Dell",
                "240");
        Monitor monitor = new Monitor("27in beast", "Acer",
                27, "2540x1440");
        Mobo mobo = new Mobo("BJ-200", "Asus",
                4, 6, "v2.44");

        PersonalComputer thePC = new PersonalComputer("2208", "Dell",
                chassis, monitor, mobo);

//        thePC.getMonitor().drawPixelAt(10,10, "red");
//        thePC.getMobo().loadProgram("Windows OS");
//        thePC.getComputerCase().pressPowerButton();

        thePC.powerUp();
    }

}

