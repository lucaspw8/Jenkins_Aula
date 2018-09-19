package com.example.humberto.tempconverter;

public class ConverterUtils {

    static double celsiusToFahrenheit(double value) {
        return value * 1.8 + 32;
    }

    static double fahrenheitToCelsius(double value) {
        return (value - 32)/1.8;
    }
}
