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
		//Dodaj now¹ wartwê która jest przekazywana przez argument do listy layerBox na dan¹ pozycjê
	}
	
	
	public void removeLayer(){
		//Usuwa wartwe z danej pozycji z listy layerBox
	}
	
	public Layer getLayer(){
		//Zwraca wartwê z danej pozycji
	}
}
