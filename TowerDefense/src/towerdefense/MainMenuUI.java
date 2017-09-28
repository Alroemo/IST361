package towerdefense;

import java.awt.*;
import java.awt.event.ActionEvent;
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
		panelOne.setLayout(new BoxLayout(panelOne, BoxLayout.Y_AXIS));
		panelTwo = new JPanel();
		panelTwo.setLayout(new BoxLayout(panelTwo, BoxLayout.Y_AXIS));
		panelThree = new JPanel();
		panelFour = new JPanel();
		biggerPanel = new JPanel();

		bEasy = new JButton("Easy");
		bEasy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new GameUI();
			} 
			
			
		});
		bMedium = new JButton("Medium");
		bMedium.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new GameUI();
			} 
			
			
		});
		bHard = new JButton("Hard");
		bHard.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				new GameUI();
			} 
			
			
		});
		panelOne.add(bEasy);
		panelOne.add(bMedium);
		panelOne.add(bHard);
		
		lPlayerName = new JLabel("Enter Player Name... ");
		tfPlayerName = new JTextField();
		panelTwo.add(lPlayerName);
		panelTwo.add(tfPlayerName);
		
		taHighscores = new JTextArea("dslkfjlasdj;kfjadsl;fj;asdjf;jasd;jf");
		panelThree.add(taHighscores);
		
		taInstructions = new JTextArea("dsfljsdal;fjkasdjfladsl;kfjads;fasdkfa");
		panelFour.add(taInstructions);
		
		
		bigPanel.add(panelOne);
		bigPanel.add(panelTwo);
		bigPanel.add(panelThree);
		bigPanel.add(panelFour);
		
		
		this.setVisible(true);
	}
	
	
	
	
}
