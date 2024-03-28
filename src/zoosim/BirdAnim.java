/**
 * The BirdAnim class represents a bird animal in a zoo simulation.
 * It extends the Animal class, inheriting its properties and methods,
 * while also implementing specific behaviors for bird animals, such as making a sound.
 * This class can be used to create instances of bird animals with specific attributes
 * like ID, age, sex, name, and species.
 * Each bird animal has attributes for hunger, fatigue, speed, and position,
 * which are initialized in the constructor.
 *
 * @author joshsoup
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
        height = 5;
    }
    
    public boolean isFlying(){
        if(height >= 5){
            return true;
        } else {
            return false;
        }
    }
    public void land(){
        height = 0;
    }
    
    public BirdAnim (int id, int age, char sex, String name, String species){
        zooID = id;
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.species = species;
        hunger = 10;
        fautigue = 0;
        speed = 10;
        posX = 0;
        posY = 0;
    }
}
