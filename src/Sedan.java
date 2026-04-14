public class Sedan extends Vehicle implements Automobile {
    protected int MAX_SPEED = 260;
    int rpm = 1500;

    public Sedan(String numPlate, String color, int yearOfManufacture, int speed,
                 String brand, String model) {
        super(numPlate, color, yearOfManufacture, speed, brand, model);

    }

    @Override
    void accelerate() {
        if (speed > MAX_SPEED) {
            System.out.println("Sedan cannot accelerate beyond maximum speed of " + MAX_SPEED + " km/h.");
        } else {
            speed += 10;
            rpm += 500;
            System.out.println("Sedan accelerating smoothly to: " + speed + " km/h (RPM: " + rpm + ")");
        }
    }

    @Override
    void stop() {
        if (speed == 0) {
            System.out.println("Sedan is already stopped.");
        } else {
            speed = 0;
            rpm = 800;
            System.out.println("Sedan has stopped smoothly.");
        }
    }

    @Override
    void gas() {
        if (speed > MAX_SPEED) {
            System.out.println("Sedan cannot accelerate beyond maximum speed of " + MAX_SPEED + " km/h.");
        } else {
            rpm += 1200;
            speed += (rpm / 120);
            if (speed > MAX_SPEED) speed = MAX_SPEED;
            System.out.println("Sedan accelerated with gas to: " + speed + " km/h (RPM: " + rpm + ")");
        }
    }

    @Override
    public void startEngine() {
        System.out.println("Sedan " + fuelType + " engine started smoothly.");
    }

    @Override
    public void stopEngine() {
        System.out.println("Sedan engine stopped.");
        speed = 0;
        rpm = 0;
    }

    @Override
    public void horn() {
        System.out.println("Beep! Beep!");
    }

}