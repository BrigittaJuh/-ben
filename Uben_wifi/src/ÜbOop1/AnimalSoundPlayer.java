package ÜbOop1;

import java.util.List;

public class AnimalSoundPlayer {
    public void makeAllAnimalSound (List<Animal> animals){
        for (Animal animal : animals){
            animal.makeSound();
        }
    }

}
