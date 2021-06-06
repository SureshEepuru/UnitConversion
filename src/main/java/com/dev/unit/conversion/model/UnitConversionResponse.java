package com.dev.unit.conversion.model;

import lombok.Data;

@Data
public class UnitConversionResponse {
	
	private double inputValue;
	private String inputUnitofMeasure;
	private String targetUnitofMeasure;
	private double studentResponse;
	private String output;

}
