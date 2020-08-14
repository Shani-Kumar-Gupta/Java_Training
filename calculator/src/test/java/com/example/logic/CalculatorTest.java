package com.example.logic;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testFindMax(){
        assertEquals(4,Calculator.findMax(new int[]{1,3,4,2}));
        assertEquals(-1,Calculator.findMax(new int[]{-12,-1,-3,-4,-2}));
    }
}