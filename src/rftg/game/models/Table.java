package rftg.game.models;

import java.util.ArrayList;

import rftg.game.interfaces.Model;

/**
 * Tableau for all the tables. Contains all the playertables.
 * 
 * @author Toni Haka-Risku (tojuhaka@gmail.com)
 */
public class Table extends ArrayList<Card> implements Model {
    private int maxSize;

    /**
     * Constructs a new instance.
     */
    public Table() {
        this.maxSize = 12;

    }

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
