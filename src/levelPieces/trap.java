//Hits player if they land on the trap space and does the HIT interactione


package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;


public class trap extends GamePiece{
    

    public trap(int location) {
        super('T', "trap", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // Check if player is at the same location as this trap
        if (playerLocation == this.getLocation()) {
            return InteractionResult.HIT;
        }
        return InteractionResult.NONE;
    }
}
