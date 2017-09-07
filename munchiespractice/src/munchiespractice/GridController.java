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

    public GridController(GridView view, Score score) {
        this.view = view;
        this.score = score;
        view.CreateGrid(5, 5);

    }
}
