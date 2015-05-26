package map;

import java.util.ArrayList;

import tools.TableHelper;

import com.badlogic.gdx.math.Vector2;

public class Layer {
	
	private int width, height;
	private Vector2 position;
	
	private int[] tiles;
	
	
	public Layer(int width, int height, Vector2 position){
		this.width = width;
		this.height = height;
		this.position = position;
		
		tiles = new int[width * height];
	}
	
	public void addTile(int x, int y, int tileId){
		//Dodaj kafelka do pozycji x, y
		tiles[TableHelper.flatPosition(width, x, y)] = tileId;
	}
	
	public void removeTile(int x, int y){
		//Usuñ kafelka z pozycji x, y
		tiles[TableHelper.flatPosition(width, x, y)] = -1;
	}
	
	public int getTile(int x, int y){
		//Wyci¹gnij kafelka z pozycji x, y i go zwróæ
		return tiles[TableHelper.flatPosition(width, x, y)];
	}
	
	
}
