package Panels.Components;

import Logic.Player;
import Structures.Structure;

import javax.swing.*;
import java.awt.*;

public class buildPanel {

    private Player player;
    private JButton close;
    private JButton road;
    private JButton settlement;
    private JButton city;
    private GridBagLayout layout;
    private GridBagConstraints control;
    private Structure chosen;


    public buildPanel(Player player) {
        this.player = player;
        this.layout = new GridBagLayout();
        this.control = new GridBagConstraints();
        this.close = new JButton("Close");
        this.road = new JButton("Road");
        this.settlement = new JButton("Settlement");
        this.city = new JButton("City");
        this.chosen = null;
    }

    public void setChosen (Structure s){

    }

    public void getChosen(){

    }








}
