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
    private int position[] = new int[2];
    private int targetPosition[] = new int[2];
    private ImageIcon image;
    private int speed;
    
    public Bullet(){
        image = new ImageIcon(); //TODO: add image filepath to constructor
        speed = 5; //TODO: update value to be slightly faster than enemy speed
    }
    
    public int[] getPosition(){
        return position;
    }
    
    /**
     * This method moves the bullet in a cardinal direction. The direction 
     * provided should be a lowercase string.
     * @param direction 
     */
    public void move(String direction){
        switch(direction){
            case "north": position[1] += speed;
                break;
            case "south": position[1] -= speed;
                break;
            case "east": position[0] -= speed;
                break;
            case "west": position[0] += speed;
                break;
        }
    }
    
    public ImageIcon getImage(){
        return image;
    }
}
