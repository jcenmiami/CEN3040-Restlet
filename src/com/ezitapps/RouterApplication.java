package com.ezitapps;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;

public class RouterApplication extends Application{
	
	@Override
	public synchronized Restlet createInboundRoot() {
		
		Router router = new Router(getContext());
		
		router.attach("/add/{var1}/{var2}", Add.class);
		router.attach("/subtract/{var1}/{var2}", Subtract.class);
		router.attach("/multiply/{var1}/{var2}", Multiply.class);
		router.attach("/divide/{var1}/{var2}", Divide.class);
		
		return router;
	}

}
