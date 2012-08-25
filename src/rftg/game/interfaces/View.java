package rftg.game.interfaces;

import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public interface View {
    public abstract void create();
    public abstract void update(OrthographicCamera camera);
    public abstract void render(SpriteBatch batch);
    public abstract void setModel(Model model);
    public abstract Model getModel();
    public abstract Controller getController();
    public abstract void setController(Controller controller);
}
