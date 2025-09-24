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
            boulder blvl1 = new boulder(1);
            movingPieces.add(blvl1);
            interactingPieces.add(blvl1);
            board[1] = blvl1;
            flower f1lvl1 = new flower(4);
            board[4] = f1lvl1;
            chest clvl1 = new chest(6);
            board[6] = clvl1;
            interactingPieces.add(clvl1);
            flower f2lvl1 = new flower(8);
            board[8] = f2lvl1;
            trap t1lvl1 = new trap(14);
            board[12] = t1lvl1;
            interactingPieces.add(t1lvl1);
            trap t2lvl1 = new trap(18);
            goblin g1lvl1 = new goblin(15);
            board[15] = g1lvl1;
            interactingPieces.add(g1lvl1);
            movingPieces.add(g1lvl1);
            board[18] = t2lvl1;
            interactingPieces.add(t2lvl1);
            Door dlvl1 = new Door(20);
            board[20] = dlvl1;
            interactingPieces.add(dlvl1);

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