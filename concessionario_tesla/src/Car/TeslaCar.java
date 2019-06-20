package Car;

public class TeslaCar implements Car {

    private String serialN;
    private String model;
    private int price = 35000;
    private String description = "New Car";

    public TeslaCar(String serialN, String model){
        this.serialN = serialN;
        this.model = model;
    }
    public TeslaCar(String serialN, String model, int price, String description) {
        this.serialN = serialN;
        this.price = price;
        this.description = description;
        this.model = model;
    }

    @Override
    public String getSerialN() {
        return this.serialN;
    }

    @Override
    public String getModel() {
        return this.model;
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    @Override
    public String getDescription() {
        return this.description;
    }
}
