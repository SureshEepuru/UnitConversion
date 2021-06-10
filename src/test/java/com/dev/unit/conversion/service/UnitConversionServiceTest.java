package com.dev.unit.conversion.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import com.dev.unit.conversion.constants.UnitConversionConstants;
import com.dev.unit.conversion.model.UnitConversionRequest;
import com.dev.unit.conversion.model.UnitConversionResponse;

@ExtendWith(MockitoExtension.class)
public class UnitConversionServiceTest {
	
	@InjectMocks
	private UnitConversionService classunderTest;
	
	@Test
	public void testValidate_FAHRENHEIT_to_CELSIUS() {
		
		//Give
		UnitConversionRequest request = new UnitConversionRequest();
		request.setInputUnitofMeasure(UnitConversionConstants.FAHRENHEIT);
		request.setInputValue(56.4);
		request.setStudentResponse(13.56);
		request.setTargetUnitofMeasure(UnitConversionConstants.CELSIUS);
		
		//When
		UnitConversionResponse result = classunderTest.validate(request); 
		
		//Then
		assertEquals(UnitConversionConstants.CORRECT, result.getOutput());
		
		request.setStudentResponse(34.15);
		UnitConversionResponse incorrectResult = classunderTest.validate(request); 
				
		assertEquals(UnitConversionConstants.INCORRECT, incorrectResult.getOutput());
	}
	
	@Test
	public void testValidate_FAHRENHEIT_to_KELVIN() {
		
		//Give
		UnitConversionRequest request = new UnitConversionRequest();
		request.setInputUnitofMeasure(UnitConversionConstants.FAHRENHEIT);
		request.setInputValue(32);
		request.setStudentResponse(273.15);
		request.setTargetUnitofMeasure(UnitConversionConstants.KELVIN);
		
		//When
		UnitConversionResponse result = classunderTest.validate(request); 
		
		//Then
		assertEquals(UnitConversionConstants.CORRECT, result.getOutput());
		
		request.setStudentResponse(272.15);
		UnitConversionResponse incorrectResult = classunderTest.validate(request); 
				
		assertEquals(UnitConversionConstants.INCORRECT, incorrectResult.getOutput());
	}
	
	@Test
	public void testValidate_FAHRENHEIT_to_RANKINE() {
		
		//Give
		UnitConversionRequest request = new UnitConversionRequest();
		request.setInputUnitofMeasure(UnitConversionConstants.FAHRENHEIT);
		request.setInputValue(32);
		request.setStudentResponse(491.67);
		request.setTargetUnitofMeasure(UnitConversionConstants.RANKINE);
		
		//When
		UnitConversionResponse result = classunderTest.validate(request); 
		
		//Then
		assertEquals(UnitConversionConstants.CORRECT, result.getOutput());
		
		request.setStudentResponse(272.15);
		UnitConversionResponse incorrectResult = classunderTest.validate(request); 
				
		assertEquals(UnitConversionConstants.INCORRECT, incorrectResult.getOutput());
	}
	
	@Test
	public void testValidate_CELSIUS_to_FAHRENHEIT() {
		
		//Give
		UnitConversionRequest request = new UnitConversionRequest();
		request.setInputUnitofMeasure(UnitConversionConstants.CELSIUS);
		request.setInputValue(45.34);
		request.setStudentResponse(113.61);
		request.setTargetUnitofMeasure(UnitConversionConstants.FAHRENHEIT);
		
		//When
		UnitConversionResponse result = classunderTest.validate(request); 
		
		//Then
		assertEquals(UnitConversionConstants.CORRECT, result.getOutput());
	}

}
