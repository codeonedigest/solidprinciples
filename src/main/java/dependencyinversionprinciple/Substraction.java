package dependencyinversionprinciple;

public class Substraction implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    public Substraction(double num1, double num2) {
        this.left = num1;
        this.right = num2;
    }

    public void performOperation() {
        result = left - right;
        System.out.println("Substraction Result is " + result);
    }
}
