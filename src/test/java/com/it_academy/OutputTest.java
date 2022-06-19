package com.it_academy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)

public class OutputTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(out));
    }


    @ParameterizedTest
    @CsvSource(value = {"5.0, 5", "8.948, 8.948", "-129.0, -129"})
    public void testPrintDoubleAsIntManyValues(double number, String result) {
        Output output = new Output();
        output.printDoubleAsInt(number);
        assertEquals(result, out.toString(), "Ошибка в работе метода printDoubleAsInt");
    }

    @ParameterizedTest
    @CsvSource(value = {"-5, (-5)", "8.948, 8.948", "-1.585, (-1.585)"})
    public void testPrintNumberAfterOperationManyValues(double number, String result) {
        Output output = new Output();
        output.printNumberAfterOperation(number);
        assertEquals(result, out.toString(), "Ошибка в работе метода printNumberAfterOperation");
    }

    @ParameterizedTest
    @CsvSource(value = {"-1, 1.2, -, -2.2, -1 - 1.2 = -2.2", "1, -1, /, -1, 1 / (-1) = -1"})
    public void testPrintResultOfCalculatingManyValues(double number1, double number2, char operation,
                                                       double resultOfCalculation, String result) {
        Output output = new Output();
        output.printResultOfCalculating(number1, number2, operation, resultOfCalculation);
        assertEquals(result, out.toString(), "Ошибка в работе метода printResultOfCalculating");
    }

    @AfterEach
    public void cleanUpStreams() {
        System.setOut(null);
    }

}
