package com.uday.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "EmployeeBuilder",toBuilder = true)
@JsonDeserialize(builder = Employee.EmployeeBuilder.class)
public class Employee {
	private int id;
	private String name;
	private String address;
	private String designation;
	private String degree;
	
	@JsonPOJOBuilder(withPrefix = "")
	public static class EmployeeBuilder{
		
	}

}
