package com.company;

import javax.swing.*;
import java.awt.*;

public class drinks extends JPanel {
    // The following constants are used to indicate the cost of drinks
    private final double PULPY =1.60 ;
    private final double COCA_COLA = 1.25;
    private final double FANTA = 1.25;
    private final double EVA_WATER = 1.05;
    private final double SPRITE = 1.40;

    // Check boxes for the available drinks
    private JCheckBox pulpy;
    private JCheckBox coke;
    private JCheckBox fanta;
    private JCheckBox water;
    private JCheckBox sprite;

    public  drinks(){
        setLayout(new GridLayout(5,1));

        pulpy = new JCheckBox("Pulpy");
        coke = new JCheckBox("Coca-Cola");
        fanta = new JCheckBox("Fanta");
        water = new JCheckBox("Eva-Water");
        sprite = new JCheckBox("Sprite");

        add(pulpy);
        add(coke);
        add(fanta);
        add(water);
        add(sprite);

        setBorder(BorderFactory.createTitledBorder("Drinks"));
    }
    public double getDrinkCost(){
        double drinks = 0.0;
        if(pulpy.isSelected())
            drinks+=PULPY;
        if(coke.isSelected())
            drinks+=COCA_COLA;
        if(fanta.isSelected())
            drinks+=FANTA;
        if(water.isSelected())
            drinks+=EVA_WATER;
        if(sprite.isSelected())
            drinks+=SPRITE;

        return drinks;
    }
}
