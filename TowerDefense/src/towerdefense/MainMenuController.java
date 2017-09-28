/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

/**
 *
 * @author tqd5157
 */
public class MainMenuController {
    
    private MainMenuUI theMainMenuUI;
    //private PlayerController thePlayerController;
    
    public MainMenuController(){
        
        //theMainMenuUI = new MainMenuUI(this);
       
        
    }
    
    public void getMainMenuController(){
        //theMainMenuUI = new MainMenuUI(this);
    }
    
    public void getPlayerController(){
        theMainMenuUI.setVisible(false);
        //thePlayerController = new PlayerController(this);
    }
    
    
}
