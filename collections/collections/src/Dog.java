public class Dog extends Animal {

    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    String sayHello() {
        return "Woof";
    }

    @Override
    String move() {
        return "Dog Moves";
    }
}
