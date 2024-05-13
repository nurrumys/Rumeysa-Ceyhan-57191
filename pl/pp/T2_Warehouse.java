package pl.pp;

class T2_Warehouse {
    private int warehouseNumber;
    private int availableSpace;
    private T2_Person owner;

    public T2_Warehouse(int warehouseNumber, int availableSpace, T2_Person owner) {
        this.warehouseNumber = warehouseNumber;
        this.availableSpace = availableSpace;
        this.owner = owner;
    }

    public int getWarehouseNumber() {
        return warehouseNumber;
    }

    public void setWarehouseNumber(int warehouseNumber) {
        this.warehouseNumber = warehouseNumber;
    }

    public int getAvailableSpace() {
        return availableSpace;
    }

    public void setAvailableSpace(int availableSpace) {
        this.availableSpace = availableSpace;
    }

    public T2_Person getOwner() {
        return owner;
    }

    public void setOwner(T2_Person owner) {
        this.owner = owner;
    }

    public void addGoods(int amount) {
        if (amount <= availableSpace) {
            availableSpace -= amount;
            System.out.println("Added " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Not enough space in the warehouse.");
        }
    }

    public void removeGoods(int amount) {
        if (amount <= availableSpace) {
            availableSpace += amount;
            System.out.println("Removed " + amount + " units of goods. Remaining warehouse space: " + availableSpace + " units.");
        } else {
            System.out.println("Not enough goods in the warehouse.");
        }
    }

    public void checkOccupancy() {
        int occupiedSpace = 5000 - availableSpace;
        System.out.println("Occupied warehouse space: " + occupiedSpace + " units.");
        System.out.println("Available warehouse space: " + availableSpace + " units.");
    }

    public void updateContact(String newEmail, String newPhone) {
        owner.setEmail(newEmail);
        owner.setPhone(newPhone);
        System.out.println("Owner's contact details updated.");
        System.out.println("New email: " + owner.getEmail());
        System.out.println("New phone number: " + owner.getPhone());
    }
}