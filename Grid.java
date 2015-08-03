package pixelgame;

public class Grid {
	/** Grid size*/
	private int N;

	/**2D array of the occupants*/
	private Occupant [][] occupants;

	/**Creates the grid of size gridsize.*/
	public Grid(int gridSize) {
		N = gridSize;
        occupants = new Occupant[N][N];
        for (int y = 0; y < N; y++) {
            for (int x = 0; x < N; x++) {
                occupants[y][x] = null;
            }
        }
	}

    /** Returns true if spot at coordinates x and y are empty.*/
    private boolean isEmpty(int x, int y) {
        return getOccupant(x, y).name.equals("empty");
    }

    /**Returns the occupant at the x and y.*/
	public Occupant getOccupant(int x, int y) {
		return occupants[x][y];
	}

	/**Draws out the NxN grid.*/
	public void drawGrid() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                Occupant o = getOccupant(i, j);
                StdDraw.setPenColor(o.color());
                StdDraw.filledSquare(i + 0.5, j + 0.5, 0.45);	
            }
        }
	}

}
