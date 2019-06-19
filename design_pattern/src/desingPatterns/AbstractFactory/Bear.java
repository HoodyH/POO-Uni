package desingPatterns.AbstractFactory;

public class Bear implements Animal {

    @Override
    public String getAnimalName() {
        return "Bear";
    }

    @Override
    public String makeSound() {
        return "Cu Cu, Cu cu";
    }
}
