import Logic.GameState;
import Panels.GameBoard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;

public class MainMenu extends JPanel implements MouseListener {
    private static final int WIDTH = 1400;
    private static final int HEIGHT = 800;
    private JButton startButton;
    private JButton helpButton;
    private JButton exitButton;

    public MainMenu(Frame f) {
        //super("Settlers of Catan");

        JPanel win = this;
        win.setLayout(null);

        JLabel heading = new JLabel("Settlers of Catan");
        heading.setSize(750, 60);
        heading.setForeground(new Color(255, 255, 255));
        heading.setLocation(175,40);
        //heading.setVisible(false);
        win.add(heading);

        Object[] playerNums = {"Select Number of Players", 2, 3, 4};
        JComboBox list = new JComboBox(playerNums);
        list.setSelectedIndex(0);
        list.setBounds(380, 170,200,35);
        //list.setVisible(false);
        win.add(list);

        JButton startButton = new JButton("Start Game");
        startButton.setBounds(380, 430, 200, 35);
        //startButton.setVisible(false);
        win.add(startButton);
        JPanel frame = this;
        startButton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e) {
                if(list.getSelectedIndex() != 0){
                    f.addGameBoard();}
                else if(list.getSelectedIndex()==0){
                    JOptionPane.showMessageDialog(frame,
                            "Please Choose The Number Of Players",
                            "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        JButton helpButton = new JButton("Help");
        helpButton.setBounds(850, 430, 70, 35);
        //helpButton.setVisible(false);
        win.add(helpButton);
        helpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new HelpMenu();
            }
        });

        setVisible(true);
        setPreferredSize(new Dimension(WIDTH, HEIGHT));
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
