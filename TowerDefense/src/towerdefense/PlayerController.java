/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Lauren
 */
public class PlayerController {
    
  PlayerUI playerView = new PlayerUI();
  private int score =0;
  private int money =0;
  private int stage =1;
  int difficulty = 1;
  private int amountScoreChanged =0;
  private int amountMoneyChanged =0;
  private int amountHealthChanged =0;
  private String name = "";
  private int health = 0;
  private int highScore =0;
  
  public PlayerController(PlayerUI playerView){
    
    this.playerView = playerView;
    this.score = score;
    this.money = money;
    this.stage = stage;
    this.difficulty = difficulty;
    this.health = 100;
    }
    
   public void setScore(int amountScoreChanged){
    score = score + amountScoreChanged;
    
    }
  
   
  public void setMoney(int amountMoneyChanged){
      money = money + amountMoneyChanged;
  }
 public void setStage(){
     stage = stage+1;
 }
 
 public void setDifficulty(int difficulty){
     this.difficulty =difficulty;
 }
 
 public void setName(String name){
     this.name = name;
 }
 public String getName(){
     return name;
 }
 public void setHealth(int amountHealthChanged){
     health = health +amountHealthChanged;
 }
 
 public String showHighScore() throws IOException{
     String savedHighScore ="0";
     File file = new File("HighScores.txt");
     file.createNewFile();
  try{
             Scanner scnr = new Scanner(file);
             
            while (scnr.hasNextLine()){
             savedHighScore = scnr.nextLine();
  
                System.out.println(savedHighScore);
            }
            
           scnr.close();
        }
        
        catch(Exception e){
            String errString = e.getMessage();
            System.out.println(errString);
        }
    
        
     return savedHighScore;
 }
}

