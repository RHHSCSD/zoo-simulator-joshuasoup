/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.*
package zoosim;

/**
 *
 * @author joshsoup
 */
public abstract class Animal implements IEntity {
    int age, posX, posY, size, speed, hunger, zooID, fautigue, time;
    String name;
    String species;
    char sex, direction;
    Image picture = new Image;
    String sound;
 
       
    public void move(){ //check with this movement thing
        if(direction == 'N'){
            posY += speed*time;
        }
        if(direction == 'E'){
            posX += speed*time;
        }
        if(direction == 'S'){
            posY -= speed*time;
        }
        if(direction == 'W'){
            posX -= speed*time;
        }
    }
    
    public abstract void makeSound();
    
    public void eat(){
        hunger = 10;
    }
    
    public void sleep(){
        fautigue = 100;
    }
    
    public void turn(int degrees){ //ask about the radian thing for turning
        
    }
    
    public void place(int x, int y){
        
    }
    public static void generateID(){{
        //ask mr r-d
    }
    
}
