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
    ImageIcon desk = new ImageIcon("desk.gif");
    int enemySpawnX;
    int enemySpawnY;
    
    Tower[] playerTowers;
    JLabel[][] theMainGrid = new JLabel[12][12];
    
    public int gridSize = 960;
      
    public GridView() {
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(12,12));
        setSize(1000, 1000);
        
        this.createGrid();
        
        this.add(gridPanel);
        
        PlayerUI playerPanel = new PlayerUI();
        
        
        getContentPane().add(playerPanel, BorderLayout.WEST);
        
        
    }
    
    public void createGrid(){
        //create grid
        for (int i = 0; i < 12; i++) {
            for(int j = 0; j < 12; j++) {
               theMainGrid[i][j] = new JLabel();
               theMainGrid[i][j].setIcon(desk);
               theMainGrid[i][j].addMouseListener(new MouseListener(){
                   @Override
                   public void mouseClicked(MouseEvent e) {
                       System.out.println("it works");
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
               
               this.gridPanel.add(theMainGrid[i][j]);
            }
        }
    }
    
    public JLabel getGridLabelFor(int x, int y){
        return theMainGrid[x][y];
    }
    
    
  
    
    /*
    public void createGrid() {
        for (int x=0; x<960; x+=80)
   		{
   			for(int y=0; y<960; y+=80)
   			{
   				JLabel label = new JLabel();
   				label.setIcon(desk);
   				label.setBounds(new Rectangle(x,y,80,80));
                            
   				this.gridPanel.add(label);
                                
   			}
   		}
    }*/
    
}
