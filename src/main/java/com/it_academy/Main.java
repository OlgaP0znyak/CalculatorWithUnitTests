package com.it_academy;

public class Main {
    public static void main(String[] args) {
        double number1;
        double number2;
        char operation;
        double result;
        System.out.println("***КАЛЬКУЛЯТОР***");
        System.out.println();
        System.out.println("Для выхода из программы введите \"exit\".");
        System.out.println();
        number1 = CalculatorInputReader.getNumber();
        operation = CalculatorInputReader.getOperation();
        number2 = CalculatorInputReader.getNumber();

        while (operation == '/' && number2 == 0)
            number2 = CalculatorInputReader.getNumber();

        Calculator calculator = new Calculator();
        result = calculator.calculate(number1, number2, operation);

        Output output = new Output();
        output.printFormattedNumber(number1);
        System.out.print(" " + operation + " ");
       /* if (number2 < 0) {
            System.out.print("(");
            output.printFormattedNumber(number2);
            System.out.print(")");
        } else*/
            output.printFormattedNumber(number2);
        System.out.print(" = ");
        output.printFormattedNumber(result);
    }
}
