/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 *
 * @author Lauren
 */
public class PlayerController {
  
  private int score =0;
  private int money =100;
  private int stage =1;
  private int difficulty = 1;
  private int amountScoreChanged =10;
  private int amountMoneyChanged =10;
  private int amountHealthChanged =10;
  private String name = "Player 1";
  public static int health = 100;
  private int highScore =0;
  public static PlayerUI ui;
  GridView theGridView;
  
  public PlayerController(GridView theParentGridView){
    
    theGridView = theParentGridView;  
    
    this.score = 0;
    this.money = 100;
    this.stage = 1;
    this.difficulty = 1;
    this.health = 100;
    name = theGridView.theMainMenuController.username;
    ui = new PlayerUI(this);
    }
  
   public void setScore(int amountScoreChanged){
    score = score + amountScoreChanged;
    ui.updateValues();
    }
  public int getScore(){
      return score;
  }
   
  public void setMoney(int amountMoneyChanged){
      money = money + amountMoneyChanged;
      ui.updateValues();
  }
  public int getMoney(){
      return money;
  }
  
 public void setStage(){
     stage = stage+1;
     ui.updateValues();
 }
 public int getStage(){
     return this.stage;
 }
 
 public void setDifficulty(int difficulty){
     this.difficulty =difficulty;
     ui.updateValues();
 }
 public int getDifficulty(){
     return difficulty;
 }

 public void setName(String name){
     this.name = name;
     ui.updateValues();
 }
 public String getName(){
     return name;
 }
 public void setHealth(int amountHealthChanged){
     health = health +amountHealthChanged;
     ui.updateValues();
 }
 public int getHealth(){
     return this.health;
 }
 
 public String showHighScore() throws IOException{
   String savedHighScore ="0";
     
     File file = new File("HighScores.txt");
     file.createNewFile();
  try{
             Scanner scnr = new Scanner(file);
             savedHighScore = scnr.nextLine();
   
           scnr.close();
        }
        
        catch(Exception e){
            String errString = e.getMessage();
            
        }
    
        
     return savedHighScore;
 }
 
 public void compareScore(int currentScore) 
 {
     
     try{
     int highScore = Integer.parseInt(showHighScore());
     
      if(currentScore>highScore){
         saveHighScore(currentScore);
         
     }
     }
     catch(Exception e){
        System.out.println(e.getMessage());
     }
    
    
 } 
 public void saveHighScore(int highScore) {
     File file = new File("HighScores.txt");
      
     try{
        file.createNewFile();
        PrintWriter out = new PrintWriter("HighScores.txt");
        out.println(highScore);
         out.close();
         
        } 
    
     catch(Exception e ){
     System.out.println(e.getMessage());
    
        }
 }
 public static void updateUI(){
     ui.updateValues();
 }

 
}

