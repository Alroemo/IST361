package munchiespractice;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.util.Random;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Lauren
 */
public class View extends JFrame{
    private JPanel mainPanel;
    private JButton topLeft;
    private JButton topMiddle;
    private JButton topRight;
    
    private JButton lowerLeft;
    private JButton lowerMiddle;
    private JButton lowerRight;
    
    public View(){
        
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
       mainPanel = new JPanel (new GridLayout (2,3));
       add(mainPanel);
       topLeft = new JButton("1");
       topMiddle = new JButton("2");
       topRight = new JButton("3");
       lowerLeft = new JButton("4");
       lowerMiddle = new JButton("5");
       lowerRight = new JButton("6");
      
       
       mainPanel.add(topLeft);
       mainPanel.add(topMiddle);
       mainPanel.add(topRight);
       mainPanel.add(lowerLeft);
       mainPanel.add(lowerMiddle);
       mainPanel.add(lowerRight);
    }

    public void addTopLeftListener(ActionListener al){
        topLeft.addActionListener(al); 
    }
    public void addTopMiddleListener(ActionListener al){
        topMiddle.addActionListener(al); 
    
    }
    public void addTopRightListener(ActionListener al){
        topRight.addActionListener(al); 
    }
public void addlowerLeftListener(ActionListener al){
        lowerLeft.addActionListener(al); 
    }
public void addlowerMiddleListener(ActionListener al){
        lowerMiddle.addActionListener(al); 
    }
public void addlowerRightListener(ActionListener al){
        lowerRight.addActionListener(al); 
    }

public void changeNumberforTopLeftButton(){
    int b = (int)(Math.random()* 50 +1);
    
    topLeft.setText(b+ "");
}
public void changeNumberforTopMiddleButton(){
    int b = (int)(Math.random()* 50 +1);
    
    topMiddle.setText(b+ "");
}
public void changeNumberforTopRightButton(){
    int b = (int)(Math.random()* 50 +1);
    
    topRight.setText(b+ "");
}

public void changeNumberforlowerLeftButton(){
    int b = (int)(Math.random()* 50 +1);
    
    lowerLeft.setText(b+ "");
}
public void changeNumberforlowerMiddleButton(){
    int b = (int)(Math.random()* 50 +1);
    
    lowerMiddle.setText(b+ "");
}
public void changeNumberforlowerRightButton(){
    int b = (int)(Math.random()* 50 +1);
    
    lowerRight.setText(b+ "");
}

}