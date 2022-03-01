package com.pack.calci;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
        Assertions.assertEquals(5,Calculator.Add(3,2));
    }

    @Test
    void subtract() {
        Assertions.assertEquals(1,Calculator.subtract(3,2));
    }

    @Test
    void multiply() {
        Assertions.assertEquals(6,Calculator.multiply(3,2));

    }

    @Test
    void divide() {
        Assertions.assertEquals(3.0,Calculator.divide(6,2));

    }
}