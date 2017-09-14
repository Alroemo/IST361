package munchiespractice;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GridView extends JFrame {

    private int score = 0;
    private Score currentScore = new Score();
    JLabel scoreLabel = new JLabel("Score ");
    JLabel winLabel = new JLabel("");
    private int numLeftToWin = 0;
    private boolean win;

    public GridView() {
        this.score = score;
        setSize(700, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void CreateGrid(int row, int col) {
        win = false;
        int gridSize;
        Container pane = getContentPane();
        pane.setLayout(new GridLayout(row, col));
        gridSize = row * col - 1;
        JButton buttons[];
        buttons = new JButton[50];
        
        //scoreLabel.setBorder(new EmptyBorder(0,15,10,15));
        //winLabel.setBorder(new EmptyBorder(0,15,20,20));
        //BorderLayout border = new BorderLayout();
        //setLayout(border);
        
        add(scoreLabel);
        add(winLabel);
        add(new JLabel(""));
        add(new JLabel(""));
        add(new JLabel(""));
        add(new JLabel(""));
        
        for (int i = 0; i < gridSize; i++) {

            buttons[i] = new JButton(Integer.toString(i + 1));
            pane.add(buttons[i]);
            //pane.add(scoreLabel);
            
            buttons[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    JButton tempbutton = (JButton) event.getSource();
                    String test = tempbutton.getText();
                    //System.out.println(tempbutton.getBackground());

                    int numbertest = Integer.parseInt(test);
                    if (!win && testPrime(numbertest, 100) == true && !(tempbutton.getBackground().equals(new Color(0, 255, 0)) || tempbutton.getBackground().equals(new Color(255, 0, 0)))) {
                        Color cur = tempbutton.getBackground();
                        currentScore.setScore(currentScore.getCurrentScore() + 100);
                        scoreLabel.setText("Score: " + currentScore.getCurrentScore());
                        numLeftToWin--;
                        System.out.println("Left: " + numLeftToWin);

                        tempbutton.setBackground(new Color(0, 255, 0));

                    } else {
                        if (!win && !(tempbutton.getBackground().equals(new Color(0, 255, 0)) || tempbutton.getBackground().equals(new Color(255, 0, 0)))) {
                            System.out.println(numbertest + " Not a prime number");
                            currentScore.setScore(currentScore.getCurrentScore() - 100);
                            scoreLabel.setText("Score: " + currentScore.getCurrentScore());
                            tempbutton.setBackground(Color.RED);
                        }
                    }
                    ;
                    if (numLeftToWin <= 0) {
                        win = true;
                        //scoreLabel.setText("Score " + currentScore.getCurrentScore());
                        winLabel.setText("You Win!");
                    }
                }
            }
            );

        };

        randomizeGrid(gridSize, buttons);
        
         for (int i = 0; i < gridSize; i++) {
            int numbTest = Integer.parseInt(buttons[i].getText());
            
            if (testPrime(numbTest, 99) == true) {
                numLeftToWin++;
                
            }
            System.out.println("Grid Num " + i + " Num " + numLeftToWin + " Value" + buttons[i].getText());
            //System.out.println("Left: " + numLeftToWin);
         }

    }

    public void randomizeGrid(int gridSize, JButton[] buttons) {

        int numRight = 0;
        int numWrong = 0;
        int randomIndex = 0; //used later to determine random index for sorting grid
        int maxDigit = 99; //change depending on grid size and max we want to use
        //Determine the number of correct answers (9-13 of 25, this part is depedent on # of jbuttons aka gridSize)
        numRight = (int) (Math.random() * 5 + 9); //change this depending on the gridSize, hardcoded for 16 rn
        numWrong = gridSize - numRight;
        setPrimes(gridSize, maxDigit, buttons, numRight);     //primes are 0 -> numRight-1 indexes
        setNonPrimes(gridSize, maxDigit, buttons, numRight, numWrong);  //non-primes are numright -> numright + numwrong
        //Randomize order of the buttons
        for (int i = 0; i < gridSize; i++) {
            randomIndex = (int) (Math.random() * gridSize); //hardcoded for now
            //JButton a = buttons[i];
            //buttons[i] = buttons[randomIndex];
            //buttons[randomIndex] = a;
            JButton a;
            a = new JButton(buttons[i].getText());
            buttons[i].setText(buttons[randomIndex].getText());
            buttons[randomIndex].setText(a.getText());
        }

        //for playtest
        //highlightAnswers(buttons, gridSize, maxDigit); //show the answers
    }

    public void setPrimes(int gridSize, int maxDigit, JButton buttons[], int numRight) {

        //prime numbers are NOT divisible by any number greater than 1 other than itself
        //int start = 2;
        int primeNumber = 0;

        boolean isPrime; //assume false until we get a prime

        for (int i = 0; i < numRight; i++) {

            isPrime = false;

            while (isPrime == false) {

                //System.out.println(primeNumber);

                primeNumber = (int) (Math.random() * maxDigit + 1); //pick numbers from 1 to maxDigit

                if (testPrime(primeNumber, maxDigit) == true) {

                    isPrime = true;

                }
            }
            buttons[i].setText(Integer.toString(primeNumber));
        }

    }

    public void setNonPrimes(int gridSize, int maxDigit, JButton buttons[], int numRight, int numWrong) {
        int nonPrimeNumber = 0;
        boolean isPrime; //assume true until we get a non-prime
        for (int i = numRight; i < gridSize; i++) {
            isPrime = true;
            while (isPrime == true) {
                nonPrimeNumber = (int) (Math.random() * maxDigit + 1); //pick numbers from 1 to maxDigit
                if (testPrime(nonPrimeNumber, maxDigit) == false) {
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
        if (maybePrime < 2) {
            return false;
            //           result = false;
        }

        if (maybePrime == 2) {
            return true;
        }
        //2 is the only even prime so check it first
        if (maybePrime % 2 == 0) {
            return false;
            //	result = false;
        }
        //check the odd primes next to save time/memory
        for (int i = 3; i < maxDigit; i++) {
            if (maybePrime % i == 0 && maybePrime != i) {
                return false;
                //		result = false;
            }
        }
        return true;
    }

    public void highlightAnswers(JButton buttons[], int gridSize, int maxDigit) {
        for (int i = 0; i < gridSize; i++) {
            if (testPrime(Integer.parseInt(buttons[i].getText()), maxDigit) == true) {
                buttons[i].setBackground(Color.yellow);
            } else {
                buttons[i].setBackground(new JButton().getBackground());
            }

        }
    }

}
