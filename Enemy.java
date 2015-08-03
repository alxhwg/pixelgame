package creatures;
import pixelgame.Creature;

/**The enemy the player needs to eliminate.*/
public class Enemy extends Creature {
	/**red color. */
    private int r;
    /**green color. */
    private int g;
    /**blue color. */
    private int b;
    /**strength of enemy.*/
    private strength;

    /**Creates an enemy creature with name "enemy" and a health.*/
    public Enemy(int health) {
    	super("enemy", health);
    	r = 255;
    	b = 0;
    	g = 0;
    	strength = 10;
    }

    /**When an enemy attacks it */
    public void attack(Creature c) {
    	c.setHealth(strength);
    }
}
