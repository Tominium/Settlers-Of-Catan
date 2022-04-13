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

    public GameState(int numOfPlayers){
        players = new ArrayList<Player>();
        setColors(numOfPlayers);
        tiles = new ArrayList<Tile>();
        dice = new Dice();
        thief = new Thief();
        Frame f = new Frame();
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
        int winner = 0;
        return players.get(winner);
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

    public static boolean canTrade(Player p) {
        return true;
    }

    public static void trade() {

    }

    public static boolean canBuild(Structure s) {
        return true;
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

    }

    public static void giveLargestArmy(Player p) {

    }

    public static Player longestRoad() {
        return players.get(0);
    }

    public static Player largestArmy() {
        return players.get(0);
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

    public static void build(Structure s) {

    }

    public static void useDevCard(DevelopmentCard dc) {

    }
}
