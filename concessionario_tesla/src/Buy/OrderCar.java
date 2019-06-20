package Buy;


import java.util.Random;
import Car.*;


public class OrderCar {

    private String client_name;
    private Car car;
    private boolean payed = false;

    public OrderCar(String model, String client_name){
        this.client_name = client_name;

        Random rand = new Random();
        int min = 1000000;
        int max = 9999999;
        String serial_n = String.valueOf(rand.nextInt((max - min) + 1) + min);

        car = new TeslaCar(serial_n, "x");
    }

    public void setBattery(String type){

        if(this.payed){
            throw new RuntimeException("the car is already payed");
        }

        if( type.compareToIgnoreCase("75") == 0){
            this.car = new with75KwBattery(car);
        }
    }

    public void setColor(String type){

        if(this.payed){
            throw new RuntimeException("the car is already payed");
        }

        if( type.compareToIgnoreCase("black") == 0){
            this.car = new Black(car);
        }
    }

    public String getCarDescription(){
        return this.car.getDescription();
    }

    public int getPrice(){
        return this.car.getPrice();
    }

    public boolean isPayed(){
        return this.payed;
    }

    public void pay(){
        this.payed = true;
    }

    public String getClientName() {
        return this.client_name;
    }
}
