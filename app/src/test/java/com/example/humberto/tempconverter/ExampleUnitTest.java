package com.example.humberto.tempconverter;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void celToFah_isCorrect() {
        assertEquals(32, ConverterUtils.celsiusToFahrenheit(0), 0.001);
    }

    @Test
    public void fahToCel_isCorrect() {
        assertEquals(0, ConverterUtils.fahrenheitToCelsius(32), 0.001);
    }
}