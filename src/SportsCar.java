public class SportsCar extends Vehicle implements Automobile {
    protected int MAX_SPEED = 360;
    int rpm = 1200;

    public SportsCar(String numPlate, String color, int yearOfManufacture, int speed,
                     String brand, String model) {
        super(numPlate, color, yearOfManufacture, speed, brand, model);
    }

    @Override
    void accelerate() {
        if (speed > MAX_SPEED) {
            System.out.println("SportsCar cannot accelerate beyond maximum speed of " + MAX_SPEED + " km/h.");
        } else {
            speed += 25;
            rpm += 1200;
            System.out.println("SportsCar is accelerating to: " + speed + " km/h ");
        }
    }

    @Override
    void stop() {
        if (speed == 0) {
            System.out.println("SportsCar is already stopped.");
        } else {
            speed = 0;
            rpm = 1200;
            System.out.println("SportsCar stopped with precision braking.");
        }
    }

    @Override
    void gas() {
        if (speed > MAX_SPEED) {
            System.out.println("SportsCar cannot accelerate beyond maximum speed of " + MAX_SPEED + " km/h.");
        } else {
            rpm += 1500;
            speed += (rpm / 100);
            if (speed > MAX_SPEED) speed = MAX_SPEED;
            System.out.println("SportsCar is accelerating to: " + speed + " km/h ");
        }
    }

    @Override
    public void startEngine() {
        System.out.println("SportsCar " + fuelType + " engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("SportsCar engine shuts down.");
        speed = 0;
        rpm = 0;
    }

    @Override
    public void horn() {
        System.out.println("Beep! Beep!");
    }
}