package com.dev.unit.conversion.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.mock.web.MockHttpServletRequest;

import com.dev.unit.conversion.constants.UnitConversionConstants;
import com.dev.unit.conversion.model.UnitConversionRequest;
import com.dev.unit.conversion.model.UnitConversionResponse;
import com.dev.unit.conversion.service.UnitConversionService;

@ExtendWith(MockitoExtension.class)
public class UnitConversionControllerTest {
	
	@InjectMocks
	private UnitConversionController classunderTest;
	
	@Mock
	UnitConversionService unitConversionService;
	
	MockHttpServletRequest mockHttpServletRequest = new MockHttpServletRequest();
	
	@Test
	public void testValidate() {
		
		UnitConversionRequest request = new UnitConversionRequest();
		request.setInputUnitofMeasure(UnitConversionConstants.FAHRENHEIT);
		request.setInputValue(56.4);
		request.setStudentResponse(13.56);
		request.setTargetUnitofMeasure(UnitConversionConstants.CELSIUS);
		
		UnitConversionResponse response = new UnitConversionResponse();
		response.setOutput(UnitConversionConstants.CORRECT);
		
		when(unitConversionService.validate(request)).thenReturn(response);
		
		ResponseEntity<UnitConversionResponse> entity = classunderTest.validate(request); 
				
		assertSame(response, entity.getBody());
		assertEquals(HttpStatus.OK, entity.getStatusCode());
		assertEquals(UnitConversionConstants.CORRECT, entity.getBody().getOutput());
		
		verify(unitConversionService).validate(request);
	}

}
