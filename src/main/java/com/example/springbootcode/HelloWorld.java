package com.example.springbootcode;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	//GET REST API
	//POST
	//PUT
	//DELETE  -----> return JSON response
	//@ResponseBody-> converts java to json format
	//@Restcontroller =  @Component + @ResponseBody
	
	
	//Get request
	//http://localhost:8080/hello-world (base URI)
	
	@GetMapping("/hello-world")
	public String helloworld()
	{
		return "Hello world";
	}
	

}
