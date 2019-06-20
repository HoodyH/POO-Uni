package TestDrive;


public class TestDriveModelX implements TestDrive{

    private String name;
    private String data;
    private String description = "none";

    public TestDriveModelX(String data, String name){
        this.data = data;
        this.name = name;
    }

    public TestDriveModelX(String data, String name, String description){
        this.data = data;
        this.name = name;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getData() {
        return data;
    }

    public String getDetails() {
        return description;
    }
}
