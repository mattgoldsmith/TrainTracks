package trainTracks;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DisplayGUI {
	
	private JFrame frame;
	private JPanel topPanel;
	private JPanel bottomPanel;
	private ArrayList<JLabel> tracks;
	private ArrayList<RailsGUI> rails;
	private JButton check;
	private JButton start;
	private JButton hint;

	public DisplayGUI(){
		setFrame(new JFrame("Train Tracks"));
	}
	
	public void newDisplay(){
		tracks = new ArrayList<JLabel>();
		rails = new ArrayList<RailsGUI>();
		//createRails();
		createWindow();
	}

	private void createWindow(){
		//setFrame(new JFrame("Train Tracks"));
		
		Dimension td = new Dimension();
		td.setSize(500, 500);
		Dimension bd = new Dimension();
		bd.setSize(500,50);
		
		//GridLayout l = new GridLayout();
		
		GridBagLayout gbl = new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		
		JLabel emptyLabel = new JLabel();
		emptyLabel.setPreferredSize(td);
		
		topPanel = new JPanel();
		topPanel.setLayout(gbl);
		topPanel.setPreferredSize(td);
		
		bottomPanel = new JPanel();
		bottomPanel.setLayout(gbl);
		bottomPanel.setPreferredSize(bd);
		//Border border = BorderFactory.createLineBorder(Color.BLACK);
		//bottomPanel.setBorder(border);
		
		start = new JButton("New Game");
		hint  = new JButton("Hint"); 
		check = new JButton("Check");
		
		//System.out.println(start.getPreferredSize());
		
		c.gridx = 0;
		c.gridy = 0;
		//c.fill = GridBagConstraints.HORIZONTAL;
		
		Dimension dimension = new Dimension();
		dimension.setSize(50, 50);
		/**
		JLabel label = new JLabel();
		JLabel label2 = new JLabel();
		JLabel label3 = new JLabel();
		
		label.setPreferredSize(dimension);
		label.setBorder(border);
		label2.setPreferredSize(dimension);
		label2.setBorder(border);
		label3.setBorder(border);
		label3.setPreferredSize(dimension);
		
		topPanel.add(label, c);
		c.gridx++;
		topPanel.add(label2, c);
		c.gridx--;
		c.gridy++;
		topPanel.add(label3, c);
		**/
		
		int x = 1;
		int y = 9;
		
		while(y > 0){
			RailsGUI rail = new RailsGUI();
			JLabel label = rail.createRails(x,y); //create label
			//label.setMinimumSize(dimension);
			label.setPreferredSize(dimension);
			//label.setMaximumSize(dimension);
			tracks.add(label); //add to arraylist
			rails.add(rail);
			
			topPanel.add(label, c); //add to panel
			
			c.gridx ++;
			
			x++;
			if(x == 10){
				x = 1;
				y --;
				
				c.gridx = 0;
				c.gridy ++;
			}
		}
		
		//topPanel.add(rails.oneone, c);
		
		//c.fill = GridBagConstraints.HORIZONTAL;
		c.weightx = 0.5;
		c.weighty = 0.5;
		//c.insets = new Insets(0,20,0,20);  //top padding
		c.anchor = GridBagConstraints.NORTH;
		c.gridx = 0;
		c.gridy = 0;
		bottomPanel.add(start, c);
		
		c.gridx = 1;
		c.gridy = 0;
		bottomPanel.add(hint, c);
		
		c.gridx = 2;
		bottomPanel.add(check, c);
		
		//frame.setPreferredSize(d);
		getFrame().setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getFrame().getContentPane().add(topPanel, BorderLayout.NORTH);
		getFrame().getContentPane().add(bottomPanel, BorderLayout.SOUTH);
	}
	
	public void remove(){
		for(JLabel label : tracks){
			topPanel.remove(label);
		}
	}
	
	public ArrayList<RailsGUI> getRails(){
		return rails;
	}

	public JFrame getFrame() {
		return frame;
	}

	public void setFrame(JFrame frame) {
		this.frame = frame;
	}
	
	public JButton getCheck(){
		return check;
	}
	
	public JButton getStart(){
		return start;
	}
	
	public JButton getHint(){
		return hint;
	}
}
