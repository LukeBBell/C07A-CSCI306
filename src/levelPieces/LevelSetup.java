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
        if (levelNumber == 1) {
            board = new Drawable[21];
            movingPieces = new ArrayList<>();
            interactingPieces = new ArrayList<>();
            playerStartLoc = 10;
        } else if (levelNumber == 2) {
            board = new Drawable[21];
            movingPieces = new ArrayList<>();
            interactingPieces = new ArrayList<>();
            playerStartLoc = 5;
        }
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