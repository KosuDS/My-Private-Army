package resources;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

import path.Path;

public class GraphicsResources {
	
	private Path path = new Path();
	private Texture tileSet;
	private ArrayList<TextureRegion> tilesTexture = new ArrayList<TextureRegion>();
	
	public GraphicsResources(String path){
		tileSet = new Texture(Gdx.files.internal(path));
	}
	
	public void splitTextures(int width, int height){
		int widthTexture = tileSet.getWidth();
		int heightTexture = tileSet.getHeight();

		for (int row = 0; row < heightTexture - 1; row +=height) {
			for (int column = 0; column < widthTexture - 1; column += width) {
				tilesTexture.add(new TextureRegion(tileSet, column, row, width, height));
				
			}
		} 
	}
}
