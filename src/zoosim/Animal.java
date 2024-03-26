/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package zoosim;
import java.util.*;

/**
 *
 * @author joshsoup
 */
public abstract class Animal implements IEntity {
    int age, posX, posY, size, speed, hunger, zooID, fautigue, time;
    String name;
    String species;
    char sex;
    Image picture;
    String sound;
    double direction = 0;
    
    
    public void move(){ //check with this movement thing
        posX += speed*Math.sin(direction);
        posY += speed*Math.cos(direction);
    }
    
    public abstract void makeSound();
    
    public void eat(){
        hunger = 10;
    }
    
    public void sleep(){
        fautigue = 0;
    }
    
    public void turn(int degrees){ //ask about the radian thing for turning
        direction = Math.toRadians(degrees);
    }
    
    public void place(int x, int y){
        posX = x;
        posY = y;
    }
}
