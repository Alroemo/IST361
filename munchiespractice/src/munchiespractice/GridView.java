package munchiespractice;

import java.awt.Color;
import java.awt.Container;
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
public class GridView extends JFrame{
//    private JPanel mainPanel;
//    private JButton topLeft;
//    private JButton topMiddle;
//    private JButton topRight;
//    
//    private JButton lowerLeft;
//    private JButton lowerMiddle;
//    private JButton lowerRight;
    
    public GridView(){
        
        
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
//       mainPanel = new JPanel (new GridLayout (2,3));
//       add(mainPanel);
//       topLeft = new JButton("1");
//       topMiddle = new JButton("2");
//       topRight = new JButton("3");
//       lowerLeft = new JButton("4");
//       lowerMiddle = new JButton("5");
//       lowerRight = new JButton("6");
//      
//       
//       mainPanel.add(topLeft);
//       mainPanel.add(topMiddle);
//       mainPanel.add(topRight);
//       mainPanel.add(lowerLeft);
//       mainPanel.add(lowerMiddle);
//       mainPanel.add(lowerRight);
    }
    
        public void CreateGrid(int row,int col){
    int gridSize;  //max
        Container pane = getContentPane();
    pane.setLayout(new GridLayout(row, col));
    gridSize = row * col; //max
    JButton buttons[];  //max
    buttons = new JButton[50];
    for (int i = 0; i < gridSize; i++) {
        //will be put controlled randomized numbers
        buttons[i] = new JButton(Integer.toString(i + 1));  //max
        pane.add(buttons[i]);            //max
      //  randomizeGrid(gridSize, buttons);
      //JButton button = new JButton(Integer.toString(i + 1));  //original
      //pane.add(button); //original
    }
    randomizeGrid(gridSize, buttons);
    }
    
    
            
    
public void randomizeGrid(int gridSize, JButton[] buttons)
{
	int numRight = 0;
	int numWrong = 0;
	int randomIndex = 0; //used later to determine random index for sorting grid
	int maxDigit = 99; //change depending on grid size and max we want to use
	
	//Determine the number of correct answers (9-13 of 25, this part is depedent on # of jbuttons aka gridSize)
	numRight = (int)(Math.random() * 5 + 9); //change this depending on the gridSize, hardcoded for 16 rn
	numWrong = gridSize - numRight;
	
	//Set 
	setPrimes(gridSize, maxDigit, buttons, numRight);     //primes are 0 -> numRight-1 indexes
	setNonPrimes(gridSize, maxDigit, buttons, numRight, numWrong);  //non-primes are numright -> numright + numwrong
	
        
	//Randomize order of the buttons
	for (int i = 0; i < gridSize; i++)
	{
		randomIndex = (int)(Math.random() * 25); //hardcoded for now
		//JButton a = buttons[i];
		//buttons[i] = buttons[randomIndex];
		//buttons[randomIndex] = a;
                JButton a;
                a = new JButton(buttons[i].getText());
                buttons[i].setText(buttons[randomIndex].getText());
                buttons[randomIndex].setText(a.getText());
	}
}

public void setPrimes(int gridSize, int maxDigit, JButton buttons[], int numRight)
{
	//prime numbers are NOT divisible by any number greater than 1 other than itself
	//int start = 2;
	int primeNumber = 0;
	boolean isPrime; //assume false until we get a prime
	
	for (int i = 0; i < numRight; i++)
	{
            isPrime = false;
		while (isPrime == false)
		{
                    System.out.println(primeNumber);
			primeNumber = (int) (Math.random() * 99 + 1); //pick numbers from 1 to maxDigit
			
			if (testPrime(primeNumber, maxDigit) == true)
			{
					isPrime = true;
			}
		}
		
                buttons[i].setText(Integer.toString(primeNumber));
                buttons[i].setBackground(Color.yellow);
		//buttons[i] = primeNumber; //need to get the prime from somewhere
	}
}

public void setNonPrimes(int gridSize, int maxDigit, JButton buttons[], int numRight, int numWrong)
{
	//int start = 2;
	int nonPrimeNumber = 0;
	boolean isPrime; //assume true until we get a non-prime
	
	//non-prime numbers are divisible by any number greater than 1 other than itself
	for (int i = numRight; i < gridSize; i++)
	{
            isPrime = true;
		while (isPrime == true)
		{
			nonPrimeNumber = (int) (Math.random() * 99 + 1); //pick numbers from 1 to maxDigit
			
			if (testPrime(nonPrimeNumber, maxDigit) == false)
			{
					isPrime = false;
			}
		}
		
                buttons[i].setText(Integer.toString(nonPrimeNumber));
	//	buttons[i] = nonPrimeNumber; //need to get the non-prime from somewhere
	}
}

public boolean testPrime(int maybePrime, int maxDigit) //private? idk?
{
       // boolean result = true; //assume prime unless not
		//code to check if a number is prime
		
                if (maybePrime < 2)
                {
                    return false;
         //           result = false;
                }
    
                if (maybePrime == 2)
                {
                    return true;
           //         result = true;
                }
		//2 is the only even prime so check it first
		if (maybePrime % 2 == 0)
		{
                    return false;
		//	result = false;
		}
		
		//check the odd primes next to save time/memory
		for (int i = 3; i < maxDigit; i++)
		{
			if (maybePrime % i == 0 && maybePrime != i)
			{
                            return false;
		//		result = false;
			}
		}
		
                return true;
                
    
    
    

//    public void addTopLeftListener(ActionListener al){
//        topLeft.addActionListener(al); 
//    }
//    public void addTopMiddleListener(ActionListener al){
//        topMiddle.addActionListener(al); 
//    
//    }
//    public void addTopRightListener(ActionListener al){
//        topRight.addActionListener(al); 
//    }
//public void addlowerLeftListener(ActionListener al){
//        lowerLeft.addActionListener(al); 
//    }
//public void addlowerMiddleListener(ActionListener al){
//        lowerMiddle.addActionListener(al); 
//    }
//public void addlowerRightListener(ActionListener al){
//        lowerRight.addActionListener(al); 
//    }
//
//public void changeNumberforTopLeftButton(){
//    int b = (int)(Math.random()* 50 +1);
//    
//    topLeft.setText(b+ "");
//}
//public void changeNumberforTopMiddleButton(){
//    int b = (int)(Math.random()* 50 +1);
//    
//    topMiddle.setText(b+ "");
//}
//public void changeNumberforTopRightButton(){
//    int b = (int)(Math.random()* 50 +1);
//    
//    topRight.setText(b+ "");
//}
//
//public void changeNumberforlowerLeftButton(){
//    int b = (int)(Math.random()* 50 +1);
//    
//    lowerLeft.setText(b+ "");
//}
//public void changeNumberforlowerMiddleButton(){
//    int b = (int)(Math.random()* 50 +1);
//    
//    lowerMiddle.setText(b+ "");
//}
//public void changeNumberforlowerRightButton(){
//    int b = (int)(Math.random()* 50 +1);
//    
//    lowerRight.setText(b+ "");
//}

}

}
