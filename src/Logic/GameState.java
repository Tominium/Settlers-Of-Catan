package Logic;

import Misc.Dice;
import Misc.Thief;
import Panels.GameBoard;
import TilePiece.Tile;
import java.util.ArrayList;
import java.util.Collections;

public class GameState {

    private ArrayList<Player> players;
    private ArrayList<Tile> tiles;
    private int turnNumber;
    private GameBoard gameBoard;
    //private GameBoardGraphic fullGameBoard;
    //private ResourceDeck rcDeck;
    //private DevelopmentDeck dcDeck;
    private Dice dice;
    private Thief thief;

    public GameState(int numOfPlayers){
        players = new ArrayList<Player>();
        setColors(numOfPlayers);
        tiles = new ArrayList<Tile>();
        dice = new Dice();
        thief = new Thief();
    }

    private void setColors(int num){
        ArrayList<String> colors = new ArrayList<String>();
        colors.add("Blue");colors.add("Red");colors.add("Orange");colors.add("Green");
        Collections.shuffle(colors);
        while(num!=0){
            players.add(new Player(colors.remove(0), num));
            num--;
        }
        Collections.reverse(players);
    }

    public ArrayList<Player> getAllPlayers(){return players;}

}
