package com.prosky.calculatorTest;

import com.prosky.calculatorTest.exception.ZeroDivideException;
import com.prosky.calculatorTest.service.CalculatorService;
import com.prosky.calculatorTest.service.CalculatorServiceImpl;
import org.junit.jupiter.api.Test;

import static com.prosky.calculatorTest.CalculatorServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceImplTest {
    private final CalculatorService out = new CalculatorServiceImpl();

    @Test
    public void shouldReturn3WhenSum1And2() {
        assertEquals(THREE, out.plus(ONE, TWO));
    }

    @Test
    public void shouldReturn2WhenSum0And2() {
        assertEquals(TWO, out.plus(ZERO, TWO));
    }

    @Test
    public void shouldReturn2WhenSubtract3And1() {
        assertEquals(TWO, out.minus(THREE, ONE));
    }

    @Test
    public void shouldReturn1WhenSubtract3And2() {
        assertEquals(ONE, out.minus(THREE, TWO));
    }

    @Test
    public void shouldReturn6WhenMultiply2And3() {
        assertEquals(SIX, out.multiply(TWO, THREE));
    }

    @Test
    public void shouldReturn3WhenMultiply1And3() {
        assertEquals(THREE, out.multiply(ONE, THREE));
    }

    @Test
    public void shouldReturn2WhenDivide6And3() {
        assertEquals(TWO, out.divide(SIX, THREE));
    }

    @Test
    public void shouldReturn3WhenDivide6And2() {
        assertEquals(THREE, out.divide(SIX, TWO));
    }

    @Test
    public void shouldThrowZeroDivideExceptionWhenDivideAnyNumAnd0() {
        assertThrows(ZeroDivideException.class, ()-> out.divide(TWO, ZERO));
    }
}
