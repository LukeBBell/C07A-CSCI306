//if you land on the chest then the GET_POINT is increased

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class chest extends GamePiece{
    
    public chest(int location) {
        super('X', "bomb", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
//checks if player landed on the chest 
        if (playerLocation == this.getLocation()) {
            return InteractionResult.GET_POINT;
        }
        return InteractionResult.NONE;
    }
}