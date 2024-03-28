package zoosim;

/**
 * The LandAnim class represents a land animal in a zoo simulation.
 * It extends the Animal class, inheriting its properties and methods,
 * while also implementing specific behaviors for land animals, such as making a sound.
 * This class can be used to create instances of land animals with specific attributes
 * like ID, age, sex, name, and species.
 * Each land animal has attributes for hunger, fatigue, speed, and position,
 * which are initialized in the constructor.
 *
 * @author joshsoup
 */
public class LandAnim extends Animal {

    /**
     * Creates a new instance of {@code LandAnim} with specified attributes.
     * 
     * @param id The unique identifier for the land animal.
     * @param age The age of the land animal.
     * @param sex The sex of the land animal, denoted by a character ('M' for male, 'F' for female).
     * @param name The name of the land animal.
     * @param species The species of the land animal.
     */
    public LandAnim(int id, int age, char sex, String name, String species) {
        zooID = id;
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.species = species;
        hunger = 0;
        fautigue = 0;
        speed = 7;
        posX = 0;
        posY = 0;
    }

    
    //incase user wants to place in specific place
    public LandAnim (int id, int age, char sex, String name, String species, int posX, int posY){
        zooID = id;
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.species = species;
        hunger = 0;
        fautigue = 0;
        speed = 7;
        this.posX = posX;
        this.posY = posY;
    }
    
    /**
     * Makes a sound specific to the land animal.
     */
    
    public void makeSound() {
        System.out.println("ROARRRRR");
    }
}
