package ui;

import application.OnlineShoppingSystem;
import domain.Item;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private OnlineShoppingSystem shoppingSystem;
    private JComboBox<String> itemComboBox;
    private JTextField quantityField;
    private JTextArea resultArea;

    public MainFrame() {
        shoppingSystem = new OnlineShoppingSystem();

        // UI Components
        setTitle("Online Shopping System");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        // Item Selection
        JLabel itemLabel = new JLabel("Select Item:");
        add(itemLabel);

        itemComboBox = new JComboBox<>(new String[]{"Laptop", "Smartphone"});
        add(itemComboBox);

        JLabel quantityLabel = new JLabel("Quantity:");
        add(quantityLabel);

        quantityField = new JTextField(5);
        add(quantityField);

        JButton purchaseButton = new JButton("Make Purchase");
        add(purchaseButton);

        resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);
        add(new JScrollPane(resultArea));

        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makePurchase();
            }
        });
    }

    private void makePurchase() {
        String selectedItem = (String) itemComboBox.getSelectedItem();
        int quantity;
        try {
            quantity = Integer.parseInt(quantityField.getText());
        } catch (NumberFormatException e) {
            resultArea.setText("Invalid quantity. Please enter a number.");
            return;
        }

        Item item;
        if ("Laptop".equals(selectedItem)) {
            item = new Item("Laptop", 999.99, 10);
        } else {
            item = new Item("Smartphone", 599.99, 5);
        }

        // Make the purchase
        shoppingSystem.makePurchase(item, quantity);
        resultArea.setText("Purchase completed for " + quantity + " x " + item.getName());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
