/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author tqd5157
 */
public class MainMenuController {
    
    private MainMenuUI theMainMenuUI;
    private GridView gv;
    //private PlayerController thePlayerController;
    
    public MainMenuController(MainMenuUI mv){
        
        theMainMenuUI = mv;
        theMainMenuUI.addEasyButtonListener(new EasyListener());
        theMainMenuUI.addMediumButtonListener(new MedListener());
        theMainMenuUI.addHardButtonListener(new HardListener());
        
    }
    
    
    private class EasyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // call other easy UI
            theMainMenuUI.dispose();
            gv = new GridView();
            gv.setVisible(true);
            GameController gc = new GameController(gv, 1);
            gc.run();
        }
        
    }
    
    private class MedListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            theMainMenuUI.dispose();
            gv = new GridView();
            gv.setVisible(true);
            GameController gc = new GameController(gv, 2);
            gc.run();
        }
    
    
    }
    
    private class HardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            theMainMenuUI.dispose();
            gv = new GridView();
            gv.setVisible(true);
            GameController gc = new GameController(gv, 3);
            gc.run();
        }
    
    
    }
    
    
    
}
