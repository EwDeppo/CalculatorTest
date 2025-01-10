package com.prosky.calculatorTest;

import com.prosky.calculatorTest.service.CalculatorService;
import com.prosky.calculatorTest.service.CalculatorServiceImpl;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;
import static com.prosky.calculatorTest.CalculatorServiceImplTestConstants.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplParameterTest {
    private CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void shouldReturnConnectOfSum(int num1, int num2) {
        assertEquals(num1 + num2, out.plus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void shouldReturnConnectOfSubtract(int num1, int num2) {
        assertEquals(num1 - num2, out.minus(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void shouldReturnConnectOfMultiply(int num1, int num2) {
        assertEquals(num1 * num2, out.multiply(num1, num2));
    }

    @ParameterizedTest
    @MethodSource("provideParamsForCalculatorTests")
    public void shouldReturnConnectOfDivide(int num1, int num2) {
        assertEquals(num1 / num2, out.divide(num1, num2));
    }

    public static Stream<Arguments> provideParamsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ONE, TWO),
                Arguments.of(ZERO, TWO),
                Arguments.of(THREE, ONE),
                Arguments.of(THREE, TWO),
                Arguments.of(SIX, THREE),
                Arguments.of(SIX, TWO));
    }
}
