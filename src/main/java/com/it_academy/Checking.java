package com.it_academy;

public class Checking {
    public static boolean checkIsFractional(double number) {
        return (Math.abs(number) - Math.floor(Math.abs(number))) > 0;
    }

    public static boolean checkIsDivisionByZero(char operation, double number) {
        return operation == '/' && number == 0;
    }

    public static boolean checkIsNegativeNumber(double number) {
        return number < 0;
    }
}
