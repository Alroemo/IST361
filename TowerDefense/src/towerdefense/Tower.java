/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author bxe5056
 */
public class Tower {

    private String name;
    private int type; //Necessary?
    private int damage;
    private int radius;
    private int cost;
    private ImageIcon image;
    private Enemy target;
    private ArrayList<Bullet> bullets;
    private int[] location = new int[2]; //0 = x, 1 = y
    int targetLoc[];
    int targetDist;

    public Tower(String name, int x, int y) {
        this.name = name;
        bullets = new ArrayList<>();
        location[0] = x;
        location[1] = y;
        //These values may need to be determined by type
        damage = 1; 
        radius = 10; //Radius of 10px
        cost = 15; //Currently arbitrary
        image = new ImageIcon(); //TODO: add filepath 
    }

    public void fire(){
        bullets.add(new Bullet(target, location[0], location[1]));
    }
    
    public void moveBullets(){
        if(enemyInRange(this.target))
        {
            for(Bullet b: bullets)
            {
                b.move();
            }
        }
        else //Bullets cannot reach enemy
        {
            //Clear all bullets
            clearBullets();
            //Target needs to be reset
            setTarget(null);
        }
    }
    
    public void clearBullets(){
        bullets.clear();
    }
    
    public boolean impact(){
        return false;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public ImageIcon getImage() {
        return image;
    }

    public void setImage(ImageIcon img) {
        this.image = img;
        //Proposed Code to Get Images
        // ImageIcon icon = new ImageIcon("image.png");
        // Image image = icon.getImage();
    }
    
    public boolean hasTarget(){
        if (target != null)
            return true;
        else
            return false;
    }
    
    public void setTarget(Enemy e){
        target = e;
    }
    
    /**
     * Converts the targets location to an integer distance and returns true
     * if distance is less than the tower's radius of attack.
     * @return inRange
     */
    public boolean enemyInRange(Enemy target){
        boolean inRange;
        targetLoc = target.getPosition();
        targetDist = (int)Math.sqrt(Math.pow(targetLoc[0] - location[0], 2) + Math.pow(targetLoc[1] - location[1], 2));
        if(targetDist < radius)
            inRange = true;
        else
            inRange = false;
        
        return inRange;
    }
    
    public int[] getLocation(){
        return this.location;
    }
    
    public void setLocation(int x, int y){
        location[0] = x;
        location[1] = y;
    }
    
    public ArrayList<Bullet> getBullets()
    {
        return this.bullets;
    }
}
