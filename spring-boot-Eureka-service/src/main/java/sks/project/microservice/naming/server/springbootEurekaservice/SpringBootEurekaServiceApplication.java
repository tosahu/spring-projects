package sks.project.microservice.naming.server.springbootEurekaservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringBootEurekaServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootEurekaServiceApplication.class, args);
	}
}