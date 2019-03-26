package sks.project.microservice.producer.springbootproducerservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import sks.project.microservice.producer.springbootproducerservice.entity.Share;
import sks.project.microservice.producer.springbootproducerservice.repository.ShareRepository;

@Service
public class ShareService {
	
@Autowired
private Environment environment;

	
	
@Autowired	
private ShareRepository shareRepository;

public ShareRepository getShareRepository() {
	return shareRepository;
}

public void setShareRepository(ShareRepository shareRepository) {
	this.shareRepository = shareRepository;
}
	
public Share getShareByCompanyName(String companyName){
	
	Share s = shareRepository.getShareByCompanyName(companyName);
	s.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
	return s;
}


public void addShare(Share share) {
	
	shareRepository.save(share);
	
	
}


public List<Share> getAllShare(){
	return shareRepository.findAll();
}

public void deleteAllShares() {
	// TODO Auto-generated method stub
	shareRepository.deleteAll();
}

public void deleteShares(Long id) {
	// TODO Auto-generated method stub
shareRepository.deleteById(id);	
}

}
