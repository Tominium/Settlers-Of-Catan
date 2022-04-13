package Panels.Components;

import Logic.GameState;
import Logic.Player;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class discardCardPanel extends JPanel {

    private Player player;
    private JButton close;
    private int numToDiscard;
    private GridBagLayout layout;
    private GridBagConstraints control;

    public discardCardPanel(Player player) {

        this.player = player;
        setBorder(new EmptyBorder(0, 0, 0 ,35));
        control = new GridBagConstraints();
        layout = new GridBagLayout();
        setLayout(layout);
        control.ipadx = 2;
        control.ipady = 5;

        int i =0;
        int divider = (int) (player.getRC().size() /2.1);

        if(divider ==0) {divider=1;}

        for(int j = 0; j < player.getRC().size(); j++) {
            Image image;

            if(j==0) {
                image = null;
            }
            else {
                image = player.getRC().get(j-1).getFront().getScaledInstance(90/divider, 132/divider, Image.SCALE_SMOOTH);
            }

            control.gridx = j;
            control.gridy = i;
            add(new JLabel(new ImageIcon(image)), control);
        }

    }

    public void updatePanel() {

        removeAll();
        control.ipadx = 2;
        control.ipady = 5;
        int i =0;
        int divider = (int) (player.getRC().size() /2.75);

        if(divider ==0) {divider=1;}

        for(int j = 0; j < player.getRC().size(); j++) {
            Image image;

            if(j==0) {
                image = null;
            }
            else {
                image = player.getRC().get(j-1).getFront().getScaledInstance(90/divider, 132/divider, Image.SCALE_SMOOTH);
            }

            control.gridx = j;
            control.gridy = i;
            add(new JLabel(new ImageIcon(image)), control);
        }

        repaint();
        revalidate();

    }

    public GridBagConstraints getGBC() {return control;}

    public GridBagLayout getGBL() {return layout;}

}



