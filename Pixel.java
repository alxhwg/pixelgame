package pixelgame;

import java.awt.Color;

/** The abstract class representing an inhabitant of the
 *  game grid.
 */

public abstract class Pixel implements Comparable<Pixel> {
	private int xCoord;
	private int yCoord;
	/** In the case the move order of two adjacent pixels needs to be determined;
	 *  the higher the value, the higher the move priority.
	 *  Rank can also impact certain Pixel's decisions regarding other Pixels. */
	private int rank;
	
	private Color color;
	
	/** Returns the Pixel's x-coordinate. */
	public int getX() {
		return xCoord;
	}
	
	/** Returns the Pixel's y-coordinate. */
	public int getY() {
		return yCoord;
	}
	
	/** Returns the Pixel's rank. */
	public int getRank() {
		return rank;
	}
	
	/** Returns the Pixel's color. */
	public Color getColor() {
		return color;
	}
	
	/** Establishes a natural ordering for Pixels where higher ranked pixels
	 *  are considered less than lower ranked Pixels and thus appear closer to
	 *  the head of a PriorityQueue.
	 */
	public int compareTo(Pixel p) {
		return p.getRank() - this.rank;
	}
}
