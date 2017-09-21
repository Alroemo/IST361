package towerdefense;

import java.awt.Image;
import javax.swing.ImageIcon;

/*
    TODO list:
    -- Make the switch statement for each type of enemy
    -- Initialize enemy position based on the layout of the map
    -- Figure out the path for the enemy to take based on the map
    -- Finish the "move" method
    -- Do the image icon stuff
    -- 

*/

/**
 *
 * @author wbm5061
 */
public class Enemy {
    
    private int speed;
    private int health;
    private int livesLost;
    private int reward;
    private int[] position = new int[2];
    private ImageIcon icon;
    private Image image;
    
    public Enemy() // number one
    {
        // with no arguments, it's a default enemy of lvl 1
        int speed = 3;
        int health = 10;
        int livesLost = 1;
        int reward = 4;
        //initialize enemy position
        icon = new ImageIcon(/*put the path to art here*/);
        image = icon.getImage();
        
    }
    
    public Enemy(int type, int lvl)
    {
        // do a switch statement to assign enemy type 
    }
    
   
    // getters and setters
    /**
     * @return the speed
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * @return the health
     */
    public int getHealth() {
        return health;
    }

    /**
     * @return the livesLost
     */
    public int getLivesLost() {
        return livesLost;
    }

    /**
     * @return the reward
     */
    public int getReward() {
        return reward;
    }
        
    // take damage method (lose health)
    public void takeDamage(int damage){
        health -= damage;
    }
    
    public void move()
    {
        //do the moving stuff here
        
    }
    
    public Image getImage()
    {
        return image;
    }
    
}
