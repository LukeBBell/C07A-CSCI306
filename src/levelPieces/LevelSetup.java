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

            boulder blvl2 = new boulder(1);
            movingPieces.add(blvl2);
            interactingPieces.add(blvl2);
            board[2] = blvl2;

            flower f1lvl2 = new flower(3);
            board[3] = f1lvl2;
            chest clvl2 = new chest(1);
            board[1] = clvl2;

            trap t1lvl2 = new trap(7);
            board[7] = t1lvl2;

            goblin g1lvl2 = new goblin(9);
            board[9] = g1lvl2;

            flower f2lvl2 = new flower(11);
            board[11] = f2lvl2;

            trap t3lvl2 = new trap(12);
            board[12] = t3lvl2;

            trap t4lvl2 = new trap(14);
            board[14] = t4lvl2;

            wizard w1lvl2 = new wizard(17);
            board[17] = w1lvl2;

            chest c2lvl2 = new chest(19);
            board[19] = c2lvl2;

            Door dlvl2 = new Door(20);
            board[20] = dlvl2;


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