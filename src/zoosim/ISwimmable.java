/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package zoosim;

/**
 * The ISwimmable interface defines the swimming capabilities for entities within
 * the zoo simulation. Implementing this interface enables entities to perform actions
 * related to being in water, such as swimming, surfacing, submerging, and potentially
 * breathing while submerged. 
 * @author joshsoup
 */
public interface ISwimmable {
    public boolean canSurface();
    
    public void swim();
    
    public void surface();
    
    public boolean isSubmerged();
    
    public boolean canBreathe();
}
