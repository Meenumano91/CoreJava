import Inheritance.Animal;
import Inheritance.Cat;
import Inheritance.Dog;
import Encapsulation.Person;

public class Test
{
    public static void main(String[] args)
    {
    Person person=new Person("Mano",33);

        System.out.println("Name  :"+person.getName());
        System.out.println("Age :"+person.getAge());

        person.setName("Meenu");
        person.setAge(32);

        System.out.println("Updated Name :" +person.getName());
        System.out.println("Updated Age :" + person.getAge());

    }
}
/*public class Test {
    public static void main(String[] args) {


            Person person = new Person("Alice", 30);

            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            person.setName("Alicia");
            person.setAge(28);

            System.out.println("Updated Name: " + person.getName());
            System.out.println("Updated Age: " + person.getAge());

            person.setAge(-5);

        }
    }*/

//        testInheritance();


    //private static void testInheritance() {

        // Inheritance
//        Animal animal=new Animal();
//        Animal cat=new Cat();
//        Animal dog=new Dog();
//
//        Dog dog1=new Dog();
//        Cat cat1=new Cat();
//
//        animal.makeSound();
//        animal.eat();
//
//        cat.makeSound();
//        cat.eat();
//
//        dog.makeSound();
//
//       dog.eat();
//
//        cat1.makeSound();
//        cat1.eat();
//
//        dog1.makeSound();
//        dog1.eat();

//test the run method from parent class
//        dog.run();

