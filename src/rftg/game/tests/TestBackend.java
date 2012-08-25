package rftg.game.tests;

import org.junit.Assert;

import org.junit.Test;

import rftg.game.models.Deck;
import rftg.game.models.Card;

public class TestBackend {

    // Initialize tests
    public TestBackend() {

    }

	@Test
	public void testDeck() {

        // Fill the deck with dummy cards
        Deck deck = new Deck();
        for (int i=0; i < 5; i++) {
            deck.add(new Card("name", i));
        }

        // Take first card, it cost should be 4
        Card card = deck.pop();
        Assert.assertEquals(card.getCost(),4);

        // Take second card, it cost should be 3
        card = deck.pop();
        Assert.assertEquals(card.getCost(),3);
        Assert.assertFalse(card.getCost() == 4);
	}

}
