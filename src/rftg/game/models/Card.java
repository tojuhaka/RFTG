package rftg.game.models;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Rectangle;

import rftg.game.interfaces.Model;

public class Card implements Model {

    private String name;
    private int cost;
    
    // There is a big image containing all the cards
    // we have to store the cards position in that image
    private int imageX, imageY;


    /**
     * Constructs a new instance.
     * @param name name of the card
     * @param cost how much the card costs
     */
    public Card(String name, int cost) {
        this.name = name;
        this.cost = cost;
    }
    public Card() {
    }

    /**
     * Gets the name for this instance.
     *
     * @return The name.
     */
    public String getName() {
        return this.name;
    }

    /**
     * Gets the cost for this instance.
     *
     * @return The cost.
     */
    public int getCost() {
        return this.cost;
    }


	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
	public int getImageX() {
		return imageX;
	}

	public int getImageY() {
		return imageY;
	}

	public void setName(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setPosition(int x, int y) {
		this.imageX = x;
		this.imageY = y;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
}
