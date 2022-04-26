import java.util.*;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1",10);
        Animal cat2 = new Cat("Cat2",10);
        Dog dog1 = new Dog("Dog1",5);
        Animal dog2 = new Dog("Dog2",5);
        Rabbit rabbit1 = new Rabbit("rabbit1",20);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(rabbit1);

        for (int i = 0; i < animalList.size(); i++) {
            System.out.println(animalList.get(i));
        }

        // Hashmap with animal name as key, object as value.
        HashMap<String, Animal> animalMap = new HashMap<String, Animal>();
        animalMap.put(cat1.getName(), cat1);
        animalMap.put(cat2.getName(), cat2);
        animalMap.put(dog1.getName(), dog1);
        animalMap.put(dog2.getName(), dog2);
        animalMap.put(rabbit1.getName(), rabbit1);

        for (Map.Entry<String,Animal> animal : animalMap.entrySet()) {
            System.out.println(animal);
        }
        // Hashmap with object as key, details as value.
        HashMap<Animal, String> animalMap2 = new HashMap<Animal, String>();
        animalMap2.put(cat1, cat1.getName());
        animalMap2.put(cat2, cat2.getName());
        animalMap2.put(dog1, dog1.getName());
        animalMap2.put(dog2, dog2.getName());
        animalMap2.put(rabbit1, rabbit1.getName());

        Set <Animal> animalSet = new HashSet<Animal>();
        animalSet.add(cat1);
        animalSet.add(cat2);
        animalSet.add(dog1);
        animalSet.add(dog2);
        animalSet.add(rabbit1);

        Iterator<Animal> it = animalSet.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
