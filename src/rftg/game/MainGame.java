package rftg.game;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

import com.badlogic.gdx.math.Rectangle;
import com.badlogic.gdx.math.Vector3;

import rftg.game.models.*;
import rftg.game.views.PlayerView;

public class MainGame implements ApplicationListener {

        private OrthographicCamera camera;
        private SpriteBatch batch;
        private Rectangle card;

        // Models
        private Deck deck;

        // Views
        private PlayerView playerView;

        @Override
        public void create () {
            // Setup camera and make sure it's always 800x480
            camera = new OrthographicCamera();
            camera.setToOrtho(false, 800, 480);

            // Create area for drawing images
            batch = new SpriteBatch();

            // Rectangle for single card
            card = new Rectangle();
            card.x = 800 / 2 - 32 / 2;
            card.y = 20;
            card.width = 32;
            card.height = 32;

            // Create models
            deck = new Deck();
            deck.create();



            // Main view for player. Initializes most of the
            // components connected to player 
            playerView = new PlayerView();
            playerView.create();
        }

        @Override
        public void render () {
            // there is no update method in libgdx so we just create one
            this.update();
            Gdx.gl.glClearColor(0, 0, 0.2f, 1);
            Gdx.gl.glClear(GL10.GL_COLOR_BUFFER_BIT);
            batch.setProjectionMatrix(camera.combined);

            batch.begin();
            playerView.render(batch);
            batch.end();

            camera.update();
        }

        public void update() {
            this.playerView.update(camera); 
            if (Gdx.input.isTouched()) {
                Vector3 touchPos = new Vector3();
                touchPos.set(Gdx.input.getX(), Gdx.input.getY(), 0);
                camera.unproject(touchPos);
                card.x = touchPos.x - 32 / 2;
            }
        }

        @Override
		public void resize (int width, int height) {
        }

        @Override
		public void pause () {
        }

        @Override
		public void resume () {
        }

        @Override
		public void dispose () {
        }
}
