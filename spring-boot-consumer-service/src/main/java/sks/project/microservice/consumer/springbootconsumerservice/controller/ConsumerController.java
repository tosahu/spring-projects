package sks.project.microservice.consumer.springbootconsumerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sks.project.microservice.consumer.springbootconsumerservice.entity.SharePrice;
import sks.project.microservice.consumer.springbootconsumerservice.service.ConsumerShareService;

@RestController
@RequestMapping("/consumer-share-service")
public class ConsumerController {
	
	@Autowired
	private ConsumerShareService consumerShareService;
	
	@GetMapping("/{companyName}/{unit}")
	public SharePrice getTotalSharePrice(@PathVariable("companyName")String companyName,@PathVariable("unit")int unit) {
		
		return consumerShareService.getTotalSharePrice(companyName,unit);
		
	}
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Consumer Application";
	}


}
