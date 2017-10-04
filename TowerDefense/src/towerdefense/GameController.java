package towerdefense;

import java.awt.GridBagConstraints;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan
 */
public class GameController {

    private final GridView gridView;
    private final int difficulty;
    private boolean gameOver;
    private Wave wave;
    private GridBagConstraints c = new GridBagConstraints();
    
    
    public GameController(GridView gridView, int difficulty)
    {
        this.gridView = gridView;
        this.difficulty = difficulty;
    }
    
    public void run()
    {
        int waveType;
        int level = 1;
        int enemyPosition[] = new int[2];
        int timer = 0;
        c.gridheight = 4;
        c.gridwidth = 4;
        //Run the game
        while(gameOver == false)
        {   
            waveType = (int)(Math.random() * 4);
            //Generate wave
            wave = new Wave(level, waveType); 
            for(Enemy e: wave.getEnemies())
            {
                //Set constraints
                enemyPosition = e.getPosition();
                c.gridx = enemyPosition[0];
                c.gridy = enemyPosition[1];
                gridView.add(e, c);
                System.out.println("enemy added");
            }
            //Move enemies through path
            while(wave.getEnemies().size() > 0)
            {
                if(timer%10 == 0)
                {
                    //remove enemies from board
                    for(Enemy e: wave.getEnemies())
                    {
                        gridView.remove(e);
                    }
                    wave.moveEnemies();
                    System.out.println("enemies moved");
                    //reset constraints and add each enemy back to board
                    for(Enemy e: wave.getEnemies())
                    {
                        //Set constraints
                        enemyPosition = e.getPosition();
                        c.gridx = enemyPosition[0];
                        c.gridy = enemyPosition[1];
                        gridView.add(e, c);
                    }
                    gridView.repaint();
                }
                timer++;
            }
            
            //As enemies move into towers' ranges, target enemies. Towers will automatically drop targets when out of range
            
            //Use tower method to fire bullets at enemies
            
            //Apply damage to enemies when hit. Tower has method to check for impact
            
            //Apply damage to player as enemies make it to the end
            
            //When wave is over, wait for user to press "Next Wave" button. Generate new wave with new wave type. 
            level++;
            gameOver = true;
        }
        
    }
}
