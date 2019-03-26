package sks.project.microservice.producer.springbootproducerservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.Id;

@Entity
@Table(name = "Shares")
public class Share {
private Long id;
private String companyName;
private Double price;
@Transient
private int port;

@Id
@GeneratedValue(strategy = GenerationType.AUTO)
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
@Column(name = "company_name")
public String getCompanyName() {
	return companyName;
}
public void setCompanyName(String companyName) {
	this.companyName = companyName;
}
@Column(name = "price")
public Double getPrice() {
	return price;
}
public void setPrice(Double price) {
	this.price = price;
}
public int getPort() {
	return port;
}
public void setPort(int port) {
	this.port = port;
}
}
