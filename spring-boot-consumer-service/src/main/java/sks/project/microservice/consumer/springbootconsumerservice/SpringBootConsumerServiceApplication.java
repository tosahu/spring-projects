package sks.project.microservice.consumer.springbootconsumerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringBootConsumerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootConsumerServiceApplication.class, args);
	}
}
