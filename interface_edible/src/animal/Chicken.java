package animal;

import edible.Edible;

public class Chicken extends Animal implements Edible {
    @Override
    public String howtoEat() {
        return "an lua an com";
    }

    @Override
    public String makeSound() {
        return "O o ooooooo";
    }
}
