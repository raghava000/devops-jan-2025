package com.devops.devops_jan_2025;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DevopsJan2025Application {

	public static void main(String[] args) {
		SpringApplication.run(DevopsJan2025Application.class, args);
	}
	 @GetMapping("/")
	    public String hello() {
	      return String.format("<h1> Hello There, Welcome to my project <h1>");
}
	 //branch demo
	 @GetMapping("/welcome")
	    public String welcome() {
	      return String.format("<h1> Welcome to world of devops <h1>");
}
}