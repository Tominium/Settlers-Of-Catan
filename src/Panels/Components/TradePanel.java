package Panels.Components;

import Logic.Player;

import javax.swing.*;
import java.util.TreeMap;

public class TradePanel {
    private Player p1;
    private Player p2;
    private TreeMap<String, Integer> Inventory;
    private TreeMap<String, Integer> p1Trade;
    private TreeMap<String, Integer> p2Trade;
    private JButton next;
    private JButton trade;
    private String type;

    TradePanel(Player p1, Player p2) {
        Inventory = new TreeMap<>();
        p1Trade = new TreeMap<>();
        p2Trade = new TreeMap<>();
        next = new JButton("Next");
        trade = new JButton("Trade");
        this.p1 = p1;
        this.p2 = p2;
    }

    public void normalTrade() {

    }

    public void portTrade() {
    }

    public void FourOneTrade() {
    }

    public void recordinventory(Player p){

    }

    public void chooseP1() {

    }

    public void chooseP2() {

    }

    public void getType() {
    }

    public void finalTradeInfo(TreeMap<String, Integer> p1Trade, TreeMap<String, Integer> p2Trade) {

    }
}




