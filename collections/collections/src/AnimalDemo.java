import java.util.ArrayList;

public class AnimalDemo {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Cat1",10);
        Cat cat2 = new Cat("Cat2",10);
        Dog dog1 = new Dog("Dog1",5);
        Dog dog2 = new Dog("Dog2",5);
        Rabbit rabbit1 = new Rabbit("rabbit1",20);

        ArrayList<Animal> animalList = new ArrayList<Animal>();
        animalList.add(cat1);
        animalList.add(cat2);
        animalList.add(dog1);
        animalList.add(dog2);
        animalList.add(rabbit1);

        for (Animal animal : animalList) {
            System.out.println(animal.toString());
        }
    }
}
