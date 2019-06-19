package desingPatterns.AbstractFactory;

public class Duck implements Animal {

    @Override
    public String getAnimalName() {
        return "Duck";
    }

    @Override
    public String makeSound() {
        return "Quak quak";
    }
}
