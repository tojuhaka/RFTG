package rftg.game.models;

import java.util.ArrayList;

import rftg.game.interfaces.Model;

/**
 * Player's hand
 * 
 * @author Toni Haka-Risku (tojuhaka@gmail.com)
 */
public class Hand extends ArrayList<Card> implements Model {
    private int maxSize;

    /**
     * Gets the maxSize for this instance.
     *
     * @return The maxSize.
     */
    public int getMaxSize() {
        return this.maxSize;
    }

    /**
     * Sets the maxSize for this instance.
     *
     * @param maxSize The maxSize.
     */
    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}    
}
