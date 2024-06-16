package pl.pp;

public class ConstructionEquipment extends Vehicle implements FuelType {
    private int hoursWorked;
    private FuelType fuelType;

    public ConstructionEquipment(String registrationNumber, String vinNumber, String color, double price,
                                 double fuelConsumption, double fuelLevel, double mileage, int hoursWorked, FuelType fuelType) {
        super(registrationNumber, vinNumber, color, price, fuelConsumption, fuelLevel, mileage);
        this.hoursWorked = hoursWorked;
        this.fuelType = fuelType;
    }

    @Override
    public void drive(double miles) {
        double fuelNeeded = miles * getFuelConsumption();
        if (fuelNeeded <= getFuelLevel()) {
            setFuelLevel(getFuelLevel() - fuelNeeded);
            setMileage(getMileage() + miles);
            this.hoursWorked += miles / 10; // Example conversion rate from miles to hours worked
        } else {
            System.out.println("Not enough fuel to drive " + miles + " miles.");
        }
    }

    @Override
    public String getFuelType() {
        return fuelType.getFuelType();
    }

    // Getters and Setters for hoursWorked
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}
