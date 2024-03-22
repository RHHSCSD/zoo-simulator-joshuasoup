/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author joshsoup
 */
public abstract class Animal implements IEntity {
    int age, posX, posY, size, speed, direction, hunger, zooID, fautigue;
    String name;
    String species;
    char sex;
    Image picture = new Image;
    String sound;
    
    
    public void move(){
        
    }
    
    public abstract void makeSound();
    
    public void eat(){
        
    }
    
    public void sleep(){
        
    }
    
    public void turn(int degrees){
        
    }
    
    public void place(int x, int y){
        
    }
    
}
