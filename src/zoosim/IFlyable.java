/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * The  IFlyable interface defines the capabilities for entities that can fly
 * within the zoo simulation. Implementing this interface allows entities to perform
 * aerial movements, including taking off, flying through the simulation space, and landing.
 * It also includes a method to check whether the entity is currently in flight.
 * @author joshsoup
 */
public interface IFlyable {
    public void fly();
    
    public void land();
    
    public boolean isFlying();
    
}
