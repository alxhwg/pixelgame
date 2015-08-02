package pixelgame;
import java.awt.Color;

/** The abstract class representing a pixel that inhabits the
  * game grid.
  */

public abstract class Pixel {
	private int xCoord;
	private int yCoord;
	private String name;
	private int health;

	/**Creates a Pixel object with name n and health h.*/
	public Pixel(String n, int h) {
		name = n;
		health = h;
	}

	/**Returns the name.*/
	public String name() {
		return name;
	}	

	/**Returns the health.*/
	public String health() {
		return health;
	}

	/**Every pixel has to have a corresponding color.*/
    public abstract Color color();
}
