import Buy.OrderCar;
import TestDrive.*;

public class Client {

    public static void main(String[] args) {

        CreateTestDrive ctd = new CreateTestDrive();
        TestDrive test_drive = ctd.setTestDrive("x", "22/10/1019", "Simone Not");

        System.out.println(test_drive.getName());

        OrderCar car = new OrderCar("X", "Simone");
        car.setBattery("75");
        car.setColor("black");
        car.pay();

        System.out.println(car.getCarDescription());

    }
}
