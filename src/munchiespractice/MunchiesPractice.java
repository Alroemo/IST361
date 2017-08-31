/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package munchiespractice;

/**
 *
 * @author Lauren
 */
public class MunchiesPractice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        View view= new View();
       
         Controller controller = new Controller(view);
        view.setVisible(true);
    }
    
}
