package com.dev.unit.conversion.service;

import org.springframework.stereotype.Component;

import com.dev.unit.conversion.model.UnitConversionRequest;
import com.dev.unit.conversion.model.UnitConversionResponse;

@Component
public class UnitConversionService {
	
	public UnitConversionResponse validate(UnitConversionRequest request) {
		//Coping given input values to response
		UnitConversionResponse response = copyGivenInputRequestValuesToResponse(request);

		//Validating conversions
		if ("Fahrenheit".equalsIgnoreCase(request.getInputUnitofMeasure())) {
			if ("Celsius".equalsIgnoreCase(request.getTargetUnitofMeasure())) {
				if (request.getStudentResponse() == convertFahrenheitToCelsius(request.getInputValue())) {
					response.setOutput("correct");
				} else
					response.setOutput("incorrect");
			}
		} else if ("Celsius".equalsIgnoreCase(request.getInputUnitofMeasure())) {
			if ("Fahrenheit".equalsIgnoreCase(request.getTargetUnitofMeasure())) {
				if (request.getStudentResponse() == convertCelsiusToFahrenheit(request.getInputValue())) {
					response.setOutput("correct");
				} else
					response.setOutput("incorrect");
			}
		} else response.setOutput("invalid");
		
		return response;
	}
	
	private UnitConversionResponse copyGivenInputRequestValuesToResponse(UnitConversionRequest request) {
		UnitConversionResponse response = new UnitConversionResponse();
		response.setInputValue(request.getInputValue());
		response.setInputUnitofMeasure(request.getInputUnitofMeasure());
		response.setTargetUnitofMeasure(request.getTargetUnitofMeasure());
		response.setStudentResponse(request.getStudentResponse());
		return response;
	}

	private double convertFahrenheitToCelsius(double f) {
		return Math.round((f-32)*5/9 * 100.0) / 100.0;
	}
	
	private double convertCelsiusToFahrenheit(double c) {
		return Math.round(((9*c)/5)+32  * 100.0) / 100.0;
	}
	
}
