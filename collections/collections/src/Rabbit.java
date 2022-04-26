public class Rabbit extends Animal {

    public Rabbit(String name, int age) {
        super(name, age);
    }

    @Override
    String sayHello() {
        return "idk";
    }

    @Override
    String move() {
        return "Rabbit moves";
    }
}
