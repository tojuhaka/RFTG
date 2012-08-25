package rftg.game.utils;

/**
 * Utility class for storing the view-data
 * and position of the card. Used for rendering.
 * @author tojuhaka
 *
 */
public class CardRectangle {
	
	// Position in cardsimage
 	public int imagePosX;
	public int imagePosY;
	
	// Card position on screen
	public float cardPosX;
	public float cardPosY;
	
	// Card width and height
	public int cardWidth;
	public int cardHeight;
	
	// Size of single image in cardsimage
	public int cardImageWidth;
	public int cardImageHeight;
}
