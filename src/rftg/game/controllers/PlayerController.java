package rftg.game.controllers;

import com.badlogic.gdx.graphics.OrthographicCamera;

import rftg.game.interfaces.Controller;
import rftg.game.interfaces.Model;
import rftg.game.interfaces.View;

import rftg.game.models.Player;
import rftg.game.views.PlayerView;

public class PlayerController implements Controller {

    // View and model
    private PlayerView playerView;
    private Player player;

    @Override
    public void create() {
               
    }

    @Override
    public void update(OrthographicCamera camera) {
    	
    }

    @Override
    public void setModel(Model model) {
        this.player = (Player)model;
    }

    @Override
    public void setView(View view) {
        this.playerView = (PlayerView)view;
    }

    @Override
    public Model getModel() {
        return player;
    }

    @Override
    public View getView() {
        return playerView;
    }

}
