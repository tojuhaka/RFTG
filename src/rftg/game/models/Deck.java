package rftg.game.models;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;

import rftg.game.interfaces.Model;

import rftg.game.utils.Stack;

/*
 * Deck is a container for cards. Deck doesn't
 * have specific view or controller. It's just a model
 * used by many other controllers and views. It loads
 * info-files and a single image containing all the cards.
 * 
 */
public class Deck extends Stack<Card> implements Model {


	@Override
	public void create() {
		
		//Dummy file
		for (int i=0; i < 3; i++) {
			Card card = new Card();
			card.setName("Contact Specialist" + i);
			card.setPosition(i, 0);
			card.setCost(i);
			this.add(card);
		}
		
		
		
	}
}
