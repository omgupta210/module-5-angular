package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringbootApplicationcontroller {
	
@GetMapping("/admin")
public String admin()
{
	return "<h1> Welcome to admin </h1>";
}

@GetMapping("/user")
public String user()
{
	return "<h1> Welcome to user </h1>";
}

@GetMapping("/")
public String home()
{
	return "<h1> Welcome to Home</h1>";
}

}
