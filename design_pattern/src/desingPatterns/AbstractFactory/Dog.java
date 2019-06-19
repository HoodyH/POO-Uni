package desingPatterns.AbstractFactory;

public class Dog implements Animal{

    @Override
    public String getAnimalName() {
        return "Dog";
    }

    @Override
    public String makeSound() {
        return "Bau Bau";
    }
}
