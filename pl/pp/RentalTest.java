package pl.pp;

public class RentalTest {
    public static void main(String[] args) {
        PassengerCar car = new PassengerCar("CA34567", "3AGHM68954A123456", "Red", 20000, 0.3, 10, 12000, 4, new Gasoline());
        Truck truck = new Truck("DEF456", "1FDXF46S12EC9805", "Blue", 50000, 0.6, 15, 50000, 10000, new Diesel());
        Motorcycle motorcycle = new Motorcycle("GHI789", "2HGFG91358H123456", "Black", 15000, 0.2, 5, 8000, false, new Gasoline());

        // ConstructionEquipment nesnesi oluşturma
        ConstructionEquipment equipment = new ConstructionEquipment("JKL019", "3FRNF7FA5AV123456", "Yellow",
                30000, 0.8, 20, 10000, 500, new Diesel());

        // Test etmek için örnek bir kullanım
        System.out.println("Initial mileage of equipment: " + equipment.getMileage());
        equipment.drive(100);
        System.out.println("Mileage after driving: " + equipment.getMileage());
    }
}
