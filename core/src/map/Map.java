package map;

import java.util.ArrayList;

public class Map {
	
	private int width, height;
	
	private ArrayList<Layer> layersBox;
	
	
	public Map(int width, int height){
		this.width = width;
		this.height = height;
		
		layersBox = new ArrayList<Layer>();
	}
	
	
	public void addLayer(){
		//Dodaj now� wartw� kt�ra jest przekazywana przez argument do listy layerBox na dan� pozycj�
	}
	
	
	public void removeLayer(){
		//Usuwa wartwe z danej pozycji z listy layerBox
	}
	
	public Layer getLayer(){
		//Zwraca wartw� z danej pozycji
	}
}
