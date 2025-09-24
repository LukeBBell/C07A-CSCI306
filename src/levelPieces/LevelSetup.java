package levelPieces;

import gameEngine.Drawable;
import java.util.ArrayList;
import gameEngine.Moveable;

public class LevelSetup {
    
    Drawable[] board;
    ArrayList<Moveable> movingPieces; 
    ArrayList<GamePiece> interactingPieces;
    int playerStartLoc;

    public void createLevel(int levelNumber) {
        // Implementation for setting up the level based on levelNumber
        if 
    }

    public Drawable[] getBoard() {
        // Return the game board array
        return board;
    }

    public ArrayList<Moveable> getMovingPieces() {
        // Return the list of moving pieces
        return movingPieces;
    }

    public ArrayList<GamePiece> getInteractingPieces() {
        // Return the list of interacting pieces
        return interactingPieces;
    }

    public int getPlayerStartLoc() {
        // Return the player's starting location
        return playerStartLoc;
    }

}