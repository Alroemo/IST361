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
    public String username;
    MainMenuController self;
    
    
    public MainMenuController(){
        self = this;
        theMainMenuUI = new MainMenuUI();
        theMainMenuUI.addEasyButtonListener(new EasyListener());
        theMainMenuUI.addMediumButtonListener(new MedListener());
        theMainMenuUI.addHardButtonListener(new HardListener());
        
    }
    
    
    private class EasyListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            // call other easy UI
            retrieveUser();
            theMainMenuUI.dispose();
            gv = new GridView(self);
            gv.setLocationRelativeTo(null);
            gv.setVisible(true);
            GameController gc = new GameController(gv, 1, self);
            gc.run();
        }
        
    }
    
    private class MedListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            retrieveUser();
            theMainMenuUI.dispose();
            gv = new GridView(self);
            gv.setLocationRelativeTo(null);
            gv.setVisible(true);
            GameController gc = new GameController(gv, 2, self);
            gc.run();
        }
    
    
    }
    
    private class HardListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            retrieveUser();
            theMainMenuUI.dispose();
            gv = new GridView(self);
            gv.setLocationRelativeTo(null);
            gv.setVisible(true);
            GameController gc = new GameController(gv, 3, self);
            gc.run();
        }
    
    
    }
    public void retrieveUser() {
        username = theMainMenuUI.getUsername();        
    }
    
    
}
