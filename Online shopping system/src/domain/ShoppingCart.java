package domain;

public class ShoppingCart {
    private Item item;
    private int quantity;

    public void addItem(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
        System.out.println(quantity + " x " + item.getName() + " added to cart.");
    }

    public double calculateTotal() {
        return item.getPrice() * quantity;
    }

    public Item getItem() {
        return item;
    }

    public int getQuantity() {
        return quantity;
    }
}
