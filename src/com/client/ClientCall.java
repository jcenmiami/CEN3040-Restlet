package com.client;

import java.io.IOException;

import org.restlet.resource.ClientResource;
import org.restlet.resource.ResourceException;

public class ClientCall {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClientResource resource = new ClientResource("http://localhost:8182");
		
		try{
			resource.get().write(System.out);
		} catch (ResourceException e){
			e.printStackTrace();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

}
}
