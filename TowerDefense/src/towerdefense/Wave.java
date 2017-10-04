package towerdefense;

import java.util.ArrayList;

/**
 *
 * @author wbm5061
 */
public class Wave {
    private int level;
    private ArrayList<Enemy> enemies = new ArrayList<Enemy>();
       
    
    /**
     * 
     * @param lvl 
     * @param waveType 0-4 (see enemy/wave design doc)
     */
    public Wave(int lvl, int waveType)
    {
        level = lvl;
        int numberOfEnemies = 19 + level;
        if(numberOfEnemies % 2 == 1)
            numberOfEnemies++;
        // Initialize the enemylist based on the waveType
        switch(waveType)
        {
            case 0:
                for(int i = 0; i < numberOfEnemies/2; i++)
                {
                    enemies.add(new Enemy(1, level));
                    enemies.add(new Enemy(3, level));
                }
                break;
            case 1:
                for(int i = 0; i < numberOfEnemies; i++)
                {
                    enemies.add(new Enemy(2, level));
                }
                break;
            case 2:
                for(int i = 0; i < numberOfEnemies/4; i++)
                {
                    enemies.add(new Enemy(1, level));
                    enemies.add(new Enemy(3, level));
                    enemies.add(new Enemy(0, level));
                    enemies.add(new Enemy(2, level));
                }
                break;
            case 3:
                for(int i = 0; i < numberOfEnemies; i++)
                {
                    enemies.add(new Enemy(3, level));
                }
                break;
            case 4:
                for(int i = 0; i < numberOfEnemies; i++)
                {
                    enemies.add(new Enemy(1, level));
                }
                break;
            case 5:
                for(int i = 0; i < numberOfEnemies; i++)
                {
                    enemies.add(new Enemy(0, level));
                }
                break;
            case 6:
                for(int i = 0; i < numberOfEnemies/4; i++)
                {
                    enemies.add(new Enemy(1, level));
                    enemies.add(new Enemy(3, level));
                    enemies.add(new Enemy(1, level));
                    enemies.add(new Enemy(2, level));
                }
                break;
            case 7:
                enemies.add(new Enemy(4,level));
                numberOfEnemies = Math.floorDiv(numberOfEnemies, 4);
                for (int i = 0; i < numberOfEnemies; i++) {
                    enemies.add(new Enemy(2, level));                       
                }
                break;
            default:
                System.out.println("Error in passing waveType to a Wave class");
                break;
        }
        
       
    }

    /**
     * @return the enemies
     */
    public ArrayList<Enemy> getEnemies() {
        return enemies;
    }
    
    public void killEnemy(int index)
    {
        enemies.remove(index);
    }
    
    public void moveEnemies(){
        for(Enemy e: enemies)
        {
            e.move();
            if(e.offBoard())
            {
                enemies.remove(enemies.indexOf(e));
                System.out.println("enemy removed");
            }
        }
    }
    
}
