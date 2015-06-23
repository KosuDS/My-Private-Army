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
		
		int widthCount = widthTexture / width;
		int heightCount = heightTexture / height;
		
		tilesTexture.add(new TextureRegion(tileSet, 0, 0, 64, 64));
		tilesTexture.add(new TextureRegion(tileSet, 64, 0, 64, 64));
		tilesTexture.add(new TextureRegion(tileSet, 128, 0, 64, 64));
		
		tilesTexture.add(new TextureRegion(tileSet, 0, 64, 64, 64));
		tilesTexture.add(new TextureRegion(tileSet, 64, 64, 64, 64));
		tilesTexture.add(new TextureRegion(tileSet, 128, 64, 64, 64));
		
		tilesTexture.add(new TextureRegion(tileSet, 0, 128, 64, 64));
		tilesTexture.add(new TextureRegion(tileSet, 64, 128, 64, 64));
		tilesTexture.add(new TextureRegion(tileSet, 128, 128, 64, 64));
		

	}
}
