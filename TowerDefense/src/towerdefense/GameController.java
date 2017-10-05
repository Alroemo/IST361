package towerdefense;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nathan
 */
public class GameController implements ActionListener{

    private final GridView gridView;
    private final JPanel gridPanel;
    private final int difficulty;
    private boolean gameOver;
    private boolean waveOver;
    private Wave wave;
    private GridBagConstraints c = new GridBagConstraints();
    private Timer clock;
    private int waveType;
    private int level = 1;
    private int enemyPosition[] = new int[2];
    MainMenuController theMainMenuController;
        
    
    
    public GameController(GridView gridView, int difficulty, MainMenuController theParentMainMenuController)
    {
        theMainMenuController = theParentMainMenuController;
        this.gridView = gridView;
        this.gridPanel = this.gridView.getGridPanel();
        this.difficulty = difficulty;
        clock = new Timer(75, this);
    }
    
    public void run()
    {
       newWave();
       gameOver = false;
       clock.start();   
    }
    
    public void newWave()
    {
        waveType = (int)(Math.random() * 4);
        //Generate wave
        wave = new Wave(level, waveType);
        c.gridheight = 4;
        c.gridwidth = 4;
        for(Enemy e: wave.getEnemies())
        {
            //Set constraints
            enemyPosition = e.getPosition();
            c.gridx = enemyPosition[0];
            c.gridy = enemyPosition[1];
            gridPanel.add(e, c);
            System.out.println("enemy added");
        }
        gridPanel.validate();
        gridPanel.repaint();
        waveOver = false;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        Object action = e.getSource();
        if(waveOver == true)
        {
            clock.stop();
        }
        if(gameOver == true)
        {
            clock.stop();
        }
        else if(action == clock)
        {
            c.gridheight = 4;
            c.gridwidth = 4;
            
            //Move enemies through path
            for(Enemy enemy: wave.getEnemies())
            {
                gridPanel.remove(enemy);
            }
            wave.moveEnemies();
            System.out.println("enemies moved");
            //reset constraints and add each enemy back to board
            for(Enemy enemy: wave.getEnemies())
            {
                //Set constraints
                enemyPosition = enemy.getPosition();
                c.gridx = enemyPosition[0];
                c.gridy = enemyPosition[1];
                gridPanel.add(enemy, c);
            }
            gridPanel.validate();
            gridPanel.repaint();
            System.out.println(wave.getEnemies().size());

            //As enemies move into towers' ranges, target enemies. Towers will automatically drop targets when out of range

            //Use tower method to fire bullets at enemies

            //Apply damage to enemies when hit. Tower has method to check for impact

            //Apply damage to player as enemies make it to the end

            //When wave is over, wait for user to press "Next Wave" button. Generate new wave with new wave type. 
            if(wave.getEnemies().size() == 0){
                waveOver = true;
            }
            
        }
    }
}
