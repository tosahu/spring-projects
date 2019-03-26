package sks.project.microservice.consumer.springbootconsumerservice.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sks.project.microservice.consumer.springbootconsumerservice.entity.SharePrice;
@Service
public class ConsumerShareService {
	@Autowired
	private ShareServiceProxy shareServiceProxy;
	
	public SharePrice getTotalSharePrice(String companyName,int unit) {
		
		SharePrice sharePrice = shareServiceProxy.getShare(companyName);
		double totalSharePrice = sharePrice.getPrice()*unit;
		sharePrice.setTotalSharePrice(totalSharePrice);
		return new SharePrice(companyName,sharePrice.getPrice(),sharePrice.getPort(),totalSharePrice);
	}

}
