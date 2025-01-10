package com.prosky.calculatorTest.exception;

public class ZeroDivideException extends IllegalArgumentException {
    public ZeroDivideException() {
        super("Ошибка деления на ноль");
    }
}
