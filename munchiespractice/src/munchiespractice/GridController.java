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
public class GridController {
    GridView view;
    Score score;
    
    public GridController(GridView view, Score score){
        this.view = view;
        this.score= score;
          view.CreateGrid(5, 5);
//        view.addTopLeftListener(new topLButtonListener());
//        view.addTopMiddleListener(new topMButtonListener());
//        view.addTopRightListener(new topRButtonListener());
//        view.addlowerLeftListener(new lowerLButtonListener());
//        view.addlowerMiddleListener(new lowerMButtonListener());
//        view.addlowerRightListener(new lowerRButtonListener());
    }
  /*  public void calcScore(){
        if(determinePrime()==true){
            
           // score= score +100;
        }
        else{
            
        }
        
        
    }
    
    */
   // public boolean determinePrime(){
    // if(view.button[0].equals()){
    //        return true;
     //   }
   // else{
  //  return false;
//}
   // }
    
//    class topLButtonListener implements ActionListener{
//        public void actionPerformed(ActionEvent e ){
//            view.changeNumberforTopLeftButton();
//        }
//        
//    }
//      class topMButtonListener implements ActionListener{
//        public void actionPerformed(ActionEvent e ){
//            view.changeNumberforTopMiddleButton();
//        }
//        
//    }
//        class topRButtonListener implements ActionListener{
//        public void actionPerformed(ActionEvent e ){
//            view.changeNumberforTopRightButton();
//        }
//        
//    }
//       class lowerLButtonListener implements ActionListener{
//        public void actionPerformed(ActionEvent e ){
//            view.changeNumberforlowerLeftButton();
//        }
//        
//    }
//        class lowerMButtonListener implements ActionListener{
//        public void actionPerformed(ActionEvent e ){
//            view.changeNumberforlowerMiddleButton();
//        }
//        
//    }
//         class lowerRButtonListener implements ActionListener{
//        public void actionPerformed(ActionEvent e ){
//            view.changeNumberforlowerRightButton();
//        }
//        
//    }
            
}
