package tests;
import static org.junit.Assert.*;   // for assertEquals, assertTrue, assertNull, etc.
import org.junit.Test;              // for @Test annotation

import gameEngine.Drawable;
import gameEngine.InteractionResult;
import levelPieces.goblin;
import levelPieces.boulder;
import levelPieces.flower;

	public class TestMovingPieces {
		@Test
		public void testGoblinRandomMovement() {
			Drawable[] gameBoard = new Drawable[10]; // we dont need a big board

			// Place Goblin in the middle
			goblin g = new goblin(5);
			gameBoard[5] = g;

			int countLeft = 0;
			int countRight = 0;
			int initialLoc = g.getLocation();

			// Run many trials to sample randomness
			for (int i = 0; i < 200; i++) {
				g.move(gameBoard, -1); // player location irrelevant here
				int newLoc = g.getLocation();

				// Ensure only valid moves: stay at 4 or 6 (or back at 5 if blocked)
				assertTrue("Goblin moved to invalid spot: " + newLoc, newLoc == initialLoc - 1 || newLoc == initialLoc + 1 || newLoc == initialLoc);

				if (newLoc == initialLoc - 1) {
					countLeft++;
					// reset for next loop
					gameBoard[newLoc] = null;
					g.setLocation(initialLoc);
					gameBoard[initialLoc] = g;
				} else if (newLoc == initialLoc + 1) {
					countRight++;
					// reset for next loop
					gameBoard[newLoc] = null;
					g.setLocation(initialLoc);
					gameBoard[initialLoc] = g;
				}
			}

			// Ensure both directions occurred
			assertTrue("Goblin never moved left", countLeft > 0);
			assertTrue("Goblin never moved right", countRight > 0);
		}	

		@Test
    public void testBoulderMovesRight() {
        Drawable[] gameBoard = new Drawable[10];
        boulder b = new boulder(2);
        gameBoard[2] = b;
		flower f = new flower(4); // Place flower to the right so we can test if it runs it over
		gameBoard[4] = f;

        // Move boulder three times
        b.move(gameBoard, -1);
        assertEquals("Boulder should move to 3", 3, b.getLocation());
        assertNull("Previous square (2) should be cleared", gameBoard[2]);

        b.move(gameBoard, -1);
        assertEquals("Boulder should move to 4", 4, b.getLocation());
        assertNull("Previous square (3) should be cleared", gameBoard[3]);

        b.move(gameBoard, -1);
        assertEquals("Boulder should move to 5", 5, b.getLocation());
        assertNull("Previous square (4) should be cleared", gameBoard[4]);
    }
	}