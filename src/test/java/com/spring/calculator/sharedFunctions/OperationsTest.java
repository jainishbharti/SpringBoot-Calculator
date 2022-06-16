package com.spring.calculator.sharedFunctions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;

import static org.junit.jupiter.api.Assertions.*;


class OperationsTest {


    Operations operation;

    @BeforeEach
    void setUp() {
        this.operation = new Operations();
    }


    @Test
    void add() {
        assertEquals(4, operation.add(2.0,2.0));
    }

    @Test
    void subtract() {
        assertEquals(4, operation.subtract(6.0,2.0));
    }

    @Test
    void multiply() {
        assertEquals(15, operation.multiply(5.0,3.0));
    }

    @Test
    void divide() {
        assertEquals(12, operation.divide(144.0,12.0));
        assertThrows(ArithmeticException.class, () -> operation.divide(1.0,0.0),"Divide by zero should throw");
    }
}