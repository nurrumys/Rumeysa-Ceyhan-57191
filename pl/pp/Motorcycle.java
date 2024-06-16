package pl.pp;

public class Motorcycle extends Vehicle implements FuelType {
    private boolean hasSidecar;
    private FuelType fuelType;

    public Motorcycle(String registrationNumber, String vinNumber, String color, double price,
                      double fuelConsumption, double fuelLevel, double mileage, boolean hasSidecar, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hasSidecar = hasSidecar;
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

    // Getters and Setters for hasSidecar
    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}

