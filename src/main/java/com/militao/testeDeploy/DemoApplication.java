package com.militao.testeDeploy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping("/")
	public String test(){
		return "teste teste teste";
	}

	@GetMapping("/{input}")
	public String test(@PathVariable String input){
		return "=====>>" + input;
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
