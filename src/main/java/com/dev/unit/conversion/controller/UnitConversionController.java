package com.dev.unit.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.unit.conversion.model.UnitConversionRequest;
import com.dev.unit.conversion.model.UnitConversionResponse;
import com.dev.unit.conversion.service.UnitConversionService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/")
@Api(tags = "Unit Conversion Common API", value = "Validates temperatures conversions between Kelvin, Celsius, Fahrenheit, and Rankine")
public class UnitConversionController {
	
	@Autowired
	UnitConversionService unitConversionService;
	
	@PostMapping("/validate")
	public ResponseEntity<UnitConversionResponse> validate(@RequestBody UnitConversionRequest request){
		return ResponseEntity.status(HttpStatus.OK).body(unitConversionService.validate(request));
	}

}
