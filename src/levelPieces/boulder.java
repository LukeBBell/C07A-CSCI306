//Boulder moves right one space every turn and kills you if it lands on same space as you
// we'll put a chest near boulder so it is a challenge to attempt to get near the boudler


package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import gameEngine.Moveable;

public class boulder extends GamePiece implements Moveable {
    //move the boulder to the right one every turn

    
    public boulder(int location) {
        super('O', "boulder", location);
    }

    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {

        if (playerLocation == this.getLocation()) {
            return InteractionResult.KILL;
        }
        return InteractionResult.NONE;
    }


    public void move(Drawable[] gameBoard, int playerLocation) {

        this.setLocation(this.getLocation() + 1);
        gameBoard[this.getLocation() - 1] = null;
    }
}