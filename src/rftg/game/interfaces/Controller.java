package rftg.game.interfaces;

import com.badlogic.gdx.graphics.OrthographicCamera;

public interface Controller {
    public abstract void create();
    public abstract void update(OrthographicCamera camera);
    public abstract void setModel(Model model);
    public abstract void setView(View view);
    public abstract Model getModel();
    public abstract View getView();
}
