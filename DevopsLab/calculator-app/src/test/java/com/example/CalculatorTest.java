package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class CalculatorTest {

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testAdd() {
  Calculator calc = new Calculator();
  assertEquals(5, calc.add(2,3));
 }

 @Test
 public void testSubtract() {
  Calculator calc = new Calculator();
  assertEquals(1, calc.subtract(3,2));
 }
}
