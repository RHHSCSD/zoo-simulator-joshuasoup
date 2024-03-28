/**
 * The WaterAnim class represents a water animal in a zoo simulation.
 * It extends the Animal class, inheriting its properties and methods,
 * while also implementing specific behaviors for water animals, such as making a sound.
 * This class can be used to create instances of water animals with specific attributes
 * like ID, age, sex, name, and species.
 * Each water animal has attributes for hunger, fatigue, speed, and position,
 * which are initialized in the constructor.
 *
 * @author joshsoup
 */
package zoosim;

/**
 *
 * @author joshsoup
 */
public class WaterAnim extends Animal implements ISwimmable{
    /**
     * Constructs a new {@code WaterAnim} with specified attributes.
     * 
     * @param id The unique identifier for the water animal.
     * @param age The age of the water animal.
     * @param sex The sex of the water animal, denoted by a character ('M' for male, 'F' for female).
     * @param name The name of the water animal.
     * @param species The species of the water animal.
     */
    
    
    /**
     * Outputs the sound specific to the water animal to the console,
     */

    public void makeSound(){
        System.out.println("glug glug");
    }
    
    /**
     * Indicates whether the water animal can surface.
     */
    public boolean canSurface(){
        if(height < 0){
            return true;
        }
        return false;
        
    }
    
    public void swim(){
        height = -5;
    }
        
    public void surface(){
        height = 0;
    }
        
    public boolean isSubmerged(){
        if(height <= -5){
            return true;
        }else{
            return false;
        }
    }
        
    public boolean canBreathe(){
        if(height <= -5){
            return true;
        }else{
            return false;
        }
 
    }
    
    public WaterAnim(int id, int age, char sex, String name, String species){
        zooID = id;
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.species = species;
        hunger = 0;
        fautigue = 0;
        speed = 5;
        posX = 0;
        posY = 0;
    }
}
