package application;

import domain.Item;
import domain.ShoppingCart;
import domain.InventorySystem;
import infrastructure.PaymentService;

public class OnlineShoppingSystem {
    private ShoppingCart cart;
    private PaymentService paymentService;
    private InventorySystem inventorySystem;

    public OnlineShoppingSystem() {
        cart = new ShoppingCart();
        paymentService = new PaymentService();
        inventorySystem = new InventorySystem();
    }

    public void makePurchase(Item item, int quantity) {
        if (inventorySystem.checkAvailability(item, quantity)) {
            cart.addItem(item, quantity);

            double totalAmount = cart.calculateTotal();
            boolean paymentSuccess = paymentService.processPayment(totalAmount);

            if (paymentSuccess) {
                inventorySystem.updateInventory(item, quantity);
                System.out.println("Purchase confirmed. You bought " + quantity + " x " + item.getName() + " for $" + totalAmount);
            } else {
                System.out.println("Payment failed. Please try again.");
            }
        } else {
            System.out.println("Item not available in the desired quantity.");
        }
    }
}
