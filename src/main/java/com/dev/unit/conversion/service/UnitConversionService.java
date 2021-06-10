package com.dev.unit.conversion.service;

import org.springframework.stereotype.Component;

import com.dev.unit.conversion.constants.UnitConversionConstants;
import com.dev.unit.conversion.model.UnitConversionRequest;
import com.dev.unit.conversion.model.UnitConversionResponse;

@Component
public class UnitConversionService {

	public UnitConversionResponse validate(UnitConversionRequest request) {
		// Copy given input values to response
		UnitConversionResponse response = copyGivenInputRequestValuesToResponse(request);

		// Validating conversions
		if (UnitConversionConstants.FAHRENHEIT.equalsIgnoreCase(request.getInputUnitofMeasure())) {
			
			convertFahrenheitToOther(request, response);
			
		} else if (UnitConversionConstants.CELSIUS.equalsIgnoreCase(request.getInputUnitofMeasure())) {
			
			convertCelsiusToOther(request, response);
			
		} else if (UnitConversionConstants.KELVIN.equalsIgnoreCase(request.getInputUnitofMeasure())) {
			
			convertKelvinToOther(request, response);
			
		} else if (UnitConversionConstants.RANKINE.equalsIgnoreCase(request.getInputUnitofMeasure())) {
			
			convertRankineToOther(request, response);
			
		} else response.setOutput(UnitConversionConstants.INVALID);

		return response;
	}

	private void convertCelsiusToOther(UnitConversionRequest request, UnitConversionResponse response) {
		
		if (UnitConversionConstants.FAHRENHEIT.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertCelsiusToFahrenheit(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.KELVIN.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertCelsiusToKelvin(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.RANKINE.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertCelsiusToRankine(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
		}
	}

	private void convertFahrenheitToOther(UnitConversionRequest request, UnitConversionResponse response) {
		
		if (UnitConversionConstants.CELSIUS.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertFahrenheitToCelsius(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.KELVIN.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertFahrenheitToKelvin(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.RANKINE.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertFahrenheitToRankine(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
		}
	}
	
	private void convertKelvinToOther(UnitConversionRequest request, UnitConversionResponse response) {
		
		if (UnitConversionConstants.CELSIUS.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertKelvinToCelsius(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.FAHRENHEIT.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertKelvinToFahrenheit(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.RANKINE.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertKelvinToRankine(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
		}
	}
	
	private void convertRankineToOther(UnitConversionRequest request, UnitConversionResponse response) {
		
		if (UnitConversionConstants.CELSIUS.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertRankineToCelsius(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.FAHRENHEIT.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertRankineToFahrenheit(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
			
		} else if (UnitConversionConstants.KELVIN.equalsIgnoreCase(request.getTargetUnitofMeasure())) {
			
			if (request.getStudentResponse() == convertRankineToKelvin(request.getInputValue())) {
				response.setOutput(UnitConversionConstants.CORRECT);
			} else
				response.setOutput(UnitConversionConstants.INCORRECT);
		}
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
		return Math.round((f - 32) * 5 / 9 * 100.0) / 100.0;
	}

	private double convertFahrenheitToKelvin(double f) {
		return Math.round((((f - 32) * 5 / 9) + 273.15) * 100.0) / 100.0;
	}
	
	private double convertFahrenheitToRankine(double f) {
		return Math.round((f + 459.67) * 100.0) / 100.0;
	}

	private double convertCelsiusToFahrenheit(double c) {
		return Math.round((((9 * c) / 5) + 32) * 100.0) / 100.0;
	}
	
	private double convertCelsiusToKelvin(double c) {
		return Math.round((273.15 + c) * 100.0) / 100.0;
	}
	
	private double convertCelsiusToRankine(double c) {
		return Math.round((273.15 + c) * 9 / 5 * 100.0) / 100.0;
	}

	private double convertKelvinToFahrenheit(double k) {
		return Math.round(((k * 9 / 5) - 459.67) * 100.0) / 100.0;
	}
	
	private double convertKelvinToCelsius(double k) {
		return Math.round((k - 273.15) * 100.0) / 100.0;
	}
	
	private double convertKelvinToRankine(double k) {
		return Math.round(k * 9 / 5 * 100.0) / 100.0;
	}
	
	private double convertRankineToFahrenheit(double r) {
		return Math.round((r - 459.67) * 100.0) / 100.0;
	}
	
	private double convertRankineToCelsius(double r) {
		return Math.round((r - 491.67) * 5 / 9 * 100.0) / 100.0;
	}
	
	private double convertRankineToKelvin(double r) {
		return Math.round(r * 5 / 9 * 100.0) / 100.0;
	}

}
