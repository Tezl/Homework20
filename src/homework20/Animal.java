package homework20;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Animal {

    public static void main(String[] args) {




        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> joinedPets = join(cats, dogs);
        printPets(joinedPets);

        removeCats(joinedPets, cats);
        printPets(joinedPets);
    }

    public static Set<Cat> createCats() {

        HashSet<Cat> Cats = new HashSet<>();

        for (int i = 0; i < 4; i++) {

            Cat cat = new Cat();
            Cats.add(cat);

        }
        return Cats;
    }

    public static Set<Dog> createDogs() {

        HashSet<Dog> Dogs = new HashSet<>();

        for (int i = 0; i < 3; i++) {
            Dog dog = new Dog();
            Dogs.add(dog);

        }
        return Dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {

        HashSet<Object> pets = new HashSet<>();
        pets.addAll(cats);
        pets.addAll(dogs);

        return pets;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {

        pets.removeAll(cats);

    }

    public static void printPets(Set<Object> pets){

        for (Iterator iterator = pets.iterator(); iterator.hasNext();) {

            System.out.println(iterator.next());

        }

        System.out.println();

    }

    }




