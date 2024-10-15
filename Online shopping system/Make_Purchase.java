// Class representing an item
class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void reduceQuantity(int qty) {
        if (this.quantity >= qty) {
            this.quantity -= qty;
        } else {
            System.out.println("Insufficient stock for " + name);
        }
    }
}

// Class representing a shopping cart
class ShoppingCart {
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

// Class representing a payment service
class PaymentService {
    public boolean processPayment(double amount) {
        // Dummy payment processing logic
        System.out.println("Processing payment of $" + amount + "...");
        return true; // Assume payment is always successful
    }
}

// Class representing an inventory system
class InventorySystem {
    public boolean checkAvailability(Item item, int quantity) {
        return item.getQuantity() >= quantity;
    }

    public void updateInventory(Item item, int quantity) {
        item.reduceQuantity(quantity);
        System.out.println("Inventory updated for " + item.getName() + ". Remaining quantity: " + item.getQuantity());
    }
}

// Class representing the online shopping system
class OnlineShoppingSystem {
    private ShoppingCart cart;
    private PaymentService paymentService;
    private InventorySystem inventorySystem;

    public OnlineShoppingSystem() {
        cart = new ShoppingCart();
        paymentService = new PaymentService();
        inventorySystem = new InventorySystem();
    }

    public void makePurchase(Item item, int quantity) {
        // Step 1: Check inventory
        if (inventorySystem.checkAvailability(item, quantity)) {
            // Step 2: Add item to cart
            cart.addItem(item, quantity);

            // Step 3: Calculate total and process payment
            double totalAmount = cart.calculateTotal();
            boolean paymentSuccess = paymentService.processPayment(totalAmount);

            if (paymentSuccess) {
                // Step 4: Update inventory
                inventorySystem.updateInventory(item, quantity);

                // Step 5: Confirm purchase
                System.out.println("Purchase confirmed. You bought " + quantity + " x " + item.getName() + " for $" + totalAmount);
            } else {
                System.out.println("Payment failed. Please try again.");
            }
        } else {
            System.out.println("Item not available in the desired quantity.");
        }
    }
}

// Main class to test the Make Purchase use case
public class Main {
    public static void main(String[] args) {
        // Create some items in stock
        Item laptop = new Item("Laptop", 999.99, 10);
        Item phone = new Item("Smartphone", 599.99, 5);

        // Instantiate the online shopping system
        OnlineShoppingSystem system = new OnlineShoppingSystem();

        // Make a purchase for a laptop
        system.makePurchase(laptop, 1);

        // Try to purchase more items than available stock
        system.makePurchase(phone, 6);
    }
}
