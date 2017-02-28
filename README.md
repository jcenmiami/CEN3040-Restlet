# CEN3040-Restlet
ezitapps.com
Create a web service that contains the ability to add, subtract, multiply, and divide. 
Using the Restlet framework, create four resources for add, subtract, multiply, and  divide. 
Each resource will obtain to values in order to perform the calculation. 
In order to pass two values, the resource is attached to the router like this 
router.attach("/add/{num1}/{num2}", AddResource.class);
