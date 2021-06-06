package com.dev.unit.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.unit.conversion.model.UnitConversionRequest;
import com.dev.unit.conversion.model.UnitConversionResponse;
import com.dev.unit.conversion.service.UnitConversionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/")
@Api(tags = "Unit Conversion Common API")
public class UnitConversionController {
	
	@Autowired
	UnitConversionService unitConversionService;
	
	@PostMapping("/validate")
	@ApiOperation(tags = "Validate Unit Conversions Common API", value = "Validates temperatures conversions between Kelvin, Celsius, Fahrenheit, and Rankine")
	public ResponseEntity<UnitConversionResponse> validate(@RequestBody UnitConversionRequest request){
		return ResponseEntity.status(HttpStatus.OK).body(unitConversionService.validate(request));
	}
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		return ResponseEntity.status(HttpStatus.OK).body("Hello There !");
	}
	
	

}
