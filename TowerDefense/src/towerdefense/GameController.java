package towerdefense;

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
    
    
    public GameController(GridView gridView, int difficulty)
    {
        this.gridView = gridView;
        this.difficulty = difficulty;
    }
    
    public void run()
    {
        int waveType;
        int level = 1;
        //Run the game
        while(gameOver == false)
        {   
            waveType = (int)(Math.random() * 4);
            //Generate wave
            
            //Move enemies through path
            
            //As enemies move into towers' ranges, target enemies. Towers will automatically drop targets when out of range
            
            //Use tower method to fire bullets at enemies
            
            //Apply damage to enemies when hit. Tower has method to check for impact
            
            //Apply damage to player as enemies make it to the end
            
            //When wave is over, wait for user to press "Next Wave" button. Generate new wave with new wave type. 
            level++;
        }
    }
}
