package map;

import java.util.HashMap;

public class Tile { 
	
	private int textureId;
	private HashMap<String, String> properties;
	
	public Tile(int textureId, HashMap<String, String> properties){
		this.textureId = textureId;
		this.properties = properties;
	}
	
	public int getTextureId(){
		return textureId;
	}
	
	public HashMap<String, String> getProperties(){
		return properties;
	}
}
