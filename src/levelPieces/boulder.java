//

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class boulder extends GamePiece {
    
    public boulder(int location) {
        super('O', "boulder", location);
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