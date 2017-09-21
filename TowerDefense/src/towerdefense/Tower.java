/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package towerdefense;

import java.awt.Image;

/**
 *
 * @author bxe5056
 */
public class Tower {

    private String name;
    private int type;
    private int damage;
    private int radius;
    private int cost;
    private Image image;

    public Tower() {

    }

    public void fire(){
        System.out.println("DEBUG: Tower.fire() Called");
    }
    public void moveBullets(){
        System.out.println("DEBUG: Tower.moveBullets() Called");
    }
    public void clearBullets(){
        System.out.println("DEBUG: Tower.clearBullets() Called");
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

    public Image getImage() {
        return image;
    }

    public void setImage(Image img) {
        this.image = img;
        //Proposed Code to Get Images
        // ImageIcon icon = new ImageIcon("image.png");
        // Image image = icon.getImage();
    }
}
