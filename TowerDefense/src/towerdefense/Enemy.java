package towerdefense;

import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
    TODO list:
    -- Initialize enemy position based on the layout of the map | wait on UI guys
    -- Figure out the path for the enemy to take based on the map | Does controller do this?
    -- Image icon stuff
        -- Added a test icon for the default constructor
        -- Test icon IS NOT implemented for the constructor that takes type and level
    -- Balance enemy health and reward later

*/

/**
 *
 * @author wbm5061
 */
public class Enemy extends JLabel{
    
    private int speed;
    private int health;
    private int livesLost;
    private int reward;
    private int[] position = new int[2]; // [x, y]
    private ImageIcon icon;
    private Image image;
    private Random r;
    
    public Enemy() // number one
    {
        // with no arguments, it's a default enemy of lvl 1
        speed = 3;
        health = 10;
        livesLost = 1;
        reward = 4;
        //initialize enemy position
        icon = new ImageIcon("testIcon.png");  // Change this when we have REAL icons
        this.setIcon(icon);
        
                
    }
    
    public Enemy(int type, int lvl)
    {
        // do a switch statement to assign enemy type 
        switch(type)
        {
            case 0: // Unpredictable
                // do the random allocation stuff later
                r = new Random(System.currentTimeMillis());
                speed = r.nextInt((5 - 1) + 1) + 1;
                health = r.nextInt((15 - 8) + 1) + 8;
                livesLost = r.nextInt((3 - 1) + 1) + 1;
                reward = r.nextInt((8 - 3) + 1) + 3;
                //initialize enemy position
                icon = new ImageIcon("enemy.gif");
                this.setIcon(icon);
                break;
            case 1: // Speedy
                speed = 8;
                health = 8;
                livesLost = 1;
                reward = 2;
                //initialize enemy position
                icon = new ImageIcon("enemy.gif");
                this.setIcon(icon);
                break;
            case 2: // Default
                speed = 6;
                health = 10;
                livesLost = 1;
                reward = 4;
                //initialize enemy position
                icon = new ImageIcon("enemy.gif");
                this.setIcon(icon);
                break;
            case 3: // Tank
                speed = 4;
                health = 30;
                livesLost = 3;
                reward = 10;
                //initialize enemy position
                icon = new ImageIcon("enemy.gif");
                this.setIcon(icon);
                break;
            case 4: // Boss
                speed = 5;
                health = 100;
                livesLost = 5;
                reward = 25;
                //initialize enemy position
                icon = new ImageIcon("enemy.gif");
                this.setIcon(icon);
                break;
        }
        int multiplier = lvl;
        //Change these to balance later
        health += multiplier;
        if(multiplier % 3 == 0)
            reward += multiplier/3;
        
        position[0] = 160;
        position[1] = 0;
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
    
    /**
     * @param dir Direction to move enemy. 0 = north, 1 = east, 2 = south, 3 = west
     */
    public void move()
    {
                
        if(position[1] < 720 && position[0] == 240)
        {
            position[1] += speed;
        }
        else if(position[0] < 720 && position[1] >= 720)
        {
            position[0] += speed;
        }
        else if(position[1] > 400 && position[0] >= 720)
        {
            position[1] -= speed;
        }
        else if(position[0] < 960 && position[1] <= 400)
        {
            position[0] += speed;
        }
    }
    
    public int[] getPosition()
    {
        return position;
    }
    
    public Image getImage()
    {
        return image;
    }
    
    public boolean offBoard()
    {
        if(position[0] >= 960)
        {
            return true;  
        }
        else
            return false;
    }
    
    public void setPosition(int x, int y)
    {
        position[0] = x;
        position[1] = y;
    }
}
