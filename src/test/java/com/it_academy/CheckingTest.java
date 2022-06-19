package com.it_academy;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)

public class CheckingTest {
    @ParameterizedTest
    @CsvSource(value = {"-5, false", "8.1, true", "0, false", "-0.125, true"})
    public void testCheckIsFractional(double number, boolean result) {
        assertEquals(result, Checking.checkIsFractional(number), "Ошибка в работе метода CheckIsFractional");
    }

    @ParameterizedTest
    @CsvSource(value = {"*, 0, false", "/, 0, true", "/, 0.0001, false"})
    public void testCheckIsDivisionByZero(char operation, double number, boolean result) {
        assertEquals(result, Checking.checkIsDivisionByZero(operation, number), "Ошибка в работе метода CheckIsDivisionByZero");
    }

    @ParameterizedTest
    @CsvSource(value = {"5, false", "-8.1, true", "0, false", "-0.125, true"})
    public void testCheckIsIsNegativeNumber(double number, boolean result) {
        assertEquals(result, Checking.checkIsFractional(number), "Ошибка в работе метода CheckIsNegativeNumber");
    }
}
