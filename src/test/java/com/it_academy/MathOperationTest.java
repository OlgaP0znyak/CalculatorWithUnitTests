package com.it_academy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@Execution(ExecutionMode.CONCURRENT)
public class MathOperationTest {

    @ParameterizedTest
    @CsvSource(value = {"0, 0, 0", "1, 2, 3", "40812094810, 647826748, 41459921558", "-0.5, 7, 6.5", "0.005, -0.005, 0"})
    public void testAddManyValues(double number1, double number2, double result) {
        assertEquals(result, MathOperation.add(number1, number2), "Ошибка в работе метода Add");
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 0, 0", "1, 2, -1", "40812094810, 647826748, 40164268062", "-0.5, 7, -7.5", "0.005, -0.005, 0.01"})
    public void testSubtractManyValues(double number1, double number2, double result) {
        assertEquals(result, MathOperation.subtract(number1, number2), "Ошибка в работе метода Subtract");
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 0, 0", "1, 2, 2", "40812, 647, 26405364", "-0.5, 7, -3.5", "0.005, -0.005, -0.000025"})
    public void testMultiplyManyValues(double number1, double number2, double result) {
        assertEquals(result, MathOperation.multiply(number1, number2), "Ошибка в работе метода Multiply");
    }

    @ParameterizedTest
    @CsvSource(value = {"0, 1, 0", "1, 2, 0.5", "40812, 647, 63.07882534775889", "-0.5, 7, -0.07142857142857142", "0.005, -0.005, -1"})
    public void testDivideManyValues(double number1, double number2, double result) {
        assertEquals(result, MathOperation.divide(number1, number2), "Ошибка в работе метода Divide");
    }

    @Test
    public void testDivideByZeroExpectedException() {
        ArithmeticException exception = assertThrows(ArithmeticException.class,
                () -> MathOperation.divide(0, 0), "При делении на ноль не генерируется Exception с нужным сообщением");
        assertEquals("Ошибка. Деление на ноль невозможно", exception.getMessage());
    }
}
