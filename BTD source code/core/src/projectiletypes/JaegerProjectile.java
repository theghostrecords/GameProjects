package projectiletypes;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

import logicClasses.Mob;
import logicClasses.Projectile;
import logicClasses.Tower;

public class JaegerProjectile extends Projectile {

	public JaegerProjectile(Vector2 position, Tower tower, int damage, Mob target, boolean slows) {
		super(new Sprite(new Texture("image\\projectiles\\shotOfJager.png")), tower, damage, 10, position, target, slows);
		sprite.setSize(6, 6);
	}

}
