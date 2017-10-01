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
    
    int goalX;
    int goalY;
    Enemy [] enemyWave;
    Tower [] towerCollection;
    Bullet [] bulletCollection;
    
    public int gridSize = 960;
      
    public GridView() {
        gridPanel = new JPanel();
        gridPanel.setLayout(new GridLayout(12,12));
        setSize(1000, 1000);
        
        this.createGrid(12,12);
        
        this.add(gridPanel);
        
        PlayerUI playerPanel = new PlayerUI();
        
        
        getContentPane().add(playerPanel, BorderLayout.WEST);
        
        
    }
    
    public void createGrid(int row, int col){
        //create grid
        for (int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
               JLabel label = new JLabel();
               label.setIcon(desk);
               this.gridPanel.add(label);
            }
        }
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
