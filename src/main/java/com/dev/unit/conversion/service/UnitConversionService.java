package com.dev.unit.conversion.service;

public class UnitConversionService {

	public float convertFahrenheitToCelsius(float f) {
		return (f-32)*5/9;
	}
	
	public float convertCelsiusToFahrenheit(float c) {
		return ((9*c)/5)+32;
	}
	
}
