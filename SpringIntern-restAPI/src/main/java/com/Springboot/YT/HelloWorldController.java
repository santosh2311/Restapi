package com.Springboot.YT;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping ("/hello-world")
	
	//GET HTTP Methods
	//http://localhost:8080/hello-world
	
	public String helloWorld()
	{
		return "Hello World <br> This is the example of RESTAPI and successfully launch";
	}

}
