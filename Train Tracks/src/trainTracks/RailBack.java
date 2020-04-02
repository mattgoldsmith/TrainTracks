package trainTracks;

import java.util.HashMap;

public class RailBack {
	
	private int xCoord;
	private int yCoord;
	private boolean hasRail;
	private HashMap<String, RailBack> neighbors;

	public RailBack(int xCoord, int yCoord){
		
		this.xCoord = xCoord;
		this.yCoord = yCoord;
		
		neighbors = new HashMap<String, RailBack>();
		
		setRail(false);
		
		//System.out.println(this.xCoord + ", " + this.yCoord);
		
	}
	
	public int getxCoord(){
		return xCoord;
	}
	
	public int getyCoord(){
		return yCoord;
	}
	
	public boolean getRail(){
		return hasRail;
	}
	
	public void setRail(boolean setRail){
		hasRail = setRail;
	}

	public HashMap<String, RailBack> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(String key, RailBack ajacent) {
		neighbors.put(key, ajacent);
	}
}
