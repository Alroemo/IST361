/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author Adlan Ramly
 */
public class GridView extends JFrame {
    
    
    JPanel gridPanel, playerPanel;
    ImageIcon map = new ImageIcon("themap.gif");
    ImageIcon desk = new ImageIcon("panel.gif");
    
    private ArrayList<Integer> newTowers = new ArrayList<>();
    
    JLabel[][] theMainGrid = new JLabel[12][12];
    
    public int gridSize = 960;
    PlayerController playerController;
    MainMenuController theMainMenuController;

    public GridView(MainMenuController theParentMainMenuController) {
        theMainMenuController = theParentMainMenuController;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
	this.setTitle("Classroom Tower Defense");
        this.setSize(new Dimension(1200,1440));
        this.setLayout(null);
        
        // init the gridPanel and the playerPanel
        gridPanel = new JPanel();
        gridPanel.setLayout(null);
        playerController = new PlayerController(this);
        playerPanel = playerController.ui;
        
        // create the bounds for the playerPanel and gridPanel
        playerPanel.setBounds(0, 0, 320, 1200);
        gridPanel.setBounds(400, 0, 1040, 960);
        this.add(playerPanel);
        this.add(gridPanel);
        
        //fill grid with sprites
        fillGrid();  
        
    }
    
    public void fillGrid(){
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 12; j++) {
                // make path for monsters and fill the rest of the grid
                if(!((i == 3 && j < 10) || (j == 9 && i > 3 && i < 10) || (i == 9 && j > 4 && j < 10) || (j == 5 && i >= 10))){    
                    theMainGrid[i][j] = new JLabel();
                    theMainGrid[i][j].setIcon(desk);
                    theMainGrid[i][j].addMouseListener(new MouseListener(){
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ImageIcon towerIcon = new ImageIcon("snake_panel.gif");
                            System.out.println("it works");
                            JLabel tempGrid = (JLabel) e.getSource();
                            newTowers.add((tempGrid.getX() - 314) / 20);
                            newTowers.add((tempGrid.getY() - 28) / 20);
                            tempGrid.setIcon(towerIcon);
			    int towerCost = 15; //This is a static price that needs to be changed to be tower specific                           
			    playerController.setMoney(0-towerCost);
                            playerController.ui.updateValues();
                            tempGrid.validate();
                            tempGrid.repaint();
                        }

                        @Override
                        public void mousePressed(MouseEvent e) {

                        }

                        @Override
                        public void mouseReleased(MouseEvent e) {

                        }

                        @Override
                        public void mouseEntered(MouseEvent e) {

                        }

                        @Override
                        public void mouseExited(MouseEvent e) {

                        }

                    });
               }else{
                   theMainGrid[i][j] = new JLabel();
                   theMainGrid[i][j].setBackground(Color.WHITE);
               }
               
                int width = 80; // 80px wide
                int height = 80;// 80px high 
                int xLoc = i * 80; // 80px * the theMainGrid locale
                int yLoc = j * 80; // 80px * the grid locale
                
                
                // need to set bounds for each title in the grid
                theMainGrid[i][j].setBounds(xLoc, yLoc, width, height);
                this.gridPanel.add(theMainGrid[i][j]);
                
            }
        }
        
        
    }
    
    public JLabel getGridLabelFor(int x, int y){
        return theMainGrid[x][y];
    }
    
    public JPanel getGridPanel()
    {
        return this.gridPanel;
    }
    
    public ArrayList<Integer> getNewTowers()
    {
        return this.newTowers;
    }

}
