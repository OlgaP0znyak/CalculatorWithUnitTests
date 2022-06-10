package com.it_academy;

public class FormatNumber {
    public static boolean checkIsFractional(double number) {
        return (Math.abs(number) - Math.floor(Math.abs(number))) > 0;
    }
}
