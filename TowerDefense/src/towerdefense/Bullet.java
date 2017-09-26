/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import javax.swing.ImageIcon;

/**
 *
 * @author nps5120
 */
public class Bullet {
    private int[] position;
    private ImageIcon image;
    private int speed;
    
    public Bullet(){
        //TODO: Instantiate local variables
    }
    
    public int[] getPosition(){
        return position;
    }
    
    public void move(){
        
    }
    
    public ImageIcon getImage(){
        return image;
    }
}
