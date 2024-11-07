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
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Center the window
        setResizable(false);

        // Panel with a background color
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setBackground(new Color(240, 240, 240));
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(10, 10, 10, 10);

        // Title Label with enhanced font
        JLabel titleLabel = new JLabel("Online Shopping System");
        titleLabel.setFont(new Font("Segoe UI", Font.BOLD, 24));
        titleLabel.setForeground(new Color(0, 102, 204)); // Blue color for the title
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        panel.add(titleLabel, gbc);

        // Item Selection Label
        JLabel itemLabel = new JLabel("Select Item:");
        itemLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        itemLabel.setForeground(new Color(50, 50, 50)); // Dark gray for labels
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 1;
        panel.add(itemLabel, gbc);

        // Item ComboBox
        itemComboBox = new JComboBox<>(new String[]{"Laptop", "Smartphone"});
        itemComboBox.setFont(new Font("Arial", Font.PLAIN, 14));
        itemComboBox.setBackground(Color.WHITE);
        gbc.gridx = 1;
        panel.add(itemComboBox, gbc);

        // Quantity Label
        JLabel quantityLabel = new JLabel("Quantity:");
        quantityLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        quantityLabel.setForeground(new Color(50, 50, 50));
        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(quantityLabel, gbc);

        // Quantity TextField
        quantityField = new JTextField(5);
        quantityField.setFont(new Font("Arial", Font.PLAIN, 14));
        quantityField.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        gbc.gridx = 1;
        panel.add(quantityField, gbc);

        // Purchase Button with Hover effect
        JButton purchaseButton = new JButton("Make Purchase");
        purchaseButton.setFont(new Font("Segoe UI", Font.BOLD, 16));
        purchaseButton.setBackground(new Color(76, 175, 80)); // Green color
        purchaseButton.setForeground(Color.WHITE);
        purchaseButton.setFocusPainted(false);
        purchaseButton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        purchaseButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        // Add hover effect to button
        purchaseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                purchaseButton.setBackground(new Color(56, 142, 60)); // Darker green on hover
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                purchaseButton.setBackground(new Color(76, 175, 80)); // Reset to original green
            }
        });

        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        panel.add(purchaseButton, gbc);

        // Result Area for displaying the purchase result
        resultArea = new JTextArea(5, 30);
        resultArea.setFont(new Font("Arial", Font.PLAIN, 14));
        resultArea.setEditable(false);
        resultArea.setBackground(new Color(255, 255, 255));
        resultArea.setBorder(BorderFactory.createLineBorder(new Color(200, 200, 200)));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        gbc.gridy = 4;
        panel.add(scrollPane, gbc);

        // Add ActionListener for the button
        purchaseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                makePurchase();
            }
        });

        // Add the panel to the frame
        add(panel);
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

        // Show the success message in the result area
        resultArea.setText("Purchase completed for " + quantity + " x " + item.getName() + "\nTotal: $" + (item.getPrice() * quantity));

        // Stylish Thank You message
        String thankYouMessage = "<html><div style='text-align:center;'><h2 style='color: #4CAF50;'>Thank You for Your Purchase!</h2><p style='font-size: 14px;'>We appreciate your order, and we hope you enjoy your " + item.getName() + "!</p></div></html>";
        JOptionPane.showMessageDialog(this, thankYouMessage, "Thank You!", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainFrame frame = new MainFrame();
            frame.setVisible(true);
        });
    }
}
