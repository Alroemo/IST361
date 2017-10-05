package towerdefense;

import java.awt.*;
import java.awt.event.ActionListener;

import javax.swing.*;

@SuppressWarnings("serial")
public class MainMenuUI extends JFrame{

	private JPanel bigPanel;
	private JPanel panelOne;
	private JPanel panelTwo;
	private JPanel panelThree;
	private JPanel panelFour;
	private JButton bEasy;
	private JButton bMedium;
	private JButton bHard;
	private JLabel lPlayerName;
	private JTextField tfPlayerName;
	private JTextArea taHighscores;
	private JTextArea taInstructions;

	
	private JPanel biggerPanel;
	
	public MainMenuUI(){
		
		this.setSize(new Dimension(800,600));
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setTitle("Classroom Tower Defense");
		
		GridLayout grid = new GridLayout(0,4);
		bigPanel = new JPanel();
		bigPanel.setLayout(grid);
		
		panelOne = new JPanel();
		panelOne.setLayout(new BoxLayout(panelOne, BoxLayout.PAGE_AXIS));
		panelTwo = new JPanel();
		panelTwo.setLayout(new BoxLayout(panelTwo, BoxLayout.PAGE_AXIS));
		panelThree = new JPanel();
                
		panelFour = new JPanel();
              
		biggerPanel = new JPanel();
                
                
                

		bEasy = new JButton("Easy");
                bEasy.setFocusPainted(false);
                bEasy.setMargin(new Insets(0, 0, 0, 0));
             // bEasy.setContentAreaFilled(false);
             // bEasy.setBorderPainted(false);
                bEasy.setOpaque(false);
                
		bMedium = new JButton("Medium");
                bMedium.setFocusPainted(false);
                bMedium.setMargin(new Insets(0, 0, 0, 0));
                bMedium.setOpaque(false);
                
                
		bHard = new JButton("Hard");
                bHard.setFocusPainted(false);
                bHard.setMargin(new Insets(0, 0, 0, 0));
                bHard.setOpaque(false);
		
                
                
                JLabel bEasyLabel = new JLabel();
                JLabel bMediumLabel = new JLabel();
                JLabel bHardLabel = new JLabel();
                ImageIcon easy_button = new ImageIcon("easy_button.png");
                ImageIcon medium_button = new ImageIcon("medium_button.png");
                ImageIcon hard_button = new ImageIcon("hard_button.png");
                
                bEasyLabel.setIcon(easy_button);
                bMediumLabel.setIcon(medium_button);
                bHardLabel.setIcon(hard_button);
                
                bEasy.add(bEasyLabel);
                bMedium.add(bMediumLabel);
                bHard.add(bHardLabel);

		panelOne.add(bEasy);
		panelOne.add(bMedium);
		panelOne.add(bHard);
		
                
                
		lPlayerName = new JLabel("Enter Player Name... ");
		tfPlayerName = new JTextField();
                tfPlayerName.setMaximumSize(new Dimension( 250, 24 ));
                tfPlayerName.setPreferredSize( new Dimension( 250, 24 ) );
		panelTwo.add(lPlayerName);
		panelTwo.add(tfPlayerName);
                
                
		JLabel highscores = new JLabel("High Scores!");
		taHighscores = new JTextArea("Write High Scores Here");
		panelThree.add(highscores);
                panelThree.add(taHighscores);
                
		
                JLabel instructions = new JLabel("Instructions!");
		taInstructions = new JTextArea("Write Instructions Here");
		panelFour.add(instructions);
                panelFour.add(taInstructions);
                
                
                this.setLayout(new GridLayout(2,0));
                
                
                JPanel titlePanel = new JPanel();
                // add the image icon here
                JLabel titleWords = new JLabel();
                ImageIcon titleWordBack = new ImageIcon("Title.gif");
                titleWords.setIcon(titleWordBack);
                
                titlePanel.add(titleWords);
                
                this.add(titlePanel);
                
		bigPanel.add(panelOne);
		bigPanel.add(panelTwo);
		bigPanel.add(panelThree);
		bigPanel.add(panelFour);
                
                
		this.add(bigPanel);
                
                
                
		this.setVisible(true);
	}
	
        
        
        public void addEasyButtonListener(ActionListener listener){
            bEasy.addActionListener(listener);
        }
	
	public void addMediumButtonListener(ActionListener listener){
            bMedium.addActionListener(listener);
        }
        
        public void addHardButtonListener(ActionListener listener){
            bHard.addActionListener(listener);
        }
        
        public String getUsername(){
            return tfPlayerName.getText();
        }
	
}
