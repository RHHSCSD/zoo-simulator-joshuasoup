/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * The interface represents a connects the entities within the zoo simulation
 * that are capable of performing basic actions such as moving, making sounds, eating, and sleeping.
 * This interface extends the IObject interface, indicating that implementing entities
 * are also considered objects within the simulation context.
 * Implementing classes are expected to provide implementations for each of the actions.
 *
 * @author joshsoup
 */
public interface IEntity extends IObject {
    public void move();
    
    public void makeSound();
    
    public void eat();
    
    public void sleep();
}
