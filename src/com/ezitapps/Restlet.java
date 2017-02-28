package com.ezitapps;

import org.restlet.Server;
import org.restlet.data.Protocol;
import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;

public class Restlet extends ServerResource{

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		new Server(Protocol.HTTP, 8182, Restlet.class).start();

	}
	
	@Get
	public String present(){
		return "HELLO, JC";
	}

}
