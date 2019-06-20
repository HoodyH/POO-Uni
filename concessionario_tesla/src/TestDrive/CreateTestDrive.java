package TestDrive;

public class CreateTestDrive {

    public TestDrive setTestDrive(String model, String data, String name){

        if(model.compareToIgnoreCase("x") == 0){
            return new TestDriveModelX(data, name);
        }

        throw new RuntimeException("unhandled model");
    }

    public TestDrive setTestDrive(String model, String data, String name, String description){

        if(model.compareToIgnoreCase("x") == 0){
            return new TestDriveModelX(data, name, description);
        }

        throw new RuntimeException("unhandled model");
    }
}
