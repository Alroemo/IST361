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
    
    int goalX;
    int goalY;
    Enemy [] enemyWave;
    Tower [] towerCollection;
    Bullet [] bulletCollection;
    
    public int gridSize = 960;
      
    public GridView() {
        gridPanel = new JPanel();
        setSize(1000, 1000);
        setLayout(null);
    }
    
    public void setBackground() {
        mapBG.setIcon(map);
        mapBG.setLayout(new BorderLayout());
        add(mapBG);
    }
    
//    public void createGrid(int row, int col){
//        //create grid
//        Container pane = getContentPane();
//        pane.setLayout(new GridLayout(row, col));
//        
//        for (int i = 0; i < row; i++) {
//            for(int j = 0; j < col; j++) {
//               JLabel label = new JLabel();
//               label.setIcon(desk);
//               add(label);
//            }
//        }
//    }
//    
    public void createGrid() {
        for (int x=0; x<960; x+=80)
   		{
   			for(int y=0; y<960; y+=80)
   			{
   				JLabel label = new JLabel();
   				label.setIcon(desk);
   				label.setBounds(new Rectangle(x,y,80,80));
   				add(label);
   			}
   		}
    }
    
}
