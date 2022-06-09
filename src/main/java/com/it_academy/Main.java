package com.it_academy;
//ndfhnfdnhd

public class Main {
    public static void main(String[] args) {
        double number1;
        double number2;
        char operation;
        double result;
        System.out.println("***КАЛЬКУЛЯТОР***");
        System.out.println();
        number1 = CalculatorInputReader.getNumber();
        operation = CalculatorInputReader.getOperation();
        number2 = CalculatorInputReader.getNumber();

        while (operation == '/' && number2 == 0)
            number2 = CalculatorInputReader.getNumber();

        Calculator calculator = new Calculator();
        result = calculator.calculate(number1, number2, operation);
        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }
}
