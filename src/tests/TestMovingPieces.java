	@Test
	public void Goblin(){
		// Each test will create its own gameBoard
		Drawable [] gameBoard = new Drawable[GameEngine.BOARD_SIZE];
		// Start with 1, leaves 0 open
		for (int i=1;i<=5; i++)
			gameBoard[i] = new Goblin();
		// Leave 6 open
		for (int i=7; i<=11; i++)
			gameBoard[i] = new Goblin();
		// Leave 12, 13 and 20 open, assume player in 13
		for (int i=14; i<20; i++)
			gameBoard[i] = new Goblin();
		// Place Sniper in an open space - 6
		// Note that Sniper location will be updated via move method, 
		// so occasionally location 6 will be open and may be chosen
		Goblin goblin = new Goblin(6);
		gameBoard[6] = goblin;
		int count0 = 0;
		int count6 = 0;
		int count12 = 0;
		int count20 = 0;
		for (int i=0; i<200; i++) {
			goblin.move(Gameboard, 13);
			int loc = goblin.getLocation();
			// ensure no other space is chosen
			if (loc != 0 && loc != 6 && loc != 12 && loc != 20)
				fail("Invalid square selected");
			// counters to ensure every valid option is chosen
			if (loc == 0) count0++;
			if (loc == 6) count6++;
			if (loc == 12) count12++;
			if (loc == 20) count20++;
		}
		// Ensure each option is randomly chosen some number of times. 
		assert(count0 > 1);
		assert(count6 > 1);
		assert(count12 > 1);
		assert(count20 > 1);		
	}