package pixelgame;

import java.util.PritorityQueue;

public class Grid {
	/** The length of one side of the square grid */
	private int N;
	/** 2D array of the terrain of the grid */
	private Terrain.TerrainType[][] terrain;
	/** 2D array of all the Pixels of the game. */
	private Pixel[][] pixels; //An alternative to a 2D array is a PQ.

	/** Creates square grid with a side length of size with no terrain and pixels. */
	public Grid(int size) {
		N = size;
        terrain = new Terrain.TerrainType[N][N];
        pixels = new Pixel[N][N];
	}

	/** Checks whether or not the coordinates specified are in the board, and if they aren't
	 *  throws an exception. */
	private void checkBounds(int x, int y) {
		if (!((x < N && x >= 0) && (y < N && y >= 0))) {
			throw new IllegalArgumentException("Coordinates are out of bounds.");
		}
	}
	
    /** Returns the occupant at x and y. */
	public Pixel get(int x, int y) {
		checkBounds(x, y);
		return pixels[x][y];
	}

    /** Returns true if spot at coordinates x and y is empty. */
    private boolean isEmpty(int x, int y) {
    	checkBounds(x, y);
        return pixels[x][y] == null;
    }

    /** Places Pixel p at location (x, y). */
    public void place(Pixel p, int x, int y) {
    	checkBounds(x, y);
        if (isEmpty(x, y)) {
            pixels[x][y] = p;
        } else {
        	throw new IllegalArgumentException(String.format("Tried to place a %s at "
        			+ "(%d, %d).", x, y));
        }
    }

	/** Draws out the NxN grid. */
	public void drawGrid() {
	}

}
