package animal;

import edible.Edible;

public abstract class Animal implements Edible {
    @Override
    public String howtoEat() {
        return null;
    }
    public abstract String makeSound();
}
