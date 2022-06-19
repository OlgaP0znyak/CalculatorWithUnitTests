package com.it_academy;

import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)

public class CalculatorTest {
    @ParameterizedTest
    @CsvSource(value = {"0, 0, +, 0", "1, 2, -, -1", "0.322, -2, /, -0.161", "-0.5, 7, *, -3.5"})
    public void testCalculateManyValues(double number1, double number2, char operation, double result) {
        Calculator calculator = new Calculator();
        assertEquals(result, calculator.calculate(number1, number2, operation), "Ошибка в работе метода Calculate");
    }
}
