public class Motorcycle extends Vehicle{
    protected int MAX_SPEED = 120;
    int rpm = 500;

    public Motorcycle(String numPlate, String color, int yearOfManufacture, int speed, String brand, String model) {
        super(numPlate, color, yearOfManufacture, speed, brand, model);
    }

    @Override
    void accelerate() {
        if (speed > MAX_SPEED) {
            System.out.println("Cannot accelerate beyond maximum speed of " + MAX_SPEED + " km/h.");
        } else {
            speed += 10;
            System.out.println("Accelerating to : " + speed + " km/h.");
        }
    }

    @Override
    void stop() {
            if (speed == 0) {
                System.out.println("Motorcycle is already stopped.");
            } else {
                speed = 0;
                System.out.println("Motorcycle has been stopped.");
            }
    }

    @Override
    void gas() {
        if (speed > MAX_SPEED) {
            System.out.println("Cannot accelerate beyond maximum speed of " + MAX_SPEED + " km/h.");
        } else {
            rpm += 1000;
            speed += (rpm /100);
            System.out.println("Accelerated to : " + speed + " km/h after applying gas");
        }
    }
}
