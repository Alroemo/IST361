/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author nps5120
 */
public class Bullet extends JLabel{
    private int position[] = new int[2]; //0 = x, 1 = y
    private int targetPosition[] = new int[2]; //0 = x, 1 = y
    private int speed;
    private Enemy target;
    
    public Bullet(Enemy target, int x, int y){
        this.target = target;
        position[0] = x;
        position[1] = y;
        setIcon(new ImageIcon("desk.gif"));
        speed = 5; //TODO: update value to be slightly faster than enemy speed
    }
    
    public int[] getPosition(){
        return position;
    }
    
    /**
     * This method moves the bullet in the direction of its target.
     */
    public void move(){
        targetPosition = target.getPosition();
        if(targetPosition[0] == position[0]) //Target is directly above or below bullet
        {
            //Move bullet speed pixels towards target
            if(targetPosition[1] > position[1])
                position[1] += speed;
            else if(targetPosition[1] < position[1])
                position[1] -= speed;
        }
        else //Target at an angle from the bullet
        {
            //Find angle from bullet position to target position
            double angle = Math.atan((targetPosition[1] - position[1])/(targetPosition[0] - position[0]));
            
            //Set x and y values so that the bullet has moved speed pixels in the direction of the target
            position[0] = (int)(speed * Math.cos(angle) + position[0]); 
            position[1] = (int)(speed * Math.sin(angle) + position[1]);
        }
    }
}
