package sks.project.microservice.producer.springbootproducerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@SpringBootApplication
public class SpringBootProducerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProducerServiceApplication.class, args);
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "hello";
	}
}
