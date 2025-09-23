//if you are not within two spaces of the wizard each turn he will have a 20% chance to shoot a fireball at you and kill you

package levelPieces;

import gameEngine.Drawable;
import gameEngine.InteractionResult;

public class wizard extends GamePiece implements Moveable{
    
    public wizard(int location) {
        super('W', "wizard", location);
    }

 @Override
    public InteractionResult interact(Drawable[] gameBoard, int playerLocation) {
        // check if player is within 2 spaces of the wizard
        if (Math.abs(playerLocation - this.getLocation()) <= 2) {
            return InteractionResult.NONE;
        } else {
            // 20% chance to shoot fireball and kill player
            if (Math.random() < 0.2) {  // 0.0–1.0, so < 0.2 means 20% chance
                return InteractionResult.KILL;
            }
        }
        return InteractionResult.NONE;
    }
}