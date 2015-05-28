package map;

import java.util.ArrayList;

import tools.TableHelper;

import com.badlogic.gdx.math.Vector2;

public class Layer {
	
	private int width, height, lenght;
	private Vector2 position;
	
	private int[] tiles;
	
	
	public Layer(int width, int height, Vector2 position){
		this.width = width;
		this.height = height;
		this.position = position;
		
		lenght = width * height;
		tiles = new int[lenght];
	}
	
	public void addTile(int x, int y, int tileId){
		if (TableHelper.isInside(width, height, x, y)){
			tiles[TableHelper.flatPosition(width, x, y)] = tileId;
		}
	}
	
	public void removeTile(int x, int y){
		if (TableHelper.isInside(width, height, x, y)){
			tiles[TableHelper.flatPosition(width, x, y)] = -1;
		}
	}
	
	public int getTile(int x, int y){
		return TableHelper.isInside(width, height, x, y) ? tiles[TableHelper.flatPosition(width, x, y)] : -1;
	}
	
	public int getTile(int index){
		return tiles[index];
	}
	
	public int getWidth(){
		return width;
	}
	
	public int getHeight(){
		return height;
	}
	
	public Vector2 getPosition(){
		return position;
	}
	
}
