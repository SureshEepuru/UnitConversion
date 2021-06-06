package com.dev.unit.conversion.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dev.unit.conversion.service.UnitConversionService;

import io.swagger.annotations.Api;

@RestController
@RequestMapping("/unitConversion")
@Api(tags = "Unit Conversion Common API")
public class UnitConversionController {
	
	@Autowired
	UnitConversionService unitConversionService;
	
	@GetMapping("/hello")
	public ResponseEntity<String> hello(){
		return ResponseEntity.status(HttpStatus.OK).body("Hello There !");
	}
	
	

}
