/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * The IObject interface outlines fundamental spatial behaviors for objects
 * within the zoo simulation environment. Implementing this interface allows objects
 * to be placed at specific locations within the simulation space and to change orientation
 * or direction by turning a specified number of degrees.
 *
 * @author joshsoup
 */
public interface IObject {
    public void turn(double degrees);   
    
    public void place(int x, int y);
}