package com.it_academy;

public class Output {
    void printDoubleAsInt(double number) {
        if (!Checking.checkIsFractional(number))
            System.out.printf("%.0f", number);
        else
            System.out.print(number);
    }

    void printNumberAfterOperation(double number) {
        if (Checking.checkIsNegativeNumber(number)) {
            System.out.print("(");
            printDoubleAsInt(number);
            System.out.print(")");
        } else
            printDoubleAsInt(number);
    }

    void printResultOfCalculating(double number1, double number2, char operation, double result) {
        printDoubleAsInt(number1);
        System.out.print(" " + operation + " ");
        printNumberAfterOperation(number2);
        System.out.print(" = ");
        printDoubleAsInt(result);
    }
}
