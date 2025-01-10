package com.prosky.calculatorTest.service;

import com.prosky.calculatorTest.exception.ZeroDivideException;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String hello() {
        return "Добро пожаловвать в калькулятор";
    }

    @Override
    public int plus(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    @Override
    public int minus(int num1, int num2) {
        int result = num1 - num2;
        return result;
    }

    @Override
    public int multiply(int num1, int num2) {
        int result = num1 * num2;
        return result;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        int result = num1 / num2;
        return result;
    }
}
