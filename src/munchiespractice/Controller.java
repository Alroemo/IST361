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
    
    public Controller(View view){
        this.view = view;
        view.addTopLeftListener(new topLButtonListener());
        view.addTopMiddleListener(new topMButtonListener());
        view.addTopRightListener(new topRButtonListener());
        view.addlowerLeftListener(new lowerLButtonListener());
        view.addlowerMiddleListener(new lowerMButtonListener());
        view.addlowerRightListener(new lowerRButtonListener());
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
