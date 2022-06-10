package com.it_academy;

public class Output {
    void printFormattedNumber(double number) {
        if (!FormatNumber.checkIsFractional(number))
            System.out.printf("%.0f", number);
        else
            System.out.print(number);
    }
}
