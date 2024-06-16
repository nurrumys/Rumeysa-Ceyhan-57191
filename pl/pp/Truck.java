package pl.pp;

public class Truck extends Vehicle implements FuelType {
    private double loadCapacity;
    private FuelType fuelType;

    public Truck(String registrationNumber, String vinNumber, String color, double price,
                 double fuelConsumption, double fuelLevel, double mileage, double loadCapacity, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.loadCapacity = loadCapacity;
        this.fuelType = fuelType;
    }

    @Override
    public void drive(double miles) {
        double fuelNeeded = miles * getFuelConsumption();
        if (fuelNeeded <= getFuelLevel()) {
            setFuelLevel(getFuelLevel() - fuelNeeded);
            setMileage(getMileage() + miles);
        } else {
            System.out.println("Not enough fuel to drive " + miles + " miles.");
        }
    }

    @Override
    public String getFuelType() {
        return fuelType.getFuelType();
    }

    // Getters and Setters for loadCapacity
    public double getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(double loadCapacity) {
        this.loadCapacity = loadCapacity;
    }
}

