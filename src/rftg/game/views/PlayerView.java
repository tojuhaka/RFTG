package rftg.game.views;

import com.badlogic.gdx.Gdx;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.math.Rectangle;

import rftg.game.controllers.PlayerController;
import rftg.game.controllers.TableController;
import rftg.game.interfaces.Controller;
import rftg.game.interfaces.Model;
import rftg.game.interfaces.View;

import rftg.game.models.Player;

/**
 * Main view for player. Initializes all other MVC-components
 * used inside player. 
 * 
 * @author tojuhaka
 */
public class PlayerView implements View {


    private Player player;
    private PlayerController playerController;
    
    // subviews
    private TableView tableView;

    // Controller links
    private TableController tableController;

    private Texture previewImage = new Texture(
            Gdx.files.internal("contact_specialist_512.png")
        );


    @Override
    public void create() {
        this.setModel(new Player());
        this.player.create();
        
        // controller
        this.setController(new PlayerController());
        playerController.setModel(this.player);
        playerController.setView(this);
        
        //subviews
        tableView = new TableView();
        tableView.create();
        
        // link controllers
        tableController = (TableController)tableView.getController();
        tableController.setPlayerController(this.playerController);
        
    }

    @Override
    public void render(SpriteBatch batch) {
        
        // Preview cardj
        //TODO: remove hardcodes
        batch.draw(previewImage, 600, 200, 200, 280, 0, 0, 370, 512, false, false);
        tableView.render(batch);

    }

    /**
     * Gets the previewImage for this instance.
     *
     * @return The previewImage.
     */
    public Texture getPreviewImage() {
        return this.previewImage;
    }

    /**
     * Sets the previewImage for this instance.
     *
     * @param previewImage The previewImage.
     */
    public void setPreviewImage(Texture previewImage) {
        this.previewImage = previewImage;
    }

    @Override
    public void setModel(Model model) {
        this.player = (Player)model;
        
    }

    @Override
    public Model getModel() {
        return this.player;
    }

	@Override
	public Controller getController() {
		return playerController;
	}

	@Override
	public void setController(Controller controller) {
		this.playerController = (PlayerController)controller;
		
	}

	@Override
	public void update(OrthographicCamera camera) {
		// TODO Auto-generated method stub
		
	}

}
