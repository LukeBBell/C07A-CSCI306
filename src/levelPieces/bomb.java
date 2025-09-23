//if you land on this space it kills immediately

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class bomb extends GamePiece {
    
    public bomb(int location) {
        super('B', "bomb", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
//checks if player landed on the bomb
        if (playerLocation == this.getLocation()) {
            return InteractionResult.KILL;
        }
        return InteractionResult.NONE;
    }
}