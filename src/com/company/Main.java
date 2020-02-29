package com.company;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.DecimalFormat;
public class Main extends JFrame {

    private pizza pizzaPlane;
    private chicken chickenPlane;
    private drinks drinksPanel;
    private dessert dessertPlane;
    private WelcomePanel welcome;
    private JPanel buttonPanel;
    private JButton calbutton;
    private JButton exit;
    private  final double Tax_rate=0.05;

    public Main(){
        super("order Window");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new BorderLayout());

        pizzaPlane = new pizza();
        chickenPlane = new chicken();
        drinksPanel = new drinks();
        dessertPlane = new dessert();
        welcome = new WelcomePanel();

        buildButtonPanel();

        add(welcome,BorderLayout.NORTH);
        add(pizzaPlane,BorderLayout.WEST);
        add(dessertPlane,BorderLayout.CENTER);
        add(drinksPanel,BorderLayout.EAST);
        add(buttonPanel,BorderLayout.SOUTH);

        pack();
        setVisible(true);
    }
    private void buildButtonPanel(){
        // Create a panel for the buttons.
        buttonPanel = new JPanel();

        // Create the buttons.
        calbutton = new JButton("Calculate");
        exit = new JButton("Exit");

        // Register the action listeners.
        calbutton.addActionListener(new CalcButtonListener());
        exit.addActionListener(new ExitButtonListener());

        // Add the buttons to the button panel.
        buttonPanel.add(calbutton);
        buttonPanel.add(exit);
    }
    private class CalcButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
            // Variables to hold the subtotal, tax, and total
            double subtotal, tax, total;

            // Calculate the subtotal.
            subtotal = pizzaPlane.getPizzaCost() + chickenPlane.getChickenCost() + drinksPanel.getDrinkCost();

            // Calculate the sales tax.
            tax = subtotal * Tax_rate;

            // Calculate the total.
            total = subtotal + tax;

            // Create a DecimalFormat object to format output.
            DecimalFormat dollar = new DecimalFormat("0.00");

            // Display the charges.
            JOptionPane.showMessageDialog(null, "Subtotal: $" + dollar.format(subtotal) + "\n" + "Tax: $" + dollar.format(tax) + "\n" + "Total: $" + dollar.format(total));
        }
    }
     //Private inner class that handles the event when the user clicks the Exit button.
     private class ExitButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e){
                System.exit(0);
        }
     }

    public static void main(String[] args) {
	// write your code here
        new Main();
    }
}
