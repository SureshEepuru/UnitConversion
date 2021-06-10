package com.dev.unit.conversion.model;

public class UnitConversionResponse {
	
	private double inputValue;
	private String inputUnitofMeasure;
	private String targetUnitofMeasure;
	private double studentResponse;
	private String output;
	public double getInputValue() {
		return inputValue;
	}
	public void setInputValue(double inputValue) {
		this.inputValue = inputValue;
	}
	public String getInputUnitofMeasure() {
		return inputUnitofMeasure;
	}
	public void setInputUnitofMeasure(String inputUnitofMeasure) {
		this.inputUnitofMeasure = inputUnitofMeasure;
	}
	public String getTargetUnitofMeasure() {
		return targetUnitofMeasure;
	}
	public void setTargetUnitofMeasure(String targetUnitofMeasure) {
		this.targetUnitofMeasure = targetUnitofMeasure;
	}
	public double getStudentResponse() {
		return studentResponse;
	}
	public void setStudentResponse(double studentResponse) {
		this.studentResponse = studentResponse;
	}
	public String getOutput() {
		return output;
	}
	public void setOutput(String output) {
		this.output = output;
	}

}
