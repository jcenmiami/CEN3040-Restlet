package com.ezitapps;

import org.restlet.resource.ServerResource;
import org.restlet.resource.Get;

public class Resource extends ServerResource {
	
	@Get
	public String present(){
		
		return "Resource URI : " + getReference() + '\n' + "Root URI     : "
				+ getRootRef() + '\n' + "Routed part     : " 
				+ getReference().getBaseRef() + '\n' + "Remaining Part: "
				+ getReference().getRemainingPart();
	}

}
