package sks.project.microservice.producer.springbootproducerservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import sks.project.microservice.producer.springbootproducerservice.entity.Share;

public interface ShareRepository extends JpaRepository<Share, Long> {
	
	public Share getShareByCompanyName(String companyName);

}
