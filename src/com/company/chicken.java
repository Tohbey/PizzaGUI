package com.company;

import javax.swing.*;
import java.awt.*;

public class chicken extends JPanel {
    //chicken kicker
   // chicken wings
   // chicken strips small
   // chicken strips large
    private double CHICKEN_KICKER = 2.00;
    private double CHICKEN_WINGS = 2.20;
    private double CHICKEN_SMALL = 1.90;
    private double CHICKEN_BIG = 2.45;

    private JRadioButton chicken_kicker;
    private JRadioButton chicken_wings;
    private JRadioButton chicken_small;
    private JRadioButton chicken_big;

    private ButtonGroup bg;

    public chicken(){
        setLayout(new GridLayout(4,1));

        chicken_kicker = new JRadioButton("Chicken Kicker");
        chicken_wings = new JRadioButton("Chicken Wings");
        chicken_small = new JRadioButton("Chicken Strips Small");
        chicken_big = new JRadioButton("Chicken Strips Big");

        bg = new ButtonGroup();
        bg.add(chicken_big);
        bg.add(chicken_kicker);
        bg.add(chicken_small);
        bg.add(chicken_wings);

        setBorder(BorderFactory.createTitledBorder("Chicken"));

        add(chicken_kicker);
        add(chicken_wings);
        add(chicken_small);
        add(chicken_big);
    }
    public double getChickenCost(){
        double chicken = 0.0;
        if (chicken_kicker.isSelected())
            chicken+=CHICKEN_KICKER;
        else if(chicken_wings.isSelected())
            chicken+=CHICKEN_WINGS;
        else if(chicken_small.isSelected())
            chicken+=CHICKEN_SMALL;
        else if(chicken_big.isSelected())
            chicken+=CHICKEN_BIG;
        return chicken;
    }
}
