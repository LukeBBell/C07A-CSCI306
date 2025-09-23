

package levelPieces;

import gameEngine.Drawable;
import gameEngine.GameEngine;
import gameEngine.InteractionResult;

/**
 *  This is an abstract class because it contains an abstract 
 *  method AND an instance variable
 * 
 * @author Mark Baldwin
 * @author Cyndi Rader
 *
 */
public class flower extends GamePiece {
    
    public flower(int location) {
        super('f', "flower", location);
    }
    
    @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        return InteractionResult.NONE;
    }
}