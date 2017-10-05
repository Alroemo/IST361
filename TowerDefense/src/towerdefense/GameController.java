package towerdefense;

import java.awt.GridBagConstraints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Iterator;
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
    private int enemyCount;
    private ArrayList<Tower> towers = new ArrayList<>();    
        
    
    
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
        waveOver = false;
        enemyCount = 0;
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
            if(enemyCount < wave.getEnemies().size())
            {
                c.gridheight = 4;
                c.gridwidth = 4;

                //Set constraints
                wave.getEnemies().get(enemyCount).setPosition(12, 0);
                enemyPosition = wave.getEnemies().get(enemyCount).getPosition();
                c.gridx = enemyPosition[0];
                c.gridy = enemyPosition[1];
                gridPanel.add(wave.getEnemies().get(enemyCount), c);
                enemyCount++;
                System.out.println("enemy added");
            }
            //Account for any new towers
            Iterator<Integer> iter = gridView.getNewTowers().iterator();
            while(iter.hasNext())
            {
                towers.add(new Tower("tower", iter.next(), iter.next()));
            }
            gridView.getNewTowers().clear();
            
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
            

            //As enemies move into towers' ranges, target enemies. Towers will automatically drop targets when out of range
            for(Tower t: towers)
            {
                boolean targetFound = false;
                int enemyIndex = 0;
                while(targetFound == false && enemyIndex < wave.getEnemies().size())
                {
                    if(t.enemyInRange(wave.getEnemies().get(enemyIndex)))
                    {
                        t.setTarget(wave.getEnemies().get(enemyIndex));
                        targetFound = true;
                    }
                    else
                        enemyIndex++;
                }
            }
            //Use tower method to fire bullets at enemies
            c.gridheight = 1;
            c.gridwidth = 1;
            for(Tower t: towers)
            {
                if(t.hasTarget())
                {
                    System.out.println("Tower has target");
                    t.fire();
                    t.moveBullets();
                    for(Bullet b: t.getBullets())
                    {
                        int bulletLoc[] = b.getPosition();
                        c.gridx = bulletLoc[0];
                        c.gridy = bulletLoc[1];
                        gridPanel.add(b, c);
                    }
                }
            }
            //Apply damage to enemies when hit. Tower has method to check for impact

            //Apply damage to player as enemies make it to the end
            
            gridPanel.validate();
            gridPanel.repaint();
            //When wave is over, wait for user to press "Next Wave" button. Generate new wave with new wave type. 
            if(wave.getEnemies().size() == 0)
                waveOver = true;
            
            
        }
    }
}
