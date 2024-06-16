package pl.pp;

public class PassengerCar extends Vehicle implements FuelType {
    private int numberOfDoors;
    private FuelType fuelType;

    public PassengerCar(String registrationNumber, String vinNumber, String color, double price,
                        double fuelConsumption, double fuelLevel, double mileage, int numberOfDoors, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.numberOfDoors = numberOfDoors;
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

    // Getters and Setters for numberOfDoors
    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}

