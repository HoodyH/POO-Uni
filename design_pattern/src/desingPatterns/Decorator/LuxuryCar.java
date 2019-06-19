package desingPatterns.Decorator;

public class LuxuryCar extends CarDecorator {

    public LuxuryCar (Car c){
        super(c);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Adding Feature of Luxury Car");
    }
}
