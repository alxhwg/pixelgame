package pixelgame;
import java.awt.Color;

public class Creature extends Pixel {

	/**Creates a creature with name n and health h.*/
	public Creature(String n, int h) {
		super(n, h);
	}

	/**Moves the creature.*/
	public void move() {
	}

	/**Used to attack a fellow creature.*/
	public void attack(Creature x) {
	}

	/**When health reaches 0, this removes the creature from the grid.*/
	public void die() {
	}

	/**After a certain time the creature may be able to evolve.*/
	public Creature evolve() {
	}

}
