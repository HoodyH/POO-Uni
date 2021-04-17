package Math;


public class Calculator {
    
    private int lastResult;

    // con il construttore inizilizzo la variabile di classe a 0
    public Calculator() {
        this.lastResult = 0;
    }

    public double add(double a, double b) {
        this.lastResult = a+b
        return this.lastResult;
    }
}