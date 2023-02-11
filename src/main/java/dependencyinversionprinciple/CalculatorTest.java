package dependencyinversionprinciple;

public class CalculatorTest {

    public static void main(String []args) {
        double number1 = 10;
        double number2 = 5;

        Calculator calculator = new Calculator();

        //Addition
        CalculatorOperation addition = new Addition(number1, number2);
        calculator.calculate(addition);

        //Substraction
        CalculatorOperation substraction = new Substraction(number1, number2);
        calculator.calculate(substraction);

        //Multiplication
        CalculatorOperation multiplipication = new Multiplication(number1, number2);
        calculator.calculate(multiplipication);

        //Division
        CalculatorOperation division = new Division(number1, number2);
        calculator.calculate(division);

    }
}
