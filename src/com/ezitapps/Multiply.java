package com.ezitapps;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class Multiply extends ServerResource{
	
	@Get
	public String toString(){
		
		double firstNumber = Double.parseDouble((String)getRequestAttributes().get("var1"));
		double secondNumber = Double.parseDouble((String)getRequestAttributes().get("var2"));
	
		return "Multiplication: " + firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber);
	}

}
