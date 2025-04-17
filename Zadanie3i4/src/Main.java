//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    Animal animal = new Animal();
    animal.sleep();
    animal.makeNoise();
    Lion lion = new Lion();
    Cat cat = new Cat();
    Wolf wolf = new Wolf();
    Dog dog = new Dog();

    lion.makeNoise();
    cat.makeNoise();
    wolf.makeNoise();
    dog.makeNoise();

    lion.roam();
    cat.roam();
    wolf.roam();
    dog.roam();
    }
}