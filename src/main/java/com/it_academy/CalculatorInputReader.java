package com.it_academy;

import java.util.Scanner;

public class CalculatorInputReader {

    public static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        double number;

        while (true) {
            System.out.println("Введите число: ");
            String inputtedLine = scanner.nextLine();
            if (inputtedLine.equals("exit")) {
                System.exit(0);
            } else {
                try {
                    number = Double.parseDouble(inputtedLine);
                    break;
                } catch (NumberFormatException e) {
                    System.out.println("Ошибка. Необходимо вводить целые числа или десятичные дроби, где целая часть отделяется точкой. Повторите ввод.");
                }
            }
        }
        return number;
    }

    public static char getOperation() {
        Scanner scanner = new Scanner(System.in);
        char operation;

        while (true) {
            System.out.println("Введите операцию (+, -, *, /): ");
            String inputtedLine = scanner.nextLine();
            if (inputtedLine.equals("exit")) {
                System.exit(0);
            } else {
                if (!inputtedLine.equals("+") && !inputtedLine.equals("-") && !inputtedLine.equals("*") && !inputtedLine.equals("/")) {
                    System.out.println("Ошибка. Повторите ввод.");
                } else {
                    operation = inputtedLine.charAt(0);
                    break;
                }
            }
        }
        return operation;
    }
}