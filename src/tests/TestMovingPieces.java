package tests;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import gameEngine.Drawable;
import levelPieces.goblin;
import levelPieces.boulder;

	public class TestMovingPieces {
		    @Test
    public void testRandomMovement() {
        Drawable[] gameBoard = new Drawable[10]; // Small board

        goblin g = new goblin(5);
        gameBoard[5] = g;

        int countLeft = 0;
        int countRight = 0;
        int initialLoc = g.getLocation();

        for (int i = 0; i < 200; i++) {
            g.move(gameBoard, -1);
            int newLoc = g.getLocation();

            assertTrue(
                newLoc == initialLoc - 1 || newLoc == initialLoc + 1 || newLoc == initialLoc,
                "Goblin moved to invalid spot: " + newLoc
            );

            if (newLoc == initialLoc - 1) {
                countLeft++;
                gameBoard[newLoc] = null;
                g.setLocation(initialLoc);
                gameBoard[initialLoc] = g;
            } else if (newLoc == initialLoc + 1) {
                countRight++;
                gameBoard[newLoc] = null;
                g.setLocation(initialLoc);
                gameBoard[initialLoc] = g;
            }
        }

        assertTrue(countLeft > 0, "Goblin never moved left");
        assertTrue(countRight > 0, "Goblin never moved right");
    }

		@Test
    public void testBoulderMovesRight() {
        Drawable[] gameBoard = new Drawable[10];
        boulder b = new boulder(2);
        gameBoard[2] = b;

        b.move(gameBoard, -1);
        assertEquals(3, b.getLocation(), "Boulder should move to 3");
        assertNull(gameBoard[2], "Previous square (2) should be cleared");

        b.move(gameBoard, -1);
        assertEquals(4, b.getLocation(), "Boulder should move to 4");
        assertNull(gameBoard[3], "Previous square (3) should be cleared");

        b.move(gameBoard, -1);
        assertEquals(5, b.getLocation(), "Boulder should move to 5");
        assertNull(gameBoard[4], "Previous square (4) should be cleared");
    }

   
}