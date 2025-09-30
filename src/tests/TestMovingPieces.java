package tests;
import static org.junit.Assert.*;   // for assertEquals, assertTrue, assertNull, etc.
import org.junit.Test;              // for @Test annotation

import gameEngine.Drawable;
import gameEngine.InteractionResult;

import levelPieces.goblin;
import levelPieces.boulder;

	public class TestMovingPieces() {
		@Test
		public void testRandomMovement() {
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
				assertTrue("Goblin moved to invalid spot: " + newLoc,
						newLoc == initialLoc - 1 || newLoc == initialLoc + 1 || newLoc == initialLoc);

				if (newLoc == initialLoc - 1) {
					countLeft++;
					// reset for next iteration
					gameBoard[newLoc] = null;
					g.setLocation(initialLoc);
					gameBoard[initialLoc] = g;
				} else if (newLoc == initialLoc + 1) {
					countRight++;
					// reset for next iteration
					gameBoard[newLoc] = null;
					g.setLocation(initialLoc);
					gameBoard[initialLoc] = g;
				}
			}

			// Ensure both directions occurred
			assertTrue("Goblin never moved left", countLeft > 0);
			assertTrue("Goblin never moved right", countRight > 0);
		}	
	}