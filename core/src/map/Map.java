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
	
	public void addNewTile(int id, Tile tile){
		tilesBox.add(id, tile);
	}
	
	public void addLayer(Layer layer, int index){
		//Dodaj now¹ wartwê która jest przekazywana przez argument do listy layerBox na dan¹ pozycjê
		layersBox.add(index, layer);
	}
	
	
	public void removeLayer(int index){
		//Usuwa warstwe z danej pozycji z listy layerBox
		layersBox.remove(index);
		
	}
	
	public Layer getLayer(int index){
		return layersBox.get(index);
		//Zwraca wartwê z danej pozycji
		
	}
}
