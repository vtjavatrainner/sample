package com.pcs.trainnning.example.sample;

import com.pcs.trainnning.example.sample.service.HelloWordService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

//@SpringBootApplication(scanBasePackages = {"com.pcs.trainnning.example.sample.controller",
//		"com.pcs.trainnning.example.sample.service",
//		"com.pcs.trainnning.example.sample.config"
//		} )
@SpringBootApplication
public class SampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Bean
	public HelloWordService getHelloWordService(){
		return new HelloWordService();
	}

}
