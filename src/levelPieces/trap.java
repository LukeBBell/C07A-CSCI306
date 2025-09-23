//do damage when on the same space


package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * trap game piece that extends GamePiece.
 * When the player interacts with a trap, they take damage.
 */
public class trap extends GamePiece{
    
    /**
     * Constructor for Goblin
     * 
     * @param location initial location of the goblin on the board
     */
    public trap(int location) {
        super('T', "trap", location);
    }
    
    /**
     * Handles interaction between player and trap.
     * When player is at the same location as trap, player takes a hit.
     * 
     * @param gameBoard current state of the game board
     * @param playerLocation current location of the player
     * @return InteractionResult.HIT if player is at same location, NONE otherwise
     */
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // Check if player is at the same location as this trap
        if (playerLocation == this.getLocation()) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
