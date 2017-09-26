package towerdefense;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author njw5184
 */
public class PlayerUI extends JPanel
{
    
    private JPanel playerPanel;
    private JLabel name;
    private JLabel lives;
    private JLabel score;
    private JLabel currency;
    private JLabel difficluty;
    private JLabel wave;
    
    // Let me know if there are too many labels or how to condense them
    
    private JLabel w1Name;  // Labels for first tower
    private JLabel w1Range;
    private JLabel w1Damage;
    private JLabel w1IconLabel; //  **Read that we can also put icons on buttons which may be better**
    private JLabel w1Icon;
    
    private JLabel w2Name;  // Labels for second tower
    private JLabel w2Range;
    private JLabel w2Damage;
    private JLabel w2IconLabel;
    private JLabel w2Icon;
    
    private JLabel w3Name;  // Labels for third tower
    private JLabel w3Range;
    private JLabel w3Damage;
    private JLabel w3IconLabel;
    private JLabel w3Icon;
    
    private JLabel w4Name;  // Labels for fourth tower
    private JLabel w4Range;
    private JLabel w4Damage;
    private JLabel w4IconLabel;
    private JLabel w4Icon;
    
    private JLabel w5Name;  // Labels for fith tower
    private JLabel w5Range;
    private JLabel w5Damage;
    private JLabel w5IconLabel;
    private JLabel w5Icon;
    
    private JButton nextWave;
    
    public PlayerUI()
    {
        playerPanel = new JPanel(new GridLayout(0,2,5,5)); // Not sure of dimensions
        
        
    }
    
}
