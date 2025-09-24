

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

//flower piece which does nothing when interaction called

public class flower extends GamePiece {
    
    public flower(int location) {
        super('f', "flower", location);
    }
    
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }
}