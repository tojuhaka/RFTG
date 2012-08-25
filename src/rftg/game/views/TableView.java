package rftg.game.views;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.math.Rectangle;

import rftg.game.models.*;
import rftg.game.utils.CardRectangle;

import rftg.game.controllers.TableController;
import rftg.game.interfaces.Controller;
import rftg.game.interfaces.Model;
import rftg.game.interfaces.View;

public class TableView implements View {

	// Position 
    private int x,y;
    private int width, height;
    
    
    // MVC
    private TableController tableController;
    private Table table;

    
    // List of all the card views
    private ArrayList<CardView> cardViews = new ArrayList<CardView>();


    public TableView() {
		// TODO Auto-generated constructor stub
	}

	@Override
    public void create() {
		this.setController(new TableController());
		this.setModel(new Table());
		this.table.create();

		this.updateCardViews();
        
    }

	@Override
	public void update(OrthographicCamera camera) {
        for (int i=0; i < cardViews.size(); i++) {
        	CardView cardView = cardViews.get(i);
            cardView.update(camera);
        }
	}
	
    @Override
    public void render(SpriteBatch batch) {
    	
        for (int i=0; i < cardViews.size(); i++) {
        	CardView cardView = cardViews.get(i);
        	cardView.setPosition(i, 0);
        	cardView.render(batch);
        }
    }

    /**
     * Get the selected card
     * 
     * @param x coordinate from touch
     * @param y coordinate from touch
     * @return selected card
     */
    public Card getSelectedCard(int x, int y) {
        // TODO: implement!
        return new Card();
    }

    /**
     * Gets the x for this instance.
     *
     * @return The x.
     */
    public int getX() {
        return this.x;
    }

    /**
     * Sets the x for this instance.
     *
     * @param x The x.
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Gets the y for this instance.
     *
     * @return The y.
     */
    public int getY() {
        return this.y;
    }

    /**
     * Sets the y for this instance.
     *
     * @param y The y.
     */
    public void setY(int y) {
        this.y = y;
    }

	@Override
	public void setModel(Model model) {
		this.table = (Table)model;
	}

	@Override
	public Model getModel() {
		return this.table;
	}

	@Override
	public Controller getController() {
		// TODO Auto-generated method stub
		return tableController;
	}

	@Override
	public void setController(Controller controller) {
		this.tableController = (TableController) controller;
		
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}


	// Called by controller
	public void updateCardViews() {
		this.cardViews.clear();
		for (Card card : table) {
			CardView cardView = new CardView();
			cardView.setModel(card);
			cardView.create();
			this.cardViews.add(cardView);	
		}
		
	}

}
