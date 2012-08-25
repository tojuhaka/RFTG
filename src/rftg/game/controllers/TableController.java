package rftg.game.controllers;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.math.Vector3;

import rftg.game.interfaces.Controller;
import rftg.game.interfaces.Model;
import rftg.game.interfaces.View;

import rftg.game.models.Card;
import rftg.game.models.Table;

import rftg.game.views.TableView;

public class TableController implements Controller {

    private TableView tableView;
    private Table table;
    
    // linked controllers
    PlayerController playerController;

    @Override
    public void create() {

    }
    


    @Override
    public void update(OrthographicCamera camera) {
        if (Gdx.input.isTouched()) {
            Vector3 touchPos = new Vector3();
            touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
            camera.unproject(touchPos);
          
        }
    }

	@Override
	public void setModel(Model model) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setView(View view) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Model getModel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public View getView() {
		return this.tableView;
	}   
	
	public void setPlayerController(Controller controller) {
		playerController = (PlayerController)controller;
	}
	
	public void addCard(Card card) {
		tableView.updateCardViews();
	}

}
