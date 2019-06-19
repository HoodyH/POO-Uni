package Find;


import java.util.*;
import Car.*;


public class Find {

    private List<Car> car_list;

    public Find(List<Car> car_list){
        this.car_list = car_list;
    }

    public List<Car> find_in(String model, int max_price, int min_price){

        List<Car> occurrence = new ArrayList<Car>();

        for (Car car : car_list){
            if (car.getModel().compareToIgnoreCase("mode") == 0) {
                if(car.getPrice() >= min_price && car.getPrice() <= max_price) {
                    occurrence.add(car);
                }
            }
        }
        return occurrence;
    }
}
