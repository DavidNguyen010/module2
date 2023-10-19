package testing;
import animal.Animal;
import animal.Chicken;
import animal.Tiger;
public class testTiger {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();
        System.out.println("Con ga");
        System.out.println(animals[0].howtoEat());
        System.out.println(animals[0].makeSound());

        System.out.println("Con ho");
        System.out.println(animals[1].howtoEat());
        System.out.println(animals[1].makeSound());

    }
}
