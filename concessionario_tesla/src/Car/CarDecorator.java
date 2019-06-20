package Car;

public class CarDecorator implements Car {

    protected Car decoratedCar;

    public CarDecorator(Car car){
        this.decoratedCar = car;
    }

    @Override
    public String getSerialN() {
        return this.decoratedCar.getSerialN();
    }

    @Override
    public String getModel() {
        return this.decoratedCar.getModel();
    }

    @Override
    public int getPrice() {
        return this.decoratedCar.getPrice();
    }

    @Override
    public String getDescription() {
        return this.decoratedCar.getDescription();
    }
}
