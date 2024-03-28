/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 * The ZooObjects class represents various static objects within the zoo simulation,
 * such as rocks, trees, cages, and buildings. Each object has properties like position,
 * size, and orientation, allowing for detailed placement within the simulation.
 * @author joshsoup
 */
public class ZooObjects implements IObject {
    String type;
    int posX, posY, length, width;
    double direction;
    String[] objects = {"Rock", "Tree", "Cage", "Grass", "Building", "Food"};
    
     /**
     * Constructs a new {@code ZooObjects} instance with specified dimensions, type, and initial position.
     * If the specified type does not match one of the predefined types, it defaults to "Grass".
     *
     * @param x The x-coordinate of the object's initial position.
     * @param y The y-coordinate of the object's initial position.
     * @param length The length of the object.
     * @param width The width of the object.
     * @param type The type of the object. Must be one of the types from the array, otherwise defaults to "Grass".
     */
    
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
    /**
     * Places the object at a new position within the simulation.
     *
     * @param x The x-coordinate of the new position.
     * @param y The y-coordinate of the new position.
     */
    @Override
    public void place(int x, int y){
        posX = x;
        posY = y;
    }
    
    /**
     * Rotates the object to a new orientation.
     * 
     * @param degrees The angle in degrees by which to rotate the object.
     *                The orientation is stored as radians.
     */
    @Override
    public void turn(double degrees){
        direction = Math.toRadians(degrees);
    }
    
    
}
