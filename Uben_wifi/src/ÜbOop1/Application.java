package ÜbOop1;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        animals.add(new Dog("blöki",5));
        animals.add(new Cat("cirmi",8));

        AnimalSoundPlayer soundPlayer = new AnimalSoundPlayer();
        soundPlayer.makeAllAnimalSound(animals);

        /**
         * A makeAllAnimalsSound metódus felelős azért, hogy végigmenjen egy listán,
         * amely Animal típusú objektumokat tartalmaz, és meghívja az egyes objektumok makeSound metódusát.
         * Metódus deklaráció:
         *
         * public: Ez a metódus hozzáférhető bárhonnan, ahol az AnimalSoundPlayer osztály elérhető.
         * void: A metódus nem ad vissza értéket.
         * makeAllAnimalsSound: A metódus neve.
         * List<Animal> animals: A metódus egy Animal objektumokat tartalmazó listát vár paraméterként.
         * Ciklus (for loop):
         *
         * for (Animal animal : animals): Ez egy úgynevezett "enhanced for loop" vagy "for-each loop", amely végigmegy a List<Animal> összes elemén.
         * Animal animal: Minden iterációban a List egy elemét egy animal nevű változóba helyezi. Az a
         * nimal változó típusa Animal, így ez bármilyen, Animal-tól származtatott objektum lehet (pl. Dog vagy Cat).
         * : animals: Ez jelzi, hogy a ciklus a animals listán megy végig.
         */


    }
}
