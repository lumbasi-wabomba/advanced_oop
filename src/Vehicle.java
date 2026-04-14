public abstract class Vehicle {
    protected String numPlate;
    protected String color;
    protected int yearOfManufacture;
    protected String brand;
    protected String model;
    int speed;


    public Vehicle(String numPlate, String color, int yearOfManufacture, int speed, String brand, String model) {
        this.numPlate = numPlate;
        this.color = color;
        this.yearOfManufacture = yearOfManufacture;
        this.brand = brand;
        this.model = model;
        this.speed = speed;
    }
    public Vehicle() {}

    abstract void accelerate();
    abstract void stop();
    abstract void gas();

    public String getNumPlate() {
        return numPlate;
    }
    public String getColor() {
        return color;
    }
    public int getYearOfManufacture(){
        return yearOfManufacture;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }



}
