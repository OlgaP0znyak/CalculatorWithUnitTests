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

        while (Checking.checkIsDivisionByZero(operation, number2)) {
            System.out.println("Ошибка. Деление на ноль невозможно. Повторите ввод делителя");
            number2 = CalculatorInputReader.getNumber();
        }

        Calculator calculator = new Calculator();
        result = calculator.calculate(number1, number2, operation);

        Output output = new Output();
        output.printResultOfCalculating(number1, number2, operation, result);
    }
}
