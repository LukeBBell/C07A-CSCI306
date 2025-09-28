package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import utilities.;


@test
public void testTrap(){
    Drawable[] gameBoard = new Drawable[Game.Engine.BOARD_SIZE];
    trap boulder = new trap(5);
    gameBoard[5] = boulder;
    
    assertEquals(InteractionResult.HIT, trap.interact(gameBoard, i));

    for(int i=0; i<10; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
    
    for(int i=11; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
}