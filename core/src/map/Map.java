package map;

import java.util.ArrayList;
import java.util.HashMap;

public class Map {
	
	private int width, height;
	
	private ArrayList<Layer> layersBox;
	private ArrayList<Tile> tilesBox;
	
	public Map(int width, int height){
		this.width = width;
		this.height = height;
		
		layersBox = new ArrayList<Layer>();
		tilesBox = new ArrayList<Tile>();
	}
	
	public void addTile(int id, Tile tile){
		tilesBox.add(id, tile);
	}
	
	public void removeTile(int id){
		tilesBox.remove(id);
	}
	
	public Tile getTile(int id){
		return tilesBox.get(id);
	}
	
	public void addLayer(Layer layer, int index){
		layersBox.add(index, layer);
	}
	
	public void removeLayer(int index){
		layersBox.remove(index);
		
	}
	
	public Layer getLayer(int index){
		return layersBox.get(index);
	}
}
