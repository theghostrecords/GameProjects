package items;

import java.util.ArrayList;
import java.util.Arrays;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import logicClasses.Item;

public class Candlelight extends Item{
	String itemName = "candlelight";
	private ArrayList<String> compatibleItems = new ArrayList<String>(Arrays.asList("teddybear","locket","glove","earring"));
	

	public Candlelight(Sprite sprite) {
		super(sprite);
		this.setName(itemName);
		this.setCompatibleList(compatibleItems);
	}

	@Override
	public void draw(SpriteBatch spriteBatch) {
		sprite.setX(position.x);
		sprite.setY(position.y);
		sprite.draw(spriteBatch);

	}
	
	@Override
	public String toString(){
		return "Candlelight: Lights up your soul.";
	}

}
