package towerdefense;

import java.awt.Image;
import javax.swing.ImageIcon;

/*
    TODO list:
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
        speed = 3;
        health = 10;
        livesLost = 1;
        reward = 4;
        //initialize enemy position
        icon = new ImageIcon(/*put the path to art here*/);
        image = icon.getImage();
        
    }
    
    public Enemy(int type, int lvl)
    {
        // do a switch statement to assign enemy type 
        switch(type)
        {
            case 0: // Unpredictable
                // do the random allocation stuff later
                speed = 3;
                health = 10;
                livesLost = 1;
                reward = 4;
                //initialize enemy position
                icon = new ImageIcon(/*put the path to art here*/);
                image = icon.getImage();
                break;
            case 1: // Speedy
                speed = 5;
                health = 8;
                livesLost = 1;
                reward = 2;
                //initialize enemy position
                icon = new ImageIcon(/*put the path to art here*/);
                image = icon.getImage();
                break;
            case 2: // Default
                speed = 3;
                health = 10;
                livesLost = 1;
                reward = 4;
                //initialize enemy position
                icon = new ImageIcon(/*put the path to art here*/);
                image = icon.getImage();
                break;
            case 3: // Tank
                speed = 1;
                health = 30;
                livesLost = 3;
                reward = 10;
                //initialize enemy position
                icon = new ImageIcon(/*put the path to art here*/);
                image = icon.getImage();
                break;
            case 4: // Boss
                speed = 2;
                health = 100;
                livesLost = 5;
                reward = 25;
                //initialize enemy position
                icon = new ImageIcon(/*put the path to art here*/);
                image = icon.getImage();
                break;
        }
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
    
    public int[] getPosition()
    {
        return position;
    }
    
    public Image getImage()
    {
        return image;
    }
    
}
