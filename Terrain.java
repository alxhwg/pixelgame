package pixelgame;
import java.awt.Color;

public class Terrain extends Pixel {

	/**Creates some terrain.*/
	public Terrain(){
		super("rock", -1000);
	}

    /**Returns a brown square (a rock?) */
    public Color color() {
        return color(102, 51, 0);
    }    

}
