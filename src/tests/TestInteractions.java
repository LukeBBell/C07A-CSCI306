package tests;
import static org.junit.Assert.*;
import org.junit.Test;
import utilities.Trap;

public class TestInteractions {
@Test
public void testTrap(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Trap trap= new Trap(5);
    gameBoard[5] = trap;
    
    assertEquals(InteractionResult.HIT, trap.interact(gameBoard, 5));

    for(int i=0; i<10; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
    
    for(int i=11; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
}
}