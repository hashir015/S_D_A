package domain;
public class InventorySystem {
    public boolean checkAvailability(Item item, int quantity) {
        return item.getQuantity() >= quantity;
    }

    public void updateInventory(Item item, int quantity) {
        item.reduceQuantity(quantity);
        System.out.println("Inventory updated for " + item.getName() + ". Remaining quantity: " + item.getQuantity());
    }
}
