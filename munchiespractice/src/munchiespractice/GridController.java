/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munchiespractice;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

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
          
        
          

    }
}


    
    
   // public boolean determinePrime(){
    // if(view.button[0].equals()){
    //        return true;
     //   }
   // else{
  //  return false;
//}
     
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
            

