package trainTracks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class TracksBack {
	private ArrayList<RailBack> rails;
	private Random rand;
	private RailBack start;
	private RailBack end;
	private RailBack current;
	private String path; 
	
	public TracksBack(){
		rails = new ArrayList<RailBack>();
		rand = new Random();
		path = "";
	}
	
	public int startTracks(){		
		createRails();
		setStart();
		setEnd();
		setNeighbors();
		int complete = makeTracks();
		
		return complete;
	}
	
	private void createRails(){
		int x = 1;
		int y = 8;
		//int count = 1;
		
		while(y >= 1){
			RailBack rail = new RailBack(x,y);
			//System.out.println(count + ": " + rail.getxCoord() + ", " + rail.getyCoord() + " -> " + x + ", " + y);
			rails.add(rail);
			x++;
			//count++;
			if(x == 9){
				x = 1;
				y--;
			}
		}
	}
	
	private void setNeighbors(){
		
		for(RailBack rail : rails){
			int xCoord = rail.getxCoord();
			int yCoord = rail.getyCoord();
			
			for(RailBack ajacent : rails){
				int xCoord2 = ajacent.getxCoord();
				int yCoord2 = ajacent.getyCoord();
				
				
				
				if(xCoord2 == xCoord - 1 && yCoord2 == yCoord && xCoord != 2){
					rail.setNeighbors("left", ajacent);
					//System.out.println(xCoord + ", " + yCoord + " -> " + xCoord2 + ", " + yCoord2 );
				}
				if(xCoord2 == xCoord + 1 && yCoord2 == yCoord){
					rail.setNeighbors("right", ajacent);
					//System.out.println(xCoord + ", " + yCoord + " -> " + xCoord2 + ", " + yCoord2 );
				}
				if(yCoord2 == yCoord + 1 && xCoord2 == xCoord && xCoord != 1){
					rail.setNeighbors("up", ajacent);
					//System.out.println(xCoord + ", " + yCoord + " -> " + xCoord2 + ", " + yCoord2 );
				}
				if(yCoord2 == yCoord - 1 && xCoord2 == xCoord && xCoord != 1 && (yCoord != 2 || end.getxCoord() == xCoord)){
					rail.setNeighbors("down", ajacent);
					//System.out.println("Down: " + xCoord + ", " + yCoord + " -> " + xCoord2 + ", " + yCoord2 );
				}
			}
		}
	}
	
	private void setStart(){
		int position = rand.nextInt(6)+2;
		
		for(RailBack rail : rails){
			if(rail.getyCoord() == position && rail.getxCoord() == 1){
				start = rail;
			}
		}
	}
	
	private void setEnd(){
		int position = rand.nextInt(7)+2;
		
		for(RailBack rail : rails){
			if(rail.getxCoord() == position && rail.getyCoord() == 1){
				end = rail;
			}
		}
	}
	
	private int makeTracks(){
		current = start;
		
		while(current != end){
			current.setRail(true);
			
			path = path + current.getxCoord() + "," + current.getyCoord() + " -> ";
			//System.out.print(current.getxCoord() + "," + current.getyCoord() + " -> ");
			
			HashMap<String, RailBack> neighbors = new HashMap<String, RailBack>();
			neighbors = current.getNeighbors();
			
			int options = 0;
			
			ArrayList<String> keys = new ArrayList<String>();
			
			for(String key : neighbors.keySet()){
				RailBack rail = neighbors.get(key);
				
				if(rail.getRail() == false){
					options++;
					keys.add(key);
				}
			}
			if(options == 0){
				//System.out.println("Dead End");
				return 0;
				//break;
			}
			
			int next = rand.nextInt(options);
			
			current = neighbors.get(keys.get(next));
		}
		if(current == end){
			current.setRail(true);
			
			int x1 = 0;
			int x2 = 0;
			int x3 = 0;
			int x4 = 0;
			int x5 = 0;
			int x6 = 0;
			int x7 = 0;
			int x8 = 0;
			
			int y1 = 0;
			int y2 = 0;
			int y3 = 0;
			int y4 = 0;
			int y5 = 0;
			int y6 = 0;
			int y7 = 0;
			int y8 = 0;
			
			for(RailBack rail : rails){
				if(rail.getxCoord() == 1 && rail.getRail() == true){
					x1++;
				}
				if(rail.getyCoord() == 1 && rail.getRail() == true){
					y1++;
				}
				if(rail.getxCoord() == 2 && rail.getRail() == true){
					x2++;
				}
				if(rail.getyCoord() == 2 && rail.getRail() == true){
					y2++;
				}
				if(rail.getxCoord() == 3 && rail.getRail() == true){
					x3++;
				}
				if(rail.getyCoord() == 3 && rail.getRail() == true){
					y3++;
				}
				if(rail.getxCoord() == 4 && rail.getRail() == true){
					x4++;
				}
				if(rail.getyCoord() == 4 && rail.getRail() == true){
					y4++;
				}
				if(rail.getxCoord() == 5 && rail.getRail() == true){
					x5++;
				}
				if(rail.getyCoord() == 5 && rail.getRail() == true){
					y5++;
				}
				if(rail.getxCoord() == 6 && rail.getRail() == true){
					x6++;
				}
				if(rail.getyCoord() == 6 && rail.getRail() == true){
					y6++;
				}
				if(rail.getxCoord() == 7 && rail.getRail() == true){
					x7++;
				}
				if(rail.getyCoord() == 7 && rail.getRail() == true){
					y7++;
				}
				if(rail.getxCoord() == 8 && rail.getRail() == true){
					x8++;
				}
				if(rail.getyCoord() == 8 && rail.getRail() == true){
					y8++;
				}
			}
			
			System.out.print(path);
			System.out.print(current.getxCoord() + "," + current.getyCoord());
			
			path = path + current.getxCoord() + "," + current.getyCoord();
			
			System.out.println("\nStart: " + start.getxCoord() + ", " + start.getyCoord());
			System.out.println("End: " + end.getxCoord() + ", " + end.getyCoord());
			
			
			
			System.out.println(x1 + " " + x2 + " " + x3 + " " + x4 + " " + x5 + " " + x6 + " " + x7 + " " + x8);
			for(RailBack rail : rails){
				if(rail.getRail() == true){
					System.out.print("X ");
				}
				else{
					System.out.print("_ ");
				}
				if(rail.getxCoord() == 8){
					if(rail.getyCoord() == 1){
						System.out.print(y1 + "\n");
					}
					if(rail.getyCoord() == 2){
						System.out.print(y2 + "\n");
					}
					if(rail.getyCoord() == 3){
						System.out.print(y3 + "\n");
					}
					if(rail.getyCoord() == 4){
						System.out.print(y4 + "\n");
					}
					if(rail.getyCoord() == 5){
						System.out.print(y5 + "\n");
					}
					if(rail.getyCoord() == 6){
						System.out.print(y6 + "\n");
					}
					if(rail.getyCoord() == 7){
						System.out.print(y7 + "\n");
					}
					if(rail.getyCoord() == 8){
						System.out.print(y8 + "\n");
					}
				}
				
			}
			
		}
		return 1;
	}
	
	public ArrayList<RailBack> getRails(){
		return rails;
	}
	
	public String getPath(){
		return path;
	}
	
}
