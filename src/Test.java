import Inheritance.Animal;
import Inheritance.Cat;
import Inheritance.Dog;

public class Test {
    public static void main(String[] args) {
        Animal animal=new Animal();
        Animal cat=new Cat();
        Animal dog=new Dog();

        Dog dog1=new Dog();
        Cat cat1=new Cat();

        animal.makeSound();
        animal.eat();

        cat.makeSound();
        cat.eat();

        dog.makeSound();

       dog.eat();

        cat1.makeSound();
        cat1.eat();

        dog1.makeSound();
        dog1.eat();

        dog.run();
    }

}
