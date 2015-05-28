package tools;

public class TableHelper {
	
	public static int flatPosition(int width, int x, int y){
		return y*width + x;
	}
	
	public static boolean isInside(int width, int height, int x, int y){
		return (x < width && y < height && x >= 0 && y >= 0) ? true : false;
	}

}
