package Ex3.Brands.Peugeot;
import Ex3.Car;

public class Peugeot extends Car {

    public Peugeot(String licensePlate, String RgbColor, int horsepower)
    {
        super(licensePlate, "Peugeot", RgbColor,horsepower);
    }

    @Override
    public void start() {
        started = true;
        System.out.println("Starting with the key.");
    }

    @Override
    public void stop() {
        started = false;
        System.out.println("Stopping with the key.");
    }
}
