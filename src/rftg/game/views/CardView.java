package rftg.game.views;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import rftg.game.controllers.CardController;
import rftg.game.interfaces.Controller;
import rftg.game.interfaces.Model;
import rftg.game.interfaces.View;
import rftg.game.models.Card;
import rftg.game.utils.CardRectangle;
import rftg.game.utils.Config;

/**
 * Card views are created when the card is shown
 * on the screen. 
 * @author tojuhaka
 *
 */
public class CardView implements View {

	private Card card;
	private CardController cardController;
	private int x;
	private int y;
	
	// Card Images
	public  Texture cardImages;
	@Override
	public void create() {
		this.setController(new CardController());
		cardController.setModel(card);
		cardController.setView(this);
		cardImages = new Texture(Gdx.files.internal("cards.png"));
	}

	@Override
	public void update(OrthographicCamera camera) {
		cardController.update(camera);

	}

	@Override
	public void render(SpriteBatch batch) {

    	int imagePosX = card.getImageX() * Config.CARD_IMAGE_WIDTH;
    	int imagePosY = card.getImageY();
    	
    	float cardPosX = (this.x * Config.CARD_WIDTH) + (this.x * 16);
    	float cardPosY = this.y + card.getImageY();
    	
    	int cardWidth = Config.CARD_WIDTH;
    	int cardHeight = Config.CARD_HEIGHT;
    	
    	int cardImageWidth = Config.CARD_IMAGE_WIDTH;
    	int cardImageHeight = Config.CARD_IMAGE_HEIGHT;
    	
        batch.draw(cardImages, cardPosX, cardPosY, cardWidth, cardHeight,
        		imagePosX, imagePosY, cardImageWidth, cardImageHeight, false, false);

	}

	@Override
	public void setModel(Model model) {
		this.card = (Card) model;
	}

	@Override
	public Model getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Controller getController() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setController(Controller controller) {
		this.cardController = (CardController)controller;
	}
	
	
	public void setPosition(int x, int y) {
		this.x = x;
		this.y = y;
	}
	

}
