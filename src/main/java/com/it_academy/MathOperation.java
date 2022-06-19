package com.it_academy;

public class MathOperation {
    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 == 0) {
            throw new ArithmeticException("Ошибка. Деление на ноль невозможно");
        } else
            return number1 / number2;
    }
}
