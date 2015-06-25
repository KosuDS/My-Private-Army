package stats;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.FPSLogger;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.mygdx.MyPrivateArmy.MyPrivateArmy;

public class Running implements Screen {

    private MyPrivateArmy mainGame;
    private OrthographicCamera camera;
    
    private SpriteBatch batch;
    private FPSLogger fpsLogger;
    private BitmapFont font;
    
    
    public Running(MyPrivateArmy mainGame){
             this.mainGame = mainGame;
    }
     
	@Override
	public void show() {
		batch = new SpriteBatch();
		camera = new OrthographicCamera();
		fpsLogger = new FPSLogger();
		font = new BitmapFont();
		
		camera.setToOrtho(false, 800, 600);
	
	}

	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0, 0.2f, 1);
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        
        camera.update();
        batch.setProjectionMatrix(camera.combined);

        batch.begin();
        font.draw(batch, "PODOBA SIE? :D", Gdx.input.getX(), Gdx.input.getY());
        batch.end();
        
        fpsLogger.log();
	}

	@Override
	public void resize(int width, int height) {

	}

	@Override
	public void pause() {
		
	}

	@Override
	public void resume() {

	}

	@Override
	public void hide() {
		
	}

	@Override
	public void dispose() {

	}
	
	

}
