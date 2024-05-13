package pl.pp;
import pl.pp.T2_Person;
import pl.pp.T2_Warehouse;

public class T2_Main {
    public static void main(String[] args) {
        // Create Person instance
        T2_Person owner = new T2_Person("Rumeysa", "rumeysa@hotmail.com", "+48 123 456 765");

        // Create Warehouse instance
        T2_Warehouse warehouse = new T2_Warehouse(1, 5000, owner);

        // Add goods
        warehouse.addGoods(3000);
        warehouse.addGoods(1000);
        warehouse.addGoods(2500);

        // Remove goods
        warehouse.removeGoods(1000);

        // Check occupancy
        warehouse.checkOccupancy();

        // Update contact details
        warehouse.updateContact("owner@magazyn.pl", "+48 123 456 789");

        // Trying to add goods beyond available space
        warehouse.addGoods(1000);
    }
}