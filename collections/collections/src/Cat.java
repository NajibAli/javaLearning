public class Cat extends Animal {

    public Cat(String name, int age) {
        super(name, age);
    }

    @Override
    String sayHello() {
        return "Meow";
    }

    @Override
    String move() {
        return "Cat moves";
    }
}
