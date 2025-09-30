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

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
}

@Test
public void testChest(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Chest chest= new Chest(5);
    gameBoard[5] = chest;
    
    assertEquals(InteractionResult.GET_POINT, trap.interact(gameBoard, 5));

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, chest.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, chest.InteractionResult(gameBoard, i));
    }
}

@Test
public void testDoor(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Door door= new Door(5);
    gameBoard[5] = door;
    
    assertEquals(InteractionResult.ADVANCE, door.interact(gameBoard, 5));

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, door.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, door.InteractionResult(gameBoard, i));
    }
}

@Test
public void test(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Trap trap= new Trap(5);
    gameBoard[5] = trap;
    
    assertEquals(InteractionResult.HIT, trap.interact(gameBoard, 5));

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, trap.InteractionResult(gameBoard, i));
    }
}

@Test
public void testFlower(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Flower flower= new Flower(5);
    gameBoard[5] = flower;
    
    assertEquals(InteractionResult.NONE, flower.interact(gameBoard, 5));

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, flower.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, flower.InteractionResult(gameBoard, i));
    }
}

@Test
public void testGoblin(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Goblin goblin= new Goblin(5);
    gameBoard[5] = goblin;
    
    assertEquals(InteractionResult.HIT, goblin.interact(gameBoard, 5));

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, goblin.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, goblin.InteractionResult(gameBoard, i));
    }
}

@Test
public void testWizard(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Wizard wizard= new Wizard(5);
    gameBoard[5] = wizard;
    
    assertEquals(InteractionResult.KILL, wizard.interact(gameBoard, 5));

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, wizard.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, wizard.InteractionResult(gameBoard, i));
    }
}

@Test
public void testBoulder(){
    Drawable[] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
    Boulder boulder= new Boulder(5);
    gameBoard[5] = boulder;
    
    assertEquals(InteractionResult.KILL, boulder.interact(gameBoard, 5));

    for(int i=0; i<5; i++){
        assertEquals(InteractionResult.NONE, boulder.InteractionResult(gameBoard, i));
    }
    
    for(int i=6; i<GameEngine.BOARD_SIZE; i++){
        assertEquals(InteractionResult.NONE, boulder.InteractionResult(gameBoard, i));
    }
}
}