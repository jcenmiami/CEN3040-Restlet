package com.ezitapps;

import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

public class AddMethod extends ServerResource{
	
	@Get
	public String toString(){
		
		double firstNumber = Double.parseDouble((String)getRequestAttributes().get("var1"));
		double secondNumber = Double.parseDouble((String)getRequestAttributes().get("var2"));
	
		return "Addition: " + firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber);
	}

}
