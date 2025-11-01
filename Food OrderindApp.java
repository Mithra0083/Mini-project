package App;

import Model.*;

import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

public class FoodOrderingApp extends JFrame {

private DefaultListModel<FoodItem> menu Model;

private DefaultListModel<Fooditem> orderModel;

private Orderltem order;

public FoodOrderingApp() {

setSize(600, 400);

setTitle("Food Ordering System"); setDefaultCloseOperation(EXIT_ON_CLOSE); setLayout(new BorderLayout());

order = new Orderltem();

menuModel = new DefaultListModel<>(); orderModel = new DefaultListModel<>();

// Add some menu items

menuModel.addElement(new FoodItem("Pizza", 180));

menuModel.addElement(new FoodItem("Burger", 120)); menuModel.addElement(new FoodItem("Pasta", 150)); menuModel.addElement(new FoodItem("Sandwich", 100)); menuModel.addElement(new FoodItem("Coffee", 80));

JList<FoodItem> menulist = new JList<>(menuModel); JList<FoodItem> orderList = new JList<>(orderModel);

JButton addButton = new JButton("Add to Order"); JButton billButton = new JButton("Generate Bill");

JPanel centerPanel = new JPanel(new GridLayout(1, 2, 10, 10));

centerPanel.add(new JScrollPane(menuList)); centerPanel.add(new JScrollPane(orderList));

JPanel bottom Panel = new JPanel();

bottom Panel.add(addButton);

bottom Panel.add(billButton);

add(centerPanel, BorderLayout.CENTER); add(bottomPanel, BorderLayout.SOUTH);

// Add button actionif (selected != null) {

order.additem(selected);

orderModel.addElement(selected);

} });

// Bill button action

billButton.addActionListener(e -> {

JOptionPane.showMessageDialog(this, "No items added!");

} else {

Billing bill = new Billing(order);

if (order.getItems().isEmpty()) { StringBuilder sb = new StringBuilder("Your Order:\n"); for (FoodItem item: order.getItems()) { sb.append(item.toString()).append("\n"); }

double total = order.calculateTotal();

JOptionPane.showMessageDialog(this, sb.toString(), "Bill",

}

sb.append("\nTotal: ").append(total); JOptionPane.INFORMATION_MESSAGE); } });

public static void main(String[] args) {

SwingUtilities.invokeLater(() -> new FoodOrderingApp().setVisible(true)); }

}
