package trainTracks;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

public class RailsGUI {
	
	private JLabel track;
	private int xcoord;
	private int ycoord;
	private boolean hasRail;
	
	public RailsGUI(){
		setHasRail(false);
	}
	
	public JLabel createRails(int x, int y){

		track = new JLabel("",SwingConstants.CENTER);
		xcoord = x;
		ycoord = y;
		
		//Border border = BorderFactory.createLineBorder(Color.BLACK);
		//Border blackline = BorderFactory.createLineBorder(Color.black);
		
		//JLabel label= new JLabel("java2s.com");
	    Border border = BorderFactory.createLineBorder(Color.BLACK);
	    //label.setBorder(border);
		
		track.setBorder(border);
		
		Dimension d = new Dimension();
		d.setSize(50, 50);
		track.setPreferredSize(d);
		track.setFont(new Font("Arial", Font.BOLD, 50));
		
		if(x != 9 && y != 9 && x!= 1 && y != 1){
			track.addMouseListener(new MouseAdapter()  
			{  
			    public void mouseClicked(MouseEvent e)  
			    {
			    	if(track.getText() == ""){
			    		track.setText("×");
			    	}
			    	else{
			    		track.setText("");
			    	}
	
			    }  
			});
		}
		return track;
	}
	
	public int getXcoord() {
		return xcoord;
	}

	public int getYcoord() {
		return ycoord;
	}
	
	public JLabel getTrack() {
		return track;
	}

	/**
	 * @return the hasRail
	 */
	public boolean getHasRail() {
		return hasRail;
	}

	/**
	 * @param hasRail the hasRail to set
	 */
	public void setHasRail(boolean hasRail) {
		this.hasRail = hasRail;
	}
	
	public void setJLabelText(String text){
		track.setText(text);
	}
}
