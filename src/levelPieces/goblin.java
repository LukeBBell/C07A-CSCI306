//stab if one away

package levelPieces;

import gameEngine.Drawable;
import gameEngine.Moveable;
import gameEngine.InteractionResult;

/**
 * Goblin game piece that extends GamePiece.
 * When the player interacts with a goblin, they take damage.
 */
public class Goblin extends GamePiece implements Moveable {
    
    /**
     * Constructor for Goblin
     * 
     * @param location initial location of the goblin on the board
     */
    public Goblin(int location) {
        super('G', "goblin", location);
    }
    
    /**
     * Handles interaction between player and goblin.
     * When player is at the same location as goblin, player takes a hit.
     * 
     * @param gameBoard current state of the game board
     * @param playerLocation current location of the player
     * @return InteractionResult.HIT if player is at same location, NONE otherwise
     */
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // Check if player is at the same location as this goblin
        if (playerLocation == (this.getLocation() + 1) || playerLocation == (this.getLocation() - 1) ) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }

    @Override
    public void move(Drawable[] gameBoard, int playerLocation) {
        //goblin moves randomly one space left or right each turn
        int direction = (int)(Math.random() * 2); // 0 or 1
        if (direction == 0 && this.getLocation() > 0) {
            if (gameBoard[this.getLocation() - 1] == null) {
            this.setLocation(this.getLocation() - 1); // move left
            }
        } else if (direction == 1 && this.getLocation() < gameBoard.length - 1) {
            if (gameBoard[this.getLocation() + 1] == null) {
            this.setLocation(this.getLocation() + 1); // move left
            }
        }
    }
}