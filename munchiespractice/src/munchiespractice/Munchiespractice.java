/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munchiespractice;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alex
 */
public class Munchiespractice extends JFrame {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Score score = new Score();
        GridView view = new GridView();
        GridController controller = new GridController(view, score);
        view.setVisible(true);

    }

}
