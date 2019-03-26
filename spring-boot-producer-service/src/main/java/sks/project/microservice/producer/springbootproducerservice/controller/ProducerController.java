package sks.project.microservice.producer.springbootproducerservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import sks.project.microservice.producer.springbootproducerservice.entity.Share;
import sks.project.microservice.producer.springbootproducerservice.service.ShareService;

@RestController
@RequestMapping("/share-service")
public class ProducerController {
	@Autowired
	private ShareService shareService;
	
	@GetMapping("/{companyName}")
	public Share getShare(@PathVariable("companyName")String companyName) {
		
		return shareService.getShareByCompanyName(companyName);
		
	}
	
	@PostMapping("/add")
	public void addShare(@RequestBody Share share) {
		shareService.addShare(share);
		
	}
	
	
	@GetMapping("/")
	public List<Share> getAllShare() {
		
		return shareService.getAllShare();
		
	}
	
	
	@DeleteMapping("/delete")
	public void deleteAllShares() {
		
		shareService.deleteAllShares();
		
	}

	@DeleteMapping("/delete/{id}")
	public void deleteShares(@PathVariable("id") Long id) {
		
		shareService.deleteShares(id);
		
	}
	
}
