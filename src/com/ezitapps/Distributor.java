package com.ezitapps;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class Distributor {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		Component component = new Component();
		component.getServers().add(Protocol.HTTP, 8182);
		
		component.getDefaultHost().attach("/trace", Resource.class);
		
		component.start();

	}

}
