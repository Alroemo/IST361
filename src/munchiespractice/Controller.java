/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munchiespractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Lauren
 */
public class Controller {
    View view;
    Score score;
    
    public Controller(View view, Score score){
        this.view = view;
        this.score = score;
        view.addTopLeftListener(new topLButtonListener());
        view.addTopMiddleListener(new topMButtonListener());
        view.addTopRightListener(new topRButtonListener());
        view.addlowerLeftListener(new lowerLButtonListener());
        view.addlowerMiddleListener(new lowerMButtonListener());
        view.addlowerRightListener(new lowerRButtonListener());
    }
    
   public Score CalculateScore(){
        //needs to add or subtract score before returning and displaying
       
      return score;
    }
    
    
    class topLButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            view.changeNumberforTopLeftButton();
        }
        
    }
      class topMButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            view.changeNumberforTopMiddleButton();
        }
        
    }
        class topRButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            view.changeNumberforTopRightButton();
        }
        
    }
       class lowerLButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            view.changeNumberforlowerLeftButton();
        }
        
    }
        class lowerMButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            view.changeNumberforlowerMiddleButton();
        }
        
    }
         class lowerRButtonListener implements ActionListener{
        public void actionPerformed(ActionEvent e ){
            view.changeNumberforlowerRightButton();
        }
        
    }
            
}
