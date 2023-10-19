package animal;

import edible.Edible;

public class Tiger extends Animal implements Edible {
    @Override
    public String howtoEat() {
        return "An thit dong loai";
    }

    @Override
    public String makeSound() {
        return "roar roar";
    }
}
