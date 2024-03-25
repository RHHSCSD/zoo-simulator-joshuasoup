/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package zoosim;

/**
 *
 * @author joshsoup
 */
public class WaterAnim extends Animal implements ISwimmable{
    public void makeSound(){
        System.out.println("flop");
    }
    public boolean canSurface(){
        return true;
    }
}
