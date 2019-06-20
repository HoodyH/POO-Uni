package Car;

public class Black extends CarDecorator{

    public Black(Car car){
        super(car);
    }

    @Override
    public String getSerialN() {
        return super.getSerialN();
    }

    @Override
    public String getModel() {
        return super.getModel();
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 100;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", color black";
    }
}
