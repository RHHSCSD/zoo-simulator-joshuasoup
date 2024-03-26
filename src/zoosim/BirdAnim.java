/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author joshsoup
 */
public class BirdAnim extends Animal implements IFlyable{
    public void makeSound(){
        System.out.println("chirp chirp");
    }
    
    public void fly(){
    }
    
    public boolean isFlying(){
        return true;
    }
    public void land(){
        
    }
}
