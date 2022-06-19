package com.it_academy;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

@Execution(ExecutionMode.CONCURRENT)

public class CalculatorInputReaderTest {


    @Test
    public void testGetNumberWithInputNumber() {

        String input = "-5.1";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals(-5.1, CalculatorInputReader.getNumber(), "Ошибка в работе метода getNumber");

    }

    @Test
    public void testGetOperationWithInputNumber() {

        String input = "*";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        assertEquals('*', CalculatorInputReader.getOperation());

    }

}
