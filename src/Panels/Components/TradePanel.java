package Panels.Components;

import Logic.Player;

import javax.swing.*;
import java.util.TreeMap;

public class TradePanel extends JPanel{
    private Player p1;
    private Player p2;
    private TreeMap<String, Integer> Inventory;
    private TreeMap<String, Integer> p1Trade;
    private TreeMap<String, Integer> p2Trade;
    private JButton next;
    private JButton trade;
    private String type;

    TradePanel(Player p1, Player p2){
        this.p1 = p1;
        this.p2 = p2;
        this.Inventory = new TreeMap<>();
        this.p1Trade = new TreeMap<>();
        this.p2Trade = new TreeMap<>();
        this.next = new JButton("Next");
        this.trade = new JButton("Trade");

    }




}
