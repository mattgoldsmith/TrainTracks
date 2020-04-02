package trainTracks;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class ChooChoo {
	private ArrayList<RailBack> rails;
	private ArrayList<RailsGUI> tracks;
	private DisplayGUI display;
	private TracksBack tracksBack;
	private JFrame hintFrame;
	
	public ChooChoo(){
		display = new DisplayGUI();
	}
	
	public void steam(){
		int complete = 0;
		while(complete < 1){
			tracksBack = new TracksBack();
			complete = tracksBack.startTracks();
			rails = tracksBack.getRails();
		}
		
		//display = new DisplayGUI();
		//display.window();
		display.newDisplay();
		tracks = display.getRails();
		
		for(RailBack rail : rails){
			for(RailsGUI railGUI : tracks){
				if(rail.getxCoord() == railGUI.getXcoord() && rail.getyCoord() == railGUI.getYcoord()){
					railGUI.setHasRail(rail.getRail());
				}
			}
		}
		
		for(RailsGUI railGUI : tracks){
			if(railGUI.getHasRail() == true && (railGUI.getXcoord() == 1 || railGUI.getYcoord() == 1)){
				railGUI.setJLabelText("×");
			}
		}
		
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
		
		for(RailsGUI railGUI : tracks){
			//x coord totals
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 1){
				railGUI.setJLabelText(String.valueOf(x1));
			}
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 2){
				railGUI.setJLabelText(String.valueOf(x2));
			}
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 3){
				railGUI.setJLabelText(String.valueOf(x3));
			}
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 4){
				railGUI.setJLabelText(String.valueOf(x4));
			}
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 5){
				railGUI.setJLabelText(String.valueOf(x5));
			}
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 6){
				railGUI.setJLabelText(String.valueOf(x6));
			}
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 7){
				railGUI.setJLabelText(String.valueOf(x7));
			}
			if(railGUI.getYcoord() == 9 && railGUI.getXcoord() == 8){
				railGUI.setJLabelText(String.valueOf(x8));
			}
			//y coord totals
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 1){
				railGUI.setJLabelText(String.valueOf(y1));
			}
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 2){
				railGUI.setJLabelText(String.valueOf(y2));
			}
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 3){
				railGUI.setJLabelText(String.valueOf(y3));
			}
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 4){
				railGUI.setJLabelText(String.valueOf(y4));
			}
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 5){
				railGUI.setJLabelText(String.valueOf(y5));
			}
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 6){
				railGUI.setJLabelText(String.valueOf(y6));
			}
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 7){
				railGUI.setJLabelText(String.valueOf(y7));
			}
			if(railGUI.getXcoord() == 9 && railGUI.getYcoord() == 8){
				railGUI.setJLabelText(String.valueOf(y8));
			}
		}
		
		display.getCheck().addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	int correct = 0;
		    	int incorrect = 0;
		        for(RailsGUI railGUI : tracks){
		        	if(((railGUI.getHasRail() == true && railGUI.getTrack().getText().length() > 0) || (railGUI.getHasRail() == false && railGUI.getTrack().getText().length() == 0)) || ((railGUI.getXcoord() == 9 || railGUI.getYcoord() == 9) && railGUI.getTrack().getText().length() > 0) ){
		        		//System.out.println("Correct");
		        		correct ++;
		        	}
		        	else{
		        		incorrect ++;
		        	}
		        }
		        if(incorrect == 0 && correct != 0){
		        	System.out.println("Correct");
		        	//System.out.println("Incorrect: " + incorrect);
		        	for(RailsGUI railGUI : tracks){
		        		railGUI.getTrack().setOpaque(true);
		        		railGUI.getTrack().setBackground(Color.GREEN);
		        	}
		        }
		        else{
		        	System.out.println("Incorrect");
		        	//System.out.println("Correct: " + correct);
		        	//System.out.println("Incorrect: " + incorrect);
		        	for(RailsGUI railGUI : tracks){
		        		railGUI.getTrack().setOpaque(true);
		        		railGUI.getTrack().setBackground(Color.RED);		        		
		        	}
		        }
		    }
		});
		
		display.getStart().addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	display.remove();
		    	steam();
		    }
		});
		
		display.getHint().addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e){
					hint();
				}
			}
		);
		
		display.getFrame().pack();
		display.getFrame().setLocationRelativeTo(null);
		display.getFrame().setVisible(true);
		
	}
	
	public void hint(){
		if(hintFrame != null){
			hintFrame.setVisible(false);
		}
		hintFrame = new JFrame("Hint");
		hintFrame.setUndecorated(true);
		hintFrame.getRootPane().setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		//hintFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Dimension d = new Dimension();
		d.setSize(200, 75);
		
		JPanel topPanel = new JPanel();
		JPanel bottomPanel = new JPanel();
		
		topPanel.setPreferredSize(d);
		//bottomPanel.setPreferredSize(d);
		
		JLabel label = new JLabel("",SwingConstants.CENTER);
		label.setFont(new Font("Arial", Font.BOLD, 20));
		//label.setText(tracksBack.getPath());
		
		/**for(RailBack rail : rails){
			if(rail.getRail() == true && rail.getxCoord() != 1 && rail.getyCoord() != 8 //&& rail.get){
				label.setText(rail.getxCoord() + ", " + rail.getyCoord());
				break;
			}
		}**/
		
		for(RailsGUI track: tracks){
			if(track.getHasRail() == true && track.getXcoord() != 1 && track.getYcoord() != 8 && track.getTrack().getText() == ""){
				label.setText(track.getXcoord() + ", " + track.getYcoord());
				break;
			}
		}
		
		if(label.getText().length() == 0){
			label.setText("Correct!");
		}
		
		JButton exit = new JButton("OK");
		
		exit.addActionListener(new ActionListener() {
		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	hintFrame.setVisible(false);
		    }
		});
		
		label.setPreferredSize(d);
		
		topPanel.add(label, BorderLayout.CENTER);
		bottomPanel.add(exit, BorderLayout.CENTER);
		
		hintFrame.add(topPanel,BorderLayout.NORTH);
		hintFrame.add(bottomPanel, BorderLayout.SOUTH);
		
		//hintFrame.setUndecorated(true);
		hintFrame.pack();
		hintFrame.setLocationRelativeTo(null);
		hintFrame.setVisible(true);
		
		System.out.println(tracksBack.getPath());
		
	}

}
