//stab if one away

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

/**
 * Goblin game piece that extends GamePiece.
 * When the player interacts with a goblin, they take damage.
 */
public class Goblin extends GamePiece {
    
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
        if (playerLocation == this.getLocation()) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}