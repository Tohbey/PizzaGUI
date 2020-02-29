package com.company;

import javax.swing.*;
import java.awt.*;

public class pizza extends JPanel {

    private double CHICKEN_SUYA;
    private double CHICKEN_TIKKA;
    private double SPICIED_CHICKEN;
    private double MEATPIE;

    private JRadioButton chickensuya;
    private JRadioButton chickentikka;
    private JRadioButton meatpie;
    private JRadioButton spiciedchicken;

    private ButtonGroup bg;
    public  pizza(){
        setLayout(new GridLayout(4,1));

        chickensuya = new JRadioButton("Chicken suya");
        chickentikka = new JRadioButton("Chicken tikka");
        spiciedchicken = new JRadioButton("Spicied Chicken");
        meatpie = new JRadioButton(" Meatpie");

        bg = new ButtonGroup();
        bg.add(chickensuya);
        bg.add(chickentikka);
        bg.add(spiciedchicken);
        bg.add(meatpie);

        setBorder(BorderFactory.createTitledBorder("Pizza"));

        add(chickensuya);
        add(chickentikka);
        add(spiciedchicken);
        add(meatpie);
    }public double getPizzaCost(){
        double pizzaCost = 0.0;
        if (chickensuya.isSelected())
            pizzaCost+=CHICKEN_SUYA;
        else if(chickentikka.isSelected())
            pizzaCost+=CHICKEN_TIKKA;
        else if(spiciedchicken.isSelected())
            pizzaCost+=SPICIED_CHICKEN;
        else if(meatpie.isSelected())
            pizzaCost+=MEATPIE;
        return pizzaCost;
    }
}
