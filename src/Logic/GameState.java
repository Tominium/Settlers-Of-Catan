package Logic;

import Cards.DevelopmentCard;
import Cards.ResourceCard;
import Misc.Dice;
import Misc.Thief;
import Panels.GameBoard;
import Structures.Structure;
import TilePiece.Tile;

import javax.sound.sampled.Port;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;

public class GameState {

    public static ArrayList<Player> players;
    private static ArrayList<Tile> tiles;
    private static int turnNumber;
    private static GameBoard gameBoard;
    //private GameBoardGraphic fullGameBoard;
    //private ResourceDeck rcDeck;
    //private DevelopmentDeck dcDeck;
    private static Dice dice;
    private static Thief thief;
    private static int max = 3;
    private static Player LAPlayer;

    public GameState(int numOfPlayers){
        players = new ArrayList<Player>();
        setColors(numOfPlayers);
        tiles = new ArrayList<Tile>();
        dice = new Dice();
        thief = new Thief();
        Frame f = new Frame();
        LAPlayer = null;
    }

    private static void setColors(int num){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");colors.add("Red");colors.add("Orange");colors.add("Green");
        Collections.shuffle(colors);
        while(num!=0){
            players.add(new Player(colors.remove(0), num));
            num--;
        }
        Collections.reverse(players);
    }

    public static ArrayList<Player> getAllPlayers(){return players;}

    public static boolean moveThief(Point p){
        return false;
    }

//    public Player checkWin(){
//        for(Player p: )
//    }

    public static Player checkWin() {
        for(int i = 0; i < players.size(); i++)
            if(players.get(i).getPoints()>=10)
                return players.get(i);
        return null;
    }

    public static LinkedList<ResourceCard> getResourceInventory() {
        return players.get(turnNumber).getRC();
    }

    public static LinkedList<DevelopmentCard> getDevelopmentInventory() {
        return players.get(turnNumber).getDC();
    }

    public static int iterateTurn() {
        return turnNumber+1;
    }

    public static void canTrade(Player p, ResourceCard[] send, ResourceCard[] receive) {
        if (players.get(turnNumber).getRC().contains(send)&&p.getRC().contains(receive))
            trade(p, send, receive);
    }


    public static void trade(Player p, ResourceCard[] send, ResourceCard[] receive) {
        for(int i = 0; i < send.length; i++) {
            p.addRC(send[i]);
            players.get(turnNumber).removeRCard(send[i]);
        }
        for(int i = 0; i < receive.length; i++) {
            players.get(turnNumber).addRC(receive[i]);
            p.removeRCard(receive[i]);
        }
    }

    public static boolean canBuild(Structure s) {

        ResourceCard[] road = new ResourceCard[2];
        road[0] = new ResourceCard("brick");
        road[1] = new ResourceCard("lumber");
        ResourceCard[] settlement = new ResourceCard[4];
        road[0] = new ResourceCard("brick");
        road[1] = new ResourceCard("lumber");
        road[2] = new ResourceCard("wheat");
        road[3] = new ResourceCard("wool");
        ResourceCard[] city = new ResourceCard[5];
        road[0] = new ResourceCard("wheat");
        road[1] = new ResourceCard("wheat");
        road[2] = new ResourceCard("ore");
        road[3] = new ResourceCard("ore");
        road[4] = new ResourceCard("ore");


        if(s.getType().equals("road"))
            return hasResources(road);
        else if(s.getType().equals("settlement"))
            return hasResources(settlement);
        else
            return hasResources(city);
    }

    public static boolean hasResources(ResourceCard[] needed) {
        return players.get(turnNumber).getRC().contains(needed);
    }

    public static boolean canPlace(Structure s, Point p) {
        return true;
    }

    public static GameBoard getGameBoard() {
        return gameBoard;
    }

    public static int getDiceRoll() {
        return dice.getRolledNum();
    }

    public static void rollSeven() {


    }

    public static void giveLongestRoad(Player p) {
        for(int i = 0; i < players.size(); i++)
            if (players.get(i).getHasLR() == true)
                players.get(i).setHasLR(false);
        p.setHasLR(true);
    }

    public static void giveLargestArmy(Player p) {
        for(int i = 0; i < players.size(); i++)
            if (players.get(i).getHasLA() == true)
                players.get(i).setHasLA(false);
        p.setHasLA(true);
    }

    public static Player longestRoad() {
        for(int i = 0; i < players.size(); i++) {
            if (players.get(i).getHasLR() == true)
                return players.get(i);
        }
        return null;
    }

    public static Player largestArmy() {
        if(LAPlayer == null)
            max = 3;
        else
            max = LAPlayer.getNumKnightCards();

        for(int i = 0; i < players.size(); i++) {

            for (int j = 0; j < players.get(i).getDC().size(); i++)
                if(LAPlayer==null&&players.get(i).getNumKnightCards()==max) {
                    LAPlayer = players.get(i);
                }
                if (players.get(i).getNumKnightCards()>max) {
                    LAPlayer = players.get(i);
                    max = players.get(i).getNumKnightCards();
                }

        }
        return LAPlayer;
    }

    public static void steal(Player p) {

    }

    public static void setTile(ArrayList<Tile> t) {

    }

    public static Port isOnPort(Structure s) {
        return null;
    }

    public static HashMap<Player, LinkedList<String>> tokenResource(int num) {
        return null;
    }

    public static void build(Structure s, Point p) {
        s.setPos(p);
    }

    public static void useDevCard(DevelopmentCard dc) {
        for(int i = 0; i < players.get(turnNumber).getDC().size(); i++)
            if(players.get(turnNumber).getDC().get(i).equals(dc))
                players.get(turnNumber).removeDCard(players.get(turnNumber).getDC().get(i));
    }
}
