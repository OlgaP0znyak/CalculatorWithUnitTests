package com.it_academy;

public class Calculator {
    double calculate(double number1, double number2, char operation) {
        double result = 0;
        switch(operation) {
            case '+':
                result = MathOperation.add(number1, number2);
                break;
            case '-':
                result = MathOperation.subtract(number1, number2);
                break;
            case '*':
                result = MathOperation.multiply(number1, number2);
                break;
            case '/':
                result = MathOperation.divide(number1, number2);
                break;
        }
        return result;
    }
}
