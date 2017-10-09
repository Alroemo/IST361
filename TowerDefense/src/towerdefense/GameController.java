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
    private Timer clock;
    private int waveType;
    private int level = 1;
    private int enemyPosition[] = new int[2];
    MainMenuController theMainMenuController;
    private int enemyCount;
    private ArrayList<Tower> towers = new ArrayList<>(); 
    private int spawnDelay = 0;
        
    
    
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
            if(enemyCount < wave.getEnemies().size() & spawnDelay % 15 == 0)
            {
                spawnDelay++;
                Enemy currentEnemy = wave.getEnemies().get(enemyCount);
                currentEnemy.setPosition(240, 0);
                enemyPosition = currentEnemy.getPosition();
                gridPanel.add(currentEnemy);
                currentEnemy.setBounds(enemyPosition[0], enemyPosition[1], 64, 64);
                enemyCount++;
                System.out.println("enemy added");
            }
            else
            {
                spawnDelay++;
            }
            //Account for any new towers
            Iterator<Integer> iter = gridView.getNewTowers().iterator();
            while(iter.hasNext())
            {
                towers.add(new Tower("tower", iter.next(), iter.next()));
            }
            gridView.getNewTowers().clear();
            
            //Move enemies through path
            for(Enemy enemy: wave.getEnemies())
            {
                gridPanel.remove(enemy);
            }
            wave.moveEnemies();
            System.out.println("enemies moved");

            for(Enemy enemy: wave.getEnemies())
            {
                enemyPosition = enemy.getPosition();
                gridPanel.add(enemy);
                enemy.setBounds(enemyPosition[0], enemyPosition[1], 64, 64);
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
            for(Tower t: towers)
            {
                if(t.hasTarget())
                {
                    t.fire();
                    for(Bullet b: t.getBullets())
                    {
                        gridPanel.remove(b);
                    }
                    t.moveBullets();
                    for(Bullet b: t.getBullets())
                    {
                        int bulletLoc[] = b.getPosition();
                        gridPanel.add(b);
                        b.setBounds(bulletLoc[0], bulletLoc[1], 5, 5);
                        //check for impact here. 
                        
                    }
                    
                    int impact = t.impact();
                    if(impact > -1) // remove enemy and reward player
                    {
                        //System.out.println(impact);
//                        int reward = wave.getEnemies().get(impact).getReward();
//                        gridView.getPlayerController().setMoney(reward);
                        wave.killEnemy(t.getBullets().get(impact).getTarget());
                        //remove bullet
                    }
                }
            }
            

            gridPanel.validate();
            gridPanel.repaint();
            //When wave is over, wait for user to press "Next Wave" button. Generate new wave with new wave type. 
            if(wave.getEnemies().size() == 0)
                waveOver = true;
            
            
        }
    }
}
