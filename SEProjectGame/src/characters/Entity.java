package characters;

import items.Weapon;

import com.badlogic.gdx.math.Vector2;
import com.badlogic.gdx.math.Vector3;

public abstract class Entity {
	public Vector2 position;
	public float width, height;
	int health;
	public boolean facesRight;
	public boolean grounded;
	Weapon weapon;
	public Vector2 velocity;
	
	Entity(Vector2 pos, int health){
		this.position = new Vector2(pos.x, pos.y);
		this.health = health;
		velocity = new Vector2(0,0);
	}
	
	public abstract void Update(float delta);

	public abstract void Render(float delta);
}
