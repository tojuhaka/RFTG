package rftg.game.models;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;

import rftg.game.interfaces.Model;

/**
 * Single Player
 * 
 * @author Toni Haka-Risku (tojuhaka@gmail.com)
 */
public class Player implements Model {

    private Dictionary<String, String[]> upgrades;
    private Table table;
    private Hand hand;
    private String name;

    /**
     * Constructs a new instance.
     */
    public Player() {
        upgrades = new Hashtable<String, String[]>();
    }

    /**
     * Gets the table for this instance.
     *
     * @return The table.
     */
    public Table getTable() {
        return this.table;
    }

    /**
     * Sets the table for this instance.
     *
     * @param table The table.
     */
    public void setTable(Table table) {
        this.table = table;
    }

    /**
     * Gets the hand for this instance.
     *
     * @return The hand.
     */
    public Hand getHand() {
        return this.hand;
    }

    /**
     * Sets the hand for this instance.
     *
     * @param hand The hand.
     */
    public void setHand(Hand hand) {
        this.hand = hand;
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
     * Sets the name for this instance.
     *
     * @param name The name.
     */
    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> draw(Deck deck, int amount) { 
        ArrayList<Card> list = deck.pop(amount);
        return list;
        
    }

	@Override
	public void create() {
		// TODO Auto-generated method stub
		
	}
}
