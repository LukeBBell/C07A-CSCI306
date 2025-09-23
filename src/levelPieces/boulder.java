//

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class boulder extends GamePiece implements Moveable {
    //move the boulder to the right one every turn

    //move the boulder to the right one every turn

    
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