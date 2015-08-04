package pixelgame;

import java.awt.Color;

/** Terrain modifies the behavior of the Creatures that
 *  inhabit the same space.
 */
public class Terrain {
	
	/** There are different types of Terrain.
	 *  NORMAL is the standard terrain and has no special effects.
	 */
	public enum TerrainType {
		NORMAL
	}

    /** Returns the color of a specifiec TerrainType. */
    public Color colorOf(TerrainType type) {
        switch (type) {
        	case TerrainType.NORMAL: return Color.WHITE;
        	default: return Color.WHITE;
        }
    }    

    /** Applies the effects of the Terrain onto a Pixel. */
    public void apply(TerrainType type, Pixel p) {
    	//Implementation of applying effects is tbd.
    }
}
