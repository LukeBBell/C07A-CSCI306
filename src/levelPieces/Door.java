//Piece placed at the end of the level which advances player to next level

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class Door extends GamePiece {
    
    public Door(int location) {
        super('D', "door", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
//checks if player is one space before the door
        if (playerLocation == (this.getLocation()-1)) {
            return InteractionResult.ADVANCE;
        }
        return InteractionResult.NONE;
    }
}