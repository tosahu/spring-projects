package sks.project.microservice.consumer.springbootconsumerservice.service;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import sks.project.microservice.consumer.springbootconsumerservice.entity.SharePrice;
//@FeignClient(name="share-service", url="localhost:8000") - no load balancer is used
@FeignClient(name="share-service")
@RibbonClient
public interface ShareServiceProxy {
	
	@GetMapping("/share-service/{companyName}")
	public SharePrice getShare(@PathVariable("companyName")String companyName);

}
