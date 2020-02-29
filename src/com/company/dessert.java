package com.company;

import javax.swing.*;
import java.awt.*;

public class dessert extends JPanel {


    private double CAKE_BATTER = 2.34;
    private double CAKE_OVERLOAD = 2.67;
    private double MELTED_CHOCO = 2.40;
    private double FOUNDERS_FAVORITES = 2.57;

    private JCheckBox cake_batter;
    private JCheckBox cake_overload;
    private JCheckBox melted_choco;
    private JCheckBox founders_favorites;

    private ButtonGroup bg;

    public dessert(){
        setLayout(new GridLayout(4,1));

        cake_batter = new JCheckBox("cake batter");
        cake_overload = new JCheckBox("cake overload");
        melted_choco = new JCheckBox("melted choco pocket");
        founders_favorites= new JCheckBox("founders favorites");

        bg = new ButtonGroup();
        bg.add(cake_batter);
        bg.add(cake_overload);
        bg.add(melted_choco);
        bg.add(founders_favorites);

        setBorder(BorderFactory.createTitledBorder("Dessert"));

        add(cake_batter);
        add(cake_overload);
        add(melted_choco);
        add(founders_favorites);
    }
    public double getDessertCost(){
        double dessertCost = 0.0;
        if (cake_batter.isSelected())
            dessertCost+=CAKE_BATTER;
        else if(cake_overload.isSelected())
            dessertCost+=CAKE_OVERLOAD;
        else if(melted_choco.isSelected())
            dessertCost+=MELTED_CHOCO;
        else if(founders_favorites.isSelected())
            dessertCost+=FOUNDERS_FAVORITES;
        return dessertCost;
    }

}
