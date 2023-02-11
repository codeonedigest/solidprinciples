package dependencyinversionprinciple;

public class Division implements CalculatorOperation {
    private double left;
    private double right;
    private double result;

    public Division(double num1, double num2) {
        this.left = num1;
        this.right = num2;
    }

    public void performOperation() {
        result = left / right;
        System.out.println("Division Result is " + result);
    }
}
