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
            GridView gv = new GridView();
            gv.setVisible(true);
            
        }
        
    }
    
    private class MedListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            theMainMenuUI.dispose();
            GridView gv = new GridView();
            gv.setVisible(true);
        }
    
    
    }
    
    private class HardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            theMainMenuUI.dispose();
            GridView gv = new GridView();
            gv.setVisible(true);
        }
    
    
    }
    
    
    
    
}
