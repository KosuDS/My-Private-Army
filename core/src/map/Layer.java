package map;

import java.util.ArrayList;

import com.badlogic.gdx.math.Vector2;

public class Layer {
	
	private int width, height;
	private Vector2 position;
	
	private Tile[] tiles;
	
	public Layer(int width, int height, Vector2 position){
		this.width = width;
		this.height = height;
		this.position = position;
		
		tiles = new Tile[width * height];
	}
	
	public void addTile(){
		//Dodaj kafelka do pozycji x, y
	}
	
	public void removeTile(){
		//Usuñ kafelka z pozycji x, y
	}
	
	public void getTile(){
		//Wyci¹gnij kafelka z pozycji x, y i go zwróæ
	}
	
	
}
