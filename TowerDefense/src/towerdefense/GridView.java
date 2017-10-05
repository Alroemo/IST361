/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author Adlan Ramly
 */
public class GridView extends JFrame {
    
//CHANGE JFRAME TO JPANEL LATER
    
    JPanel gridPanel, playerPanel;
    JLabel mapBG = new JLabel();
    ImageIcon map = new ImageIcon("themap.gif");
    ImageIcon desk = new ImageIcon("panel.gif");
    
    int enemySpawnX;
    int enemySpawnY;
    private GridBagConstraints c;
    
    Tower[] playerTowers;
    JLabel[][] theMainGrid = new JLabel[12][12];
    
    public int gridSize = 960;
    PlayerController playerController;
      
    public GridView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
	this.setTitle("Classroom Tower Defense");
        
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridBagLayout());
        c = new GridBagConstraints();
        setSize(1500, 1200);
        
        this.createGrid();
        
        this.add(gridPanel);
        
        playerController = new PlayerController();
        playerPanel = playerController.ui;
        
        getContentPane().add(playerPanel, BorderLayout.WEST);
        
        
    }
    
    public void createGrid(){
        //each tower will span 4x4 blocks on the grid
        c.gridwidth = 4;
        c.gridheight = 4;
        //create grid
        for (int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
               c.gridx = i * 4;
               c.gridy = j * 4;
               if(!((i == 3 && j < 10) || (j == 9 && i > 3 && i < 10) || (i == 9 && j > 4 && j < 10) || (j == 5 && i >= 10)))
               {
                    theMainGrid[i][j] = new JLabel();
                    theMainGrid[i][j].setIcon(desk);
                    theMainGrid[i][j].addMouseListener(new MouseListener(){
                        @Override
                        public void mouseClicked(MouseEvent e) {
                            ImageIcon towerIcon = new ImageIcon("snake_panel.gif");
                            System.out.println("it works");
                            JLabel tempGrid = (JLabel) e.getSource();
                            tempGrid.setIcon(towerIcon);
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
               }
               else
               {
                   theMainGrid[i][j] = new JLabel();
                   theMainGrid[i][j].setBackground(Color.WHITE);
               }
                           
               this.gridPanel.add(theMainGrid[i][j], c);
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
    

}
