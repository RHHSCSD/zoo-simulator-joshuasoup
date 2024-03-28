/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package zoosim;
import java.util.*;

/**
 * The ZooSim class is the main entry point for the zoo simulation program.
 * It initializes a fixed number of animals with random attributes (age, sex, species, and type)
 * and simulates basic activities such as feeding, sleeping, and moving.
 * The simulation currently supports three types of animals: land, water, and birds,
 * with a simple approach to their behavior and interaction.
 *
 * @author Josh Soup
 */
public class ZooSim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int totalAnimals = 20, rng, age, rng_species, species =1;
        char sex;
        Animal[] Animals = new Animal[totalAnimals];
        String[] names = {"Aiden", "Bella", "Connor", "Diana", "Ethan", "Fiona", "Gabriel", "Hannah", "Ian", "Julia", "Kevin", "Luna", "Mason", "Nora", "Oliver", "Piper", "Quinn", "Ryan", "Sophia", "Tyler"};
        String[] LandSpecies = {"Lion", "Elephant", "Giraffe"};
        String[] WaterSpecies = {"Salmon", "Carp", "Whale"};
        String[] BirdSpecies = {"Owl", "Falcon", "Crow"};
        while (true){
            for(int i = 0; i < totalAnimals; i++){
                //randomize species
                rng_species =(int)(Math.random()*10);
                
                if(rng_species > 7){
                    species = 2;
                    
                } else if (rng_species <= 7 && rng_species >= 4) {
                    species = 1;
                    
                } else if ( rng_species >= 0 && rng_species < 4){
                    species = 0;
                }
                
                //number to randomize type of animal
                rng = (int)(Math.random() * 10);
                
                //randomize age
                age = (int)(Math.random() * 10);
                
                //randomize sex
                if(Math.random()*10 < 5){
                    sex = 'M';
                }else{
                    sex = 'W';
                }
                //randomize if it's either bird, water, or land
                if(rng > 7){
                    Animals[i] = new BirdAnim(i, age, sex, names[i], BirdSpecies[species]);
                    
                } else if (rng <= 7 && rng >= 4) {
                    Animals[i] = new WaterAnim(i, age, sex, names[i], WaterSpecies[species]);
                    
                } else if ( rng >= 0 && rng < 4){
                    Animals[i] = new LandAnim(i, age, sex, names[i], LandSpecies[species]);
                }
            }
            //now animals are made, time to feed and take care of them/find out their statistics
            for(Animal d: Animals){
                    d.feed();
                    d.sleep();
                    d.move();
                    d.info();
            }
            break;
        }
    }
}

//To allow for predator and prey interactions, I would create health, and rank different animal species based on if they 
//are predator or prey. Depending on the ranking and health it would make the other animal move away from that direction if
//it reaches x or y distance away from that predator.
//for carnivores and omnivores, I would have to create even furhter subclasses from the animal classes to distinguish the implementing
//a new method isOmnivore, the other 2. With this implementation there must also be types of food. Then with new types of food
//methods would have to be made to check if it is the right type based on if it's a omnivore or canivore