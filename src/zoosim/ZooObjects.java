/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author joshsoup
 */
public class ZooObjects implements IObject {
    String type;
    int posX, posY, length, width;
    double direction;
    String[] objects = {"Rock", "Tree", "Cage", "Grass", "Building", "Food"};
    
    public ZooObjects(int x, int y, int length, int width, String type){
        posX = x;
        posY = y;
        for(String i: objects){
            if(i.equals(type)){
                type = i;
            } else {
                System.out.println("That object doesn't exist, here's grass");
                type = "Grass";
            }
        }
        
        this.length = length;
        this.width = width;
        
    }
    
    public void place(int x, int y){
        posX = x;
        posY = y;
    }
    
    
    public void turn(int degrees){
        direction = Math.toRadians(degrees);
    }
    
    
}
